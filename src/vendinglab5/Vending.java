/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vendinglab5;

import java.util.Hashtable;

class VendingItem {
  double price;
  int numPieces;
  
  
  VendingItem(double price, int numPieces) {
    this.price = price;
    this.numPieces = numPieces;
  }
  
  void restock(int pieces) {
    this.numPieces = this.numPieces + pieces;
  }
  
  void purchase(int pieces) {
    this.numPieces = this.numPieces - pieces;
  }
}

/** 
 * Class for a Vending Machine.  Contains a hashtable mapping item names to item data, as 
 * well as the current balance of money that has been deposited into the machine.
 */
class Vending {
  private static Hashtable<String, VendingItem> Stock = new Hashtable<String,VendingItem>();
  private double balance;
    
  Vending(int numCandy, int numGum) {
    Stock.put("Candy", new VendingItem(1.25, numCandy));
    Stock.put("Gum", new VendingItem(.5, numGum));
    this.balance = 0;
  }
  
  /** resets the Balance to 0 */
  void resetBalance () {
    this.balance = 0;
  }
  
  /** returns the current balance */
  double getBalance () {
    return this.balance;
  }
  
  /** adds money to the machine's balance
    * @param amt how much money to add
    * */
  void addMoney (double amt) {
    this.balance = this.balance + amt;
  }
    
  /** attempt to purchase named item.  Message returned if
    * the balance isn't sufficient to cover the item cost.
    * 
    * @param name The name of the item to purchase ("Candy" or "Gum")
    */
  void select (String name) {
    if (Stock.containsKey(name)) {
      VendingItem item = Stock.get(name);
      if (balance >= item.price) {
        item.purchase(1);
        this.balance = this.balance - item.price;
      }
      else
        System.out.println("Gimme more money");
    }
    else System.out.println("Sorry, don't know that item");
  }
      
}

class Examples {
}
  
