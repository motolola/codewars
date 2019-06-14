package io.motolola.learning.oca8;

/**
 * Created by Akinjide Motolola.
 * email: motolola@icloud.com
 */
public class MyString
{
    private static final int a = 10;
    public static void main(String[] args)
    {
        System.out.println(a);
        int b = a + changeA(a);
        System.out.println(b);
    }

    private static int changeA(int a)
    {
        return a + 2;
    }
}
