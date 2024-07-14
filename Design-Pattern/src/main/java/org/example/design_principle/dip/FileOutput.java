package org.example.design_principle.dip;

public class FileOutput implements Writer{
    @Override
    public String write() {
        return "Writing bu FileOutput";
    }
}
