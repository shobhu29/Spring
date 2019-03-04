package com.capgemini;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	 @RequestMapping("/hello")  
	    public String display(@RequestParam("name") String name,@RequestParam("pass") String pass,Model model)  
	    {  
	 
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
