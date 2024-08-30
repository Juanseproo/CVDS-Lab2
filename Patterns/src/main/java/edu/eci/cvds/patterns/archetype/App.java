package edu.eci.cvds.patterns.archetype;

public class App {
    public static void main(String[] args) {
        String message = "Hello";
        // No hay argumentos
        if (args.length == 0) {
            message += " World";
        } 
        else {
            for (String word: args) {
                message += " " + word;
            }
        }
        message += "!";
        System.out.println(message);
    }
}