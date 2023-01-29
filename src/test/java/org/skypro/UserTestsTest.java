package org.skypro;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTestsTest {

    User user = new User("marina_v", "mar@com.ru");
    User user1 = new User("lena_k", "lena@com.ru");

    @Test
    @DisplayName("Construction object creation User")
    void testUser() {
        String actualResultLogin = user.getLogin();
        String actualResultEmail = user.getEmail();
        Assertions.assertEquals("marina_v", actualResultLogin);
        Assertions.assertEquals("mar@com.ru", actualResultEmail);
    }

    @Test
    @DisplayName("Test without passing parameters to it")
    void parameterPassing() {
        String actualResultLogin = user1.getLogin();
        String actualResultEmail = user1.getEmail();
        Assertions.assertNotNull(actualResultLogin);
        Assertions.assertNotNull(actualResultEmail);
    }

    @Test
    @DisplayName("Correct Email address in the email field in the User class")
    void correctEmail() {
        boolean userCorrect = false;
        if (!user.getEmail().contains("@") || !user.getEmail().contains(".")) {
            Assertions.assertFalse(userCorrect);
        }
    }

    @Test
    public void areLoginAndEmailEqual() {
        Assertions.assertNotEquals(user1.getLogin(), user1.getEmail());
    }
}