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
public interface AbstractController {// laita kaikki kamat jotka on kaikissa kontrollereissa tänne


    public void localize(Locale currentLocale, String sceneLocale);


}
