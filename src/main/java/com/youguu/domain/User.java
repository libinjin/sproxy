package com.youguu.domain;

import com.youguu.domain.annotation.Color;

import java.util.Date;

public class User {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }

    @SuppressWarnings("unused")
    private String usernae;

    public static void main(String[] args) {
        //@Deprecated
        new Date().toLocaleString();
    }

    //给方法打过期用的
    @Deprecated
    public void add(){

    }

    public static void add(int ...args){

    }

    private Color a;

}
