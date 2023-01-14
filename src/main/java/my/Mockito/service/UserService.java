package my.Mockito.service;
import lombok.AllArgsConstructor;
import lombok.Data;
import my.Mockito.dao.*;
import my.Mockito.model.User;

@Data
@AllArgsConstructor

public class UserService {

    private UserDaoImpl userDaoImpl;


    public boolean checkUserExists(User user) {
            return userDaoImpl.getUserByName(user.getName()) != null;
    }
}

