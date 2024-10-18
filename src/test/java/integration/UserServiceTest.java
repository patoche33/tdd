package integration;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.User;
import org.example.repository.UserRepository;
import org.example.service.UserService;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    @Test
    public void testGetUser() {
        UserRepository mockRepository = mock(UserRepository.class);
        when(mockRepository.findUser("john")).thenReturn(new User("john", "John Doe"));

        UserService userService = new UserService(mockRepository);
        User user = userService.getUser("john");

        assertEquals("John Doe", user.getName());


    }
}
