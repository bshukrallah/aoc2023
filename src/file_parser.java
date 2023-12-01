import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class file_parser {

    public file_parser() {
        System.out.println("This parses files to a list");
    }

    public static List<String> parse_input(String path) {
        List<String> input = new ArrayList<String>();
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(path));
            String line = reader.readLine();

            while (line != null) {
                input.add(line);
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return input;
    }
}
