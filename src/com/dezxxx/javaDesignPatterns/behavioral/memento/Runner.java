package com.dezxxx.javaDesignPatterns.behavioral.memento;


import java.time.format.DateTimeFormatter;

public class Runner {

    public static void main(String[] args) throws Exception {

        Editor editor = new Editor();
        History history = new History();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Состояние 1
        editor.setText("Version 1");
        Memento memento1 = editor.save();
        history.save(memento1);

        System.out.println("Saved state: " + memento1.getState());
        System.out.println("Created at: " + memento1.getCreatedAt().format(formatter));
        System.out.println("Current editor text: " + editor.getText());
        System.out.println();
        Thread.sleep(3000);


        // Состояние 2
        editor.setText("Version 2");
        Memento memento2 = editor.save();
        history.save(memento2);

        System.out.println("Saved state: " + memento2.getState());
        System.out.println("Created at: " + memento2.getCreatedAt().format(formatter));
        System.out.println("Current editor text: " + editor.getText());
        System.out.println();
        Thread.sleep(3000);


        // Состояние 3
        editor.setText("Version 3");
        Memento memento3 = editor.save();
        history.save(memento3);

        System.out.println("Saved state: " + memento3.getState());
        System.out.println("Created at: " + memento3.getCreatedAt().format(formatter));
        System.out.println("Current editor text: " + editor.getText());
        System.out.println();
        Thread.sleep(3000);


        // Откат 1
        Memento undoStep1 = history.undo();
        if (undoStep1 != null) {
            System.out.println("Undo step 1 -> removed state: " + undoStep1.getState());
            System.out.println("Removed state date: " + undoStep1.getCreatedAt().format(formatter));
        }

        Memento restoreStep1 = history.undo();
        if (restoreStep1 != null) {
            editor.restore(restoreStep1);
            System.out.println("Restored to: " + restoreStep1.getState());
            System.out.println("Restored state date: " + restoreStep1.getCreatedAt().format(formatter));
            System.out.println("Current editor text after undo: " + editor.getText());
        }
        System.out.println();
        Thread.sleep(3000);


        // Откат 2
        Memento undoStep2 = history.undo();
        if (undoStep2 != null) {
            editor.restore(undoStep2);
            System.out.println("Restored to: " + undoStep2.getState());
            System.out.println("Restored state date: " + undoStep2.getCreatedAt().format(formatter));
            System.out.println("Current editor text after undo: " + editor.getText());
        }
    }
}