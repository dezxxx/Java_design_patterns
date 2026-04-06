package com.dezxxx.javaDesignPatterns.behavioral.iterator;

// Concrete collection
class DeveloperTeam implements Collection<String> {

    private final String[] developers;

    public DeveloperTeam(String[] developers) {
        this.developers = developers;
    }

    @Override
    public Iterator<String> createIterator() {
        return new DeveloperIterator();
    }

    // Inner iterator
    private class DeveloperIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < developers.length;
        }

        @Override
        public String next() {
            return developers[index++];
        }
    }
}