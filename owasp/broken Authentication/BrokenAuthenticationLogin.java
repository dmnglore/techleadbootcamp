package com.craft.owasp;

import java.util.HashMap;
import java.util.Map;

public class BrokenAuthenticationLogin {

	    // Simulated user credentials (for demonstration purposes)
	    private static final Map<String, String> userCredentials = new HashMap<>();

	    static {
	        // Populating user credentials (username, password)
	        userCredentials.put("user1", "password1");
	        userCredentials.put("user2", "password2");
	        // Add more users if needed
	    }

	    // Method to authenticate a user
	    public boolean authenticate(String username, String password) {
	        // Retrieve the stored password for the provided username
	        String storedPassword = userCredentials.get(username);
	        
	        // Check if the provided username exists and the password matches
	        return storedPassword != null && storedPassword.equals(password);
	    }
	    
	    // Additional methods for user management could be added here
	}


