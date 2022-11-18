package karaktermetodusok;

/**
 *
 * @author user3
 */
public class KarakterMetodusok {

    public static void main(String[] args) {
        char kar = 'a';
        
        // alfabetikus-e
        System.out.println(Character.isAlphabetic(kar));
        
        // szám-e
        System.out.println(Character.isDigit(kar));
        
        // betű-e
        System.out.println(Character.isLetter(kar));
        
        // betű vagy szám-e
        System.out.println(Character.isLetterOrDigit(kar));
        
        // kisbetűs-e
        System.out.println(Character.isLowerCase(kar));
        
        // nagybetűs-e
        System.out.println(Character.isUpperCase(kar));
        
        // szóköz-e
        System.out.println(Character.isSpaceChar(kar));
        
        // whitespace karakter-e, pl: \u0009
        System.out.println(Character.isWhitespace(kar));
        
        // kisbetűsítés
        System.out.println(Character.toLowerCase(kar));
        
        // nagybetűsítés
        System.out.println(Character.toUpperCase(kar));
    }
    
}
