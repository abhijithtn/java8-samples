import java.util.stream.IntStream;

public class ThreadExample {

	public static void main(String[] args) {
		
		Runnable r1 = () -> {System.out.println("Jai Sri Rama");};
		
		Thread t = new Thread(r1);
		
		t.start();

        IntStream.rangeClosed(1, 100).forEach(System.out::println);

	}

}
