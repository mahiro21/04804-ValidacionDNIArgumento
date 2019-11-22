/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class UtilesPrimitivos {

    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static final int calcular(int num, char ctr) {
        int result;
        double dniNum = num % 23;
        char letraOK = LETRAS.charAt((int) dniNum);

        if (ctr == letraOK) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    public static final String validar(int val) {
        String validez = "";
        switch (val) {
            case 1:
                validez = "Validez ..: Correcto";
                break;
            case 0:
                validez = "Validez ..: Incorrecto";
                break;
        }
        return validez;
    }

}
