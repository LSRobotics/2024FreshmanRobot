// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.OperatorConstants;

public class TrapSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public CANSparkMax trapMotor;

  public TrapSubsystem () {
    trapMotor = new CANSparkMax(OperatorConstants.trapMotorID, MotorType.kBrushed);
  }

  public void runTrap(double speed) {
    trapMotor.set(-speed);
  }

}