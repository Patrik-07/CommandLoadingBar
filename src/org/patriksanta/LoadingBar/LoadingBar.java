package org.patriksanta.LoadingBar;

public class LoadingBar {
    private final int length;

    public LoadingBar(int length) {
        this.length = length;
    }

    public void draw(float percent) {
        // Top
        //drawLine(10, " ");
        System.out.print("+");
        drawLine(length, "-");
        System.out.println("+");

        // Mid
        int count = (int) (length * percent);
        System.out.print("|");
        drawLine(count, "#");
        drawLine(length - count, " ");
        System.out.println("|");

        // Bottom
        //drawLine(10, " ");
        System.out.print("+");
        drawLine(length, "-");
        System.out.println("+");
    }

    private void drawLine(int length, String s) {
        for (int i = 0; i < length; i++)
            System.out.print(s);
    }
}
