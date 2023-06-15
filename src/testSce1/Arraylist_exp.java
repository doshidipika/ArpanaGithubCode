package basicsOfJava;

import java.util.ArrayList;

public class Arraylist_exp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cNames=new ArrayList<String>(); // defining objects ( variable)
		System.out.println("Arraylist size before storing elements="+cNames.size()); // you will get 0 as output
		cNames.add("Jack"); // this will get story at 0th array position
		cNames.add("George"); // this will get story at 1st array position
		cNames.add("pooja"); // this will get story at 2nd array position
		cNames.add("Riya"); // this will get story at 3rd array position
		System.out.println("Arraylist size after storing elements="+cNames.size()); // u will get out put as 4 as 4 arrays defined
        System.out.println(cNames);
        
         for(int i=0;i<cNames.size();i++)
        	 {
        	   System.out.println(cNames.get(i)); //cNme size is 4 so prog will run till 3rd position ( which is 4th position as array start fro 0,1,2,3
        	   
        	 }
        	 
        cNames.add("diya");
        cNames.add(1, "tani"); // this will not replace whatever is at 1st location i.e. George' but ADD method will add new elements - diya and George will move to next lication i.e. 2nd location
        System.out.println("Arraylist after adding elements");
        
        for(int i=0;i<cNames.size();i++)
   	 {
   	   System.out.println(cNames.get(i)); //cNme size is 4 so prog will run till 3rd position ( which is 4th position as array start fro 0,1,2,3
   	   
   	 }  
        cNames.set(4, "roopali"); //updating element that is at 4th place with roopali
         System.out.println("Arraylist after updating elements");
        
        for(int i=0;i<cNames.size();i++)
   	 {
   	   System.out.println(cNames.get(i)); 
   	   
   	 }    
        
        if(cNames.contains("Roopali")) // as we use upper case for R so it will say element doesn't exist. SO lower/upper case does matter
        {
        	System.out.println("Element Exist");
        }
        else
        {
        	System.out.println("element NOT exists");
        }
        
        cNames.remove(4);    //updating element that is at 4th place with roopali
        System.out.println("Arraylist after removing elements");
       
       for(int i=0;i<cNames.size();i++)
  	 {
  	   System.out.println(cNames.get(i)); 
  	   
  	 }   
       
       cNames.clear();    //updating element that is at 4th place with roopali
       System.out.println("Arraylist after clearing elements");
       System.out.println("Arraylist after clearing elements. Clear will erase all elements");
      
        
        }
}
