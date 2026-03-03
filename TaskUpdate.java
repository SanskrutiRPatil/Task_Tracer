package com.example;

public class TaskUpdate {

    private String status = "Pending";

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getStatus() {
        return status;
    }
}
