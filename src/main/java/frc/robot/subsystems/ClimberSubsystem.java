package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.OperatorConstants;

public class ClimberSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public TalonFX climbermotor;

  public ClimberSubsystem() {
    climbermotor = new TalonFX(OperatorConstants.climberMotorID);
  }
  
  public void climbRun(double speed) {
    climbermotor.set(speed);
  }
}
