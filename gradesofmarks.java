import java.util.*;//for scanner class to take input from keyboard
 public class gradesofmarks
{
    public static void main(String args[])//main method
    {
        int m1,m2,m3,m4,m5;//declaring variables for 5 subject marks
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of 5 subjects");
        System.out.println("Marks in English");
        m1=sc.nextInt();
        System.out.println("Marks in Maths");
        m2=sc.nextInt();
        System.out.println("Marks in Science");
        m3=sc.nextInt();
        System.out.println("Marks in Hindi");
        m4=sc.nextInt();
        System.out.println("Marks in Social");
        m5=sc.nextInt();
        int tot=m1+m2+m3+m4+m5;
        System.out.println("Total marks:"+tot+"/500");
      float avg=(tot)/5;
      System.out.println("The Average marks:"+avg);

        if(avg>=70)
        {
            System.out.println("Grade:A");
        }
        else if(avg>=60&&avg<70)
        {
             System.out.println("Grade:B");

        }
        else if(avg>=50&&avg<60)
        {
           System.out.println("Grade:C");
        }
        else if(avg>=40&&avg<50)
        {
           System.out.println("Grade:D");
        }
        else
        System.out.println("Fail");
    }
}