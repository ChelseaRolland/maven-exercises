import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringPlay {
    public static String capitalizeLetter (String letter) {
        StringUtils utils = new StringUtils();

        //return letter.toUpperCase();
        return letter.utils.uppercase();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(capitalizeLetter("l"));
        String letter = scan.nextLine();
        System.out.println(capitalizeLetter(letter));
    }
}
