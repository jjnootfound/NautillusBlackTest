package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Slider {
    private final DcMotor leftPulley;
    private final DcMotor rightPulley;

    public Slider(HardwareMap hardwareMap) {
        leftPulley = hardwareMap.get(DcMotor.class, "leftPulley");
        rightPulley = hardwareMap.get(DcMotor.class, "rightPulley");
    }
    /*
    public void lowBasketTarget() {

    }
    public void highBasketTarget() {

    }
    public void submergiblePosition() {

    }
    */
     public void expandSliders() {
         rightPulley.setPower(1);
         leftPulley.setPower(-1);
     }

    public void contractSliders() {
        rightPulley.setPower(-1);
        leftPulley.setPower(1);
    }
    public void stopSliders() {
        rightPulley.setPower(0);
        leftPulley.setPower(0);
    }
}