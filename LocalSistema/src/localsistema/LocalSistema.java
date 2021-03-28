

package localsistema;

import java.util.Locale;


public class LocalSistema {

    
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        System.out.print("Seu sistema está em: ");
        System.out.print(loc.getDisplayLanguage());
        System.out.print(" - ");
        System.out.println(loc.getLanguage());
        
        
        
    }

}