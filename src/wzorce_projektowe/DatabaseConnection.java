package wzorce_projektowe;

public class DatabaseConnection {
    private DatabaseConnection() {}

    private static class DatabaseConnectorHelper {
        private static final DatabaseConnection INSTANCE = new DatabaseConnection();
    }

    public static DatabaseConnection getInstance() {
        return DatabaseConnectorHelper.INSTANCE;
    }

    public void connect() {
        System.out.println("łącze się z baza");
    }

    public void update() {
        System.out.println("update database....");
    }
}