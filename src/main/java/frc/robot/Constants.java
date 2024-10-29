// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static final String prayer = "oh boy!";
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
    public static final double triggerDeadzone = 0.1;
    public static final int trapMotorID = 21;
    public static final int shooterMotor1Id = 19;
    public static final int shooterMotor2ID = 20;
    public static final int climberMotorID = 11;
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
  }
  public static class ShooterConstants {
    public static final double shooterReleaseSpeed = 1;
    public static final double shooterIntakeSpeed = 1;
  }
  public static class TrapConstants {
    public static final double trapIntakeSpeed = 1;
    public static final double trapReleaseSpeed = 1;
    public static final double trapSpeed = 0;
  }
  public static class ClimberConstants {
    public static final int upSpeed = -1;
    public static final int downSpeed = -1;
  }
}