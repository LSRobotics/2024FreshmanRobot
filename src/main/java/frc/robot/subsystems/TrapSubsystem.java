// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.OperatorConstants;

public class TrapSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public TalonFX trapMotor;

  public TrapSubsystem () {
    trapMotor = new TalonFX(OperatorConstants.trapMotorID);
  }

  public void runTrap(double speed) {
    trapMotor.set(-speed);
  }

}