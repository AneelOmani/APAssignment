package com.javatpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class StudentDao {
HibernateTemplate template;
public void setTemplate(HibernateTemplate template) {
	this.template = template;
}

public void saveAddStudent(Student e){               //save obect of mcqs in table
	template.save(e);
}

public void updateAddStudent(Student e){           //update object of mcqs in table
	template.update(e);
}
 
public void deleteAddStudent(Student e){             //now delete it 
	template.delete(e);

}
public Student getById(int id){  
    Student e=(Student)template.get(Student.class,id);      //it return single row of table of given id 
    System.out.print("iam omani");
    //System.out.print(e.getQuestion());
    return e;  
} 
public Student getByusername(String user){  
    Student e=(Student)template.findByNamedQuery("select * from Student where Student.username=?",user);
    System.out.print("iam nathu mal");
    System.out.print(e.getName());
    return e;  
} 


public List<Student> getstudent(){  
    List<Student> list=new ArrayList<Student>();  
    list=template.loadAll(Student.class);   //it return all object of table mcqs 
    return list;  
}  
/*
public String getStudent(){             //now delete it 
	return template.getQueryCacheRegion();
}*/
}

