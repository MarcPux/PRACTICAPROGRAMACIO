/**
 * Created by mpuigb on 22/11/16.
 */
public class Main {
    public static void main(String[] args) {
        int delta = 3;
        String textClar = "ABC";
        String encode = Caesar.cypher(textClar, delta);
        System.out.println(encode);
    }

}
