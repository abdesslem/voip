package main;

import javax.swing.UIManager;
import java.awt.*;

/**
 * <p>Title: Z_VOIP</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2013</p>
 * <p>Company: Centre polytechnique</p>
 * @author Zoadiak 
 * @version 1.0
 */

public class Softphone1App {
  boolean packFrame = false;

  //Construct the application
  public Softphone1App() {
    Softphone1GUI frame = new Softphone1GUI();
    //Validate frames that have preset sizes
    //Pack frames that have useful preferred size info, e.g. from their layout
    if (packFrame) {
      frame.pack();
    }
    else {
      frame.validate();
    }
    //Center the window
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = frame.getSize();
    if (frameSize.height > screenSize.height) {
      frameSize.height = screenSize.height;
    }
    if (frameSize.width > screenSize.width) {
      frameSize.width = screenSize.width;
    }
    frame.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    frame.setVisible(true);
  }

  //Main method
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    }
    catch(Exception e) {
      e.printStackTrace();
    }
        new Softphone1App();
  }
}