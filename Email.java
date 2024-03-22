import java.util.Scanner;
import java.lang.Math;
public class Email{

 public static void main(String[] args){

  Generate mail =new Generate();  // Defining mail object of genrate class
  Scanner scan =new Scanner(System.in);   // Defining scan object of Scanner class
  Password pswrd=new Password(); //Generates random password for user 

  
  System.out.print("Enter the first name: "); //user info
  mail.firstname=scan.nextLine();

  System.out.print("Enter the last name: "); //user info
  mail. lastName=scan.nextLine();

  System.out.println("For deprtment enter the number accordingly: ");
  System.out.println("1.Sales");
  System.out.println("2.Development");
  System.out.println("3.Accounting");
  mail.department=scan.nextLine();



  System.out.println(mail.mailAddress(mail.firstname,mail.lastName,mail.department));


  //generating random password


  //randomGenerator method
  //characters attribute 

  

  // for(int i=0;i<13;i++){
  //   String a=pswrd.characters;
  //   int b=pswrd.randomGenerator();
  //    char pwd= a.charAt(b);
  //    System.out.println(pwd);


  // }

  StringBuilder pwd =new StringBuilder();
   for(int i=0;i<13;i++){

   int index=pswrd.randomGenerator();
   char result=pswrd.characters.charAt(index);
   pwd.append(result);


   }
   System.out.println(pwd);



  

  scan.close();
 }
}


//class starts here; 


 class Generate{
   
    String firstname;
    String lastName;
    String department;
    String dot=".";
    String adero="@";
    String tail=".company.com";
    String tail2="@company.com";
    String d1="sales";
    String d2="development";
    String d3="accounting";
    
    public String mailAddress(String firstname,String lastName,String department){
       
        
            switch (department) {
                case "1":
                    return firstname+dot+lastName+adero+d1+tail;
                case "2":
                    return firstname+dot+lastName+adero+d2+tail;
                case "3":
                    return firstname+dot+lastName+adero+d3+tail;
                    
            
                default:
                    return firstname+dot+lastName+tail2;
            }
        
     
        }
    }

class Password{
  String characters="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~0123456789 ";
 
  
 
  public int randomGenerator(){  //generates a random number between 1 to 96 inclusive;
    double random= Math.random();
    random= random*96;
    random=Math.floor(random);
    random=random+1;
    int finalRandom=(int)random;
    return finalRandom;
    
  }

  
    

  }
//   public int passGenerate(){
//     for(int i=0;i<13;i++){

        
//     }
//   }



    