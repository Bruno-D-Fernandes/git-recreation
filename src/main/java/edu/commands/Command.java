package edu.commands;

import java.io.IOException;
import java.util.List;

public interface Command {

    int exec(String[] args) throws IOException;

}
