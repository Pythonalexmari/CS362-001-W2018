package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalDayTest {

	
	 //create a calendar day of appointments with same day month and year, but different starting times
	 @Test
	  public void test01()  throws Throwable  {
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 
		 //assertFalse(listAppts.CalDay());
		 
		 int startHour=10;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Appointment 1 to add to list";
		 String description="Starts at 10:30";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 listAppts.add(appt);
		 
		 int startHour2=9;
		 int startMinute2=30;
		 int startDay2=15;
		 int startMonth2=01;
		 int startYear2=2018;
		 String title2="Appointment 2 to add to list";
		 String description2="Starts at 9:30";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour2,
		          startMinute2 ,
		          startDay2 ,
		          startMonth2 ,
		          startYear2 ,
		          title2,
		         description2);
		 
		 listAppts.add(appt2);
		 
		 int startHour3=7;
		 int startMinute3=30;
		 int startDay3=15;
		 int startMonth3=01;
		 int startYear3=2018;
		 String title3="Appointment 3 to add to list";
		 String description3="Starts at 7:30";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt3 = new Appt(startHour3,
		          startMinute3 ,
		          startDay3 ,
		          startMonth3 ,
		          startYear3 ,
		          title3,
		         description3);
		 
		 listAppts.add(appt3);
		 
		 LinkedList <CalDay> calday = new LinkedList<CalDay>();

	 }
	 @Test
	  public void test02()  throws Throwable  {
		 
	 }
//add more unit tests as you needed	
}
