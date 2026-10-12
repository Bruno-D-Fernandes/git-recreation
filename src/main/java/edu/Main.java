package edu;

import edu.cli.Listener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static List<String> commands;

    public static void main(String[] args){
        // Setta o commands
        commands = List.of(args);
        // valida os args do java -jar jarName issoAqui
        if(!startValidate(commands)) System.out.println("chama o help");


        if(commands.contains("start")){
            Listener.listen();
        }

        // todo help command
        if(commands.contains("help") || commands.contains("-h")){

        }

    }

    //Validação dos args na inicialização do jar
    private static boolean startValidate(List<String> commandsParam){
        if(commandsParam.size() != 1) return false;
        if(!commandsParam.get(0).equals("start")) return false;

        System.out.println("LOG: START VALIDADO");
        return true;
    }

    // todo validação do comando, ver se todas as flas/comandos são conhecidos
    public static boolean commandValidate(List<String> lastCommand){

        if(!lastCommand.get(0).equals("bru")) return false;

        System.out.println("LOG: COMANDO VALIDADO");
        return true;
    }

}
