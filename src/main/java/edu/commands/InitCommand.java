package edu.commands;

import edu.Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static edu.core.Repository.initPath;

public class InitCommand implements command{


    @Override
    public void exec(List<String> args) {
        try {
            Path resolve = Files.createDirectory(initPath.resolve(".bru"));
            System.out.println("LOG " + resolve.toString());

            Files.createDirectory(resolve.resolve("objects"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
