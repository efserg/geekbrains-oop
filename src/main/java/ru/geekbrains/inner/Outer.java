package ru.geekbrains.inner;

public class Outer {

    private int a;
    private static int b;

    public Outer() {
        System.out.println("Outer");
        new StaticInner().inner();
    }

    private void method1() {
        class LocalClass {
            private int a;
            public void m2() {

            }
            public int m1() {
                return 0;
            }
        }
        LocalClass localClass = new LocalClass();
        localClass.m1();
    }

    private static void staticMethod() {

    }
    public class Inner {
        // имеет доступ ко всем переменным и методам внешнего класса
        public Inner() {
            System.out.println("Inner");

            a = 1;
            method1();
            staticMethod();
        }
    }

    public static class StaticInner {
        // имеет доступ ко всем статическим переменным и методам внешнего класса
        public StaticInner() {
            System.out.println("StaticInner");

            b = 1;
            staticMethod();
        }

        public void inner() {

        }
        public static void innerMethod() {

        }
    }
}



