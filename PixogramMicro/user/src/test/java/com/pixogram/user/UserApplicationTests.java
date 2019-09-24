package com.pixogram.user;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.pixogram.user.controller.UserController;
import com.pixogram.user.entity.User;
import com.pixogram.user.repo.UserRepo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserApplicationTests {
@Autowired
private static UserRepo controller;

@Autowired
UserRepo repo;
@Test
   public void userRepo4(){
List<User> gfg = new ArrayList<User>();

gfg=repo.findByUsernameAndPassword("demo","demo");
assertEquals(gfg.get(0).getEmail(),"demo@gmail.com");
   
}

@Test
   public void myRepo4(){
ArrayList<Optional> gfg = new ArrayList<Optional>();
assertEquals(repo.findByUsernameAndPassword("0", "0"),gfg);
   
}
@Test
   public void myRepo(){
      assertNotNull(repo.findAll());
   }
@Test
   public void myRepo1(){

assertNotNull(repo.findById(1));
   }

