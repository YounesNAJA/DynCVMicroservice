package com.younesnaja.dyncv.exception;

public abstract class ExceptionMessages {
    public static String PARAMETRE_INVALIDE = "Le format du paramètre %s est invalide";
    public static String FORMATION_NOT_FOUND = "La formation dont l'id est : %s, est introuvable.";

    public static String getMessage(String message, String... param){
        return String.format(message, param);
    }
}
