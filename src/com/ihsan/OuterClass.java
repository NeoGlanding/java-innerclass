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

//    Static Inner Class
    public static class InnerClass2 implements InnerClassInterface {
        private String checkField;

        public InnerClass2(String checkField) {
            this.checkField = checkField;
        }

        @Override
            public void check() {
                System.out.println("InnerClass2 Checked");
            }
    }
}