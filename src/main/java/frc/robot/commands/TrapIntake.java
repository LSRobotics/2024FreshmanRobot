// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class TrapIntake extends Command {
  private final TrapSubsystem m_trapSub;

  /**
   * Creates a new TrapIntake.
   *
   * @param subsystem The subsystem used by this command.
   */
  public TrapIntake(TrapSubsystem subsystem) {
    m_trapSub = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initxially scheduled.
  @Override
  public void initialize() {
    m_trapSub.runTrapIntake(Constants.TrapConstants.TrapIntakeSpeed);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_trapSub.runTrapIntake(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
