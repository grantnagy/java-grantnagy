/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagrantnagy.finalp;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grant
 */
public class App {
    
    private static final String WEBSITE = "https://www.google.com/search?q=nfl&rlz=1C1CHBF_enUS869US869&oq=nfl&aqs=chrome..69i57j69i59l2j69i60l3.675j0j7&sourceid=chrome&ie=UTF-8#sie=lg;/g/11ffv6kjj0;6;/m/059yj;st;fp;1;;";
    
    private Map<String, String> teams;
    
    public static void main(String[] args) {
        App app = new App();
       app.Main();
    }
    
    
    void Main() {
        teams = new HashMap<>();
        scanTeams();
    }
   
    void scanTeams(){
        Document document;
        
        try{
            document = Jsoup.connect(WEBSITE).get();
        } catch (IOException ignored) {
            System.out.println("Could not show teams");
            return;
        }
        
        Elements elements = document.getElementsByClass("liveresults-sports-immersive__str-dc liveresults-sports-immersive__st-sc");
        
        for (Element element : elements) {
            String link = element.attributes().get("td");
            
            System.out.println("link");
        }
    }
    
}
