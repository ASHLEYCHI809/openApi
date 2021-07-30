package com.example.openapidemo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;


interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {
 @Query(value = "select u from User u where u.email like %?1%")
    User findByEmail(String email);

 @Query(value = "delete from User u where u.email like %?1%")
 void deleteByEmail(String email);
}
