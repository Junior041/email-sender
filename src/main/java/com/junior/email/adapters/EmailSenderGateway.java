package com.junior.email.adapters;

public interface EmailSenderGateway {
    void sendEmail(String to, String subject, String body);
}
