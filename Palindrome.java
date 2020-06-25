import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
public class Palindrome
{
	public static boolean isPalindrome(String input)
	{
		return input.equalsIgnoreCase(new StringBuilder().append(input).reverse().toString());
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		List<String> strings = new ArrayList<String>();
		List<String> r;
		Predicate<String> predicate=StringPalindrome::isPalindrome;      
		int n;
		
		System.out.print("Enter no of strings : ");
		n = scan.nextInt();
		
		System.out.println("Enter strings");
		for(int iter=1;iter<=n;iter++)
		{
			strings.add(scan.next());
		}
		
		r=strings.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(r);
	}
}
