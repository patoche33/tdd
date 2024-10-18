package org.example.repository;

import org.example.User;

public interface UserRepository {
    User findUser(String username);
}
