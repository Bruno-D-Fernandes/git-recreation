package edu;

import edu.commands.Command;
import edu.commands.InitCommand;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Stream;

public class Main{
    public static void main(String[] args){
        Path cwd = Path.of("").toAbsolutePath();
        Map<String, Command> commands = Map.of("init", new InitCommand(cwd));

        // Normalização
        Stream.of(args).forEach((a) -> a.toLowerCase());
        for(String a : args) System.out.println(a);

        try {
            if(commands.containsKey(args[0])) System.exit(commands.get(args[0]).exec(args));

        }catch (Exception e){
            System.out.println("Estourou foi everything");
            e.printStackTrace();
        }


    }

    // Descontinuado no momento
    //Validação dos args na inicialização do jar
//    private static boolean startValidate(String[] commandsParam){
//        if(commandsParam.length != 1) return false;
//        if(!commandsParam[0].equals("start")) return false;
//
//        System.out.println("LOG: START VALIDADO");
//        return true;
//    }

    // todo validação do comando, ver se todas as flags/comandos são conhecidos
    public static boolean commandValidate(String[] lastCommand){
        if(lastCommand.length == 0) return false;

        System.out.println("LOG: COMANDO VALIDADO");
        return true;
    }

}
