package utils;
public abstract class Questions {
    public Questions() {
        System.out.printf("%n「%s」%n",Thread.currentThread().getStackTrace()[2].getClassName());
    }
}
