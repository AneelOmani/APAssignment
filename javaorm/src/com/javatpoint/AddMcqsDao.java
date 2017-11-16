package com.javatpoint;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.ArrayList;
import java.util.List;

public class AddMcqsDao {
HibernateTemplate template;
private SessionFactory sessionFactory;

public void setTemplate(HibernateTemplate template) {
	this.template = template;
}
public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
}

public void saveAddMcqs(AddMcqs e){               //save obect of mcqs in table
	template.save(e);
}

public void updateAddMcqs(AddMcqs e){           //update object of mcqs in table
	template.update(e);
}
 
public void deleteAddMcqs(AddMcqs e){             //now delete it 
	template.delete(e);
}

public AddMcqs getById(int id){  
    AddMcqs e=(AddMcqs)template.get(AddMcqs.class,id);      //it return single row of table of given id 
    System.out.print("iam omani");
    System.out.print(e.getQuestion());
    return e;  
}  


public List<AddMcqs> getmcqs(){  
    List<AddMcqs> list=new ArrayList<AddMcqs>();  
    list=template.loadAll(AddMcqs.class);   //it return all object of table mcqs 
    return list;  
}  
}

