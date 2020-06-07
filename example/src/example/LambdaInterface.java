package example;

public interface LambdaInterface {
	void abstractFun(int x);
	default void normalFun() {
		System.out.println("Hello");
	}
}
