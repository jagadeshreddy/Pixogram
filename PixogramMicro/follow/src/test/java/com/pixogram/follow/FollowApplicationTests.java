package com.pixogram.follow;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pixogram.follow.entity.Follow;
import com.pixogram.follow.repo.FollowRepo;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FollowApplicationTests {


@Autowired
private static FollowRepo controller;

@Autowired
FollowRepo repo;
@Test
   public void mediaRepo4(){
List<Follow> gfg = new ArrayList<Follow>();

gfg=repo.findByUsername("user");
assertEquals(gfg.get(0).getStatus(),"active");
   
}
@Test
   public void mediaRepo(){
ArrayList<Optional> gfg = new ArrayList<Optional>();
assertEquals(repo.findByUsername("0"),gfg);
   
}
@Test
   public void mediaRepo1(){
      assertNotNull(repo.findAll());
   }
@Test
   public void mediaRepo2(){

assertNotNull(repo.findById(1));

   }


}