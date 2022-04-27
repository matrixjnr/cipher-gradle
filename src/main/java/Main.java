import java.util.Scanner;

public class Main {

    //driver program asking user for input before encryption
    public static void main(String[] args){
        //set scanner for input
        Scanner in = new Scanner(System.in);
        //set menu option to select 1 for encryption or 2 for decryption
        //read menu option from user
        System.out.println("1: Encryption\n2: Decryption");
        int menu = in.nextInt();

        //if statement for menu option
        if(menu == 1){
            System. out. println("Please enter a message to by encrypted: ");
            //set string to be encrypted
            String input = in.next();
            //wait for input to be finished before asking for key input
            //set scanner for key
//        Scanner key = new Scanner(System.in);
            System.out.println("Please enter a number to be your shift key: ");
            //set key
            int keyInput = in.nextInt();
            //encrypted message
            String output = "";

            //loop through input and encrypt each character using EncryptCipher
            for(int i = 0; i < input.length(); i++){
                //set output to be encrypted character
                EncryptCipher encoding = new EncryptCipher();
                //set encoding
                encoding.setKey(keyInput);
                encoding.setC(input.charAt(i));
                //set output to be encrypted character
                output += encoding.encrypt();
            }
            //print encrypted message
            System.out.println("Your encrypted message is: "+output);
        } else if (menu == 2){
            System. out. println("Please enter a message to by dencrypted: ");
            //set string to be decrypted
            String input = in.next();
            //set scanner for key
//        Scanner key = new Scanner(System.in);
            System. out. println("Please enter a number to be your decryption key: ");
            //set key
            int keyInput = in.nextInt();
            //encrypted message
            String output = "";

            //loop through input and encrypt each character using DecryptCipher
            for(int i = 0; i < input.length(); i++){
                //set output to be enc character
                DecryptCipher encoding = new DecryptCipher();
                //set encoding
                encoding.setKey(keyInput);
                encoding.setC(input.charAt(i));
                //set output to be encrypted character
//                System.out.println(encoding.decrypt());
                output += encoding.decrypt();
            }
            //print encrypted message
            System.out.println("Your decrypted message is: "+output);
        } else {
            //print error
            System.out.println("You should select 1 or 2");
        }

//        String message = "AABC";
//        int key = 3;
//        String encrypted = "";
//        //loop to decrypt message
//        for(int i = 0; i < message.length(); i++){
//            //set cipher to be decrypted
//            DecryptCipher cipher = new DecryptCipher();
//            //set key
//            cipher.setKey(key);
//            //set character to be decrypted
//            cipher.setC(message.charAt(i));
//            //set encrypted message
//            encrypted += cipher.decrypt();
//        }
//
//        //print decrypted message
//        System.out.println("Your decrypted message is: "+encrypted);
    }
}
