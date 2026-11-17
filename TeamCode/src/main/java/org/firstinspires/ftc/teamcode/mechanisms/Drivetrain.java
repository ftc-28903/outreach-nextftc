package org.firstinspires.ftc.teamcode.mechanisms;

import com.qualcomm.robotcore.hardware.Gamepad;

import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.robot.Mechanism;
import dev.nextftc.robot.drive.DriveCommands;

public class Drivetrain implements Mechanism {
    public final NextMotor frontLeft = new NextMotor("fl");
    public final NextMotor frontRight = new NextMotor("fr");
    public final NextMotor backLeft = new NextMotor("bl");
    public final NextMotor backRight = new NextMotor("br");

    public void startDrive(Gamepad gamepad) {
        frontRight.setDirection(NextMotor.Direction.REVERSE);
        backRight.setDirection(NextMotor.Direction.REVERSE);
        DriveCommands.mecanumDrive(frontLeft, frontRight, backLeft, backRight, gamepad).schedule();
    }
}