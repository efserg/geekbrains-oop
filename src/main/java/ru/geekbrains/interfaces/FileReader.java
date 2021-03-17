package ru.geekbrains.interfaces;

import java.io.File;

public class FileReader implements Reader {
    private File file;

    public FileReader(File file) {
        this.file = file;
    }

    public String read() {
        // чтение из файла
        return "alkdjflkjasd sldj aa";
    }
}
