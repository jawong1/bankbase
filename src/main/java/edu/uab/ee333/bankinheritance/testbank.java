/*
 * Author: Joe Wong <jawong1@uab.edu>
 * Assignment:  bankbase - EE333 Spring 2022
 *
 * Credits:  (if any for sections of code)
 */

package edu.uab.ee333.bankinheritance;

/**
 *
 */
public class testbank {

    /**
     * @param args from command line - unused
     */
  public static void main(String[] args) {

    CheckingAccount mine = new CheckingAccount("David Green", 200000);
    System.out.println("The account has " + mine.getBalance());
    System.out.println(mine);

    mine.deposit(1000);
    System.out.println(mine);

    mine.withdraw(200000);
    System.out.println(mine);

    // trying to remove too much
    boolean status = mine.withdraw(200000);
    System.out.println(mine);
    System.out.println("Withdraw returned " + status);

    System.out.println(mine.clearCheck(1));
    System.out.println(mine);

    System.out.println(mine.clearCheck(10000));
    System.out.println(mine);

    mine.assessMonthlyFee();
    System.out.println(mine);
  }

}
