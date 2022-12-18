import javax.swing.JOptionPane;

public class NumbersInfoJOptionPane {

	public static void main(String[] args) {
		//JOptionPane.showMessageDialog(null, "Hello World!", "WELCOME", JOptionPane.INFORMATION_MESSAGE);		
		//int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Type a number: "));
		//JOptionPane.showMessageDialog(null,"You typed number : " + n);
		int n;
		int count = 0, sum = 0;
		int oddNumbers = 0, evenNumbers = 0;
		int higherThan100 = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Type a number: <br><em>(0 stops)</em></html>"));
			if (n != 0) {
				count += 1;
				sum += n;
				if (n > 100) {
					higherThan100 += 1;
				}
				if (n % 2 == 0) {
					evenNumbers += 1;
				} else {
					oddNumbers += 1;
				}
			}
		} while (n != 0);
		
		JOptionPane.showMessageDialog(null,"<html> INFORMATION <br> <hr>"
				+ "<br> Number of Values: " + count
				+ "<br> Sum of Values:  " + sum
				+ "<br> Even Values: " + evenNumbers
				+ "<br> Odd Values: " + oddNumbers 
				+ "<br> Higher than 100: " + higherThan100 
				+ "<br> <hr> <br> </html>");		
	}

}
