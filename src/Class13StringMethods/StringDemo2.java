package Class13StringMethods;

import Utils.StringUtils;

public class StringDemo2 {
    public static void main(String[] args) {

        String str = "Thor love and Thunder";
        StringUtils strUtils=new StringUtils(); //we created the StringUtils in the Utils package
        strUtils.printAllIndexes(str, 'e');
    }


}
