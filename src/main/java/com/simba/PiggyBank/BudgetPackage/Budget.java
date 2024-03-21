package com.simba.PiggyBank.BudgetPackage;

import jakarta.persistence.*;
import com.simba.PiggyBank.UserPackage.User;
import java.util.Map;


@Entity
@Table(name = "budgets")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ElementCollection
    @CollectionTable(name = "budget_categories",
            joinColumns = @JoinColumn(name = "budget_id"))
    @MapKeyColumn(name = "category")
    @Column(name = "amount")
    private Map<String, Double> categoryAmounts;

    @Column(nullable = false)
    private double totalAmount;

    @Column(nullable = false)
    private int month;

    @Column(nullable = false)
    private int year;

    public Budget() {
    }

    public Budget(Long id, User user, Map<String, Double> categoryAmounts, double totalAmount, int month, int year) {
        this.id = id;
        this.user = user;
        this.categoryAmounts = categoryAmounts;
        this.totalAmount = totalAmount;
        this.month = month;
        this.year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Map<String, Double> getCategoryAmounts() {
        return categoryAmounts;
    }

    public void setCategoryAmounts(Map<String, Double> categoryAmounts) {
        this.categoryAmounts = categoryAmounts;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Constructors, getters, and setters
}
