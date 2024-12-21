package com.cm.service;

import java.util.List;

import com.cm.Exception.UserException;
import com.cm.model.User;

public interface UserService {

	public User findUserProfileByJwt(String jwt) throws UserException;
	
	public User findUserByEmail(String email) throws UserException;

	public List<User> findAllUsers();

	public List<User> getPenddingRestaurantOwner();

	void updatePassword(User user, String newPassword);

	void sendPasswordResetEmail(User user);

}
