package com.ihsan;

public class OuterClass {
//    Inner Class Normal
    public class InnerClass implements InnerClassInterface {
        private int testField;

        public InnerClass(int testField) {
            this.testField = testField;
        }
        public int getTestField() {
            return testField;
        }

        @Override
        public void check() {
            System.out.println("InnerClass Checked");
        }
    }
}