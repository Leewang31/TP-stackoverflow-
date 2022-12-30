package com.stack.stackoverflow.UserPage.repository;

import com.stack.stackoverflow.UserPage.entity.UserPage;
import com.stack.stackoverflow.question.entity.Question;
import com.stack.stackoverflow.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserPageRepository extends JpaRepository<UserPage, Long> {
    UserPage findByUser(User user);
    Optional<UserPage> findByRefresh(String refresh);
}
