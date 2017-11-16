package com.javatpoint;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Titlepage extends JFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void titlepage() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Titlepage frame = new Titlepage();
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
	public Titlepage() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setForeground(Color.CYAN);
		frame.getContentPane().setForeground(Color.CYAN);
		frame.setBounds(100, 100, 504, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTitle = new JLabel("Title ");
		lblTitle.setBackground(Color.RED);
		lblTitle.setBounds(44, 49, 46, 14);
		frame.add(lblTitle);
		
		textField = new JTextField();
		textField.setBounds(88, 33, 322, 47);
		frame.add(textField);
		textField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(25, 159, 65, 25);
		frame.add(lblDescription);
		
		textField_1 = new JTextField();
		textField_1.setBounds(88, 135, 316, 67);
		frame.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(160, 227, 89, 23);
		frame.add(btnNext);

		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				QuizFormat q = new QuizFormat();
				q.asad();
			}
		});
	}
}
