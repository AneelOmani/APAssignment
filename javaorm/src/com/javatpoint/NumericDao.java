package com.javatpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class NumericDao {
HibernateTemplate template;
public void setTemplate(HibernateTemplate template) {
	this.template = template;
}

public void saveNumeric(Numeric e){               //save obect of mcqs in table
	template.save(e);
}

public void updateNumeric(Numeric e){           //update object of Numeric table in table
	template.update(e);
}
 
public void deleteNumeric(Numeric e){             //now delete it 
	template.delete(e);
}
public Numeric getById(int id){  
    Numeric e=(Numeric)template.get(Numeric.class,id);      //it return single row of table of given id 
    System.out.print("iam omani");
    System.out.print(e.getQuestion());
    return e;  
}  


public List<Numeric> getNumeric(){  
    List<Numeric> list=new ArrayList<Numeric>();  
    list=template.loadAll(Numeric.class);   //it return all object of table mcqs 
    return list;  
}  
}

