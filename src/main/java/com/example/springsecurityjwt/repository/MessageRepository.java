package com.example.springsecurityjwt.repository;

import com.example.springsecurityjwt.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<MessageEntity, Long> {

}
