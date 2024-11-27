package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Rotor {
    private final DcMotor Arm;
    public Rotor(HardwareMap hardwareMap) {
        Arm = hardwareMap.get(DcMotor.class,"Arm");
    }

    public void rotorFirstPosition() {

    }

    public void rotorGoesUp() {
        Arm.setPower(0.31);
    }

    public void rotorGoesDown() {
        Arm.setPower(-0.31);
    }
    //angles and positions to be defined

    public void mantainsRotorsOnStandBy() {
        Arm.setPower(0);
    }
}
/* rotor angles:

 */