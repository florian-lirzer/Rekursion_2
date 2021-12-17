package org.campus02.files;

import java.util.ArrayList;

public class Folder extends FSEntry {

    private ArrayList<FSEntry> entries = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    @Override
    public int getSize()
    {
        int size = 0;
        for (FSEntry entry : entries)
        {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public void print()
    {
        System.out.println(name + "," + getSize() + " Bytes");
        for (FSEntry entry : entries)
        {
            entry.print();
        }
    }

    @Override
    public void print(String indent)
    {
        System.out.println(indent + "+" + name);
        for (FSEntry entry : entries)
        {
            entry.print(indent + " ");
        }
    }

    @Override
    public ArrayList<FSEntry> findEntries(String name)
    {
        ArrayList<FSEntry> result = new ArrayList<>();

        if(getName().contains(name))
            result.add(this);

        for (FSEntry fsEntry : entries)
        {
            ArrayList<FSEntry>searchResults = fsEntry.findEntries(name);
            result.addAll(searchResults);
        }
        return result;
    }

    public void addEntry(FSEntry entry) {
        entries.add(entry);
    }

}
