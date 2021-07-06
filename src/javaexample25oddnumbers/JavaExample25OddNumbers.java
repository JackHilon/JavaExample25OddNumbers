
package javaexample25oddnumbers;

import java.util.Scanner;


public class JavaExample25OddNumbers {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int limit=0;
        
        System.out.print("Enter your limit: ");
        limit=GetInteger(input);
        
        
        for (int i = 1; i < limit; i++) {
            if(i%2==0)
                continue;
            System.out.println(i+" is an odd number!");
        }
        
        input.close();
        
    }// end main()
    private static int GetInteger(Scanner in)
    {
        int res=0;
        try{
            res=in.nextInt();
            if(res<=0)
                throw new IllegalArgumentException("zero or negative number!");
            return res;
        }catch(Exception e)
        {
            in.nextLine();
            System.out.println(e.toString());
            return GetInteger(in);
        }
    }// end GetInteger()
    
}
