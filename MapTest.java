import java.util.*;  
public class MapTest{  
	public static void main(String args[]){  
		Map<Integer,String> map=new HashMap<Integer,String>();  
		map.put(100,"Amit");  
		map.put(102,"Vijay");  
		map.put(101,"Rahul");
		System.out.println(map.entrySet());
		for(Map.Entry<Integer,String> m:map.entrySet()){  
			System.out.println(m.getKey()+" "+m.getValue());  
		}  
	}  
}  