package edu.cli;

import edu.Main;
import edu.commands.InitCommand;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static edu.Main.commandValidate;


public class Listener {
    private static final Scanner SC = new Scanner(System.in);
    public static List<String> lastCommand;

    public Listener() {
    }

    public static void listen(){


        // todo eu preciso manter o terminal vivo?, eu não posso simplesmente deixar rodando o jar e me referir a ele dps? Como o git faz?
        while(true){
            lastCommand = Arrays.stream(SC.nextLine().split(" ")).toList();
            if(!commandValidate(lastCommand)) System.out.println("chama o help");
            // todo fazer algo mais refinado que um contains
            if(lastCommand.contains("stop")) break;


            // todo somente para testes, temporário
            if(lastCommand.get(1).equals("init")){
                InitCommand initCommand = new InitCommand();
                System.out.println("LOG init chmado");
                initCommand.exec(lastCommand);
            }

            System.out.println("Seu ultimo comando foi: " + lastCommand);
        }
    }

}
