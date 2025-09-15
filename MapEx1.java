import java.util.*;

class MapEx1
{
	public static void main(String[] args) {
		Map<Integer,Integer> map=new HashMap<>();
		map.put(1,10);
		map.put(2,20);
		map.put(3,30);
		map.put(4,40);
		map.put(5,50);

		for(Integer key: map.keySet())
		{
			System.out.println(key);
		}
	}

}