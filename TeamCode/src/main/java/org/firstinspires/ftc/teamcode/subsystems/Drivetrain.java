package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivetrain {

    private final DcMotor frontLeftMotor;
    private final DcMotor frontRightMotor;
    private final DcMotor backLeftMotor;
    private final DcMotor backRightMotor;

    private void setMotorPowers(double frontLeftPower, double frontRightPower, double rearLeftPower, double rearRightPower) {
        frontLeftMotor.setPower(frontLeftPower);
        frontRightMotor.setPower(frontRightPower);
        backLeftMotor.setPower(rearLeftPower);
        backRightMotor.setPower(rearRightPower);
    }

    public Drivetrain(HardwareMap hardwareMap){
        frontLeftMotor = hardwareMap.get(DcMotor.class, "frontLeftMotor");
        frontRightMotor = hardwareMap.get(DcMotor.class, "frontRightMotor");
        backLeftMotor = hardwareMap.get(DcMotor.class, "backLeftMotor");
        backRightMotor = hardwareMap.get(DcMotor.class, "backRightMotor");

        frontLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
        backLeftMotor.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void drive(double vd, double td, double vt) {
        double sin, cos, max;
        double frontLeftMotorPower, frontRightMotorPower, backLeftMotorPower, backRightMotorPower;

        sin = Math.sin(td - Math.PI / 4);
        cos = Math.cos(td - Math.PI / 4);
        max = Math.max(Math.abs(sin), Math.abs(cos));

        frontLeftMotorPower = vd * cos / max + vt;
        frontRightMotorPower = vd * sin / max - vt;
        backLeftMotorPower = vd * sin / max + vt;
        backRightMotorPower = vd * cos / max - vt;

        if ((vd + Math.abs(vt)) > 1) {
            frontLeftMotorPower /= vd + vt;
            frontRightMotorPower /= vd + vt;
            backLeftMotorPower /= vd + vt;
            backRightMotorPower /= vd + vt;
        }
        setMotorPowers(frontLeftMotorPower, frontRightMotorPower, backLeftMotorPower, backRightMotorPower);
    }

    public void stop() {
        setMotorPowers(0,0,0,0);
    }
}
