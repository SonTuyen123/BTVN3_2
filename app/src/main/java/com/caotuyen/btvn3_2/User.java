package com.caotuyen.btvn3_2;

public class User {
    private int resourceId;
    private String name;
    private int bacham;

    public User(int resourceId, String name, int bacham) {
        this.resourceId = resourceId;
        this.name = name;
        this.bacham = bacham;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBacham() {
        return bacham;
    }

    public void setBacham(int bacham) {
        this.bacham = bacham;
    }
}