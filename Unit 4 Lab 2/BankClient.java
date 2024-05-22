//Nathan Nguyen
//On my honor as a student, I have not given nor received any unauthorized assistance on this assignment

import java.text.*;
import java.util.*;
public class BankClient{
   private String name, account, pin, balanceAsMoney;
   private double balance;
   public BankClient(String n, String p, double b){
      name = n;
      pin = p;
      balance = b;
      setBalanceAsMoney();
      createAccountNum();
   }
   public BankClient(String n, String p)
   {
      name = n;
      pin = p;
      balance = 0;
      setBalanceAsMoney();
      createAccountNum();
   }
   public String getName()
   {
      return name;
   }
   public void setBalanceAsMoney()
   {
      balanceAsMoney = NumberFormat.getCurrencyInstance().format(balance);
   }
   public void createAccountNum()
   {
      account = String.valueOf((int)(Math.random() * 1000000)); //generates a random # between 0 and 999999 and converts to String
      while (account.length() < 6){ //in case a 6 digit account number wasn't generated
         account = "0" + account;
      }
   }
   public String getBalance()
   {
      return balanceAsMoney;
   }
   public String getAccount()
   {
      return account;
   }
   public boolean checkAccount(String s)
   {
      if(account.equals(s))
      {
         return true;
      }
      return false;
   }
   public boolean pinCheck(String p)
   {
      if(pin.equals(p))
      {
         return true;
      }
      return false;
   }
   
   public void deposit(double d)
   {
      balance += d;
      setBalanceAsMoney();
   }
   
   public boolean withdraw(double w)
   {
      if(balance >= w)
      {
         balance -= w;
         setBalanceAsMoney();
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public String toString(){
      String s1 = account + " " + name + " " + balanceAsMoney;
      return s1;
   }
}
