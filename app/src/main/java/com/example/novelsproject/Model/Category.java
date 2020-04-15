package com.example.novelsproject.Model;

public class Category {
    private String CategoryID, Name, Note;


    public Category(String categoryID, String name, String note) {
        CategoryID = categoryID;
        Name = name;
        Note = note;
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(String categoryID) {
        CategoryID = categoryID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }
}
