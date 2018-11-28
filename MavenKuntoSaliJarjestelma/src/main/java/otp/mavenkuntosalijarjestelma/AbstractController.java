/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Antti Käyhkö
 */
public abstract class AbstractController {// laita kaikki kamat jotka on kaikissa kontrollereissa tänne
    protected final Locale defaultLocale = new Locale("fi", "FI");
    protected Locale currentLocale;
    protected String localeBundleBaseString = null;
    
    public String getLocaleBundleBaseString() {
        return localeBundleBaseString;
    }
    
    public Locale getCurrentLocale() {
        return currentLocale;
    }

    public void setCurrentLocale(Locale currentLocale) {
        this.currentLocale = currentLocale;
    }
    
    

    public  Locale getDefaultLocale() {
        return defaultLocale;
    }
    
    
    


}
