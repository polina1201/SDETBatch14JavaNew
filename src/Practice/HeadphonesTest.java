package Practice;

import java.util.Arrays;

public class HeadphonesTest {
    public static void main(String[] args) {

        Headphones hp=new Headphones();

        System.out.println(hp.charge);
        System.out.println(Arrays.toString(hp.controls));
        System.out.println(hp.color);

        hp.powerOn();
        hp.volumeUp();
        System.out.println("The power is on "+hp.power);
        System.out.println("The volume is up "+hp.volume);



    }

}
