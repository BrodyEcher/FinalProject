import javax.swing.*;
import javax.swing.text.Caret;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.stream.*;

public class CounterBox implements ActionListener {
	JTextField tf1, tf1_1, tf2, tf2_1, tf3, tf3_1, tf4, tf4_1, tf5, tf5_1;
	JButton b1, b2;
	JLabel lbl1, lbl1_1, lbl2, lbl2_1, lbl3, lbl3_1, lbl4, lbl4_1, lbl5, lbl5_1;
	ArrayList<String> Food_Array = new ArrayList<String>();
	int Calorie_Int = 0; // Amount of Total Calories taken in
	int Fat_Int = 0; // Amount of Total Fat Taken in
	int Carb_Int = 0; // Amount of Total Carbs Taken in
	int Protein_Int = 0; // Amount of Total Carbs Taken in

	CounterBox() {
		JFrame f = new JFrame();

		lbl1 = new JLabel("Food");
		lbl1.setBounds(0, 50, 150, 20);
		tf1 = new JTextField();
		tf1.setBounds(50, 50, 150, 20);

		lbl1_1 = new JLabel("Total Food");
		lbl1_1.setBounds(250, 50, 150, 20);
		tf1_1 = new JTextField();
		tf1_1.setBounds(350, 50, 150, 20);
		tf1_1.setEditable(false);

		lbl2 = new JLabel("Calories");
		lbl2.setBounds(0, 100, 150, 20);
		tf2 = new JTextField();
		tf2.setBounds(50, 100, 150, 20);

		lbl2_1 = new JLabel("Total Calories");
		lbl2_1.setBounds(250, 100, 150, 20);
		tf2_1 = new JTextField();
		tf2_1.setBounds(350, 100, 150, 20);
		tf2_1.setEditable(false);

		lbl3 = new JLabel("Fats");
		lbl3.setBounds(0, 150, 150, 20);
		tf3 = new JTextField();
		tf3.setBounds(50, 150, 150, 20);

		lbl3_1 = new JLabel("Total Fats");
		lbl3_1.setBounds(250, 150, 150, 20);
		tf3_1 = new JTextField();
		tf3_1.setBounds(350, 150, 150, 20);
		tf3_1.setEditable(false);

		lbl4 = new JLabel("Carbs");
		lbl4.setBounds(0, 200, 150, 20);
		tf4 = new JTextField();
		tf4.setBounds(50, 200, 150, 20);

		lbl4_1 = new JLabel("Total Carbs");
		lbl4_1.setBounds(250, 200, 150, 20);
		tf4_1 = new JTextField();
		tf4_1.setBounds(350, 200, 150, 20);
		tf4_1.setEditable(false);

		lbl5 = new JLabel("Protein");
		lbl5.setBounds(0, 250, 150, 20);
		tf5 = new JTextField();
		tf5.setBounds(50, 250, 150, 20);

		lbl5_1 = new JLabel("Total Proteins");
		lbl5_1.setBounds(250, 250, 150, 20);
		tf5_1 = new JTextField();
		tf5_1.setBounds(350, 250, 150, 20);
		tf5_1.setEditable(false);

		b1 = new JButton("Submit Data");
		b1.setBounds(50, 350, 150, 50);
		b1.addActionListener(e -> submit());

		b2 = new JButton("Clear Data");
		b2.setBounds(50, 450, 150, 50);
		b2.addActionListener(e -> clear());
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(tf4);
		f.add(tf5);

		f.add(tf1_1);
		f.add(tf2_1);
		f.add(tf3_1);
		f.add(tf4_1);
		f.add(tf5_1);

		f.add(b1);
		f.add(b2);
		f.add(lbl1);
		f.add(lbl2);
		f.add(lbl3);
		f.add(lbl4);
		f.add(lbl5);

		f.add(lbl1_1);
		f.add(lbl2_1);
		f.add(lbl3_1);
		f.add(lbl4_1);
		f.add(lbl5_1);
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);
	}

	public void submit() {
        String currentText = tf1.getText(); // Food Eaten
        String currentText2 = tf2.getText(); // Calories
        String currentText3 = tf3.getText(); // Fats
        String currentText4 = tf4.getText(); // Carbs
        String currentText5 = tf5.getText(); // Protein

        Food_Array.add(currentText); // Adds the Food entered to the Food array

        int User_Calorie = Integer.parseInt(currentText2); // Takes the user input and places into an int
        Calorie_Int = Calorie_Int + User_Calorie; // Adds the User input with the total number to update the total
                                                    // calories consumed

        int User_Fat = Integer.parseInt(currentText3); // Takes user input and places into an int
        Fat_Int = Fat_Int + User_Fat; // Adds user input to update the total fat Count

        int User_Carb = Integer.parseInt(currentText4); // Takes user input and places into an int
        Carb_Int = Carb_Int + User_Carb; // Adds user input to update the total Carb Count

        int User_Protein = Integer.parseInt(currentText5); // Takes user input and places into an int
        Protein_Int = Protein_Int + User_Protein; // Adds user input to update the total

        tf1.setText(""); // sets all values to blank after the button is pressed
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");

        tf1_1.setText(Food_Array.toString());
        tf2_1.setText(Integer.toString(Calorie_Int)); // Places the total Calories taken into a field
        tf3_1.setText(Integer.toString(Fat_Int));
        tf4_1.setText(Integer.toString(Carb_Int));
        tf5_1.setText(Integer.toString(Protein_Int));

    }
	public void clear() {
        Food_Array = new ArrayList<String>();
        Calorie_Int = 0;
        Fat_Int = 0;
        Carb_Int = 0;
        Protein_Int = 0;
        
        tf1.setText(""); // sets all values to blank after the button is pressed
        tf2.setText("");
        tf3.setText("");
        tf4.setText("");
        tf5.setText("");
        
        tf1_1.setText(""); // sets all values to blank after the button is pressed
        tf2_1.setText("");
        tf3_1.setText("");
        tf4_1.setText("");
        tf5_1.setText("");
        
       
        
    }

	public static void main(String[] args) {
		new CounterBox();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}