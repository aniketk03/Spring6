package org.example;


import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public Laptop()
    {
        System.out.println("Laptop Object Created");
    }
    public void play()
    {
        System.out.println("Playing Music on Laptop");
    }
}
