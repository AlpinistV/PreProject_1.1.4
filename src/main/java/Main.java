import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Alex", "Beglov", (byte) 20);
        userService.saveUser("Gleb", "Borodach", (byte) 24);
        userService.saveUser("Anatoliy", "Jiglov", (byte) 36);
        userService.saveUser("Denis", "Stepin", (byte) 58);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.closeSessionFactory();
    }
}

