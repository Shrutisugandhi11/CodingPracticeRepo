package org.example.design_principle.dip;

public class FileInput implements Reader{
    @Override
    public String read() {
        return "Reading by FileInput";
    }
}
