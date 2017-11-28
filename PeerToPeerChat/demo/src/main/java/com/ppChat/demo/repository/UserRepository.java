package com.ppChat.demo.repository;
import com.ppChat.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, String>{

}


