package org.firstinspires.ftc.teamcode;

import androidx.annotation.NonNull;

import org.firstinspires.ftc.teamcode.mechanisms.Drivetrain;
import org.firstinspires.ftc.teamcode.mechanisms.Intake;

import java.util.Set;

import dev.nextftc.robot.Mechanism;
import dev.nextftc.robot.NextRobot;

public class Robot implements NextRobot {
    public Drivetrain drivetrain = new Drivetrain();
    public Intake intake = new Intake();

    @NonNull
    @Override
    public Set<Mechanism> getMechanisms() {
        return Set.of(drivetrain, intake);
    }
}
