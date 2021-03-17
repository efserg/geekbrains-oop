package ru.geekbrains.interfaces;

public class CharCounter {
    private final Reader reader;
    private final Writer writer;

    public CharCounter(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void processText() {
        String text = reader.read();
        int[] chars = count(text);
        for (char i = 0; i < chars.length; i++) {
            if (chars[i] != 0) {
                writer.write(i + " встретилось " + chars[i] + " раза");
            }
        }
    }

    private int[] count(String sentence) {
        int[] c = new int[127];
        char[] chars = sentence.toCharArray();
        for (char ch : chars) {
            c[ch]++;
        }
        return c;
    }
}