package database;

public class Database extends БазаДаних {
    public String getUserData() {
        return super.отриматиДаніКористувача();
    }

    public String getStatisticsData() {
        return super.отриматиСтатистичніДані();
    }
}
