package S_Extra.D_Generics.GenericsInterface;

@FunctionalInterface
//3 is not necessary in java 8, every interface with one abstract method is a functional interface
public interface MyFunction<T> {
    void function(T n);
    //void function(T n, T b);

    /**Instead of inheriting we use lambda experiences for implementations*/
}
