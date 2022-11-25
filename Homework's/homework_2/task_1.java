import java.io.*;
import java.util.Arrays;
import java.util.List;

public class task_1 {

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("test.txt", false)) {
            // запись всей строки
            String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";

            writer.write(text);
            writer.flush();
            // Чтение из файла text.txt сделать чтение из файла

            // преобразование строки в массив [{name=Ivanov, country=Russia, city=Moscow,
            // age=null}]ArrayList
            String sep = text.replace(':', '=');
            String sep1 = sep.replaceAll("\"", "");
            String[] sep2 = sep1.split(",");
            List<String> container = Arrays.asList(sep2);

            System.out.print("Result: " + container + container.getClass().getSimpleName());

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
