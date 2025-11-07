import tasks.task1.User;
import tasks.task1.UserDTO;
import tasks.task1.UserRole;
import tasks.task1.UserService;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    UserService userService = new UserService();
    List<User> users = new ArrayList<>();

    for (int i = 0; i < 10; i++) {
      User user = new User("i", "e", true, UserRole.CLIENT);
      users.add(user);
    }

    User admin = new User("admin", "a", true, UserRole.ADMIN);
    User admin2 = new User("admin", "a", false, UserRole.ADMIN);
    User admin3 = new User("admin", "a", true, UserRole.ADMIN);

    users.add(admin);
    users.add(admin2);
    users.add(admin3);

    List<UserDTO> result = userService.getActiveUsers(users);

    System.out.println(result.size());
  }
}