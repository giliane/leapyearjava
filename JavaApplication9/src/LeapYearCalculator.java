/* 
 * LeapYearCalculator class	
 *
 * Assignament Computing Programing Lecture
 *
 * Author: Giliane Lima
 *
 * November 2016
 */
 
    public class LeapYearCalculator{
    
		
	/*method1 - public boolean, as it has to return either leap year is true or false,
	 *tried public void before, but it didn't work for the LeapYear print.out.
	 */
	 	
	public  boolean isLeapYear(int year){
	boolean ly = true;//variable to store information whether is Leap Year or not. 
	/*so to beggin "isLeapYear"="true"*/
	
	//bellow the idea is eliminate first what is not a leap year
		
	if(year % 4 !=0){//if reminder of year%4 IS NOT "0",go "return ly;", otherwise go to next"else if".     
	   ly = false;//if between brackects is true, variable "ly" becomes false. 
	}
	else if(year % 100!=0){//reminder of year%100 IS NOT "0",go "return ly;",otherwise go next else if.
	   ly = true;//if between brackects is true variable "ly" becomes true. 
	}		
	else if(year % 400!=0){//reminder of year%400 IS NOT "0", go "return ly;",otherwise go last "else".
	   ly = false;//if between brackects is true variable "ly" becomes false. 
	}
	else
	{
	   ly=true;//if the information got here, variable "ly" becomes true.
	}
	   return ly; //answer if it IS or IS NOT a leap year.	
	}
	
	// method2
	 
	public  void displayCalendar(int year){
	/* bellow there is a boolean variable to "call" my 1 st method and enable the correct 
	 * out.print of Leap Years(29 days in February) and also, to out.print 
	 * if the year is or not a leap year
     */	
	boolean isLeapYear = isLeapYear(year);
	if(isLeapYear) {//isLeapYear is a true boolean, but if after execute "if"it became false...
		System.out.println(year + " is a leap year");
	}
	else {//...go to else
		System.out.println(year + " is not a leap year"); 
	}
	/* bellow there are the code to print the days in each month.
	 *
     */ 	
	System.out.println("\n\n***** January ******\n");//print out the month. Couldn't find a better way.
	for(int d=1;d<=31;d++){ //to count the days of the month 
	if(d>0&&d<=9)           //the way to make the first week aligned with the others.
	System.out.print("0");  //to turn the one digit into two digits.		
	System.out.print(d+" ");//to give an space between the days.
	if((d % 7)==0){         //tried without the brakects it gave me 7, 14, 21
	System.out.println(" ");//line break to align the weeks
	}	
	}
	/* except by February, all the months have the exact same structure as January, so 
	 * they wont have comments in it.
	 */
	System.out.println("\n\n**** February ******\n");
	for(int d=1;d<=28;d++){
	if(d>0&&d<=9)
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}	
	}
	if(isLeapYear) {//if isLeapYear keep true after execute "if" process out.print next line...
		System.out.println("29");//...by add a string "29" February will have an extra day...
	}//...in Leap year. Wanted a more efective way, but could find it.
			
	System.out.println("\n\n****** March *******\n");
	for(int d=1;d<=31;d++){
	if(d>0&&d<=9)
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}
	
	System.out.println("\n\n****** April *******\n");
	for(int d=1;d<=30;d++){
	if(d>0&&d<=9)
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}
	
	System.out.println("\n\n******* May ********\n");
	for(int d=1;d<=31;d++){
	if(d>0&&d<=9)
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}
    
	System.out.println("\n\n******* June *******\n");
	for(int d=1;d<=30;d++){
	if(d>0&&d<=9)
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}
	
	System.out.println("\n\n******* July *******\n");
	for(int d=1;d<=31;d++){
	if(d>0&&d<=9)
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}
	
	System.out.println("\n\n****** August ******\n");
	for(int d=1;d<=31;d++){
	if(d>0&&d<=9)
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}
	
	System.out.println("\n\n**** September *****\n");
	for(int d=1;d<=30;d++){
	if(d>0&&d<=9)
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}
	
	System.out.println("\n\n***** October ******\n");
	for(int d=1;d<=31;d++){
	if(d>0&&d<=9)
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}
	
	System.out.println("\n\n***** November *****\n");
	for(int d=1;d<=30;d++){
	if(d>0&&d<=9)           
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}
	
	System.out.println("\n\n***** December *****\n");
	for(int d=1;d<=30;d++){
	if(d>0&&d<=9)         
	System.out.print("0");		
	System.out.print(d+" ");
	if((d % 7)==0){ 
	System.out.println(" ");
	}
	}	
	
	}
}
  