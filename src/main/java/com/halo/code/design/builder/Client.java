package com.halo.code.design.builder;

public class Client {

    public static void main(String[] args) {
        IBuilder builder = new ConcreteBuilder();
        System.out.println(builder.build());
    }

    static class Product {

        private String name;

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    interface IBuilder {
        Product build();
    }

    static class ConcreteBuilder implements IBuilder {

        private Product product = new Product();

        @Override
        public Product build() {
            return product;
        }
    }
}
