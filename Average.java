import java.util.Scanner;
import java.util.*;
import java.util.function.BiFunction;
public class Average
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int num,av;
		ArrayList<Integer> integers=new ArrayList<Integer>();
		System.out.print("Enter number of elements:");
		num=s.nextInt();
		System.out.println("Enter elements");
		for(int iter=1;iter<=num;iter++)
		{
			integers.add(s.nextInt());
		}
		av=avgOfListOfIntegers(integers,( a, b)->a+b);
		System.out.println("Average of given integers is : "+av);
	}
	public static int avgOfListOfIntegers(ArrayList<Integer> integers,BiFunction<Integer,Integer,Integer> biFunction)
	{
		int sum=0,average;
		BiFunction<Integer,Integer,Integer> findDiv=(a,b)->a/b;
		for(int num:integers)
		{
			sum=biFunction.apply(sum,num);
		}
		average=findDiv.apply(sum,integers.size());
		return average;
	}
}
