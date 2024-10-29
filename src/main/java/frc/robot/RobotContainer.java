// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ClimberDown;
import frc.robot.commands.ClimberUp;
import frc.robot.commands.ExampleCommand;
import frc.robot.commands.ShooterIntake;
import frc.robot.commands.ShooterRelease;
import frc.robot.commands.TrapIntake;
import frc.robot.commands.TrapRelease;
import frc.robot.subsystems.*;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ClimberSubsystem m_climberSubsystem = new ClimberSubsystem();
  private final MainShooterSubsystem m_mainShooterSubsystem = new MainShooterSubsystem();
  private final TrapSubsystem m_trapSubsystem = new TrapSubsystem();

  // Replace with CommandPS4Controller or CommandJoystick if needed
  private final CommandXboxController m_driverController =
      new CommandXboxController(OperatorConstants.kDriverControllerPort);

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    m_driverController.b().whileTrue(new ShooterIntake(m_mainShooterSubsystem));
    m_driverController.a().whileTrue(new ShooterRelease(m_mainShooterSubsystem));
    m_driverController.leftBumper().whileTrue(new TrapIntake(m_trapSubsystem));
    m_driverController.rightBumper().whileTrue(new TrapRelease(m_trapSubsystem));
    m_driverController.leftTrigger(OperatorConstants.triggerDeadzone).whileTrue(new ClimberUp(m_climberSubsystem, m_driverController.getLeftTriggerAxis() - OperatorConstants.triggerDeadzone));
    m_driverController.rightTrigger(OperatorConstants.triggerDeadzone).whileTrue(new ClimberDown(m_climberSubsystem, m_driverController.getRightTriggerAxis() - OperatorConstants.triggerDeadzone));
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An example command will be run in autonomous
    // TODO: ACTUALLY DO SOMETHING.
    return Autos.exampleAuto(null);
  }
}
