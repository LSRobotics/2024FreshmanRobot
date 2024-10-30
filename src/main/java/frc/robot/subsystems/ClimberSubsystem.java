package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.OperatorConstants;

public class ClimberSubsystem extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  public CANSparkMax climbermotor;

  public ClimberSubsystem() {
    climbermotor = new CANSparkMax(OperatorConstants.climberMotorID, MotorType.kBrushless);
  }
  
  public void climbRun(double speed) {
    climbermotor.set(speed);
  }
}
