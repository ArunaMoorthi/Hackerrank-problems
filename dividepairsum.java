import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int count=0,itr,itr1,sum;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(itr=0;itr<n;itr++)
            {
            for(itr1=itr+1;itr1<n;itr1++)
                {
                sum=a[itr]+a[itr1];
                if(sum%k==0)
                    count++;
                else
                    continue;
            }
        }
        System.out.println(count);
    }
}
