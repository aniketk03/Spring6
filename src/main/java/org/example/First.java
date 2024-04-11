package org.example;

public class First {

    private int age;
    private Laptop lap;
    private int a;
    private Computer com;

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

        public Computer getcom()
        {
         return com;
        }

        public void setcom(Computer com)
        {
            this.com = com;
        }

    public void run()
    {
        //lap.play();
        com.play();

    }
}
