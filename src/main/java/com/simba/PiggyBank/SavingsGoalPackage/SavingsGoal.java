package com.simba.PiggyBank.SavingsGoalPackage;


import jakarta.persistence.*;
import com.simba.PiggyBank.UserPackage.User;
import java.time.LocalDate;

@Entity
@Table(name = "savings_goals")
public class SavingsGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String goalName;

    @Column(nullable = false)
    private double targetAmount;

    @Column(nullable = false)
    private double currentAmount;

    @Column(nullable = false)
    private LocalDate deadline;

    // Constructors, getters, and setters
}
