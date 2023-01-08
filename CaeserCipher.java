import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class CaeserCipher {
    static String alphabet="abcdefghijklmnopqrstuvwxyz";

public static String Encode(String Ptxt,int key)
{
    Ptxt=Ptxt.toLowerCase();
    String Ctxt="";
    for (int i = 0; i < Ptxt.length(); i++) {
        int charindex=alphabet.indexOf(Ptxt.charAt(i));
        int newindex=(charindex+key)%26;
        char cipher=alphabet.charAt(newindex);
        Ctxt=Ctxt+cipher;
    }
    return Ctxt;
}
    public static String decode(String ctxt,int key){
        ctxt=ctxt.toLowerCase();
        String plaintxt="";
        for (int i = 0; i < ctxt.length(); i++){
            int charindex=alphabet.indexOf(ctxt.charAt(i));
            int newindex=(charindex-key)%26;
            if (newindex<0){
                newindex=alphabet.length()+newindex;
            }
            char ptxt=alphabet.charAt(newindex);
            plaintxt=plaintxt+ptxt;
    }
        return plaintxt;
    }

    public static void main(String[] args) {
        System.out.println("please enter plaintxt");
        Scanner in=new Scanner(System.in);
        String plain=in.nextLine();
        System.out.println("please enter the key");
        int key=in.nextInt();
        String ciphertxt=Encode(plain,key);
        System.out.println("the cipher text is:"+ciphertxt);
        System.out.println("the decode message is :"+decode(ciphertxt, key));

    }
}

