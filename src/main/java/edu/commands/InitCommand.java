package edu.commands;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class InitCommand implements Command {
    private final Path workTree;

    public InitCommand(Path workTree) {this.workTree = workTree;}

    @Override
    public int exec(String[] args) {
        try {
            Path bru = workTree.resolve(".bru");

            if(Files.exists(bru)){
                System.out.println("Repositório já inicializado em " + bru);
                return 1;
            }

            Files.createDirectories(bru.resolve("objects"));
            Files.createDirectories(bru.resolve("refs/heads"));

            // Branch, por enquanto eu posso ignorar
            Files.writeString(bru.resolve("HEAD"), "ref: refs/heads/main\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return 0;
    }

}
