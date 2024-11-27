package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.subsystems.Claw;
import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.subsystems.Slider;

@Autonomous
public class HumanPlayerAuto extends LinearOpMode {
    private Drivetrain drivetrain;
    private Slider slider;
    private Claw claw;

    @Override
    public void runOpMode() throws InterruptedException {
        drivetrain = new Drivetrain(hardwareMap);
        claw = new Claw(hardwareMap);

        waitForStart();

        drivetrain.drive(1, Math.PI/2,0);
        sleep(500);
        drivetrain.stop();

        slider.expandSliders();
        sleep(200);
        slider.stopSliders();

        slider.contractSliders();
        sleep(200);
        slider.contractSliders();

        claw.openClaw();
        sleep(100);

        drivetrain.drive(1, 11 * Math.PI/2,1);
        sleep(500);
        drivetrain.stop();
    }
}
