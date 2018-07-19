package com.mohan.jsontest;

public class SuperHeros {
    private String name;
    private String realname;
    private String team;
    private String firstappearence;
    private String createdby;
    private String publisher;
    private String bio;
    private String imgeurl;

    public String getName() {
        return name;
    }

    public String getRealname() {
        return realname;
    }

    public String getTeam() {
        return team;
    }

    public String getFirstappearence() {
        return firstappearence;
    }

    public String getCreatedby() {
        return createdby;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBio() {
        return bio;
    }

    public String getImgeurl() {
        return imgeurl;
    }

    public SuperHeros(String name, String realname, String team, String firstappearence, String createdby, String publisher, String bio, String imgeurl) {
        this.name = name;
        this.realname = realname;
        this.team = team;
        this.firstappearence = firstappearence;
        this.createdby = createdby;
        this.publisher = publisher;
        this.bio = bio;
        this.imgeurl = imgeurl;

    }
}
