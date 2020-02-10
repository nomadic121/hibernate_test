package hibernate_test;

import hibernate_test.models.UserEntity;
import hibernate_test.services.UserService;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        UserEntity user = new UserEntity("Alex", "Old", 80);

        userService.saveUser(user);

//        userService.updateUser(user);
//        userService.deleteUser(user);
        System.out.println(userService.findUser(1));
        System.out.println(userService.findUser(2));
        System.out.println(userService.findUser(3));
    }
}
