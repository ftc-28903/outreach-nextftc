package org.firstinspires.ftc.teamcode.mechanisms;

import com.pedropathing.ivy.Command;

import dev.nextftc.hardware.actuators.NextMotor;
import dev.nextftc.robot.Mechanism;

public class Intake implements Mechanism {
    public NextMotor motor = new NextMotor("intake");

    public Command on() { return instant(() -> motor.setThrottle(0.8)); }
    public Command off() { return instant(() -> motor.setThrottle(0.0)); }
}
