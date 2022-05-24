package ru.geekbrains.patterns.decorator;

public class Main {

    public static void main(String[] args) {
        Printer consolePrinter = new ConsolePrinter();
        Printer borderPrinter = new BorderPrinter(consolePrinter);
        Printer upperPrinter = new UpperPrinter(borderPrinter);
        Printer sparsePrinter = new SparsePrinter(upperPrinter);
        Printer sparsePrinter1 = new SparsePrinter(sparsePrinter);
        sparsePrinter1.print("Hello world");
    }

}
