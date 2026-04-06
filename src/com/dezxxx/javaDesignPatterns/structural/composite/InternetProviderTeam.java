package com.dezxxx.javaDesignPatterns.structural.composite;

public class InternetProviderTeam {
    public static void main(String[] args) {

        Team team = new Team("FastNet");

        CallOperator callOperator = new CallOperator();
        InternetInstaller internetInstaller = new InternetInstaller();
        TechnicalSupport technicalSupport = new TechnicalSupport();




        team.addEmployee(callOperator);
        team.addEmployee(internetInstaller);
        team.addEmployee(technicalSupport);

        team.createInternetProvider();


    }


}
