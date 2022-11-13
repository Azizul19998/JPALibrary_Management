package com.example.spring.JPALibraryManagement.Repository;

import com.example.spring.JPALibraryManagement.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
