package com.manu.chat_app.chat;


import lombok.*;


@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private String content;
    private String sender;
    private MessageType type;

    public String getSender() {
        return sender;
    }
}
