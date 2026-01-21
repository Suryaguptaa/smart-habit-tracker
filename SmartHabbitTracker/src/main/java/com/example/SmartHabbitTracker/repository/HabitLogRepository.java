package com.example.SmartHabbitTracker.repository;

import com.example.SmartHabbitTracker.model.HabitLog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.time.LocalDate;
import java.util.List;

public interface HabitLogRepository extends JpaRepository<HabitLog, Long> {

    // Check if a log exists for a specific habit on a specific date
    Optional<HabitLog> findByHabitIdAndDate(Long habitId, LocalDate date);

    // Get all history for a habit (for analytics later)
    List<HabitLog> findByHabitIdOrderByDateDesc(Long habitId);
    Long countByHabitId(Long habitId);
}