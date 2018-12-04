/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp.mavenkuntosalijarjestelma;

import java.util.Locale;

/**
 *
 * @author Antti Käyhkö
 */
public abstract class AbstractController {// laita kaikki kamat jotka on kaikissa kontrollereissa tänne

    /**
     *
     */

    protected final Locale defaultLocale = new Locale("fi", "FI");

    /**
     *
     */
    protected Locale currentLocale;

    /**
     *
     */
    protected String localeBundleBaseString = null;
    
    /**
     *
     * @return
     */
    public String getLocaleBundleBaseString() {
        return localeBundleBaseString;
    }

    /**
     *
     * @return
     */
    public Locale getCurrentLocale() {
        return currentLocale;
    }

    /**
     *
     * @param currentLocale
     */
    public void setCurrentLocale(Locale currentLocale) {
        this.currentLocale = currentLocale;
    }

    /**
     *
     * @return
     */
    public Locale getDefaultLocale() {
        return defaultLocale;
    }

}
