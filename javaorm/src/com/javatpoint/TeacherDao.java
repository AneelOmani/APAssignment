package com.javatpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class TeacherDao {
	HibernateTemplate template;
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public void saveAddTeacher(Teacher e){               //save obect of mcqs in table
		template.save(e);
	}

	public void updateAddTeacher(Teacher e){           //update object of mcqs in table
		template.update(e);
	}
	 
	public void deleteAddTeacher(Teacher e){             //now delete it 
		template.delete(e);

	}
	public Teacher getById(int id){  
	    Teacher e=(Teacher)template.get(Teacher.class,id);      //it return single row of table of given id 
	    System.out.print("iam omani");
	    //System.out.print(e.getQuestion());
	    return e;  
	}  


	public List<Teacher> getteacher(){  
	    List<Teacher> list=new ArrayList<Teacher>();  
	    list=template.loadAll(Teacher.class);   //it return all object of table mcqs 
	    return list;  
	}  
}
