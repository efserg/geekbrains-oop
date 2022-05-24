package ru.geekbrains.patterns.decorator;

public class UpperPrinter implements Printer {

    private final Printer printer;

    public UpperPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        printer.print(text.toUpperCase());
    }
}
