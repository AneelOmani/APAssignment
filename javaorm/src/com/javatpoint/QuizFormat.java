package com.javatpoint;


import java.awt.Event;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizFormat {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void asad() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizFormat window = new QuizFormat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuizFormat() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setForeground(Color.CYAN);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(100, 100, 504, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please select the title of the quiz");
		lblNewLabel.setBounds(85, 39, 325, 36);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.getContentPane().add(lblNewLabel);
		
		final JComboBox comboBox = new JComboBox();
		comboBox.setBounds(100, 125, 256, 36);
		comboBox.addItem("MCQS");
		
		comboBox.addItem("True/false");
		comboBox.addItem("numeric");
		comboBox.setSelectedItem(null);
		frame.getContentPane().add(comboBox);
		
		JButton btnSubmit = new JButton("Next");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSubmit.setBounds(188, 269, 89, 23);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSubmit.setForeground(Color.RED);
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
		
			// action performed function to go to the required type of quiz
			public void mouseClicked(MouseEvent arg0) {
				
			// if instructor selects quiz type mcqs then it will move to that side
				if (comboBox.getSelectedItem()=="MCQS"){
					frame.setVisible(false);
					AddMcqsF m = new AddMcqsF();
					m.addmcqs();
				}
				
				if (comboBox.getSelectedItem()=="True/false"){
					frame.setVisible(false);
					AddTF t = new AddTF();
					t.true_false();
					
				}
				
                      if (comboBox.getSelectedItem()=="numeric"){
					frame.setVisible(false);
					NumericQuiz n = new NumericQuiz();
					n.numeric();
					
				}
                   
                  /*  if(comboBox.getSelectedItem()=="Student"){
                    	  
                    		  frame.setVisible(false);
							attemptQuiz as = new attemptQuiz();
							 //as.setVisible(true); 
                      }*/
				
			}
		});
		frame.getContentPane().add(btnSubmit);
		
		JLabel lblQuizFormat = new JLabel("Quiz Format");
		lblQuizFormat.setBounds(191, 7, 123, 14);
		lblQuizFormat.setFont(new Font("Tahoma", Font.BOLD, 15));
		frame.getContentPane().add(lblQuizFormat);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(155, 4, 159, 23);
		frame.getContentPane().add(textArea);
		
		
	}
}