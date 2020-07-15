import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OddStringOut {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of your String array : ");
        final int length = scanner.nextInt();

        final String[] input = new String[length];
        System.out.println("Enter elements of your wish:");
        for (int i = 0; i < length; i++) {
            String userInput = scanner.next();
            input[i] = userInput;
        }


        final List<String> list = new ArrayList<>(Arrays.asList(input));
        System.out.println("List of elements you entered : "+list);
        System.out.println("The second unique string in the list is : "+ firstNonRepeating(list, list.size()));
        scanner.close();
    }

    static String firstNonRepeating(final List<String> list, final int n)
    {
        final List<String> innerList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0 ; j < list.size(); j++) {
                if (i != j && list.get(i).equals(list.get(j))) {
                    innerList.add(list.get(i));
                    break;
                }
            }
        }

        list.removeAll(innerList);

        if (list.size() == 0) {
            return "N/A";
        } else {
            return list.get(1);
        }
    }
}
