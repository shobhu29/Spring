package com.capgemini;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	 @RequestMapping("/hello")  
	    public String display(HttpServletRequest request,Model model)  
	    {  
	        //read the provided form data  
	        String name=request.getParameter("name");  
	        String pass=request.getParameter("pass");  
	        if(pass.equals("admin"))  
	        {  
	            String msg="Hello "+ name;  
	            //add a message to the model  
	            model.addAttribute("message", msg);  
	            return "viewpage";  
	        }  
	        else  
	        {  
	            String msg="Sorry "+ name +". You entered an incorrect password";  
	            model.addAttribute("message", msg);  
	            return "errorpage";  
	        }     
	    }  
}
