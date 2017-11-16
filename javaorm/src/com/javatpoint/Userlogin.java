package com.javatpoint;



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Userlogin {

	private JFrame frame;
	private JPasswordField pwdPassword;
	private JTextField txtUsername;
	private JLabel lblRole;
	private JComboBox comboBox;
    public AddMcqsDao dao;
    public AddTFsDao tfdao;
    public NumericDao Ndao;
    public StudentDao sdao;
    public TeacherDao tdao;
    
	/**
	 * Launch the application.
	 * 
	 */
	private  String possword;               //two attributes of role 
    private String name;
	/**
	 * Launch the application.
	 */
    public void setname(String user_name)       //setter function
    {
    	name=user_name;
    	
    }
    public void setpossword(String user_password)
    {
    	possword=user_password;
    	
    }
    public boolean checkLogin()         //check weather string is null or not 
    {
    	if(name==null && possword==null)
		return true;
    	else
    		return false;
    	
    }
    
    
	public static void main(String[] args) {
		System.out.print("iam nathu");
		/*Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		AddMcqsDao dao=(AddMcqsDao)factory.getBean("M");*/
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Userlogin window = new Userlogin();
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
	public AddMcqsDao getAddmcqsdao()
	{
	return dao;
	}
	/*public void setemployeeDao()
	{
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		dao=(AddMcqsDao)factory.getBean("M");
	}*/
	public AddTFsDao getAddtfsdao()
	{
	return tfdao;
	}
/*	public void settfdao()
	{
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		tfdao=(AddTFsDao)factory.getBean("T");
	}*/
	public NumericDao getNumericDao()
	{
	return Ndao;
	}
	public StudentDao getstudentDao()
	{
		return sdao;
	}
	public TeacherDao getteacherdao()
	{
		return tdao;
	}
	public void setNumericDao()
	{
		Resource r=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		Ndao=(NumericDao)factory.getBean("N");
		tfdao=(AddTFsDao)factory.getBean("T");
		dao=(AddMcqsDao)factory.getBean("M");
		sdao=(StudentDao)factory.getBean("student");
		tdao=(TeacherDao)factory.getBean("teacher");
	}
	public Userlogin() {
		//settfdao();
		//setemployeeDao();
		setNumericDao();
		dao.getById(2);
		//dao.getmcq();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame("Welcome to the quiz generator");
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 453, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setForeground(Color.BLUE);
		lblUsername.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblUsername.setBounds(46, 71, 75, 22);
		frame.getContentPane().add(lblUsername);
		
		txtUsername = new JTextField();
		txtUsername.setBackground(Color.WHITE);
		txtUsername.setBounds(131, 73, 173, 29);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPassword.setBounds(46, 104, 131, 57);
		frame.getContentPane().add(lblPassword);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setForeground(Color.BLACK);
		pwdPassword.setBounds(131, 122, 171, 29);
		frame.getContentPane().add(pwdPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setToolTipText("");
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setForeground(Color.RED);
		btnLogin.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
			
				/*
				Student s1=new Student();
				s1.setId(10);
				s1.setscore(0);
				s1.setname("muslim ali");
				s1.setusername("muslim ali");
				s1.setpwd("memon123");
				sdao.saveAddStudent(s1);
				Student s2=new Student();
				s2.setId(11);
				s2.setscore(0);
				s2.setname("assadullah");
				s2.setusername("assad");
				s2.setpwd("assad123");
				sdao.saveAddStudent(s2);
				Student s3=new Student();
				s3.setId(12);
				s3.setscore(0);
				s3.setname("zain");
				s3.setusername("zain123");
				s3.setpwd("jiyebhutto");
				sdao.saveAddStudent(s3);
				Student s4=new Student();
				s4.setId(13);
				s4.setscore(0);
				s4.setname("nathumal");
				s4.setusername("aneel");
				s4.setpwd("omani123");
				sdao.saveAddStudent(s4);
				Student s5=new Student();
				s5.setId(14);
				s5.setscore(0);
				s5.setname("aftab");
				s5.setusername("aftab");
				s5.setpwd("somro");
				sdao.saveAddStudent(s5);
				*/
				/*
				Teacher t1=new Teacher();
				t1.setId(21);
				t1.setname("fawad");
				t1.setusername("fawad");
				t1.setpwd("fawad123");
				tdao.saveAddTeacher(t1);
				Teacher s2=new Teacher();
				s2.setId(22);
				s2.setname("feroz");
				s2.setusername("feroz");
				s2.setpwd("feroz123");
				tdao.saveAddTeacher(s2);
				Teacher s3=new Teacher();
				s3.setId(23);
				s3.setname("daim");
				s3.setusername("daimali");
				s3.setpwd("daim123");
				tdao.saveAddTeacher(s3);*/
				
				/*
				Student s=new Student();
				s.setusername("assad");
				sdao.getByusername("assad");
				System.out.print(s.getId());*/
				
				String user_name=txtUsername.getText();
				String paswd=pwdPassword.getText();
		          		
				if((user_name.equals("omani") && paswd.equals("1234")) && comboBox.getSelectedItem()=="Instructor")
				{
					
				JOptionPane.showMessageDialog(frame, "you have logined successfully As Teacher ");
				frame.setVisible(false);
				Titlepage t=new Titlepage();
				t.titlepage();
				}
				else if((user_name.equals("nathu") && paswd.equals("1234")) && comboBox.getSelectedItem()=="Student"){
					{
						JOptionPane.showMessageDialog(frame, "you have logined successfully As Student ");
						frame.setVisible(false);
						attemptQuiz q = new attemptQuiz();
						q.Quiz();
					}
				}
				else
				{
					
					JOptionPane.showMessageDialog(frame, "Invalid username or password please try again");
				}
			}
		});
		btnLogin.setBounds(150, 219, 131, 37);
		frame.getContentPane().add(btnLogin);
		
		lblRole = new JLabel("Role");
		lblRole.setForeground(Color.BLUE);
		lblRole.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblRole.setBounds(56, 170, 75, 29);
		frame.getContentPane().add(lblRole);
		
		comboBox = new JComboBox();
		comboBox.setForeground(Color.BLACK);
		comboBox.addItem("");
		comboBox.addItem("Instructor");
		comboBox.addItem("Student");
		comboBox.setBounds(131, 172, 173, 29);
		frame.getContentPane().add(comboBox);
		
		
	}
}
	