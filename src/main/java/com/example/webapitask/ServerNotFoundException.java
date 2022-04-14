package com.example.webapitask;

public class ServerNotFoundException extends RuntimeException {
    public ServerNotFoundException(String id) {
        super("Could not find server(s) "+id);
    }
}
