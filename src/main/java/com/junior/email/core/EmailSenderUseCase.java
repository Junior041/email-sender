package com.junior.email.core;
// somente cuida do que faz, não como faz : 16:10
public interface EmailSenderUseCase {
    void sendEmail(String to, String subject, String body);
}
