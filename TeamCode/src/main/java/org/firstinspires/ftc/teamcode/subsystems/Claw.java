package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {
    private Servo servoClaw;
    private Servo servo360;

    public Claw(HardwareMap hardwareMap) {
        servoClaw = hardwareMap.get(Servo.class, "servoClaw");
        servo360 = hardwareMap.get(Servo.class,"servo360");
    }

    //positions to be defined
    public void openClaw() {

    }
    public void closeClaw() {

    }
    public void twistClaw(){

    }
}
