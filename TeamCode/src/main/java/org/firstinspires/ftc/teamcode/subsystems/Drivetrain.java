package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivetrain {

    private final DcMotor frontLeft;
    private final DcMotor frontRight;
    private final DcMotor rearLeft;

    private final DcMotor rearRight;

    private void setMotorPowers(double frontLeftPower, double frontRightPower, double rearLeftPower, double rearRightPower) {
        frontLeft.setPower(frontLeftPower);
        frontRight.setPower(frontRightPower);
        rearLeft.setPower(rearLeftPower);
        rearRight.setPower(rearRightPower);
    }

    public Drivetrain(HardwareMap hardwareMap){
        frontLeft = hardwareMap.get(DcMotor.class, "frontLeft");
        frontRight = hardwareMap.get(DcMotor.class, "frontRight");
        rearLeft = hardwareMap.get(DcMotor.class, "rearLeft");
        rearRight = hardwareMap.get(DcMotor.class, "rearRight");

        frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);
        rearLeft.setDirection(DcMotorSimple.Direction.REVERSE);
    }
    public void drive(double vd, double td, double vt) {
        double sin, cos, max;
        double frontLeftPower, frontRightPower, rearLeftPower, rearRightPower;

        sin = Math.sin(td - Math.PI / 4);
        cos = Math.cos(td - Math.PI / 4);
        max = Math.max(Math.abs(sin), Math.abs(cos));

        frontLeftPower = vd * cos / max + vt;
        frontRightPower = vd * sin / max - vt;
        rearLeftPower = vd * sin / max + vt;
        rearRightPower = vd * cos / max - vt;

        if ((vd + Math.abs(vt)) > 1) {
            frontLeftPower /= vd + vt;
            frontRightPower /= vd + vt;
            rearLeftPower /= vd + vt;
            rearRightPower /= vd + vt;
        }
        setMotorPowers(frontLeftPower, frontRightPower, rearLeftPower, rearRightPower);
    }

    public void stop() {
        setMotorPowers(0,0,0,0);
    }
}
