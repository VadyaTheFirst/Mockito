package my.Mockito.dao;

import java.util.List;
import my.Mockito.model.*;

public interface UserDao {
  public User getUserByName(String name);
   List<User>  findAllUsers();

}
