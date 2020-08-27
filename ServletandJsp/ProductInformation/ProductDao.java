package com.myserv.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.myserv.dbutil.DbConnection;
import com.myserv.model.Product;

public class ProductDao {

//create new product
public String saveProduct(Product product)
{

try{
Connection con= DbConnection.getConnect();
String sql="insert into products values(?,?,?,?,?,?)";
PreparedStatement stat=con.prepareStatement(sql);

stat.setInt(1, product.getProdId());
stat.setString(2, product.getProdName());
stat.setFloat(3, product.getProdPrice());
stat.setDate(4, new java.sql.Date(product.getMfd().getTime()));
stat.setString(5, product.getColour());
stat.setDate(6, new java.sql.Date(product.getExpDate().getTime()));


int res= stat.executeUpdate();
if(res>0)
return "Product Created";


}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return "cannot create product";
}


//display product details
public ArrayList<Product> getAllProducts()
{
try
{

Connection con=DbConnection.getConnect();
String sql="select * from products";

PreparedStatement stat=con.prepareStatement(sql);
ResultSet rs= stat.executeQuery();

ArrayList<Product> productList=new ArrayList<>();

while(rs.next())
{
int prodId= rs.getInt("prod_id");
String prodName= rs.getString("prod_name");
float prodPrice= rs.getFloat("prod_price");
Date mfd= rs.getDate("mfd");
String colour= rs.getString("colour");
Date expDate=rs.getDate("exp_date");

Product product=new Product(prodId, prodName, prodPrice, mfd, colour, expDate);

productList.add(product);

}

return productList;

}
catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
}
return null;
}

//delete
public String deleteProductById(int productId){
try
{
	Connection con=DbConnection.getConnect();

String sql="delete from products where prod_id=?";
PreparedStatement stat=con.prepareStatement(sql);


stat.setInt(1, productId);

int res= stat.executeUpdate();
if(res>0){
return "product deleted";
}

}
catch (Exception e) {
e.printStackTrace();

}

return "product not deleted";
}

//search
public ArrayList<Product> searchProductByName(String data) {
	
	{
		try
		{

		Connection con=DbConnection.getConnect();
		String sql="select * from products where PROD_NAME LIKE '%"+data+"%'";

		PreparedStatement stat=con.prepareStatement(sql);
		ResultSet rs= stat.executeQuery();

		ArrayList<Product> productList=new ArrayList<>();

		while(rs.next())
		{
		int prodId= rs.getInt("prod_id");
		String prodName= rs.getString("prod_name");
		float prodPrice= rs.getFloat("prod_price");
		Date mfd= rs.getDate("mfd");
		String colour= rs.getString("colour");
		Date expDate=rs.getDate("exp_date");

		Product product=new Product(prodId, prodName, prodPrice, mfd, colour, expDate);

		productList.add(product);

		}

		return productList;

		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
	
	
	
	return null;
}


}
}