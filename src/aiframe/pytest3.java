package aiframe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
 
public class pytest3 {
 
    public static void main(String[] args) {
        try {
            Path path = Paths.get("C:\\Users\\hp\\Desktop\\new\\test1.py");
            Stream <String> lines = Files.lines(path);
            List <String> replaced = lines.map(line -> line.replaceAll("i='up'", "i='up'")).collect(Collectors.toList());
            Files.write(path, replaced);
            lines.close();
            System.out.println("Find and Replace done!!!");
            
            Path path1 = Paths.get("C:\\Users\\hp\\Desktop\\new\\test1.py");
            Stream <String> lines1 = Files.lines(path);
            List <String> replaced1 = lines1.map(line -> line.replaceAll("i='down'", "i='up'")).collect(Collectors.toList());
            Files.write(path1, replaced1);
            lines1.close();
            System.out.println("Find and Replace done again!!!");
            
            Path path2 = Paths.get("C:\\Users\\hp\\Desktop\\new\\test1.py");
            Stream <String> lines2 = Files.lines(path);
            List <String> replaced2 = lines2.map(line -> line.replaceAll("i='right'", "i='up'")).collect(Collectors.toList());
            Files.write(path2, replaced2);
            lines2.close();
            System.out.println("Find and Replace done again!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}