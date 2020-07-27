package Session12.Week12;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
class Newlists
{
    public List<String> list;
	Newlists(List<String> list)
	{
		this.list = list;
	}
    public List<String> lists(List<String> list,int n)
    {
        List<String> palindrome=new ArrayList<String>();
        for(int i=0;i<n;i++)
        {
            String tempString = list.get(i).replaceAll("\\s+", "").toLowerCase();
            if(IntStream.range(0, tempString.length() / 2).noneMatch(j -> tempString.charAt(j) != tempString.charAt(tempString.length() - j - 1))==true)
            {
                palindrome.add(tempString);
            }
        }
        return palindrome;
    }
}
public class Palindrome
{
    public static void main(String args[])
    {
        List<String> list=new ArrayList<String>();
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            String str=s.next();
            list.add(str);
        }
        Newlists l=new Newlists(list);
        List<String> finallists=l.lists(list,n);
        System.out.print(finallists);
    }
}