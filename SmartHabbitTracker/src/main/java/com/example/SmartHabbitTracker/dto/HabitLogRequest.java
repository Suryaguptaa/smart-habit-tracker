package com.example.SmartHabbitTracker.dto;

import java.time.LocalDate;

public class HabitLogRequest {
    private LocalDate date; // YYYY-MM-DD
    private String status;  // "COMPLETED"

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}