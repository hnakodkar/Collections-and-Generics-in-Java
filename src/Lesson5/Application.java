package Lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args){

     TreeMap<String, String> dictionary = new TreeMap<>();
        dictionary.put("Brave","ready to face and endure danger or pain.");
        dictionary.put("joy"," a feeling of great pleasure and happiness.");
        dictionary.put("Confidence"," the state of feeling certain about the truth of something.");
        dictionary.put("Brilliant", " exceptionally clever or talented.");
        dictionary.put("Brilliant", " nbmbnbnmbmnbnm");

//        for(String word : dictionary.keySet()){
//            System.out.println((word));
//        }

        for(Map.Entry<String, String> entry : dictionary.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }






    }
}
