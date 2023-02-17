
package computersocietyproj;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UserName {
    public UserName(){}

    public static String findName(){
        String result ="";
        try {
            Process p;
            p = Runtime.getRuntime().exec("whoami");
            BufferedReader input =
                    new BufferedReader
                            (new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = input.readLine()) != null) {
                result += line;
            }
            input.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        int sub=result.length();
        int s = 0;
        for(int i=0;i<sub;i++){
            s=result.indexOf("\\");
        }
        
        result=result.substring(s+1).trim();
        return result;
        
    }

}
