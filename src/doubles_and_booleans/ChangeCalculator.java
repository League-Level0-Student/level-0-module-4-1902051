package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickels = JOptionPane.showInputDialog(null, "How many nickels do ya have?");

		// Convert their answer to an int using Integer.parseInt()
int num=Integer.parseInt(nickels);
		// Ask the user how many dimes they have, and convert their answer
String dimes = JOptionPane.showInputDialog(null, "How many dimes do ya have?");
int num1=Integer.parseInt(dimes);
		// Ask the user how many quarters they have, and convert their answer
String quarters = JOptionPane.showInputDialog(null, "How many quarters do ya have?");
int num2=Integer.parseInt(quarters);
		// Calculate how much money the user has and save it in a double variable 
double cash = 0.25+num2+0.10+num1+0.5+num;
		// Tell the user how much money they have

	}
}

