package com.javatpoint;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class attemptQuiz extends JFrame {

	private JPanel contentPane;
	private JTextField question;
	private String Quest;
	private String option1;
	private String option2;           //atttributes 
	private String option3;
	private String option4;
	int number=1 ;                                                  //increment the number  from 1 to n 
	private List<AddMcqs>m1;
	
	 public void setQuest(int i)
	    {
		 
	    	Quest=m1.get(i).getQuestion();
	    	option1=m1.get(i).getoptionA();                     //set the text for field 
	    	option2=m1.get(i).getoptionB();
	    	option3=m1.get(i).getoptionC();
	    	option4=m1.get(i).getoptionD();
	    	number+=1;
	    }    	
	    
	    public boolean check()           //check the validity of string 
	    {
	    	if(Quest==null && option1==null && option2==null && option3==null && option4==null)    //check wether  they are empty or not 
			return true;
	    	else
	    		return false;
	    	
	    }
	    public void attemptQuiz1(){            //default constructor 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);                           //initilize the frame 
			contentPane = new JPanel();
			contentPane.setBackground(Color.CYAN);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblQuestion = new JLabel("Attempt the quiz");
			lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 15));
			lblQuestion.setBounds(104, 11, 188, 28);
			contentPane.add(lblQuestion);
			
			question = new JTextField();
			question.setBounds(20, 47, 385, 49);
			contentPane.add(question);
			question.setColumns(10);
			
			final JRadioButton optionA = new JRadioButton("New radio button");
			optionA.setBounds(6, 118, 133, 23);
			contentPane.add(optionA);
			
			final JRadioButton optionB = new JRadioButton("New radio button");
			optionB.setBounds(181, 118, 139, 23);
			contentPane.add(optionB);
			
			final JRadioButton optionC = new JRadioButton("New radio button");
			optionC.setBounds(6, 169, 133, 23);
			contentPane.add(optionC);
			
			final JRadioButton optionD = new JRadioButton("New radio button");
			optionD.setBounds(181, 169, 139, 23);
			contentPane.add(optionD);
			
			JButton btnNext = new JButton("submit");
			btnNext.setForeground(Color.RED);
			btnNext.setFont(new Font("Tahoma", Font.BOLD, 15));
			btnNext.setBounds(158, 216, 89, 23);
			contentPane.add(btnNext);
			
			
		    m1=new ArrayList<AddMcqs>();
			Userlogin user=new Userlogin();
			AddMcqsDao dao=user.getAddmcqsdao();
			m1=dao.getmcqs();
			String name=m1.get(0).getQuestion();
			setQuest(1);
			  question.setText(m1.get(0).getQuestion());
		      optionA.setText(m1.get(0).getoptionA());                //set the text for first question
		      optionB.setText(m1.get(0).getoptionB());//
		      optionC.setText(m1.get(0).getoptionC());
		      optionD.setText(m1.get(0).getoptionD());
		
		 btnNext.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent arg0) {
					setQuest(number);
					question.setText(Quest);
					optionA.setText(option1);
					optionB.setText(option2);
					optionC.setText(option3);       //set the text for next incoming Question
					optionD.setText(option4);
					
					
				
				}
			});  
	    }
	    
	    
	

	/**
	 * Launch the application.
	 */
	public static void Quiz() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {                         //main function inittiliazation of frame
					
					 attemptQuiz frame = new attemptQuiz();
					 frame.attemptQuiz1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public attemptQuiz()
	{}
}
