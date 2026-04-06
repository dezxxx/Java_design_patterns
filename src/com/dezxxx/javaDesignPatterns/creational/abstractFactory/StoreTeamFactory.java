package com.dezxxx.javaDesignPatterns.creational.abstractFactory;

public interface StoreTeamFactory {
  Seller  getSeller ();
  Director getDirector();
  Accountant getAccountant();
}
