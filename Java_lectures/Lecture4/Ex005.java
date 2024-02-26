package Java_lectures.Lecture4;


// Этот код на Java реализует алгоритм вычисления выражения в обратной польской записи с использованием стека.

// В данном примере представлены три примера выражений в обратной польской записи, закомментированные в переменной exp. Каждое выражение разбито на отдельные элементы с помощью метода split(" "), чтобы представить его в виде массива строк.

// Код выполняет следующие шаги:

// Создает экземпляр стека Stack<Integer> для хранения промежуточных результатов вычислений.
// Проходит по каждому элементу выражения в цикле.
// Если элемент является числом, он добавляется в стек.
// Если элемент является оператором (+, -, *, /), извлекаются два последних числа из стека, и применяется соответствующая операция.
// Результат вычисления добавляется обратно в стек.
// После завершения обработки всех элементов выражения, извлекается результат из стека и выводится на консоль.
// Этот код обеспечивает правильное выполнение арифметических операций в выражении в обратной польской записи и выводит итоговый результат на консоль.



import java.util.Stack;

public class Ex005 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -
        
        //var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        
        //var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(exp);
        
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res =  st.pop()/ st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }
}