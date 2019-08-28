package com.oocl.web.sampleWebApp;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class User {
	List <Student>students=new ArrayList<Student>() 
	{{
		
	}};

@RequestMapping("/user")
public @ResponseBody String greeting()
       {
   return "Hello World";
        }

@RequestMapping("/users")
public @ResponseBody String getMessage() {
	Student student=new Student();
	
 	
	return "Hello World";
                    }
	
 }
