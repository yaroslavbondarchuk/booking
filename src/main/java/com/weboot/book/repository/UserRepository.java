package com.weboot.book.repository;

import com.weboot.book.model.Item;
import com.weboot.book.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Yaroslav Bondarchuk
 *         Date: 02.01.2016
 *         Time: 18:15
 */
public interface UserRepository extends JpaRepository<User, String> {
}
