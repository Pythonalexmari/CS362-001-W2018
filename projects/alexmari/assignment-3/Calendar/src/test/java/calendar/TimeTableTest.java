package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
		 //GregorianCalendar thisday = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		 //CalDay listAppts = new CalDay(thisday);
		 //assertFalse(listAppts.CalDay());
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 
		 int startHour=10;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Appointment 1 to add to list 1";
		 String description="Starts at 10:30 first day";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 listAppts.add(appt);
		 
		 //GregorianCalendar nextday = new GregorianCalendar(2018, Calendar.FEBRUARY, 16);
		 //CalDay listAppts2 = new CalDay(nextday);
		 //assertFalse(listAppts.CalDay());
		 
		 int startHour2=8;
		 int startMinute2=30;
		 int startDay2=16;
		 int startMonth2=01;
		 int startYear2=2018;
		 String title2="Appointment 1 to add to list 2";
		 String description2="Starts at 8:30 next day";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour2,
		          startMinute2 ,
		          startDay2 ,
		          startMonth2 ,
		          startYear2 ,
		          title2,
		         description2);
		 
		 listAppts.add(appt2);
		 
		 int startHour3=8;
		int startMinute3=30;
		int startDay3=16;
		int startMonth3=01;
		int startYear3=2018;
		String title3="Appointment 1 to add to list 2";
		String description3="Starts at 8:30 next day";
		//Construct a new Appointment object with the initial data	 
		Appt appt3 = new Appt(startHour3,
		         startMinute3 ,
		         startDay3 ,
		         startMonth3 ,
		         startYear3 ,
		         title3,
		     description3);
			
		int[] recurDays = {2,3,1,5,6,7,8};
		int recurBy = Appt.RECUR_BY_WEEKLY;
		int recurIncrement = Appt.RECUR_BY_MONTHLY;
		int recurNumber = Appt.RECUR_NUMBER_FOREVER;
		
		appt3.setRecurrence(recurDays, recurBy, recurIncrement, recurNumber);
		
		listAppts.add(appt3);
		
		int startHour4=9;
		int startMinute4=30;
		int startDay4=16;
		int startMonth4=01;
		int startYear4=2018;
		String title4="Appointment 1 to add to list 2";
		String description4="Starts at 8:30 next day";
		//Construct a new Appointment object with the initial data	 
		Appt appt4 = new Appt(startHour4,
		         startMinute4 ,
		         startDay4 ,
		         startMonth4 ,
		         startYear4 ,
		         title4,
	        description4);
		
		int[] recurDays2 = {2,3};
		int recurBy2 = Appt.RECUR_BY_MONTHLY;
		int recurIncrement2 = Appt.RECUR_BY_WEEKLY;
		int recurNumber2 = Appt.RECUR_NUMBER_FOREVER;
		
		appt4.setRecurrence(recurDays2, recurBy2, recurIncrement2, recurNumber2);
		
		listAppts.add(appt4);
		
		 
		 GregorianCalendar aDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		 GregorianCalendar theNextDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 16);
		 TimeTable timeTable=new TimeTable();
		 //assertSame(timeTable.getApptRange(listAppts, theNextDay, aDay));
		 try{
			 timeTable.getApptRange(listAppts, aDay, theNextDay);
		 }catch(DateOutOfRangeException e ){
				System.out.println ("Date out of range");
			}
		 try{
			 timeTable.getApptRange(listAppts, theNextDay, aDay);
		 }catch(DateOutOfRangeException e ){
				System.out.println ("Date out of range");
			}
		 int[] pv = {1};
		 try{
			 timeTable.permute(listAppts, pv);
		 }catch(IllegalArgumentException e){
			 System.out.println("Illegal Argument Exception");
		 }
		 int[] pv2 = {1,2,3,2};
		 //System.out.println("linked list size:");
		 //System.out.println(listAppts.size());
		 
		 //System.out.println("pv2 size:");
		 //System.out.println(pv2.length);
		 
		 try{
			 timeTable.permute(listAppts, pv2);
		 }catch(IndexOutOfBoundsException e){
			 System.out.println("Illegal Argument Exception");
		 }
	 }
	 @Test
	  public void test02()  throws Throwable  {
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 Appt appt = new Appt(0,0,50,1,2018,"","");
		 listAppts.add(appt);
		 
		 
		 int startHour2=8;
		 int startMinute2=30;
		 int startDay2=16;
		 int startMonth2=01;
		 int startYear2=2018;
		 String title2="Appointment 1 to add to list 2";
		 String description2="Starts at 8:30 next day";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt2 = new Appt(startHour2,
		          startMinute2 ,
		          startDay2 ,
		          startMonth2 ,
		          startYear2 ,
		          title2,
		         description2);
		 
		 listAppts.add(appt2);
		 
		 TimeTable timeTable=new TimeTable();
		 try{
		 timeTable.deleteAppt(null, null);
		 timeTable.deleteAppt(null, appt);
		 timeTable.deleteAppt(listAppts, null);
		 timeTable.deleteAppt(listAppts, appt);
		 }catch(NullPointerException e){
			System.out.println("Null pointer exception");
		 }
		 //assertNotSame("", timeTable.deleteAppt(listAppts, appt2));
	 }
