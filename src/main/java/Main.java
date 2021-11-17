import analytics.ReportBuilder;
import database.Authorization;
import database.Database;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization auth = new Authorization();
        if (auth.авторизуватися(db)) {
            ReportBuilder rb = new ReportBuilder(db);
        }
    }
}

// 1:07