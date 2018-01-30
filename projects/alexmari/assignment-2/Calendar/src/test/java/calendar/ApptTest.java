package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;
import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());    		
	 }

	 //to test set appointment methods (setStartHour, setStartMin, setStartDay, setStartMonth,
	 //setStartYear, setTitle, setDescription)
	 @Test
	  public void test02()  throws Throwable  {
		 //initial appointment settings
		 int startHour2=23;
		 int startMin2=0;
		 int startDay2=10;
		 int startMonth2=02;
		 int startYear2=2020;
		 String title2="Test Appointment 2/10/2020";
		 String description2="Testing february leap year set up and 23rd hour setup";
		 
		 //new appointment settings to use for set- methods 
		 int newHour=13;
		 int newMin=20;
		 int newDay=13;
		 int newMonth=04;
		 int newYear=2030;
		 String newTitle="Was Appointment on 2/10/2020";
		 String newDescript="Testing setStart methods";
		 
		 //setting initial appointment object with test data 2
		 Appt appt2 = new Appt(startHour2,
				 startMin2,
				 startDay2,
				 startMonth2,
				 startYear2,
				 title2,
				 description2);
		 
		 //the start of assertions
		 //assertTrue(appt2.getValid());
		 //assertEquals(23, appt2.getStartHour());
		 //assertEquals(0, appt2.getStartMinute());
		 //assertEquals(10, appt2.getStartDay());
		 //assertEquals(02, appt2.getStartMonth());
		 //assertEquals(2020, appt2.getStartYear());
		 //assertEquals("Test Appointment 2/10/2020", appt2.getTitle());
		 //assertEquals("Testing february leap year set up and 23rd hour setup", appt2.getDescription());
		 
		 appt2.setStartHour(newHour);
		 appt2.setStartMinute(newMin);
		 appt2.setStartDay(newDay);
		 appt2.setStartMonth(newMonth);
		 appt2.setStartYear(newYear);
		 appt2.setTitle(newTitle);
		 appt2.setDescription(newDescript);
		 
		 assertTrue(appt2.getValid());
		 assertEquals(13, appt2.getStartHour());
		 assertEquals(20, appt2.getStartMinute());
		 assertEquals(13, appt2.getStartDay());
		 assertEquals(04, appt2.getStartMonth());
		 assertEquals(2030, appt2.getStartYear());
		 assertEquals("Was Appointment on 2/10/2020", appt2.getTitle());
		 assertEquals("Testing setStart methods", appt2.getDescription());
		 
	 }
