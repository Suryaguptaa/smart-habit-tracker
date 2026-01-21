# 🚀 Smart Habit Tracker & Analytics Engine

A high-performance backend system for tracking daily habits, calculating streaks, and generating behavioral analytics. Built with **Spring Boot** and optimized **MySQL** queries.

## 📌 Key Features
* **Smart Streak Engine:** Auto-calculates user consistency using an optimized date-traversal algorithm.
* **Performance Analytics:** Delivers instant completion rates and consistency scores via aggregated SQL queries (O(1) dashboard reads).
* **Data Integrity:** Prevents duplicate logs using composite unique constraints at the database level.
* **RESTful Architecture:** Clean separation of concerns with Controller, Service, and Repository layers.

## 🛠️ Tech Stack
* **Backend:** Java 17+, Spring Boot 3.x
* **Database:** MySQL 8.0 (with Hibernate/JPA)
* **Tools:** Maven, Postman, Lombok

## ⚙️ Setup & Run
1.  **Clone the repository**
    ```bash
    git clone [https://github.com/Suryaguptaa/habit-tracker.git](https://github.com/Suryaguptaa/habit-tracker.git)
    ```
2.  **Configure MySQL**
    * Create a database named `habit_tracker_db`.
    * Update `src/main/resources/application.properties` with your MySQL username/password.
3.  **Run the Application**
    ```bash
    mvn spring-boot:run
    ```

## 🔌 API Endpoints

### 👤 User Management
* `POST /api/users/register` - Create a new account

### 📅 Habit Management
* `POST /api/habits` - Create a new habit
* `GET  /api/habits/user/{id}` - Get all habits for a user

### ⚡ Tracking & Analytics
* `POST /api/habits/{id}/log` - Mark a habit as completed for a date
* `GET  /api/habits/{id}/streak` - Get current streak count
* `GET  /api/habits/{id}/analytics` - Get completion rate and motivational stats