package com.oopsDemo.tutorial1.staticDemo;

public class InnerClasses {
    static class Test {
        String name;
        Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Test{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
