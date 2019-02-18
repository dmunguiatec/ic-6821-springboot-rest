package edu.tec.ic6821.sample.services;

import edu.tec.ic6821.sample.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> create(String username, String password);
}
