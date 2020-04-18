//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int base)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: "+base);
  }
}
class CSE extends Faculty
{
  public void salary(int base)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: "+(base+3000));
  }
}
class IT extends Faculty
{
  public void salary(int base)
  {
    //write your IT class statements
    System.out.println("IT Faculty: "+(base+5000));
  }
}
class ECE extends Faculty
{
  public void salary(int base)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: "+(base+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {  
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    Faculty ob=new Faculty();
    ob.salary(base);
    CSE obj2 = new CSE();
    obj2.salary(base);
    IT obj1 = new IT();
    obj1.salary(base);
    ECE obj = new ECE();
    obj.salary(base);
    
    
  }
}