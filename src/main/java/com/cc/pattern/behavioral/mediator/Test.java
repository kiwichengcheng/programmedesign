package com.cc.pattern.behavioral.mediator;

public class Test {
    public static void main(String[] args) {
        User geely = new User("geely");
        User tom = new User("Tom");

        geely.sendMessage("Hey Tom, Let's learn");
        tom.sendMessage("Ok geely");

        //

    }
}
