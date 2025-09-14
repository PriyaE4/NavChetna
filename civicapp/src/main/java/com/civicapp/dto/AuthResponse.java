//data transfer objects
package com.civicapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//Defines a class to represent the server’s response after successful authentication.
//When login is successful, this class is used to send the JWT token back to the client.
public class AuthResponse {
	//Holds the JWT token issued to the user. This token is returned to the client and later used to access protected APIs.
    private String token;  // JWT token
}
