import java.util.Arrays;

public class DecryptCipher {

    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};

    private char c;
    private int key;

    //empty constructor
    public DecryptCipher() {
    }

    //constructor
    public DecryptCipher(char c, int key) {
        this.c = c;
        this.key = key;
    }

    //getters and setters
    public char getC() {
        return c;
    }

    public void setC(char c) {
        //convert to uppercase
        this.c = Character.toUpperCase(c);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    // method to decrypt character literal with array using caesar cipher
    //decrypts the character
    public char decrypt() {
        int index = Arrays.asList(alphabet).indexOf(c);
        int newIndex = (index - key) % 26;
        //check if new index is negative
        if (newIndex < 0) {
            newIndex = 26 + newIndex;
        }
        //check if charAt is a space
        if (c == ' ') {
            //return space
            return ' ';
        }
        //check for numbers
        if (c >= '0' && c <= '9') {
            return c;
        }
        //if special characters return character
        if (c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':' || c == '\'' || c == '\"' || c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}' || c == '-' || c == '_' || c == '+' || c == '=' || c == '*' || c == '/' || c == '&' || c == '^' || c == '%' || c == '$' || c == '#' || c == '@' || c == '~' || c == '`' || c == '<' || c == '>' || c == '|' || c == '\\' || c == '\t' || c == '\n' || c == '\r') {
            return c;
        }
        return alphabet[newIndex];
    }

}
