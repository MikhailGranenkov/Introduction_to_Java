package Dz.Dz2;

// Дана строка sql-запроса:
// select * from students where "
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже.
// Если значение null, то параметр не должен попадать в запрос.
// Напишите свой код в методе answer класса Answer.
// Метод answer принимает на вход два параметра:
// String QUERY - начало SQL-запроса String PARAMS - JSON с параметрами

public class Answer {
    public static String answer(String QUERY, String PARAMS) {
        StringBuilder whereClause = new StringBuilder();
        String[] params = PARAMS.substring(1, PARAMS.length() - 1).split(", ");
        
        for (String param : params) {
            String[] keyValue = param.split(":");
            String key = keyValue[0].substring(1, keyValue[0].length() - 1);
            String value = keyValue[1];
            
            if (!value.equals("null")) {
                if (whereClause.length() > 0) {
                    whereClause.append(" and ");
                }
                whereClause.append(key).append("=").append("'").append(value.substring(1, value.length() - 1)).append("'");
            }
        }
        
        return QUERY + whereClause.toString();
    }

    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String result = answer(QUERY, PARAMS);
        System.out.println(result);
    }
}
