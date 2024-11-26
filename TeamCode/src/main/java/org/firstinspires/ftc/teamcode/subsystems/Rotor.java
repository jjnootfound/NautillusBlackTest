package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Rotor {
    private final DcMotor leftRotor;
    private final DcMotor rightRotor;
    public Rotor(HardwareMap hardwareMap) {
        leftRotor = hardwareMap.get(DcMotor.class,"leftRotor");
        rightRotor = hardwareMap.get(DcMotor.class, "rightRotor");
    }

    public void rotorFirstPosition() {

    }
    //angles and positions to be defined

    public void stopRotors() {
        leftRotor.setPower(0);
        rightRotor.setPower(0);
    }
}
/* rotor angles:

 */