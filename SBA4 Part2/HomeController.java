package com.myboot.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myboot.mvc.dao.MyUsersDao;
import com.myboot.mvc.model.MyUsers;



@Controller
public class HomeController {


@Autowired
MyUsersDao dao;

@RequestMapping(value="/test")
public String home()
{
//dao.saveUser(new MyUsers("107","pass4"));
return "home";
}

@RequestMapping(value = "/login", method = RequestMethod.GET)
public String search1(Model model,@RequestParam ("userName") String id,@RequestParam ("password") String pass) {
	//int userId=Integer.parseInt(id);
MyUsers user=dao.getusersById(id);
//System.out.println(id);

MyUsers passw=dao.getusersByPassword(pass);
//String passw=dao.getusersByPassword(pass);
//System.out.println(user);
//System.out.println(passw);


if(user==null && passw==null)
	
{
	//System.out.println("test null");
	String msg ="Please Enter User Id and Password";
	model.addAttribute("msg",msg);
	
	return "loginfail";
	
}

else if(user==null || passw==null)
{
	
	String msg1 ="Please Enter Valid User Id and Password";
	model.addAttribute("msg1",msg1);
	return "loginfail";
	
}

else
{
	//System.out.println("check not null values");
	
	String pass1=user.getPassword();
	
	
	if(pass.equals(pass1)==true)
	{
		String msg2 ="Logged In Successfully";	
		model.addAttribute("msg2",msg2);
		return "loginsuccess";
	}
	else
	{
		
		String msg3 ="Please Enter Valid User Id and Password";	
		model.addAttribute("msg3",msg3);
		return "loginfail";
		
	}
	
	
	
	
	

}

}


@RequestMapping(value="/forgotpassword")
public String fp()
{
	
return "forgotpassword";
}

@RequestMapping(value="/validation",method = RequestMethod.GET )
public String valid(Model model,@RequestParam ("userName") String id,@RequestParam ("question") String ques, @RequestParam ("securityAnswer") String ans)
{
	

	MyUsers user=dao.getusersById(id);
	//System.out.println(ques);
	//System.out.println(user);
		//System.out.println(ans);
	
	
	
	String s = ques;  
    switch(s){  
    case "ques1": 
    	String ques1=user.getQues1();
        //System.out.println(ques1);
        if(ans.equals(ques1)==true)
        	{String msg=id;
        	model.addAttribute("msg",msg);
        return "resetpassword";}
        else
        	return "wronganswer";
    case "ques2":  
    	String ques2=user.getQues2();
        //System.out.println(ques1);
        if(ans.equals(ques2)==true)
        {String msg=id;
        model.addAttribute("msg",msg);
        return "resetpassword";}
        else
        	return "wronganswer";
    case "ques3":  
    	String ques3=user.getQues3();
        //System.out.println(ques1);
        if(ans.equals(ques3)==true)
        {String msg=id;
        model.addAttribute("msg",msg);
        return "resetpassword";}
        else
        	return "wronganswer";
        
    case "ques4":  
    	String ques4=user.getQues4();
        //System.out.println(ques1);
        if(ans.equals(ques4)==true)
        {String msg=id;
        model.addAttribute("msg",msg);
        return "resetpassword";}
        else
        	return "wronganswer";
    default: 
        return "wronganswer";
    }  
    
   
}



@RequestMapping(value = "/resetpassword", method = RequestMethod.GET)
public String reset(Model model,@RequestParam ("id") String id,@RequestParam ("newpassword") String newpass,@RequestParam ("confirmnewpassword") String confirmnewpass) 
{

    if(newpass.equals(confirmnewpass)==true)
    {
    	
    	MyUsers user=dao.getusersById(id);
    
    	//System.out.println(user);
    	
    	String oldpass=user.getPassword();
    	
    	
    	String s=dao.updatePassword(oldpass,newpass);
    	System.out.println(s);
    	
    	
   
    	
    	return "passwordmatch";
    	
    	
    }
	
    else
    	return "passwordnotmatch";
	
	
	

}



}

