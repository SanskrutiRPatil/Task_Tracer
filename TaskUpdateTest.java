package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskUpdateTest {

    @Test
    void testUpdateStatus() {

        TaskUpdate task = new TaskUpdate();

        task.updateStatus("Completed");

        assertEquals("Completed", task.getStatus());
    }
}