//add more unit tests as you needed
	 
	 //to test recurrence get and set methods
	 @Test
	 public void test03()	throws Throwable{
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2000;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 int[] checkRecurDays = new int [0];
		 //Construct a new Appointment object with the initial data	 
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 //at this point recurrence should be equal to zero and monthly and recurring never
		 assertEquals(2, appt3.getRecurBy());
		 assertArrayEquals(checkRecurDays, appt3.getRecurDays());
		 assertEquals(0, appt3.getRecurIncrement());
		 assertEquals(0, appt3.getRecurNumber());
		 
		 
	 }
	 
	 @Test
	 public void test03b()	throws Throwable{
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2000;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 int[] checkRecurDays = new int [0];
		 //Construct a new Appointment object with the initial data	 
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 //at this point recurrence should be equal to zero and monthly and recurring never
		 //assertEquals(2, appt3.getRecurBy());
		 //assertArrayEquals(checkRecurDays, appt3.getRecurDays());
		 //assertEquals(0, appt3.getRecurIncrement());
		 //assertEquals(0, appt3.getRecurNumber());
		 
		 //establishing variables for checking recurrence
		 int[] recurDays= new int [3];
		 int yearlyRecur=3;
		 int recurIncrement=1;
		 int recurNumber=1000;
		 
		 //checking setRecurDays with entering null value and actual value
		 //as well as if the setRecurrence method has worked
		 appt3.setRecurrence(null, yearlyRecur, recurIncrement, recurNumber);
		 
		 assertEquals(3, appt3.getRecurBy());
		 assertArrayEquals(checkRecurDays, appt3.getRecurDays());
		 assertEquals(1, appt3.getRecurIncrement());
		 assertEquals(1000, appt3.getRecurNumber());
		 
		 //check if the is recurring statement works
		 assertTrue(appt3.isRecurring());
		 
		 /*appt3.setRecurrence(recurDays, yearlyRecur, recurIncrement, recurNumber);
		 
		 assertEquals(3, appt3.getRecurBy());
		 assertArrayEquals(recurDays, appt3.getRecurDays());
		 assertEquals(1, appt3.getRecurIncrement());
		 assertEquals(1000, appt3.getRecurNumber());*/
		 
		 //check if the is recurring statement works
		 //assertTrue(appt3.isRecurring());
		 
	 }
	 
	 @Test
	 public void test03c()	throws Throwable{
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2000;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 int[] checkRecurDays = new int [0];
		 //Construct a new Appointment object with the initial data	 
		 Appt appt3 = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
		 
		 //at this point recurrence should be equal to zero and monthly and recurring never
		 //assertEquals(2, appt3.getRecurBy());
		 //assertArrayEquals(checkRecurDays, appt3.getRecurDays());
		 //assertEquals(0, appt3.getRecurIncrement());
		 //assertEquals(0, appt3.getRecurNumber());
		 
		 //establishing variables for checking recurrence
		 int[] recurDays= new int [3];
		 int yearlyRecur=3;
		 int recurIncrement=1;
		 int recurNumber=1000;
		 
		 //checking setRecurDays with entering null value and actual value
		 //as well as if the setRecurrence method has worked
		 /*appt3.setRecurrence(null, yearlyRecur, recurIncrement, recurNumber);
		 
		 assertEquals(3, appt3.getRecurBy());
		 assertArrayEquals(checkRecurDays, appt3.getRecurDays());
		 assertEquals(1, appt3.getRecurIncrement());
		 assertEquals(1000, appt3.getRecurNumber());
		 
		 //check if the is recurring statement works
		 assertFalse(appt3.isRecurring());*/
		 
		 appt3.setRecurrence(recurDays, yearlyRecur, recurIncrement, recurNumber);
		 
		 assertEquals(3, appt3.getRecurBy());
		 assertArrayEquals(recurDays, appt3.getRecurDays());
		 assertEquals(1, appt3.getRecurIncrement());
		 assertEquals(1000, appt3.getRecurNumber());
		 
		 //check if the is recurring statement works
		 assertTrue(appt3.isRecurring());
		 
	 }
	 
	//to test isValid if else statement where hour, minute, day and month are all out of range
	//note: month will stay out of range for tests 4, 5, 6 and 7
	/*@Test
	public void test04()	throws Throwable{
		int startHour=30;
		int startMinute=70;
		int startDay=89;
		int startMonth=14;
		int startYear=1995;
		String title="All variables Out of range Appointment";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		
		//test isValid
		assertFalse(appt.getValid());
	}
	//testing isValid with only hour in range
	@Test
	public void test05()	throws Throwable{
		int startHour=20;
		int startMinute=70;
		int startDay=89;
		int startMonth=14;
		int startYear=1995;
		String title="only start hour in range Appointment";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		
		//test isValid
		assertFalse(appt.getValid());
	}
	
	//testing isValid with only Hour and minute in range
	@Test
	public void test06()	throws Throwable{
		int startHour=20;
		int startMinute=40;
		int startDay=89;
		int startMonth=14;
		int startYear=1995;
		String title="Start hour and minute in range Appointment";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		
		//test isValid
		assertFalse(appt.getValid());
	}
	
	//testing isValid with only Hour, minute and days in range but month still out of range
	@Test
	public void test07()	throws Throwable{
		int startHour=20;
		int startMinute=40;
		int startDay=1;
		int startMonth=14;
		int startYear=1995;
		String title="start hour, minute, and day in range Appointment";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		
		//test isValid
		assertFalse(appt.getValid());
	}
	/* these test will only have the month in range to see how it affects the isValid method
	 * I noticed that this method heavily relies on the StartMonth variable
	 * */
	@Test
	public void test08()	throws Throwable{
		int startHour=30;
		int startMinute=70;
		int startDay=89;
		int startMonth=04;
		int startYear=1995;
		String title="Only month in range Appointment";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		
		//test isValid
		assertFalse(appt.getValid());
	}
	//testing isValid with only hour in range
	@Test
	public void test09()	throws Throwable{
		int startHour=20;
		int startMinute=70;
		int startDay=89;
		int startMonth=04;
		int startYear=1995;
		String title="Hour and month in range Appointment";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		
		//test isValid
		assertFalse(appt.getValid());
	}
	
	//testing isValid with only Hour and minute in range
	@Test
	public void test10()	throws Throwable{
		int startHour=20;
		int startMinute=40;
		int startDay=89;
		int startMonth=04;
		int startYear=1995;
		String title="hour, minute and month in range Appointment";
		String description="This is my birthday party.";
		//Construct a new Appointment object with the initial data	 
		Appt appt = new Appt(startHour,
		         startMinute ,
		         startDay ,
		         startMonth ,
		         startYear ,
		         title,
		         description);
		
		//test isValid
		assertFalse(appt.getValid());
	}
	
	//testing toString and compareTo methods
	@Test
	public void test11()	throws Throwable{
		int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="in bounds Appointment for toString and compare";
		 String description="Test toString and compareTo methods";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	
		 //String apptString= startMonth + "/" + startDay + "/" + startYear + " at ";
		 //String fullApptString= "\t" + "9:30pm" + " ," + title + ", " + description + "\n";
		 assertTrue(appt.getValid());
		 //assertEquals(fullApptString, appt.toString());
		 
		 //I am not sure if this is a good test but here goes
		 assertEquals(0, appt.compareTo(appt));
		 
	}
	
}
