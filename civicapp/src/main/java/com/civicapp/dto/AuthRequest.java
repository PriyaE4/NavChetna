/*
 AuthRequest = Input DTO (login request).

AuthResponse = Output DTO (JWT response).
They are the bridge between frontend and backend in your authentication flow.
 */
package com.civicapp.dto;

import lombok.Data;

@Data
//hold the login request details coming from the client.
//This class captures login input (username + password) from the user and passes it into your authentication controller/service.
public class AuthRequest {
	//fields for storing the username, password that the client sends when logging in.
    private String username;
    private String password;
}
