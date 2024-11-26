package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.subsystems.Claw;
import org.firstinspires.ftc.teamcode.subsystems.Drivetrain;
import org.firstinspires.ftc.teamcode.subsystems.Mecanum;
import org.firstinspires.ftc.teamcode.subsystems.Rotor;
import org.firstinspires.ftc.teamcode.subsystems.Slider;

public class RobotContainer {
    private HardwareMap hardwareMap;

    public RobotContainer(HardwareMap hardwareMap){
        this.hardwareMap = hardwareMap;
    }
    public final Mecanum mecanum = new Mecanum(null);
    public final Rotor rotor = new Rotor(hardwareMap);
    public final Claw claw = new Claw(hardwareMap);
    public final Drivetrain drivetrain = new Drivetrain((hardwareMap));
    public final Slider slider = new Slider((hardwareMap));
}