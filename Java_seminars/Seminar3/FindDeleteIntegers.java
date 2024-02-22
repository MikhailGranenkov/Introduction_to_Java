package Seminar3;

// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class FindDeleteIntegers {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>(Arrays.asList("priv", "hell", "345", "ads", "12")); 
        deleteNumberIter(strList);        
        deleteNumber(strList);
        System.out.println(strList);       
    }

    private static void deleteNumberIter(ArrayList<String> strList) {
        Iterator<String> iter = strList.iterator();
        while(iter.hasNext()){
            String elem = iter.next();
            if (isNumber(elem)) iter.remove();
        }
    }

    private static void deleteNumber(ArrayList<String> strList) {
        for (int i = 0; i < strList.size(); i++) {
            if(isNumber(strList.get(i))) {
                strList.remove(i);
                i--;
            }            
        }
    }

    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);            
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}