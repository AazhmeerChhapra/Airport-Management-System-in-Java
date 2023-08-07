package com.example.project;

public class plane {
    String planeName;
    int capacity;
    boolean status;

    public plane(String planeName, int capacity, boolean status) {
        this.planeName = planeName;
        this.capacity = capacity;
        this.status = status;
    }

    public String getPlaneName() {
        return planeName;
    }

    public void setPlaneName(String planeName) {
        this.planeName = planeName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
