import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringPlay {
    public static String capitalizeLetter (String letter) {
        //return letter.toUpperCase();
        return StringUtils.upperCase(letter);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        System.out.println(capitalizeLetter("l"));
        String input = scan.nextLine();
        //System.out.println(capitalizeLetter(input));
        System.out.println("You Entered: \"" + input +"\"");
        if (StringUtils.isNumeric(input)) {
            System.out.println("\"" + input+"\" IS a number");
        } else {
            System.out.println("\"" + input+"\" is NOT a number");
        }

        System.out.println("Flipped case: " + StringUtils.swapCase(input));

        System.out.println("Reversed: " + StringUtils.reverse(input));

    }
}
