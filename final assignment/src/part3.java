import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;
public class part3 {
	static double gpa=0;
	static double Marks=0;
public static void main(String [] args) {
	JPanel panel = new JPanel();

	JFrame frame = new JFrame();
	frame.setSize(300, 300);
	frame.setLocationRelativeTo(null);
	frame.setTitle("GPA calculator");
	frame.add(panel);
	
	panel.setLayout(null);
	
	/**JLabel label = new JLabel("");
	label.setBounds(65, 50, 80,25);
	panel.add(label);**/
	
	
	JButton GPA = new JButton("Semester's GPA");
	GPA.setBounds(65, 100, 150, 25);
	panel.add(GPA);
	
	JButton totalGPA= new JButton("Total GPA");
	totalGPA.setBounds(65, 130, 150, 25);
	panel.add(totalGPA);
	
	GPA.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int totalMarks=0;
			String hours=JOptionPane.showInputDialog("enter the number of hours");
			int numhours= Integer.parseInt(hours);
			String course=JOptionPane.showInputDialog("enter the number of courses");
	       int numcourse= Integer.parseInt(course);
			for (int i=0;i<numcourse;i++) {
				String points=JOptionPane.showInputDialog("enter the grade");
				 int marks= Integer.parseInt(points);
			     marks= marks*3;
				 totalMarks = totalMarks+marks;
				  
				 Marks = totalMarks/numhours;
			}
		     
			
			
			if (85<= Marks)
		   	 {
				      gpa = 4;
		   	 }
				 else if (80<=Marks)
				   	{
					  gpa = 3.75;
		   	 }
				 else if (77<=Marks)
					{
					  gpa = 3.50;
					}
				 else if (73<=Marks)
									{
					  gpa = 3.25;
		   	 }
				 else if (70<=Marks) {

					  gpa = 3.00;
		   	 }
			     else if (67<=Marks)
			 { 
			    	  gpa = 2.75;
			 }
			     else if (63<=Marks)
			 {
			    	  gpa = 2.50;
		     }
		         else if (60<=Marks)
		     {
		        	  gpa = 2.25;
		     }
				 else if (50<=Marks)
			 {
					  gpa = 1.00;
			 }
			      else if (35<=Marks)
			 {
			    	  gpa = 0.5;
			 }
			JOptionPane.showMessageDialog(null,"your semester's GPA is: "+ gpa);
		}
	});
	
	totalGPA.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			double scoreGPA= 0;
			String smstr=JOptionPane.showInputDialog("How many semesters have you finished:");
			double numSmstr= Double.parseDouble(smstr);
			for (int j=0;j<numSmstr;j++) {
				String smstrgpa =JOptionPane.showInputDialog("Enter the GPA");
				double smstrGPA= Double.parseDouble(smstrgpa);
				 scoreGPA = scoreGPA+smstrGPA;
			}
			
			double totalGPA = (scoreGPA+gpa)/(numSmstr+1);
			JOptionPane.showMessageDialog(null,"Your total GPA:"+ totalGPA);
		}
	});
	
	frame.setVisible(true);
}
}

