import java.util.ArrayList;
import java.util.List;

public class day1 {
    public day1() {
        System.out.println("Day 1 Advent of Code");
    }

    static void solve_problem() {

        List<String> new_list = new ArrayList<String>();
        new_list = file_parser.parse_input("src/inputs/day1_test.txt");

        for (int x = 0; x < new_list.size(); x++) {
            System.out.println(new_list.get(x));
        }
    }
}
