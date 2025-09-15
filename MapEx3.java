import java.util.*;

class MapEx3
{
	public static void main(String[] args) {
		Map<Integer,Character> map=new LinkedHashMap<>();
		System.out.println("isEmpty() : "+map.isEmpty());
		System.out.println();

		map.put(1,'A');
		map.put(2,'B');
		map.put(3,'C');
		map.put(4,'D');
		map.put(5,'E');

		for(Map.Entry<Integer,Character> eleEn : map.entrySet())
		{
			System.out.println(eleEn);
		}
		System.out.println();

		System.out.println("size() : "+map.size());
		System.out.println();

		System.out.println("isEmpty() : "+map.isEmpty());
		System.out.println();

		System.out.println("containsKey(2) : "+map.containsKey(2));
		System.out.println();

		System.out.println("containsValue('C') : "+map.containsValue('C'));
		System.out.println();

		System.out.println("remove() : "+map.remove(1));
		System.out.println();
		for(Map.Entry<Integer,Character> eleEn : map.entrySet())
		{
			System.out.println(eleEn);
		}


	}
}