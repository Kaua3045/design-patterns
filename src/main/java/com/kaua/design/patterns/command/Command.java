package com.kaua.design.patterns.command;

interface Command {

    // poderia receber um Input que extende uma classe base command
    void execute();
}
