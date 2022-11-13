package com.example.spring.JPALibraryManagement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
//@AllArgsConstructor
@NoArgsConstructor
@Table(name="card_table")
public class Card {
    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
  private  int id;
  private  int fine;

    public Card(int fine) {
        this.fine = fine;
    }

    @CreationTimestamp
    private Date createdOn;
//    @UpdateTimestamp
//    private Date updatedOn;

}
