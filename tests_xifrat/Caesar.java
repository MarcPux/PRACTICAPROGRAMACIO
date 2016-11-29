public class Caesar {
    static String cypher(String s, int delta) {
        s = s.toUpperCase();
        String solucio ="";
        for (int x=0;x<s.length();x++){
            if ((s.charAt(x)+delta) >= 91 && (s.charAt(x)+delta) <= 107){
                solucio += (char) (s.charAt(x)+delta-26);
            }else if((s.charAt(x)+delta) >= 107){
                solucio += (char) (s.charAt(x)+delta-(delta%26));
            }else{
                solucio += (char) (s.charAt(x)+delta);
            }
        }
        return solucio;
    }

    static String decypher(String s, int delta) {
        return null;
    }

    static String magic(String s) {
        return null;
    }
}
