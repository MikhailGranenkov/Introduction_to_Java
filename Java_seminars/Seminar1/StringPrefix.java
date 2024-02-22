package Seminar1;


// Напишите метод, который находит самую длинную строку общего
// префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

public class StringPrefix {
    public static void main(String[] args) {

        String[] strings = { "flower", "flow", "flight" }; // fl
        for (int index = 1; index < strings.length; index++) {

        }
                System.out.println(getPrefix(strings));
                
            }
        
            private static String getPrefix(String[] strings) {
                String prefix = strings[0]; // fl
                for (int i = 1; i < strings.length; i++) {
                    while (strings[i].indexOf(prefix)!=0) {
                        prefix = prefix.substring(0, prefix.length()-1);
                        if (prefix.isEmpty()) {
                            return "";
                        }
                    }
                }
                return prefix;
            }
         }   

