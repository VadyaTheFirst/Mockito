package Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import my.Mockito.model.User;
import my.Mockito.dao.*;

import static org.junit.jupiter.api.Assertions.*;


class UserDaoTest {

    private final User user1 = new User("Коля");
    private final User user2 = new User("Jk");

    @Test
    @DisplayName("Проверка наличиясуществующего юзаера")
    void getExistsUserByName() {
        assertNotNull(new UserDaoImpl().getUserByName(user1.getName()));
        assertEquals("Коля", new UserDaoImpl().getUserByName(user1.getName()).getName());
    }

    @Test
    @DisplayName("Проверка отсутствия несуществующего юзера")
    void getNonExistsUserByName() {
        assertNull(new UserDaoImpl().getUserByName(user2.getName()));
    }
}