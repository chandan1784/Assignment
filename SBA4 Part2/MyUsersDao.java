package com.myboot.mvc.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.myboot.mvc.model.MyUsers;




@Component
@Transactional
public class MyUsersDao {


@Autowired
SessionFactory sessionFactor;

//save
public String saveUser(MyUsers myUsers)
{
try
{
Session session=sessionFactor.getCurrentSession();
session.save(myUsers);

return "user created";
}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}

return "cannot create user";

}

//by id

public MyUsers getusersById(String Id){
	{
	try
	{
	Session session= sessionFactor.getCurrentSession();

	Query query=session.createQuery("FROM MyUsers e WHERE e.userName=:idparam");
	query.setParameter("idparam", Id);
	MyUsers user=(MyUsers) query.uniqueResult();

	return user;
	}
	catch (Exception e) {
	e.printStackTrace();
	}


	return null;



	}



	}

//by pass

public MyUsers getusersByPassword(String pass){
	{
	try
	{
	Session session= sessionFactor.getCurrentSession();

	Query query=session.createQuery("FROM MyUsers f WHERE f.password=:passparam");
	query.setParameter("passparam", pass);
    MyUsers user1=(MyUsers) query.uniqueResult();

	return user1;
	}
	catch (Exception e) {
	e.printStackTrace();
	}


	return null;



	}



	}

//update


public String updatePassword(String oldpass, String newpass){
	{
	try
	{
	Session session= sessionFactor.getCurrentSession();

	String queryString = "update MyUsers s set s.password=:newPass where s.password=:oldPass";
    Query query = session.createQuery(queryString);
    query.setParameter("newPass", newpass);
    query.setParameter("oldPass", oldpass);
    
    query.executeUpdate();
    
   int res = query.executeUpdate();
	if(res>0)
	return	"Password Updated";
	}
	
	catch (Exception e) {
	e.printStackTrace();
	}


	return "Password not Updated";



	}



}
}










