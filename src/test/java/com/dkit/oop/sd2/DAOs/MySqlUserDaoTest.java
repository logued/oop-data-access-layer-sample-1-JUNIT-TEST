package com.dkit.oop.sd2.DAOs;
// Note that for this test to work, the database must be created using the original SQL setup file.
// and the relevant data must not have been changed.
// Also, MySql server must be running. (XAMPP)      Mar 2024
//

import com.dkit.oop.sd2.DTOs.User;
import com.dkit.oop.sd2.Exceptions.DaoException;

import static org.junit.jupiter.api.Assertions.*;

class MySqlUserDaoTest {
    UserDaoInterface IUserDao=null;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        IUserDao = new MySqlUserDao();  // create the DAO class
    }

    @org.junit.jupiter.api.Test
    void findUserByUsernamePassword() throws DaoException {
        User user = IUserDao.findUserByUsernamePassword("cocozzaf","password");
        assertNotNull(user);
        assertEquals("cocozzaf",user.getUsername());
        assertEquals("Frankie",user.getFirstName());
        assertEquals("Cocozza",user.getLastName());
        assertEquals("password",user.getPassword());
        assertEquals(3,user.getId());

    }
}