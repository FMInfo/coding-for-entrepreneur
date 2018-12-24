import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionFrameworks {
    public void explainArray(){
        int[] intArray = new int[5];

        intArray[0] = 5;
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
    }

    public void explainArrayList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));
    }

    public  void explainHashSet(){
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("HD");
        hashSet.add("nice to meet you");

        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("hd"));
        System.out.println(hashSet.contains("HD"));
        System.out.println(hashSet);

        ArrayList<String> arrayList = new ArrayList<>(hashSet);
        System.out.println(arrayList.get(0));
    }

    public void explainHashMap(){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("name","HD");
        System.out.println(hashMap.get("name"));// 해시 맵이 사용하기 더 편할것 같다.
    }
}
