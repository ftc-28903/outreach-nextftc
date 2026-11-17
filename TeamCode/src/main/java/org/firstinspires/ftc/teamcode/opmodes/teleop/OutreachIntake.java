package org.firstinspires.ftc.teamcode.opmodes.teleop;

import org.firstinspires.ftc.teamcode.Robot;

import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.robot.opmode.BulkReadHook;
import dev.nextftc.robot.opmode.NextOpMode;
import dev.nextftc.robot.opmode.NextTeleop;
import dev.nextftc.robot.triggers.CommandGamepad;

@NextTeleop(name = "OutreachIntake")
public class OutreachIntake extends NextOpMode {
    private final Robot robot;
    private final CommandGamepad gp1;

    public OutreachIntake(Robot robot) {
        super(robot, BulkReadHook.INSTANCE);
        this.robot = robot;
        this.gp1 = new CommandGamepad(gamepad1);
    }

    @Override
    public void start() {
        robot.intake.motor.setDirection(NextMotor.Direction.REVERSE);
        robot.drivetrain.startDrive(gamepad1);
        gp1.rightTrigger().isOver(0.4)
                .onTrue(robot.intake.on())
                .onFalse(robot.intake.off());
    }
}
