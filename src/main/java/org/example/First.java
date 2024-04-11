package org.example;

public class First {

    private int age;
    private Laptop lap;
    private int a;

    public First(int age, Laptop lap, int a)
    {
        System.out.println(age);
        System.out.println(lap);
        System.out.println(a);
        System.out.println("Hello");
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public void setlap(Laptop lap)

        {
            this.lap = lap;
        }

        public Laptop getlap()
        {
            return lap;
        }


    public void run()
    {
        lap.play();
    }
}
