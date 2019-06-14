package io.motolola.learning.oca8;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class ByValue
{
    public static void main(String[] args)
    {
        Boy myBoy = new Boy("Mike", 33);
        new ByValue().changeBoyAge(myBoy);
        System.out.println(myBoy.getAge());
    }

    public int changeBoyAge(Boy boy)
    {
        System.out.println("I am changing");
        boy.setAge(boy.getAge() + 2);
        return boy.getAge();
    }
}

class Boy
{
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
