package checkarmstrong;
import java.util.Scanner;
public class CheckArmstrong {
    public static void main(String[] args) {
        int num,n,sum=0,r;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number:");
        num=s.nextInt();
        n=num;
        while(num>0)
        {
            r=num%10;
            sum=sum+r*r*r;
            num=num/10;
        }
        if(sum==n)
            System.out.println(n+" is armstrong number");
        else 
            System.out.println(n+"is not armstrong number");
    }
    
}
