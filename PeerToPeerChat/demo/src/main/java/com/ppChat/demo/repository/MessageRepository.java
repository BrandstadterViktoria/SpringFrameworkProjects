package com.ppChat.demo.repository;
import com.ppChat.demo.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Long> {}

