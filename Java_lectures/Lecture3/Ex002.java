package Java_lectures.Lecture3;

// Этот код на Java создает объект ArrayList, который представляет собой динамический список, способный хранить объекты типа Integer. Затем в этот список добавляется один элемент со значением 2809 с помощью метода add(). После этого происходит итерация по всем элементам списка с использованием цикла for-each, и каждый элемент выводится в консоль с помощью метода println().


import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       //ArrayList list = new ArrayList();
       list.add(2809);


       for (Object o : list) {
           System.out.println(o);
       }
   }
}
