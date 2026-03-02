package lesson9.step2;

import java.io.IOException;

public class FileReaderExecutor {
    public static void main(String[] args) {
        // создаём объект для чтения файла
        final var fileReader = new FileReader();
        // пробуем прочитать файл по указанному пути
        try {
            final var result = fileReader.readFile("src/main/java/ru/lessons/lesson9/План.txt");
            System.out.println(result);
        } catch (IOException e) {
            // если возникла ошибка чтения — кидаем ошибку RuntimeException
            throw new RuntimeException(e);
        }
    }
}
