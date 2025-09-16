import java.util.*;

class CountFreqMap
{
	public static void main(String[] args) {
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();

		ArrayList<Character> list=new ArrayList<Character>(50);

		for(int i=0,cnt=0;cnt!=50;)
		{
			char ch=(char)(Math.random()*100);
			if(ch>=65 && ch<=90)
			{
				list.add(ch);
				cnt++;
			}
		}

		LinkedHashSet<Character> set=new LinkedHashSet<>(list);

		for(Character ele : set)
		{
			int cnt = Collections.frequency(list,ele);
			map.put(ele,cnt);
		}
		System.out.println(map);

		for(Map.Entry<Character,Integer> ele : map.entrySet())
			System.out.println(ele);
	}
}