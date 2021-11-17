package database;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    private Database db;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        db = new Database();
    }

    @org.junit.jupiter.api.Test
    void getUserData() {
        assertEquals("hello", db.getUserData());
    }

    @org.junit.jupiter.api.Test
    void getStatisticsData() {
        assertEquals("hello2", db.getStatisticsData());
    }
}