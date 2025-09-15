import java.util.*;

class MapEx2
{
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"amey");
		map.put(2,"hemant");
		map.put(3,"vivek");
		map.put(4,"aayush");
		map.put(5,"ritik");

		for(Integer ele : map.keySet())
		{
			System.out.println(ele);
		}
		System.out.println();

		for(String name : map.values())
		{
			System.out.println(name);
		}
		System.out.println();

		for(Map.Entry<Integer , String> ent : map.entrySet() )
		{
			System.out.println(ent);
		}
	}
}