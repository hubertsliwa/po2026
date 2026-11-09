package agh.po.lab3;

import java.util.Map;

public class CodingBat {
    public static boolean hasTeen(int a, int b, int c) {
        if(a>=13 && a<=19){
            return true;
        }
        else if(b>=13 && b<=19){
            return true;
        }
        else if(c>=13 && c<=19){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean loneTeen(int a, int b) {
        if(a>=13 && a<=19){
            if(b>=13 && b<=19){
                return false;}
            else{
                return true;
            }
        }
        else if(b>=13 && b<=19){
            return true;
        }
        else{
            return false;
        }
    }

    public static int countEvens(int[] nums) {
        int count=0;
        for(int i: nums){
            if(i%2==0){
                count++;
            }
        }
        return count;
    }

    public static String makeAbba(String a, String b) {
        return a+b+b+a;
    }

    public Map<String, String> mapAB(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b")) {
            String aValue = map.get("a");
            String bValue = map.get("b");
            map.put("ab", aValue + bValue);
        }
        return map;
    }

    public static Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> result = new java.util.HashMap<>();
        for (String str : strings) {
            result.put(str, str.length());
        }
        return result;
    }
}