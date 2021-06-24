import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Dialog.ModalExclusionType;

public class ImeiGen extends JFrame {

	private JPanel contentPane;
	private JTextField txt;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImeiGen frame = new ImeiGen();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ImeiGen() {
		setResizable(false);
		setAlwaysOnTop(true);
		setTitle("IMEI GENERATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton genBut = new JButton("GENERATE");
		genBut.setBounds(149, 134, 127, 34);
		genBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
			
				Random r = new Random();

				int one;
				int two;
				int three;
				int four;
				int five;
				int six;
				int sumOfOdds;
				int sumOfTwo;
				int newTwo = 0;
				int newFour = 0;
				int newSix = 0;
				int checkNumberCalc;
				int checkDigit;
				double checkNumber;
				double checkNumbers;


				for(int i = 1;i <= 50; i++) {

				one = r.nextInt(9);
				two = r.nextInt(9);
				three = r.nextInt(9);
				four = r.nextInt(9);
				five = r.nextInt(9);
				six = r.nextInt(9);



				sumOfOdds = 14 + one + three + five;


				//generating newTwo
				if(two == 0) {
				newTwo = 0;
				}else if(two == 1) {
				newTwo = 2;
				}else if(two == 2) {
				newTwo = 4;
				}else if(two == 3) {
				newTwo = 6;
				}else if(two == 4) {
				newTwo = 8;
				}else if(two == 5) {
				newTwo = 1;
				}else if(two == 6) {
				newTwo = 3;
				}else if(two == 7) {
				newTwo = 5;
				}else if(two == 8) {
				newTwo = 7;
				}else if(two == 9) {
				newTwo = 9;
				}


				//generating newFour
				if(four == 0) {
				newFour = 0;
				}else if(four == 1) {
				newFour = 2;
				}else if(four == 2) {
				newFour = 4;
				}else if(four == 3) {
				newFour = 6;
				}else if(four == 4) {
				newFour = 8;
				}else if(four == 5) {
				newFour = 1;
				}else if(four == 6) {
				newFour = 3;
				}else if(four == 7) {
				newFour = 5;
				}else if(four == 8) {
				newFour = 7;
				}else if(four == 9) {
				newFour = 9;
				}


				//generating newSix
				if(six == 0) {
				newSix = 0;
				}else if(six == 1) {
				newSix = 2;
				}else if(six == 2) {
				newSix = 4;
				}else if(six == 3) {
				newSix = 6;
				}else if(six == 4) {
				newSix = 8;
				}else if(six == 5) {
				newSix = 1;
				}else if(six == 6) {
				newSix = 3;
				}else if(six == 7) {
				newSix = 5;
				}else if(six == 8) {
				newSix = 7;
				}else if(six == 9) {
				newSix = 9;
				}


				sumOfTwo = 9 + newTwo + newFour + newSix;


				checkNumberCalc = sumOfOdds+sumOfTwo;
				checkNumbers = (sumOfOdds+sumOfTwo)/10;
				checkNumber = (Math.ceil(checkNumbers)*10) + 10;


				checkDigit = (int) (checkNumber - checkNumberCalc);

				if(checkDigit == 10) {
				checkDigit = 0;
				}
				
				
				txt.setText("35803508" +one+two+three+four+five+six+checkDigit);
				
				//System.out.println("35803508" +one+two+three+four+five+six+checkDigit);
				}
	
			}
			
			
			
		});
		contentPane.setLayout(null);
		contentPane.add(genBut);
		
		txt = new JTextField();
		txt.setBounds(79, 103, 271, 20);
		txt.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(txt);
		txt.setColumns(10);
		
		JLabel lblGoogleImeiGenerator = new JLabel("Google IMEI Generator");
		lblGoogleImeiGenerator.setBounds(79, 78, 271, 14);
		lblGoogleImeiGenerator.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblGoogleImeiGenerator);
		
		
		
	}
}
