/*PERILLO, ALLYZA DIANE J.
  BSIT-NW2C
  ACTIVITY 05B
 */


package dsaa;

import java.util.LinkedList;
import java.util.Scanner;
public class Act5_MyLinkedList_Perillo_NW2C {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       //This will be use for creating a linklist for a specific subject
        LinkedList Fname = new LinkedList();
        LinkedList Mname = new LinkedList();
        LinkedList Lname = new LinkedList();
        LinkedList Areacode = new LinkedList();
        LinkedList Telnum = new LinkedList();
        LinkedList Gender = new LinkedList();
        LinkedList Age = new LinkedList();
        
        System.out.print("How many members information will be entered? ");
        int memcount = scan.nextInt(); //Mcount variable is use as a container for how many members should be entered
         scan.nextLine();
        
        for(int i = 0; i < memcount;i++){
            int count = i;
            count++; //count++ is use in order to assure that the counting will start at 1
            
          System.out.println();
        
          //this will ask the information from the user that will be store in a linkedlist
          System.out.println("Kindly give the information of member " + count);
          System.out.print("Enter firstname: ");
          String fname = scan.nextLine();
          System.out.print("Enter middle name: ");
          String mname = scan.nextLine();
          System.out.print("Enter last name: ");
          String lname = scan.nextLine();
          System.out.print("Enter area code: ");
          String areacode = scan.nextLine();
          System.out.print("Enter telephone number: ");
          String telnum = scan.nextLine();
          System.out.print("Enter gender: ");
          String gender = scan.nextLine();
          System.out.print("Enter age: ");
          int age = scan.nextInt();
          scan.nextLine();
           
          
          System.out.println();

         //this is the way of adding elements in a linkedlist
            Fname.add(fname);
            Mname.add(mname);
            Lname.add(lname);
            Areacode.add(areacode);
            Telnum.add(telnum);
            Gender.add(gender);
            Age.add(age);
     
           
        }
         
        
        for(int i = 0; i < memcount;i++){

        //printing all the information gathered
        System.out.println("Welcome to the club " + Fname.get(i) +" " + Mname.get(i) + " "+ Lname.get(i)+ "!");
        System.out.println("Your area code and telephone number is " +  "(" + Areacode.get(i)+ ")" + Telnum.get(i) + "." );
        System.out.println("You are " + Gender.get(i) + " member and your age is " + Age.get(i) + ".");
        System.out.println();
       
        }
      
        
        
        
        
        
    }
    
}
