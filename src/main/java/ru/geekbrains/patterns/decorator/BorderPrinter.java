package ru.geekbrains.patterns.decorator;

public class BorderPrinter implements Printer {

    private final Printer printer;

    public BorderPrinter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void print(String text) {
        System.out.println("*".repeat(text.length() + 4));
        System.out.print("* ");
        printer.print(text);
        System.out.println(" *");
        System.out.println("*".repeat(text.length() + 4));
    }
}
