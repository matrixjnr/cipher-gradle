import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncryptCipherTest {
    @Test
    public void encryptedCharacter_returnsCharPlusTwoPosition() {
        EncryptCipher encoding= new EncryptCipher();
        encoding.setC('C');
        encoding.setKey(2);
        Character expected = 'E';
        assertEquals(expected, encoding.encrypt());
    }

    @Test
    public void decryptedCharacter_returnsCharPMinusTwoPosition() {
        DecryptCipher encoding= new DecryptCipher();
        encoding.setC('E');
        encoding.setKey(2);
        Character expected = 'C';
        assertEquals(expected, encoding.decrypt());
    }

    //encrypt string using EncryptCipher class
    @Test
    public void encryptText(){
        String message = "THE QUICK BROWN FOX";
        String encryptedText = "";

        //loop through each character in the message and encrpt
        for(int i = 0; i < message.length(); i++){
            EncryptCipher encoding = new EncryptCipher();
            encoding.setC(message.charAt(i));
            encoding.setKey(2);
            encryptedText += encoding.encrypt();
        }
        assertEquals("VJG SWKEM DTQYP HQZ", encryptedText);
    }

    //Decrypt string using DecryptCipher class
    @Test
    public void decryptText(){
        String message = "VJG SWKEM DTQYP HQZ";
        String decryptedText = "";

        //loop through each character in the message and encrpt
        for(int i = 0; i < message.length(); i++){
            DecryptCipher encoding = new DecryptCipher();
            encoding.setC(message.charAt(i));
            encoding.setKey(2);
            decryptedText += encoding.decrypt();
        }
        assertEquals("THE QUICK BROWN FOX", decryptedText);
    }

    //test for decrypted space character
    @Test
    public void decryptSpace(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC(' ');
        encoding.setKey(2);
        assertEquals(' ', encoding.decrypt());
    }

    //test for encrypted space character
    @Test
    public void encryptSpace(){
        EncryptCipher encoding = new EncryptCipher();
        encoding.setC(' ');
        encoding.setKey(2);
        assertEquals(' ', encoding.encrypt());
    }

    //test for number characters
    @Test
    public void encryptNumber(){
        EncryptCipher encoding = new EncryptCipher();
        encoding.setC('1');
        encoding.setKey(2);
        assertEquals('1', encoding.encrypt());
    }

    //test for number characters
    @Test
    public void decryptNumber(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('1');
        encoding.setKey(2);
        assertEquals('1', encoding.decrypt());
    }

    //test for lowercase characters
    @Test
    public void encryptLowercase(){
        EncryptCipher encoding = new EncryptCipher();
        encoding.setC('a');
        encoding.setKey(2);
        assertEquals('C', encoding.encrypt());
    }

    //test for lowercase characters
    @Test
    public void decryptLowercase(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('c');
        encoding.setKey(2);
        assertEquals('A', encoding.decrypt());
    }

    //test for uppercase characters
    @Test
    public void encryptUppercase(){
        EncryptCipher encoding = new EncryptCipher();
        encoding.setC('A');
        encoding.setKey(2);
        assertEquals('C', encoding.encrypt());
    }

    //test for uppercase characters
    @Test
    public void decryptUppercase(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('C');
        encoding.setKey(2);
        assertEquals('A', encoding.decrypt());
    }

    //test for special characters
    @Test
    public void encryptSpecial(){
        EncryptCipher encoding = new EncryptCipher();
        encoding.setC('!');
        encoding.setKey(2);
        assertEquals('!', encoding.encrypt());
    }

    //test for special characters
    @Test
    public void decryptSpecial(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('!');
        encoding.setKey(2);
        assertEquals('!', encoding.decrypt());
    }

    //test for special characters
    @Test
    public void encryptSpecial2(){
        EncryptCipher encoding = new EncryptCipher();
        encoding.setC('@');
        encoding.setKey(2);
        assertEquals('@', encoding.encrypt());
    }

    //test for special characters
    @Test
    public void decryptSpecial2(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('@');
        encoding.setKey(2);
        assertEquals('@', encoding.decrypt());
    }

    //test for special characters
    @Test
    public void encryptSpecial3(){
        EncryptCipher encoding = new EncryptCipher();
        encoding.setC('#');
        encoding.setKey(2);
        assertEquals('#', encoding.encrypt());
    }

    //test for special characters
    @Test
    public void decryptSpecial3(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('#');
        encoding.setKey(2);
        assertEquals('#', encoding.decrypt());
    }

    //test for special characters
    @Test
    public void encryptSpecial4(){
        EncryptCipher encoding = new EncryptCipher();
        encoding.setC('$');
        encoding.setKey(2);
        assertEquals('$', encoding.encrypt());
    }

    //test for special characters
    @Test
    public void decryptSpecial4(){
        DecryptCipher encoding = new DecryptCipher();
        encoding.setC('$');
        encoding.setKey(2);
        assertEquals('$', encoding.decrypt());
    }

    //test for special characters
    @Test
    public void encryptSpecial5(){
        EncryptCipher encoding = new EncryptCipher();
        encoding.setC('%');
        encoding.setKey(2);
        assertEquals('%', encoding.encrypt());
    }
}
