package org.example;

public class Desktop implements Computer {

public Desktop()
{
    System.out.println("this is desktop  constructor");
}
    @Override
    public void play() {
        System.out.println("Music Playing in Desktop");
    }
}
