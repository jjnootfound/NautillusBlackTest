package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class Claw {
    private Servo ServoGarra;
    private Servo ServoBrazo;

    public Claw(HardwareMap hardwareMap) {
        ServoGarra = hardwareMap.get(Servo.class, "ServoGarra");
        ServoBrazo = hardwareMap.get(Servo.class,"ServoBrazo");
    }

    //posisciones por definirse a la banqueta :/
    public void openClaw() {
        ServoGarra.setPosition();
    }
    public void closeClaw() {
        ServoGarra.setPosition();
    }
    public void twistClawClockwise(){

        ServoBrazo.setPower(0.10);
    }

    public void twistClawCounterClockWise() {
        ServoBrazo.setPower(-0.10);
    }

    public void mantainClawTwistOnStandby() {
        ServoBrazo.setPower(0);
    }
}
