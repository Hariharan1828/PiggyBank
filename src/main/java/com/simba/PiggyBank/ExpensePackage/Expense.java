package com.simba.PiggyBank.ExpensePackage;

import jakarta.persistence.*;
import com.simba.PiggyBank.UserPackage.User;

import java.time.LocalDate;

@Entity
@Table(name = "expenses")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private LocalDate date;

    // Constructors, getters, and setters
}
