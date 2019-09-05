/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.coloradomesa.cs310;

/**
 *
 * @author Grant
 */
public class App {
    
    private String who = "World";
    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    private String greeting = "Hello";
    public String getGreeting() {
        return greeting;
    }
    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
    public static void main(String [] args) throws Exception {
        App app = new App();
        app.run();
    }
    
    
    private void run() {
        System.out.println(getGreeting() + " " + getWho() + '!');
    }

    private String language = "en";
    void setLanguage(String language) {
        if (language.equals("en") || language.equals("cn"))
        {
            this.language = language;
        }
        else
        {
        throw new UnsupportedOperationException("Nah");
    }
    }

    String getMessage() {
        switch(language){
            case "en": return "Hello World!";
            case "cn": return "你好，世界";
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
