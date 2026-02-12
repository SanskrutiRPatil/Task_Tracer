package com.example;

import java.util.ArrayList;
import java.util.List;

public class TaskCreation {

    private List<String> tasks = new ArrayList<>();

    public void addTask(String task) {
        tasks.add(task);
    }

    public int getTaskCount() {
        return tasks.size();
    }
}
