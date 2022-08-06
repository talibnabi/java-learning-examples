package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterPosition {

    public static void main(String[] args) {
        String text = "My dear friend,Suzana i love you !";
        CharacterPosition characterPosition = new CharacterPosition();
        Map<Character, List<Integer>> count = characterPosition.doCount(text);
        count.forEach((ch, list) -> System.out.printf("%s:%d:%s\n", ch, list.size(), list));
    }

    public Map<Character, List<Integer>> doCount(String origin) {
        HashMap<Character, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < origin.length(); i++) {
            Character c = Character.toLowerCase(origin.charAt(i));
            if (Character.isLetter(c)) {
                List<Integer> list = hashMap.getOrDefault(c, new ArrayList<>());
                list.add(i + 1);
                hashMap.put(c, list);
            }
        }
        return hashMap;
    }

}
