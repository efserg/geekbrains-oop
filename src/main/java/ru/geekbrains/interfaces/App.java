package ru.geekbrains.interfaces;

public class App {

    public static void main(String[] args) {
        Reader reader1 = new Reader() { // анонимный класс
            @Override
            public String read() {
                return "Call from anonymous class";
            }
        };
        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        CharCounter charCounter = new CharCounter(reader1, writer);
        charCounter.processText();
    }
}
