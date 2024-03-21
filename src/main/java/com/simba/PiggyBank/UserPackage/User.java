package com.simba.PiggyBank.UserPackage;

import jakarta.persistence.*;
import com.simba.PiggyBank.BudgetPackage.Budget;
import com.simba.PiggyBank.SavingChallengesPackage.SavingsChallenge;
//import com.simba.PiggyBank.ExpensePackage.Expense;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Budget> budgets;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<SavingsChallenge> savingsChallenges;

    public User(Long id, String name, String email, String password, List<Budget> budgets, List<SavingsChallenge> savingsChallenges) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.budgets = budgets;
        this.savingsChallenges = savingsChallenges;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Budget> getBudgets() {
        return budgets;
    }

    public void setBudgets(List<Budget> budgets) {
        this.budgets = budgets;
    }

    public List<SavingsChallenge> getSavingsChallenges() {
        return savingsChallenges;
    }

    public void setSavingsChallenges(List<SavingsChallenge> savingsChallenges) {
        this.savingsChallenges = savingsChallenges;
    }

    // Constructors, getters, and setters
}

