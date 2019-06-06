package com.Movie.BookMyShow;

import java.beans.PropertyEditorSupport;


public class SetStudentProperty  extends PropertyEditorSupport{
	
	
	
	
		
	///   @Override
	
	//We can override 
 	public void setAsText(String box1) throws 	IllegalArgumentException
	{
		if(box1.contains ("IND")|| box1.contains("KA"))
		{
			setValue(box1);
		}
		else
		{
			box1 ="KA"+box1;
			
			setValue(box1);
		}
	}

}
