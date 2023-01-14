package my.Mockito.dao;

import my.Mockito.model.User;


import java.util.Arrays;
import java.util.List;

public class UserDaoImpl implements UserDao {


    public List<User> users = Arrays.asList(
            new User("Коля"),
            new User("Толя"))
    ;


    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users.stream().toList();
    }
}
