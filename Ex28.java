package selectionStructures;

import javax.swing.JOptionPane;

public class Ex28 {

	public static void main(String[] args) {

		int number1, multiple;

		number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number to check if it is even."));

		multiple = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number to check if it is a multiple."));

		if (number1 % 2 == 0) {

			if (multiple != 0 && number1 % multiple == 0) {

				JOptionPane.showMessageDialog(null, "This number is even and a multiple of " + multiple);

			}

		} else if (multiple == 0) {

			JOptionPane.showMessageDialog(null, "Cannot check for multiple of zero.");

		} else {

			JOptionPane.showMessageDialog(null, "This number is even but not a multiple of " + multiple);
		}

	}

}
