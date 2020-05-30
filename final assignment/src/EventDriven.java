import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class EventDriven {
	public static void main(String[]args) {
		JFrame frame=new JFrame();
		frame.setSize(300,300);
		frame.setTitle("event driven");
		JButton btn=new JButton("click here");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "clicking on the button is considered an evet");
				
			}
		});
		frame.add(btn);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
	}


}
