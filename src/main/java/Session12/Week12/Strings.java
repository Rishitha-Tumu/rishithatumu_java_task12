package Session12.Week12;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
class Newlist
{
    public List<String> list;
	Newlist(List<String> list)
	{
		this.list = list;
	}
    public List<String> lists(List<String> list,int n)
    {
        List<String> filtered = list.stream() .filter(x -> x.length()==3) .collect(Collectors.toList());
        List<String> finallist = filtered.stream().filter( s -> s.startsWith("a") ).collect(Collectors.toList());
        return finallist;
    }
}
public class Strings
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
        Newlist l=new Newlist(list);
        List<String> finallists=l.lists(list,n);
        System.out.print(finallists);
    }
}