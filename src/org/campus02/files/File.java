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

}
