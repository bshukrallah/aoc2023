import java.util.ArrayList;
import java.util.List;

public class day1 {
    public day1() {
        System.out.println("Day 1 Advent of Code");
    }

    static Integer solve_problem() {

        List<String> new_list = new ArrayList<String>();
        new_list = file_parser.parse_input("src/inputs/day1_inputs.txt");
        int calibrationValue = 0;
        for (int x = 0; x < new_list.size(); x++) {
            //System.out.println(new_list.get(x));
            List<Character> numberList = new ArrayList<>();
            for(char letter : new_list.get(x).toCharArray()) {
                try {
                    double num = Double.parseDouble(String.valueOf(letter));
                } catch (NumberFormatException e) {
                    continue;
                }
                //System.out.println(letter);
                numberList.add(letter);
                // access each character

            }

            String calibrationString = String.valueOf(numberList.get(0).toString() + numberList.get(numberList.size() - 1).toString());
            //System.out.println(calibrationString);
            int calibrationNumber = Integer.parseInt(calibrationString);
            calibrationValue = calibrationValue + calibrationNumber;

        }
        return calibrationValue;
    }
}
