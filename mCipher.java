import java.util.*;

class mCipher {
    static String str1 = "";
    static String str2 = "";

    //  -------------------ENCRYPTION------------------------------------------
    static void encrypt(String str, int key, int n) {
        char ch1[] = str.toCharArray();
        
        char ch3;
        for (int i = 0; i < n; i++) {
            if (Character.isLetter(ch1[i])) {
                ch3 = (char) (((int) ch1[i] * key) % 26 + 97);
                str1 = str1 + ch3;
            } else if (ch1[i] == ' ') {
                str1 = str1 + ch1[i];
            }
        }
        System.out.print(str1);
    }

    //  --------------------DECRYPTION------------------------------------------
    static void decrypt(String str1, int key, int n) {
        char ch4;
        // int q = 0;
        // for (int i = 0; i < 26; i++) {
        //     if (((i * 26) + 1) % key == 0) {
        //         q = ((i * 26) + 1) / key;
        //         break;
        //     }
        // }
        char ch2[] = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            if (Character.isLetter(ch2[i])) {
                ch4 = (char) (( (int) ch2[i] / key ) % 26 + 97);
                str2 = str2 + ch4;
            } else if (ch2[i] == ' ') {
                str2 = str2 + ch2[i];
            }
        }
        System.out.println(str2);
    }

    // --------------------Main------------------------------------------
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int key, n;
        String str;
        System.out.print("Enter the plaintext: ");
        str = sc.nextLine();
        str = str.toLowerCase();
        n = str.length();
        
        System.out.print("Key: ");
        key = sc.nextInt();
        sc.close();

        System.out.print("\nEncrypted text: ");
        encrypt(str, key, n);

        System.out.print("\nDecrypted text: ");
        decrypt(str1, key, n);

    }
}