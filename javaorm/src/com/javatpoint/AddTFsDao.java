package com.javatpoint;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class AddTFsDao {
HibernateTemplate template;
public void setTemplate(HibernateTemplate template) {
	this.template = template;
}

public void saveAddTFs(AddTFs e){               //save obect of mcqs in table
	template.save(e);
}

public void updateAddTFs(AddTFs e){           //update object of mcqs in table
	template.update(e);
}
 
public void deleteAddTFs(AddTFs e){             //now delete it 
	template.delete(e);
}
public AddTFs getById(int id){  
    AddTFs e=(AddTFs)template.get(AddTFs.class,id);      //it return single row of table of given id 
    System.out.print("iam omani");
    System.out.print(e.getQuestion());
    return e;  
}  


public List<AddTFs> getTF(){  
    List<AddTFs> list=new ArrayList<AddTFs>();  
    list=template.loadAll(AddTFs.class);   //it return all object of table mcqs 
    return list;  
}  


}

