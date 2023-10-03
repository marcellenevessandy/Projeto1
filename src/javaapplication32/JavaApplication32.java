
package javaapplication32;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication32 {

   
    public static void main(String[] args) {
      
       double raio, volume, altura;
       raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio: "));
       altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: "));
       
  
       volume = 3.14*raio*raio*altura;
       JOptionPane.showMessageDialog(null,"O valor do volume do cilindro é:" + volume);
    }
    
}
