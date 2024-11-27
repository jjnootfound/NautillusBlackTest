package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.subsystems.Claw;
import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.subsystems.Rotor;
import org.firstinspires.ftc.teamcode.subsystems.Slider;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends OpMode {

    private Rotor rotor;
    private Claw claw;
    private Drivetrain drivetrain;
    private Slider slider;


    @Override
    public void init() {
        rotor = new Rotor(hardwareMap);
        claw = new Claw(hardwareMap);
        drivetrain = new Drivetrain(hardwareMap);
        slider = new Slider(hardwareMap);
    }

    @Override

    public void loop() {

        //código de la clase drivetrain para chasis
        double x = gamepad1.left_stick_x;
        double y = -gamepad1.left_stick_y;
        double turn = gamepad1.right_stick_x;

        double vd = Math.hypot(x, y);
        double td = Math.atan2(y, x);

        drivetrain.drive(vd, td, turn * 0.6);

        //slider pulley system
        if(gamepad2.right_trigger > 0.1) {
            slider.expandSliders();
        } else if (gamepad2.left_trigger > 0.1) {
            slider.contractSliders();
        } else {
            slider.stopSliders();
        }
        //claw (positions in class claw to be defined
        if(gamepad2.x) {
            claw.openClaw();
        } else if(gamepad2.y) {
            claw.closeClaw();
        }

        //setear el ángulo del brazo :o
        if(gamepad2.right_bumper) {
            rotor.rotorGoesUp();
        } else if (gamepad2.left_bumper) {
            rotor.rotorGoesDown();
        } else {
            rotor.mantainsRotorsOnStandBy();
        }

        //rotar la clawwwww :p
        if(gamepad2.a) {
            claw.twistClawClockwise();
        } else if (gamepad2.b) {
            claw.twistClawCounterClockWise();
        } else {
            claw.mantainClawTwistOnStandby();
        }

    }
}