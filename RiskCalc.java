package edu.bentley.riskcalc;

import java.util.Scanner;

public class RiskCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Actuarial Risk Tool v1.0 ---");
        
        System.out.print("Enter Principal Amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter Annual Interest Rate (as decimal, e.g., 0.05): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter Risk Factor (0.0 to 1.0 - likelihood of loss): ");
        double risk = scanner.nextDouble();

        // Simple Actuarial Formula: Expected Value = P * (1 + r) * (1 - risk)
        double expectedValue = principal * (1 + rate) * (1 - risk);

        System.out.println("\nResults:");
        System.out.println("Projected Value: $" + expectedValue);
        System.out.println("Risk Adjustment: -$" + (principal * (1 + rate) * risk));
        
        scanner.close();
	}

}
