package com.example.springsecurityjwt.entity.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MessageResponseDto {

    private Long id;
    private String text;
    private String author;
}