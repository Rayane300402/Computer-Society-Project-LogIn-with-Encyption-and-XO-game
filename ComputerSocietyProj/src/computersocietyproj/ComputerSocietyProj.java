
package computersocietyproj;

import javax.swing.JFrame;

public class ComputerSocietyProj extends JFrame {
     
    public static void main(String[] args) {
      String sn = HrdDskSerial.getSerialNumber("C");
    int len = sn.length();
    String username = UserName.findName();
    System.out.println(username);
    String encrypt = Encryption.Generate(sn, len, 10);
    System.out.println("After encryption: "+ encrypt);       
        
    
        
   
 
    }

}