package _03_method_writing._1_obedient_robot;
import org.jointheleague.graphical.robot.*;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.*;
public class obedient_robot {

	static void drawSquare() {
		Robot rob = new Robot();
		rob.setPenColor(Color.red);
		rob.penDown();
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
	}
	
	
	
	
	public static void main(String[] args) {
		String userInput = JOptionPane.showInputDialog("what shape do you want ? ");
		String userColor = JOptionPane.showInputDialog("what color do you want ? ");
		if (userInput.equals("square") && userColor.equals("red")) {
			drawSquare();
		}
	}
	
	
}
