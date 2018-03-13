package calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	public static final long TestTimeOut = 60 * 500 * 1;
	public static final int numOfTests = 10;
	LinkedList<Appt> listApptsWhole = new LinkedList<Appt>();
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
		 
			long startTime = Calendar.getInstance().getTimeInMillis();
			long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

			GregorianCalendar aDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
			GregorianCalendar theNextDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 16);
			TimeTable timeTable=new TimeTable();
			//CalDay listAppts = new CalDay(thisday);
			LinkedList<Appt> listAppts = new LinkedList<Appt>();
			
			System.out.println("Start testing...");
			 
			try{ 
				for (int iteration = 0; elapsed < TestTimeOut; iteration++) {
					long randomseed =System.currentTimeMillis(); //10
		//			System.out.println(" Seed:"+randomseed );
					Random random = new Random(randomseed);
					
					int rem = ValuesGenerator.getRandomIntBetween(random, 0, 10);
					if(rem == 3 || rem == 0){
						try{
							timeTable.deleteAppt(listAppts, null);
						}catch(NullPointerException e){
							continue;
						}
					}
					
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
							 listAppts.add(appt);
							 timeTable.deleteAppt(listAppts, appt);
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
						continue;
					}
				 	listAppts.add(appt);
				 	timeTable.deleteAppt(listAppts, appt);
				 	
					
					 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				        if((iteration%10000)==0 && iteration!=0 )
				              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeOut);
				 
				}
				
			}catch(NullPointerException e){
				
			}
			 
		 
	 }
	 
	 @Test
	 public void randomtest2() throws Throwable {
		 long startTime = Calendar.getInstance().getTimeInMillis();
			long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

			GregorianCalendar aDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
			GregorianCalendar theNextDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 16);
			TimeTable timeTable=new TimeTable();
			//CalDay listAppts = new CalDay(thisday);
			//LinkedList<Appt> listAppts = new LinkedList<Appt>();
			
			System.out.println("Start testing...");
			
			//long halfTime=TestTimeOut/2;
			 
			try{ 
				for (int iteration = 0; elapsed < TestTimeOut; iteration++) {
					long randomseed =System.currentTimeMillis(); //10
		//			System.out.println(" Seed:"+randomseed );
					Random random = new Random(randomseed);
					
					int rem = ValuesGenerator.getRandomIntBetween(random, 0, 10);
					if(rem == 3 || rem == 0){
						timeTable.deleteAppt(listApptsWhole, null);
					}
					if(rem == 4){
						timeTable.deleteAppt(null, null);
					}
					
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
							 listApptsWhole.add(appt);
							 timeTable.deleteAppt(listApptsWhole, appt);
						 continue;
					 }
					
				 //int[] checkRecurDays = new int[0];
				 //assertEquals(checkRecurDays, appt.getRecurDays());
					
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
							listApptsWhole.add(appt);
							timeTable.getApptRange(listApptsWhole, aDay, theNextDay);
							if (rem == 5 || rem == 9){
								timeTable.getApptRange(listApptsWhole, theNextDay, aDay);
							}
							timeTable.deleteAppt(listApptsWhole, appt);
						}
						
					
				 	
				 	
					
					 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
				        if((iteration%10000)==0 && iteration!=0 )
				              System.out.println("elapsed time: "+ elapsed + " of "+TestTimeOut);
				 
				}
					//timeTable.deleteAppt(listApptsWhole, appt);
				
			}catch(NullPointerException e){
				
			}catch(DateOutOfRangeException e){
			
			}
			
			
	 }
	 
	 @Test
	 public void randomRangeTest() throws Throwable {
		 long startTime = Calendar.getInstance().getTimeInMillis();
			long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

			GregorianCalendar aDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 15);
			GregorianCalendar theNextDay = new GregorianCalendar(2018, Calendar.FEBRUARY, 20);
			TimeTable timeTable=new TimeTable();
			//CalDay listAppts = new CalDay(thisday);
			//LinkedList<Appt> listAppts = new LinkedList<Appt>();
			
			System.out.println("Start testing...");
			
			long halfTime=TestTimeOut/2;
			 
			try{ 
				for (int iteration = 0; iteration < 10; iteration++) {
					long randomseed =System.currentTimeMillis(); //10
		//			System.out.println(" Seed:"+randomseed );
					Random random = new Random(randomseed);
					
					/*int rem = ValuesGenerator.getRandomIntBetween(random, 0, 10);
					if(rem == 3 || rem == 0){
						timeTable.deleteAppt(listApptsWhole, null);
					}
					if(rem == 4){
						timeTable.deleteAppt(null, null);
					}*/
					
					//for (int rna = 0; rna< ValuesGenerator.getRandomIntBetween(random, 0, 5); rna++){
					 int startHour=ValuesGenerator.getRandomIntBetween(random, 0, 12);
					 int startMinute=ValuesGenerator.getRandomIntBetween(random, 0, 59);
					 //will be used for the rest of test
					 int startDay=ValuesGenerator.getRandomIntBetween(random, 15, 20);
					 int startMonth=1;
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
					//listApptsWhole.add(appt);
					//timeTable.deleteAppt(listApptsWhole, appt);
					
					
				 //int[] checkRecurDays = new int[0];
				 //assertEquals(checkRecurDays, appt.getRecurDays());
					
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
						listApptsWhole.add(appt);
						//timeTable.deleteAppt(listApptsWhole, appt);
					}
					
					elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
					if((iteration%10000)==0 && iteration!=0 )
						System.out.println("elapsed time: "+ elapsed + " of "+TestTimeOut);
				System.out.println("about to appt range");
				timeTable.getApptRange(listApptsWhole, aDay, theNextDay);
				}	//timeTable.deleteAppt(listApptsWhole, appt);
			}catch(NullPointerException e){
				
			}
	 }


	
}
