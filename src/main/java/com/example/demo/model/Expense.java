package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "expense")
public class Expense {

    @Id
    private  Long id;
    private Instant expenseDate;
    private String descript;
    private String location;

    //SQL join
    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

}
