package com.dkit.oop.sd2.DAOs;

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
        assertEquals("cocozzaf",user.getUsername());
        assertEquals("Frankie",user.getFirstName());
        assertEquals("Cocozza",user.getLastName());
        assertEquals("password",user.getPassword());
        assertEquals(3,user.getId());

    }
}