package com.Movie.BookMyShow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.Movie.modelObjects.StudentUser;

@Service
public class ServiceChecking {

	@Autowired
	StudentDao stundedao;
	
	public Boolean getUserMobNumber(String mobNumber) {
		
		
		Boolean flag=false;
		
		List<StudentUser> cv=stundedao.ById(mobNumber);
		
		for(StudentUser fg:cv)
		{
			if(fg.getMobNumber().equalsIgnoreCase(mobNumber)|| fg.getMobNumber()==null)
			{
				flag=true;		
			}
		}
		
		
		
		
		
		return flag;
		
	}

}
