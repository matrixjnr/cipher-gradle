import java.util.Arrays;

public class EncryptCipher {
    Character[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',};
    private char c;
    private int key;

    //empty constructor
    public EncryptCipher() {
    }

    //constructor
    public EncryptCipher(char c, int key) {
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

    //encrypts the character
    public char encrypt() {
        int index = Arrays.asList(alphabet).indexOf(c);
        int newIndex = (index + key) % 26;
        //check for spaces and special characters
        if (c == ' ') {
            return ' ';
        }
        //check for numbers
        if (c >= '0' && c <= '9') {
            return c;
        }
        //if special characters return character
        if (c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':' || c == '\'' || c == '\"' || c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}' || c == '<' || c == '>' || c == '&' || c == '#' || c == '$' || c == '%' || c == '^' || c == '*' || c == '+' || c == '-' || c == '/' || c == '\\' || c == '|' || c == '=' || c == '_' || c == '~' || c == '`' || c == '@' || c == '.' || c == ',' || c == '!' || c == '?' || c == ';' || c == ':' || c == '\'' || c == '\"' || c == '(' || c == ')' || c == '[' || c == ']' || c == '{' || c == '}' || c == '<' || c == '>' || c == '&' || c == '#' || c == '$' || c == '%' || c == '^' || c == '*' || c == '+' || c == '-' || c == '/' || c == '\\' || c == '|' || c == '=' || c == '_' || c == '~' || c == '`') {
            return c;
        }
        return alphabet[newIndex];
    }
}
