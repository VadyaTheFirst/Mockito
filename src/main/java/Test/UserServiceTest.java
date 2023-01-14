package Test;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

import my.Mockito.dao.UserDaoImpl;
import my.Mockito.service.UserService;
import my.Mockito.model.User;

//@Data
//@AllArgsConstructor


@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    public UserDaoImpl daoImpl = Mockito.mock(UserDaoImpl.class);
    public UserService userService;

    public UserServiceTest() {
        userService = new UserService(daoImpl);
    }

    @Test
    void checkPresntUser() {
        User presentUser = new User("Коля");
        when(daoImpl.getUserByName("Коля")).thenReturn(presentUser);
        boolean checkUser = userService.checkUserExists(presentUser);
        assertTrue(checkUser);
    }

    @Test
    void checkAbsentUser() {
        User absentUser = null;
        when(daoImpl.getUserByName("Оля")).thenReturn(absentUser);
        boolean checkUser = userService.checkUserExists(absentUser);
        assertFalse(checkUser);
    }
}