import java.util.Locale;

public class StringPractice {
    public static void main(String[] args) {
        String str="I am learning Java";
        if (str.toLowerCase().contains("java"))
        {
            System.out.println("It contains Java");
        }
        else
        {
            System.out.println("It doesnot contain Java");
        }
        String str1="Hello ";
        System.out.println(str1.concat(str));
        String out="<<>>";
        String word="Hello";
        System.out.println( out.substring(0,2)+word+out.substring(2,4));

    }
}
