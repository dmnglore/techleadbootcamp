package com.craft.owasp;
import java.util.HashMap;
import java.util.Map;


public class BrokenAuthenticationLoginService {
	
	
	    private static final Map<String, String> userCredentials = new HashMap<>();
	    private static final Map<String, Integer> loginAttempts = new HashMap<>();
	    private static final int MAX_LOGIN_ATTEMPTS = 3; // Maximum allowed login attempts
	    private static final long LOGIN_BLOCK_DURATION = 60 * 1000; // Block duration in milliseconds (1 minute)

	    static {
	        // Populating user credentials (username, password)
	        userCredentials.put("user1", "password1");
	        userCredentials.put("user2", "password2");
	        // Add more users if needed
	    }

	    // Method to authenticate a user
	    public boolean authenticate(String username, String password) {
	        // Check if the user is blocked due to exceeding the maximum login attempts
	        if (isUserBlocked(username)) {
	            System.out.println("User " + username + " is currently blocked. Please try again later.");
	            return false;
	        }

	        // Retrieve the stored password for the provided username
	        String storedPassword = userCredentials.get(username);

	        // Check if the provided username exists and the password matches
	        if (storedPassword != null && storedPassword.equals(password)) {
	            // Reset login attempts for the user upon successful login
	            resetLoginAttempts(username);
	            System.out.println("User " + username + " has logged in successfully.");
	            return true;
	        } else {
	            // Increment login attempts for the user
	            incrementLoginAttempts(username);
	            System.out.println("Invalid username or password. Please try again.");
	            return false;
	        }
	    }

	    // Method to increment login attempts for a user
	    private void incrementLoginAttempts(String username) {
	        loginAttempts.put(username, loginAttempts.getOrDefault(username, 0) + 1);
	    }

	    // Method to reset login attempts for a user
	    private void resetLoginAttempts(String username) {
	        loginAttempts.remove(username);
	    }

	    // Method to check if a user is currently blocked due to exceeding the maximum login attempts
	    private boolean isUserBlocked(String username) {
	        Integer attempts = loginAttempts.get(username);
	        return attempts != null && attempts >= MAX_LOGIN_ATTEMPTS;
	    }

	    public static void main(String[] args) {
	    	BrokenAuthenticationLoginService loginService = new BrokenAuthenticationLoginService();
	        
	        // Simulated login attempts
	        for (int i = 0; i < 5; i++) {
	            loginService.authenticate("user1", "wrong_password"); // Invalid login attempts
	        }
	        
	        // After exceeding the maximum login attempts, further login attempts should be blocked
	        loginService.authenticate("user1", "password1"); // Blocked login attempt
	    }
	}


