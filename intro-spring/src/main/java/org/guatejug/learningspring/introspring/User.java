package org.guatejug.learningspring.introspring;

/**
 *
 * @author Mario Batres
 * @version 1.0
 */
public class User {
    private int userId;
    private String name;
    private String username;
    private String password;

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User = {userId = ").append(this.userId).
                append(", name = '").append(this.name).
                append("', username = '").append(this.username).
                append("', password = '").append(this.password).
                append("'}");
        
        return builder.toString();
    }
    
    
}
