package org.example;


import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("Prototype")
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
