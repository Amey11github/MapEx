import java.util.*;

class MyHashTable<K,V>
{
	private final int CAPACITY=10;
	private LinkedList<Entry<K,V>> [] table;
	private int size;

	private class Entry<K,V>
	{
		K key;
		V value;

		Entry(K key , V value)
		{
			this.key=key;
			this.value=value;
		}
	}

	public MyHashTable()
	{
		table=new LinkedList[CAPACITY];
		for(int i=0;i<CAPACITY;i++)
		{
			table[i]=new LinkedList<MyHashTable<K,V>.Entry<K,V>>();
		}
	}

	public int hashFunction(K key)
	{
		return Math.abs(key.hashCode())%CAPACITY;
	}

	public boolean put(K key , V value)
	{
		if(key==null) return false;
		int indx=hashFunction(key);
		LinkedList<Entry<K,V>> bucket=table[indx];

		for(Entry<K,V> entry : table[indx])
		{
			if(entry.key.equals(key))
			{
				entry.value=value;
				return true;
			}
		}
		bucket.add(new Entry<K,V>(key,value));
		size++;
		return true;
	}

	public V remove(K key)
	{
		V value=null;
		int indx=hashFunction(key);
		LinkedList<Entry<K,V>> bucket=table[indx];
		Iterator<Entry<K,V>> iterator = bucket.iterator();
		while(iterator.hasNext())
		{
			Entry<K,V> entry=iterator.next();
			if(entry.key.equals(key))
			{
				value=entry.value;
				iterator.remove();
				size--;
				return value;
			}
		}
		return value;
	}

	public int size()
	{
		return size;
	}

	public String toString()
	{
		if(size()==0) return "{}";
		String op="{";
		for(int i=0;i<CAPACITY;i++)
		{
			for(Entry<K,V> entry : table[i])
			{
				op+=entry.key+"="+entry.value+", ";
			}
		}
		return op+"}";
	}

	public Set<K> keySet()
	{
		Set<K> keys=new HashSet<>();
		for(int i=0;i<CAPACITY;i++)
		{
			for(Entry<K,V> entry : table[i])
				keys.add(entry.key);
		}
		return keys;
	}

	public V getValues(K key)
	{
		int indx=hashFunction(key);
		LinkedList<Entry<K,V>> bucket=table[indx];
		for(Entry<K,V> entry : bucket)
		{
			if(entry.key.equals(key))
			{
				return entry.value;
			}
		}
		return null;
	}

	public boolean isEmpty()
	{
		return size()==0;
	}
}

class MyHashTableDriver
{
	public static void main(String[] args) {

		MyHashTable<Integer,String> tab=new MyHashTable<>();
		System.out.println(tab.isEmpty());

		tab.put(1,"abc");
		tab.put(2,"hjk");
		tab.put(3,"rty");
		tab.put(4,"qwe");
		tab.put(5,"asd");
		tab.put(6,"xyz");

		System.out.println(tab);

		System.out.println(tab.size());

		System.out.println(tab.isEmpty());

		System.out.println(tab.remove(2));
		System.out.println(tab);

		for(Integer key : tab.keySet())
		{
			System.out.println(key+" : "+tab.getValues(key));
		}

	}
}