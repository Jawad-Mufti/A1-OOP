import static dit042.SimpleIO.*;                                         // we import simpleIO library from (dit042 package) 
public class Assignment    {                                             // the name of the class and it should be the same as the name in the .java file in the package

	public static void main(String[] args) {
		
		 String s1 ;                                                     // we make two string in the first s1 and s1 to use it in the whole do-while loop
		 String s2 ;                                                    // this is the second string
		 char ch ;
	println("");
	println("        ********************************");                  // here we print  the introduction by (println();) function to make the coordinated box
	println("        **                            **");        
    println("        **    Welcome to the DIT042   **");
    println("        **        String Library      **");
    	println("        **                            **");
    	println("        ********************************");
   
    do {                                                               	// we start the do-while loop here 
    println("");
    	println("Please choose a String operation or press 'q' to quit:");   // we print the menu 
    	println("Press c for concatenation");
    	println("Press e for equals");
    	println("Press s for substring");
    	println("Press t for trim");
    	println("Press l for lastIndexOf");
    
	
    
    	ch=readChar();                                   // we make char ch readable by readchar(); function
    	if (ch=='q') {println("Thanks! Goodbye.");}     // now here we start the first if statement if the user click 'q' it will print the "thanks goodbye" 
   
                                                 	// now we have to put the function for the characters in the menu
                                                 	// we start with character 'c' by using else-if statement and we will use it for all characters 
  
    	else if (ch=='c') {                         //if the user click 'c'
    		
    	println("Please enter the first string:");
     	s1=readString();                               //save first string in S1
    	println("Please enter the second string:");
        s2=readString();                             //save second string in S2
        String s3 ;                                 //here we make third string and put it as = to S1 to be initialized when i print it outside the for loop
        s3=s1;                                     //and to add  s1 to the s2 characters and put it inside the s3 string
       for(int i=0;i<s2.length();i++) {           // now we have to put the character of S2 string beside S1 using for loop
    	                                             // the for loop will start from index 0 until the  last index in S2
    	   s3=s3+s2.charAt(i) ;                     // so now we put s2 characters from index 0 to the last one with s1 string (the loop will stop in the last index)
       } 
         
    println("The result of concatenating "+ s1+ " and "+ s2+ " is " + s3);      // we print s3 that contain s1+s1 but we did it with for loop
    println("");
       }                                         // we start the second else-if and we still inside the first if , we will continue with this way until the last character
       
    	else if(ch=='e') {
    boolean eq = false;                         // making boolean and initialized it as false 
   
    println("Please enter the first string:");
    	s1=readString();
    	println("Please enter the second string:");
    	s2=readString(); 
    if (s1.length()!=s2.length()) {eq=false;}           //    we make condition that if the length of S1 not equal S2 make the boolean eq false and print it directly
    	else {                                             // if it has the same length 
    for(int i=0;i<s2.length();i++) {                   // we make for loop to get s2 characters to compare it
    	
    	if(	s1.charAt(i)!=s2.charAt(i)) 
    	{eq=false;                                        // here the loop will compare s1 character at i with s2 character at i  if one 
    break ;	}                                        //of the characters is not the same eq will be false and stop the loop directly
    	else {eq=true;}                                  // if the character is the same keep the loop going until we compared all the characters
    		
    	}
    	}
    	println("The result of comparing Hey and hey is: " +  eq);
    	println("");
    	}
    	
    	else if(ch=='s') {
    		
    	 println("Please enter the string:"); 
      	s1=readString();                                    // read string and put it in S1 
     	int index1 , index2 ;
    	println("Please enter the first index: ");
    	    index1=readInt();                                  // read the index (integer) and put it in index1
    	 
    	println("Please enter the second index: ");
      	index2=readInt();                                 // read the index2  and put it in index2
    	String s3="";                                        // we initialize string s3 "empty"
    	
    	if (index2>s1.length()) {                           // before everything we make if statement to know if the index2 is larger than s1 length
    		while (index2 > s1.length()) {                 // if the condition is valid we make while-loop every time the condition is valid ask the user to input new index
    			println("Please enter vaild index ! ");
    			index2 = readInt();                       // this is very important point in the while-loop  , read the index2 again 
    		}
    	}
              	                                      /* if the first condition is not valid we make for loop between the index1 and < than index2 
                                                     	( not <= because the index2 has to be -1 the real index2 when we print it out)*/
    	
    	for(int i=index1 ; i<index2;i++) {
    	
    		s3=s3+s1.charAt(i);                               // we put the string characters one by one in the empty string s3
    	}
    	println("The resulting substring is: "+s3);           // then print it out as string s3
    	println(""); 
    	}
     	
    	else if (ch=='t') {
    println("Please enter a sentence to trim:");
    		s1=readLine();                           //read the line (not string) and put it in S1
    	    char c = ' ';                           // we make char type named it c and make it equal to "space" to use it in for loop later 
    		String s3 = "";                        // also empty string called s3
    	    for (int i=0;i<s1.length();i++)     
    			{                                    // make if statement inside the for loop to get rid of  white spaces
    				if (s1.charAt(i)!=c) {          // if the character is not white space put it in the empty string s3
    					s3=s3+s1.charAt(i);         // so it will cut all the spaces and put it in one new string s3
    				}
    				
    			}
    			println("The resulting trimmed sentence is: "+ s3);        // print it out
    			println("");
           	}
    	else if(ch=='l') {
    		char charc ;                                  // we create char type and named it "charc"
    		println("Please enter a string: ");
    	s1=readString();                                 //Initialized string s1 (readable)
        println("Please enter a character:");
    	charc=readChar();                                  // initialized "charc" (readable)
    	int pos =-1;                               // we initialize int "pos" as -1 to used it later if the condition is not valid so it will print pos as -1
    	for (int i = 0; i < s1.length(); i++) {   // we start for loop and an if statement inside it 
			if (charc == s1.charAt(i)) {     //the for loop will run the s1 characters one by one and see if the character that
				pos=i;                      // the user write  is in s1 characters  then if its it will make "pos" = to the number of the index for this character
			}                               // if the character that the user write it is note in the string , the condition is not valid and "pos" will still -1
			
		}
    	println("The index of character " + charc +" in string "+s1+ "is: " + pos);                     // print "pos" 
    	println("");
    	}
    	else {println("This is not a valid choice. Please retry! ");              // this else is for the first if , so if  the user did not write one of the characters up 
        	println("");                                // it will print out that enter valid characters that are in the menu 
    	}
    } while(ch !='q');                             //this while is for the first do , so it will check the condition  after all the orders in the do 
                                                    // if the the user  write q it will do nothing and the program will stop( because of the first if up and the while 
                                                   // function !) but if it is not q it will start the do loop again and again !!!
    }
}