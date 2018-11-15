package com.yodlee.design.patterns.creational.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker<T> {

    private List<Command<T>> commandList = new ArrayList<>();
    private T t1;
    private T t2;

    public Invoker (T t1, T t2){
        this.t1 = t1;
        this.t2 = t2;
    }

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void removeCommand(Command command){
        commandList.remove(command);
    }

    public T execute(Command command){
        return (T) command.execute(t1, t2);
    }

    public void executeAllCommands(){
        for(Command<T> command: commandList){
            command.execute(t1, t2);
        }
    }
}