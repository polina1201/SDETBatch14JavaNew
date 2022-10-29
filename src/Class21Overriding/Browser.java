package Class21Overriding;

public class Browser {
    void openBrowser(){
        System.out.println("Open a Browser");
    }
    void navigate(){
        System.out.println("Opening the url");
    }
    void test(){
        System.out.println("Testing the webpage");
    }
    void closeBrowser(){
        System.out.println("Close the Browser");
    }
}

class Chrome extends Browser{
    @Override
    void openBrowser(){
        System.out.println("Opening the browser in less than 1 second");
    }

}
class FireFox extends Browser {
    void OpenBrowser(){
        System.out.println("Opening the browser in sell than 2 seconds");
    }

}