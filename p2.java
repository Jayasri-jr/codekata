import java.util.*;
import java.lang.*;
 class p2
{
    public static void main(String args[])
    {   int fact=1;
        Scanner sj=new Scanner(System.in);
        int n=sj.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
