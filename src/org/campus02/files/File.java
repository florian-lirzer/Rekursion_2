package org.campus02.files;

import java.util.ArrayList;

public class File extends FSEntry {

    private String extension;
    private int size;

    public File(String name, String extension, int size) {
        super(name);
        this.extension = extension;
        this.size = size;
    }

    @Override
    public int getSize()
    {
        return size;
    }

    @Override
    public void print()
    {
        System.out.println(name + "." + extension + ";" + size + " Bytes");
    }

    @Override
    public void print(String indent)
    {
        System.out.println(indent + name + "." + extension + ";" + size + " Bytes");
    }

    @Override
    public ArrayList<FSEntry> findEntries(String name)
    {
        ArrayList<FSEntry> result = new ArrayList<>();
       if(getName().contains(name))
           result.add(this);
        return result;
    }
}
