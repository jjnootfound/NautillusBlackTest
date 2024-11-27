package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Slider {
    private final DcMotor Pulley;
    private final DcMotor SecondPulley;

    public Slider(HardwareMap hardwareMap) {
        Pulley = hardwareMap.get(DcMotor.class, "Pulley");
        SecondPulley = hardwareMap.get(DcMotor.class, "SecondPulley");
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
         SecondPulley.setPower(1);
         Pulley.setPower(1);
     }

    public void contractSliders() {
        SecondPulley.setPower(-1);
        Pulley.setPower(-1);
    }
    public void stopSliders() {
        SecondPulley.setPower(0);
        Pulley.setPower(0);
    }
}