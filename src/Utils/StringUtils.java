package Utils;

public class StringUtils {

    public void printAllIndexes(String str, char c) { //c is a placeholder for a char character to search
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == c) {
                System.out.println(i);
            }
        }
    }
}