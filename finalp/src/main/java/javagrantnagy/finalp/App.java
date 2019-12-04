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
    
    private static final String WEBSITE = "https://www.revengeofficial.com";
    
    private Map<String, String> teams;
    
    public static void main(String[] args) {
        App app = new App();
       app.scanTeams();
    }
    
    private void scanTeams(){
        teams = new HashMap<>();
        Document document;
        
        try{
            document = Jsoup.connect(WEBSITE + "/webstore").get();
        } catch (IOException ignored) {
            System.out.println("Could not show teams");
            return;
        }
        
        Elements elements = document.getElementsByClass("ProductList-item-link");
        
        for (Element element : elements) {
            String link = element.attributes().get("href");
            
            System.out.println(link);
        }
    }
    
}
