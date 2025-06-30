package org.example;

public class Test {
    static int x = 1;
    {
        x++;
    }
    static {
        x++;
    }
    static {
        x++;
    }
    {
        x++;
    }

}
