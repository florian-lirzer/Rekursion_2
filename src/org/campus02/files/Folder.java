package org.campus02.files;

import java.util.ArrayList;

public class Folder extends FSEntry {

    private ArrayList<FSEntry> entries = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void addEntry(FSEntry entry) {
        entries.add(entry);
    }

}
