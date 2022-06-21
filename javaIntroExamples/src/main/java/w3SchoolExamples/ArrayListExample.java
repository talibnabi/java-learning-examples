package w3SchoolExamples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayListExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
//        List<String> list = Arrays.asList("A", "B", "C");
//        List<String> persons = new ArrayList<>(list);
//
//        for (String person : persons) {
//            System.out.println(person);
//        }
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("Nazmila");
//        hashSet.add("Turan");
//        hashSet.add("Rauf");
//        hashSet.add("Suleyman");
//        for (String element : hashSet) {
//            System.out.println(element);
//        }
//        Iterator<String> iterator = hashSet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//        System.out.println(iterator.next());
//        System.out.println(hashSet.contains("Nazmila"));
//        System.out.println(hashSet.contains("Tahira"));

//        HashMap<Integer, String> hashMap = new HashMap<>();
//        hashMap.put(1, "Nazmila");
//        hashMap.put(2, "Nazmila");
//        hashMap.put(3, "Tuna");
//        hashMap.put(4, "Sebastian");
//        for (Integer element : hashMap.keySet()) {
//            System.out.println(element);
//        }
//        for (String element : hashMap.values()) {
//            System.out.println(element);
//        }
//        System.out.println(hashMap.size());
//        System.out.println(hashMap);
//        System.out.println(hashMap.get(2));
//        hashMap.remove(1);
//        System.out.println(hashMap);
//        hashMap.clear();
//        System.out.println(hashMap);

//        ArrayList<String> arrayList = new ArrayList<>();
//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.add("Machine");
//        linkedList.add("Machine");
//        linkedList.add("Machine");
//        for (String element : linkedList) {
//            System.out.println(element);
//        }
//        arrayList.add("Machine");
//        arrayList.add("Machine");
//        arrayList.add("Machine Second");
//        arrayList.add("Anaconda");
//        arrayList.add("Amina Karimova");
//        arrayList.add("Amina Abbas");
//        Collections.sort(arrayList);
//        for (String element : arrayList) {
//            System.out.println(element);
//        }
//        for (String element : arrayList) {
//            System.out.println(element);
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            String element = arrayList.get(i);
//            System.out.println(element);
//        }
//        arrayList.set(0, "Java");
//        arrayList.set(1, "Python");
//        for (int i = 0; i < arrayList.size(); i++) {
//            String element = arrayList.get(i);
//            System.out.println(element);
//        }
//        arrayList.remove(0);
//        for (int i = 0; i < arrayList.size(); i++) {
//            String element = arrayList.get(i);
//            System.out.println(element);
//        }
//        arrayList.clear();
//        for (int i = 0; i < arrayList.size(); i++) {
//            String element = arrayList.get(i);
//            System.out.println(element);
//        }

    }
}
