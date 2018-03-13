package calendar;


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;

	

/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {
	public static final long TestTimeOut = 60 * 500 * 1;
	public static final int numOfTests = 10;
    /**
     * Generate Random Tests that tests CalDay Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

		GregorianCalendar thisday = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
		CalDay listAppts = new CalDay(thisday);
		System.out.println("Start testing...");
		 
		try{ 
			for (int iteration = 0; elapsed < TestTimeOut; iteration++) {
				long randomseed =System.currentTimeMillis(); //10
	//			System.out.println(" Seed:"+randomseed );
				Random random = new Random(randomseed);
				
				
				//for (int rna = 0; rna< ValuesGenerator.getRandomIntBetween(random, 0, 5); rna++){
				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 80);
				 //will be used for the rest of test
				 int startDay=ValuesGenerator.RandInt(random);;
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
				 
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
				 if(!appt.getValid()){
					 try{
						 listAppts.addAppt(appt);
					 }catch(NullPointerException e){
						 
					 }
					 continue;
				 }
				
			 //int[] checkRecurDays = new int[0];
			 //assertEquals(checkRecurDays, appt.getRecurDays());
				int me = ValuesGenerator.getRandomIntBetween(random, 0, 2);
				if(me == 2){
					for (int i = 0; i < numOfTests; i++) {
						String methodName = ApptRandomTest.RandomSelectMethod(random);
						if (methodName.equals("setRecurrence")){
							int sizeArray=ValuesGenerator.getRandomIntBetween(random, 0, 8);
							int[] recurDays=ApptRandomTest.RandomSelectRecurDays(random);
							int recur=ApptRandomTest.RandomSelectRecur(random);
							int recurIncrement = ValuesGenerator.RandInt(random);
							int recurNumber=ApptRandomTest.RandomSelectRecurForEverNever(random);
							appt.setRecurrence(recurDays, recur, recurIncrement, recurNumber);
						   //if(appt.getRecurDays().equals(checkRecurDays)){
							   //assertEquals(checkRecurDays)
						}
					}
				}
			 	listAppts.addAppt(appt);
				
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			        if((iteration%10000)==0 && iteration!=0 )
			              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeOut);
			 
			}
		}catch(NullPointerException e){
			
		}
		 
	 }


	
}
