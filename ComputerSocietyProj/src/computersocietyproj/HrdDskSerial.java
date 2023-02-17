
package computersocietyproj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HrdDskSerial {

  public HrdDskSerial() {  }

  public static String getSerialNumber(String drive) {
 
  String result = "";
    try {
      Process p;
      p = Runtime.getRuntime().exec("wmic diskdrive get serialnumber");
      BufferedReader input =new BufferedReader(new InputStreamReader(p.getInputStream()));
      String line;
      while ((line = input.readLine()) != null) {
         result += line;
      }
      
    }
    catch(Exception e){
        e.printStackTrace();
    }
    String str=result.substring(16);
    return str.trim();
  }
}
