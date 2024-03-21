package com.simba.PiggyBank.SavingChallengesPackage;

import jakarta.persistence.*;
import com.simba.PiggyBank.UserPackage.User;
import java.time.LocalDate;

@Entity
@Table(name = "savings_challenges")
public class SavingsChallenge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double targetAmount;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    // Constructors, getters, and setters
}
