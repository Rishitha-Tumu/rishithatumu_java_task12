package Session12.Week12;

import java.util.*;
import java.io.*;
import java.util.Arrays;
class Average
{
    public List<Integer> list;
	Average(List<Integer> list)
	{
		this.list = list;
	}
    public void sum(List<Integer> list,int n)
    {
        int s=list.stream().mapToInt(i->i).sum();
        System.out.print(s/n);
    }
}
public class LambdasandStreams
{
    public static void main(String args[])
    {
        List<Integer> list = new ArrayList<Integer>(); 
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            int m=s.nextInt();
            list.add(m);
        }
        Average a=new Average(list);
        a.sum(list,n);
    }
}