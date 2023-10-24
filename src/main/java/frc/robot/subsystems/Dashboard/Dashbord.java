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
  private boolean H1;
  private boolean H2;
  private boolean H3;
  private boolean M1;
  private boolean M2;
  private boolean M3;
  private boolean L1;
  private boolean L2;
  private boolean L3;
  
  public Dashbord() {
    
    dash = new MAShuffleboard("commander");

  }

  public void printGrid() {
      
    dash.addBoolean("H1" , dash.getBoolean("H1"));
    dash.addBoolean("H2" , dash.getBoolean("H2"));
    dash.addBoolean("H3" , dash.getBoolean("H3"));
    dash.addBoolean("M1" , dash.getBoolean("M1"));
    dash.addBoolean("M2" , dash.getBoolean("M2"));
    dash.addBoolean("M3" , dash.getBoolean("M3"));
    dash.addBoolean("L1" , dash.getBoolean("L1"));
    dash.addBoolean("L2" , dash.getBoolean("L2"));
    dash.addBoolean("L3" , dash.getBoolean("L3"));

  }

  public void updateGrid() { 
    H1 = dash.getBoolean("H1");
    H2 = dash.getBoolean("H2");
    H3 = dash.getBoolean("H3");
    M1 = dash.getBoolean("M1");
    M2 = dash.getBoolean("M2");
    M3 = dash.getBoolean("M3");
    L1 = dash.getBoolean("L1");
    L2 = dash.getBoolean("L2");
    L3 = dash.getBoolean("L3");
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
