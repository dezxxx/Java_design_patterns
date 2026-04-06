package com.dezxxx.javaDesignPatterns.creational.builder.model;

public class Computer {

    private String name;
    private CpuGpuType cpu;
    private int ram;
    private int storage;
    private CpuGpuType gpu;
    private int price;

    public Computer() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCpu(CpuGpuType cpu) {
        this.cpu = cpu;
    }

    public void setGpu(CpuGpuType gpu) {
        this.gpu = gpu;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computer:\n");
        sb.append("name: ").append(name).append("\n");
        sb.append("cpu: ").append(cpu).append("\n");
        sb.append("gpu: ").append(gpu).append("\n");
        sb.append("ram: ").append(ram).append("\n");
        sb.append("storage: ").append(storage).append("\n");
        sb.append("price: ").append(price);

        return sb.toString();
    }
}
