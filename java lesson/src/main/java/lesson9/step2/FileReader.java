package lesson9.step2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Читает содержимое файла по указанному пути.
 * Кидаем IOException если файл не найден или произошла ошибка чтения
 */
public class FileReader {
    public String readFile(String path) throws IOException {
        return Files.readString(Path.of(path), StandardCharsets.UTF_8);
    }
}
