/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.xemacscode.demo;

/**
 *
 * @author Matthew
 */
public class Books {
    private Integer id;
    private String title;
    private String author;
    private int year;
    private int pages;

    public Books(Integer id, String title, String author, int year, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.pages = pages;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }
    
}
