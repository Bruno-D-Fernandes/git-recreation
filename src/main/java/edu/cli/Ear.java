package edu.cli;

import edu.Main;

import java.util.List;
import java.util.Scanner;

public class Ear {
    Scanner scanner = new Scanner(System.in);

    List<String> lastCommand;

    public Ear() {
        // call Main's command validation when Ear is instantiated
        Main.commandValidate();
    }

}
