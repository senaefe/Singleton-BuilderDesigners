package com.rd;

public class Phone {
    private String brand;
    private String model;
    private int ram;
    private double screenSize;
    private String color;

    private Phone(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.ram = builder.ram;
        this.screenSize = builder.screenSize;
        this.color = builder.color;
    }

    public static class Builder {
        private String brand;
        private String model;
        private int ram;
        private double screenSize;
        private String color;

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder setScreenSize(double screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", screenSize=" + screenSize +
                ", color='" + color + '\'' +
                '}';
    }

    public static Phone managePhone (String brand, String model, int ram, double screenSize, String color){
        return new Builder()
                .setBrand(brand)
                .setModel(model)
                .setRam(ram)
                .setScreenSize(screenSize)
                .setColor(color)
                .build();

    }
}


