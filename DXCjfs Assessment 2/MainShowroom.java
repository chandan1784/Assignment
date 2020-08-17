//Question 3

package com.mupack.demo;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;


public class MainShowroom {
	
	//Search car using the showroom name
	
	
		Map<String, List<Cars>> carstore1;

		public void SearchCarByShowroomName(String carName) {
			List<Cars> cars = carstore1.get(carName);
			System.out.println("Search car using the showroom name :");

			for(Cars ca:cars)
			{
						System.out.println(ca);
			}	
			System.out.println();
		}
		
	
	//sort the car based on year and name
	
	Map<String, List<Cars>> carstore2;

	public void SortTheCarBasedOnYearAndCarname(String name) {
		List<Cars> cars = carstore2.get(name);
		
		System.out.println("Sort the car based on year :");
		Collections.sort(cars, new YearSort());		
		for(Cars car:cars)
		{
			System.out.println(car);
			
		}
		System.out.println();
		
		
		System.out.println("Sort the car based on name :");
		Collections.sort(cars, new NameSort());		
		for(Cars car:cars)
		{
			System.out.println(car);
			
		}
		System.out.println();
	}
	
	
	//car details based on the showroom name and sortType(year/name)
	
	Map<String, List<Cars>> carstore3;

	public void displayByShowroomName3(String name) {
		List<Cars> cars = carstore3.get(name);
		
		System.out.println("Car details based on sort type manufacture year :");
		Collections.sort(cars, new YearSort());		
		for(Cars car:cars)
		{
			car.ShowCarDetails();
			
		}
		System.out.println();
		
		
		System.out.println("Car details based on sort type car name :");
		Collections.sort(cars, new NameSort());		
		for(Cars car:cars)
		{
			car.ShowCarDetails();
			
		}
		System.out.println();
	}
	
	
	//Driver or Main Method
	
	public static void main(String[] args) {

		Cars car1=new Cars(1998,"Scorpio");
	    Cars car2=new Cars(2004,"XUV300");
		Cars car3=new Cars(2009,"AUV500");

		List<Cars> cars105=new Vector<Cars>();

		cars105.add(car1);
		cars105.add(car2);
		cars105.add(car3);


		Showroom showroom=new Showroom("Mahindra Agency", 105,cars105);
		
		
		List<Cars> cars106=new Vector<Cars>();
		
		Cars car4=new Cars(2000,"Toyata");
	    Cars car5=new Cars(2010,"Benz");
		Cars car6=new Cars(2019,"Creta");

		

		cars106.add(car4);
		cars106.add(car5);
		cars106.add(car6);


		Showroom showroom1 =new Showroom("Toyata Agency", 106,cars106);

		
		MainShowroom m= new MainShowroom();
		
		
		m.carstore1=new HashMap<String,List<Cars>>();
		m.carstore1.put(showroom.getName(), showroom.getCars());
		m.carstore1.put(showroom1.getName(), showroom1.getCars());

		m.SearchCarByShowroomName("Toyata Agency");
		
		
		m.carstore2=new HashMap<String,List<Cars>>();
		m.carstore2.put(showroom.getName(), showroom.getCars());
		m.carstore2.put(showroom1.getName(), showroom1.getCars());
			
		m.SortTheCarBasedOnYearAndCarname("Mahindra Agency");
		
		
		m.carstore3=new HashMap<String,List<Cars>>();
		m.carstore3.put(showroom.getName(), showroom.getCars());
		m.carstore3.put(showroom1.getName(), showroom1.getCars());
					
		m.displayByShowroomName3("Mahindra Agency");

	

}
}
