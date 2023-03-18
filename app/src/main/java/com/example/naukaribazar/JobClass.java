package com.example.naukaribazar;

public class JobClass {
    private String name,skill,amount,location,time;
    int imageUrl;

    public JobClass(int imageUrl, String name, String skill, String amount, String location, String time) {
        this.imageUrl = imageUrl;
        this.name = name;
        this.skill = skill;
        this.amount = amount;
        this.location = location;
        this.time = time;
    }

    public int getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(int imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
