import java.util.Properties;

public class Test1 {
    public static void main(String[] args) {
        Properties p = System.getProperties();
        p.setProperty("pirate", "secure");
        String s = p.getProperty("dog")+ " ";
        s+=p.getProperty("pirate");
        System.out.println(s);
    }
}
