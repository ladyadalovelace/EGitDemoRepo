import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SieveOfE {

	public static void main(String[] args) {
		
		Set<Integer> nums = new TreeSet<Integer>();
		int n = 200;
		
		for(int i = 2; i < n; i++)
		{
			nums.add(i);
		}
		
		for(int i = 2; i < Math.sqrt(n); i++)
		{
			Iterator<Integer> iter = nums.iterator(); // use iterator here because can't use enhanced for to change Set 
			while(iter.hasNext())
			{
				Integer x = iter.next();
				if(x%i == 0 && x!=i) iter.remove();
			}
		}
		
		System.out.println(nums);
	}
	

}
