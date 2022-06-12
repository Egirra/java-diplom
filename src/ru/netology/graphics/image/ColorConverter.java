package ru.netology.graphics.image;

public class ColorConverter implements TextColorSchema {

    private static final char[] CHARS = new char[]{'#', '$', '@', '%', '*', '+', '-', '"'};

    @Override
    public char convert(int color) {
        int index = (int) (color / (256.00 / CHARS.length));
        return CHARS[index];
    }
}