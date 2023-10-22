package com.eps.taskmanager.Controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskControllerTest {
    String EXPECTED_RESPONSE = "Hello from Task Manager!";

    @Test
    void shouldReturnAResponseFromPayload() {
        TaskController taskController = new TaskController();
        String payloadResponse = taskController.getTasks();
        assertEquals(EXPECTED_RESPONSE, payloadResponse);
    }
}