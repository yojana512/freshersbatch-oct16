import java.util.Date;
import java.util.LinkedList;
import java.util.Set;
class date{
	static int month;
	static int day;
	static int year;


	public date(int day, int month, int year) { 
	this.day = day;
	this.month = month;
	this.year = year;
	}

	public static int getMonth() {
	return month;
	}

	public static int getDay() {
	return day;
	}

	public static int getYear() {
	return year;
	} 
   
  
   public String toString() {
	   return "" + day + ", " + month + " , " + year + "";
   }
   
    	
    }
 

public class Collection_4 {

	public static void main(String[] args) {
		LinkedList<date> list=new LinkedList<>();
		list.add(new date(23,12,2000));
		
        
		System.out.print("Your date of birth is "+date.getMonth()+"-"+date.getDay()+"-"+date.getYear());
		
		{
		if(date.getYear()%4==0)
		{
			System.out.print(" and it was a leap year.");
		}
		else
		{
			System.out.print(" and it was not a leap year.");
		}
		}
          list.add(new date(23,12,2001));
		
        
		System.out.print("\nYour date of birth is "+date.getMonth()+"-"+date.getDay()+"-"+date.getYear());
		
		{
		if(date.getYear()%4==0)
		{
			System.out.print("and it was a leap year");
		}
		else
		{
			System.out.print(" and it was not a leap year");
		}
		}	

	}
}

