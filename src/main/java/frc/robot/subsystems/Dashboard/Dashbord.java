// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Dashboard;

import com.ma5951.utils.MAShuffleboard;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Dashbord extends SubsystemBase {
  /** Creates a new Dashboard. */
  private static MAShuffleboard dashbord;
  private boolean cone;
  
  
  public Dashbord() {
    
    dashbord = new MAShuffleboard("Dashbord");

  }

  

  public static MAShuffleboard getInstance() {
    if (dashbord == null) {
      dashbord = new MAShuffleboard("Dashbord");
    }
    return dashbord;
  }

  @Override
  public void periodic() {

    dashbord.addBoolean("Test" , true);

  }
}
