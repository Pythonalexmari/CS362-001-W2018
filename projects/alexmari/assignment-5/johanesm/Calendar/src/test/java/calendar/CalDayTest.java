package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;
public class CalDayTest {

	
	 //create a calendar day of appointments with same day month and year, but different starting times
	 @Test
	  public void test01()  throws Throwable  {
		 //LinkedList<Appt> listAppts = new LinkedList<Appt>();
		 GregorianCalendar thisday = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		 CalDay listAppts = new CalDay(thisday);
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
		 
		 listAppts.addAppt(appt);
		 
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
		 
		 listAppts.addAppt(appt2);
		 
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
		 
		 listAppts.addAppt(appt3);
		 
		 LinkedList<CalDay> linkedlist = new LinkedList<CalDay>();
		 
		 /*for (int i=0; i<listAppts.)
		 linkedlist = listAppts;
		 
		 Iterator it = linkedlist.iterator();
		 
		    // Iterating the list in forward direction
		    System.out.println("LinkedList elements:");
		    while(it.hasNext()){
		       System.out.println(it.next());
		    }*/
		 
		 assertEquals(3, listAppts.getSizeAppts());
		 assertNotNull(listAppts.toString());
		 /*try{
			 listAppts.iterator();
		 }catch(ArrayIndexOutOfBoundsException e ){
				System.out.println ("Array Index is Out Of Bounds");
			}*/

	 }
	 @Test
	  public void test02()  throws Throwable  {
		 GregorianCalendar theday = new GregorianCalendar(2018, Calendar.FEBRUARY, 26);
		 CalDay listAppts = new CalDay(theday);
		 
		 assertTrue(listAppts.isValid());
		 assertEquals(26, listAppts.getDay());
		 assertEquals(2018, listAppts.getYear());
		 assertEquals(1, listAppts.getMonth());
	 }
//add more unit tests as you needed	
	 @Test
	 public void test03()	throws Throwable	{
		 GregorianCalendar thisday = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		 CalDay listAppts = new CalDay(thisday);
		 assertTrue(listAppts.isValid());
		 assertEquals(0, listAppts.getSizeAppts());
		 assertNotNull(listAppts.toString());
		 //assertEquals(0, listAppts.getSizeAppts());
	 }
	 
	 @Test
	 public void test03b()	throws Throwable	{
		 try{
		 CalDay listAppts = new CalDay();
		 assertFalse(listAppts.isValid());
		 //assertEquals(0, listAppts.getSizeAppts());
		 assertEquals("", listAppts.toString());
		 //assertNull(listAppts.getSizeAppts());
		 }
		 catch(NullPointerException e){
			 System.out.print("threw null pointer exception");
		 }
	 }
	 
	 @Test
	 public void test04()	throws Throwable	{
		 GregorianCalendar thisday = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		 CalDay listAppts = new CalDay(thisday);
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
		 
		 listAppts.addAppt(appt);
		 
		 assertEquals(1, listAppts.getSizeAppts());
	 }
	 
	 @Test
	 public void test05()	throws Throwable	{
		 GregorianCalendar thisday = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		 CalDay listAppts = new CalDay(thisday);
		 //assertFalse(listAppts.CalDay());
		 
		 int startHour=10;
		 int startMinute=30;
		 int startDay=16;
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
		 
		 listAppts.addAppt(appt);
		 
		 Appt appt2 = new Appt(80, 20, 1, 1, 2018, "", "");
		 listAppts.addAppt(appt2);
		 //assertEquals(1, listAppts.getSizeAppts());
		 //assertEquals(listAppts.getAppts().iterator(), listAppts.iterator());
		 try{
			 System.out.print("Original contents of listAppts: ");
		 
	     Iterator<?> itr = listAppts.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + "\n");
	      }
	      System.out.println();
		 }catch(NullPointerException e){
			 System.out.println("null pointer exception");
		 }
	 }
	 @Test
	 public void test06()	throws Throwable	{
		 CalDay listAppts = new CalDay();
		 //assertFalse(listAppts.isValid());
		 //assertEquals(0, listAppts.getSizeAppts());
		 //assertEquals("", listAppts.toString());
		 //assertNull(listAppts.getSizeAppts());
		 
		 try{
			 Appt appt = new Appt(24, 0, 1, 1, 2018, "", "");
			 listAppts.addAppt(appt);
		 }catch(ArrayIndexOutOfBoundsException e ){
				System.out.println ("Array Index is Out Of Bounds");
			}
	 }
	 @Test
	 public void test07()	throws Throwable	{
		 GregorianCalendar thisday = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		 CalDay listAppts = new CalDay(thisday);
		 //assertFalse(listAppts.CalDay());
		 
		 int startHour=10;
		 int startMinute=30;
		 int startDay=16;
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
		 
		 listAppts.addAppt(appt);
		 
		 Appt appt2 = new Appt(20, 20, 1, 1, 2018, "", "");
		 listAppts.addAppt(appt2);
		 //assertEquals(1, listAppts.getSizeAppts());
		 //assertEquals(listAppts.getAppts().iterator(), listAppts.iterator());
		 try{
			 System.out.print("Original contents of listAppts: ");
		 
	     Iterator<?> itr = listAppts.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + "\n");
	      }
	      System.out.println();
		 }catch(NullPointerException e){
			 System.out.println("null pointer exception");
		 }
	 }
	 
	 @Test
	 public void test08()	throws Throwable	{
		 GregorianCalendar thisday = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		 CalDay listAppts = new CalDay(thisday);
		 //assertFalse(listAppts.CalDay());
		 
		 int startHour=100;
		 int startMinute=30;
		 int startDay=16;
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
		 
		 listAppts.addAppt(appt);
		 
		 Appt appt2 = new Appt(80, 20, 1, 1, 2018, "", "");
		 listAppts.addAppt(appt2);
		 //assertEquals(1, listAppts.getSizeAppts());
		 //assertEquals(listAppts.getAppts().iterator(), listAppts.iterator());
		 try{
			 System.out.print("Original contents of listAppts: ");
		 
	     Iterator<?> itr = listAppts.iterator();
	      
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + "\n");
	      }
	      System.out.println();
		 }catch(NullPointerException e){
			 System.out.println("null pointer exception");
		 }
	 }
}
