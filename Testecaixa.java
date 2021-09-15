
package testecaixa;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import javax.swing.JOptionPane;

public class Testecaixa {


    public static void main(String[] args) {
        
        String x= JOptionPane.showInputDialog(null,"Digite um valor");
        int val1= Integer.parseInt(x);
        x=JOptionPane.showInputDialog(null,"Digite outro valor");
        int val2= Integer.parseInt(x);
        JOptionPane.showMessageDialog(null,"Resultado" + (val1+val2));
    }
    
}
