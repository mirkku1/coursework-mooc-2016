
public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(muotoile(t));
        
        System.out.println("");
        
        int[] x = {1, 2, 3, 4};
        System.out.println(muotoile(x));
    }

    public static String muotoile(int[] t) {
        
        StringBuilder sb = new StringBuilder();
        
        sb.append("{\n");
               
        for (int i = 0; i < t.length; i++) {   
            // Jos ollaan lisäämässä riville ensimmäistä lukua niin laitetaan alkuun välilyönti
            if((i + 1) % 4 == 1) {
                sb.append(" ");
            }
            
            // Jos ollaan lisäämässä viimeistä lukua, ei lisätä pilkkua perään, muutoin lisätään
            if(i == t.length - 1) {
                sb.append(t[i]);
            } else {
                sb.append(t[i]).append(", ");
            }
            
            // Lisätään rivinvaihto, joka neljännelle luvulle ellei kyseessä ole viimeinen rivi
            if(i < t.length - 1) {
                if((i + 1) % 4 == 0) {
                    sb.append("\n");
                }
            }
        }
        
        sb.append("\n}");
        
        return sb.toString();
    }
}
