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
        this.c = c;
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
        return alphabet[newIndex];
    }
}