//add more unit tests as you needed
	 @Test
	  public void test03()  throws Throwable  {
		//GregorianCalendar thisday = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		//CalDay listAppts = new CalDay(thisday);
		//assertFalse(listAppts.CalDay());
		LinkedList<Appt> listAppts = new LinkedList<Appt>();
		
		int startHour=10;
		int startMinute=30;
		int startDay=15;
		int startMonth=01;
		int startYear=2018;
		String title="Appointment 1 to add to list 1";
		String description="Starts at 10:30 first day";
		//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
				startMinute ,
		        startDay ,
		        startMonth ,
		        startYear ,
		        title,
		    description);
		 
		listAppts.add(appt);
		 
		//GregorianCalendar nextday = new GregorianCalendar(2018, Calendar.FEBRUARY, 16);
		//CalDay listAppts2 = new CalDay(nextday);
		//assertFalse(listAppts.CalDay());
		
		int startHour2=8;
		int startMinute2=30;
		int startDay2=16;
		int startMonth2=01;
		int startYear2=2018;
		String title2="Appointment 1 to add to list 2";
		String description2="Starts at 8:30 next day";
		//Construct a new Appointment object with the initial data	 
		Appt appt2 = new Appt(startHour2,
		         startMinute2 ,
		         startDay2 ,
		         startMonth2 ,
		         startYear2 ,
		         title2,
	        description2);
		
		int[] recurDays = {2,3};
		int recurBy = Appt.RECUR_BY_WEEKLY;
		int recurIncrement = Appt.RECUR_BY_WEEKLY;
		int recurNumber = Appt.RECUR_NUMBER_FOREVER;
		
		appt2.setRecurrence(recurDays, recurBy, recurIncrement, recurNumber);
		
		listAppts.add(appt2);
		
		int startHour3=8;
		int startMinute3=30;
		int startDay3=17;
		int startMonth3=01;
		int startYear3=2018;
		String title3="Appointment 3 to add to list 2";
		String description3="Starts at 8:30 next day";
		//Construct a new Appointment object with the initial data	 
		Appt appt3 = new Appt(startHour3,
		         startMinute3 ,
		         startDay3 ,
		         startMonth3 ,
		         startYear3 ,
		         title3,
	        description3);
			
		listAppts.add(appt3);
		
		Appt appt4 = new Appt(24, 0,17,1,2018, "", "");
		
		listAppts.add(appt4);
		
		int startHour5=8;
		int startMinute5=30;
		int startDay5=15;
		int startMonth5=01;
		int startYear5=2018;
		String title5="Appointment 5 to add to list 2";
		String description5="Starts at 8:30 next day";
		//Construct a new Appointment object with the initial data	 
		Appt appt5 = new Appt(startHour5,
		         startMinute5 ,
		         startDay5 ,
		         startMonth5 ,
		         startYear5 ,
		         title5,
	        description5);
			
		listAppts.add(appt5);
		
		GregorianCalendar aDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		GregorianCalendar theNextDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 17);
		TimeTable timeTable=new TimeTable();
		//assertSame(timeTable.getApptRange(listAppts, theNextDay, aDay));
		try{
			timeTable.getApptRange(listAppts, aDay, theNextDay);
		}catch(DateOutOfRangeException e ){
			System.out.println ("Date out of range");
			}
		try{
			timeTable.getApptRange(listAppts, theNextDay, aDay);
		}catch(DateOutOfRangeException e ){
			System.out.println ("Date out of range");
			}
		try{
			timeTable.deleteAppt(listAppts, appt);
			timeTable.deleteAppt(listAppts, appt2);
			timeTable.deleteAppt(listAppts, appt3);
			timeTable.deleteAppt(listAppts, appt4);
			timeTable.deleteAppt(listAppts, appt5);
		}catch(NullPointerException e){
			System.out.println ("Null pointer exception");
		}
	 }
}
