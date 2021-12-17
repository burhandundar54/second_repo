package second_repo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		Map<String, Integer> myMap= new HashMap<>();
        myMap.put(("Ozkan"), 25);
        myMap.put("Pmar", 20);
        myMap.put("Bulent", 18);
        myMap.put("Turhan", 10);
        myMap.put("Burhann", 101);
        myMap.put("Anna", 41);
        System.out.println(sortedMap(myMap));
    }
    public static Map<String, Integer> sortedMap(Map<String, Integer> numbers){
        Map<String, Integer> myMap2= new LinkedHashMap<>();
        //TreeMap<String,Integer> newMap = new TreeMap<>(myMap);
        //System.out.println(newMap);
        Set<Map.Entry<String, Integer>> newSet= numbers.entrySet();
        List<Map.Entry<String, Integer>> entryList= new ArrayList<>(newSet);
        entryList.sort(Comparator.comparing(Map.Entry::getValue));
        for (Map.Entry<String, Integer> e: entryList){
            myMap2.put(e.getKey(), e.getValue());
        }
        return myMap2;
    }


	}


