// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Dashboard;

import com.ma5951.utils.MAShuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.intake.Intake;



public class Dashbord extends SubsystemBase {
  /** Creates a new Dashboard. */
  private static Dashbord dashbord;
  private static MAShuffleboard dash;

  public enum scoringPose {
    H1,
    H2,
    H3,
    M1,
    M2,
    M3,
    L1,
    L2,
    L3
  }
  
  public enum intakePice {
    Cone,
    Cube,
  }

  public enum intakePose {
    Floor,
    Shelf,
    Ramp,
  }

  public Dashbord() {
    
    dash = new MAShuffleboard("commander");

  }

  public void printGrid() {
      
    

  }

  public void updateGrid() { 
    
  }

  public static Dashbord getInstance() {
    if (dashbord == null) {
      dashbord = new Dashbord();
    }
    return dashbord;
  }

  @Override
  public void periodic() {

    printGrid();
    updateGrid();
    //System.out.println(H3);

  }
}
