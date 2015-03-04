import java.time.LocalDate;
import java.util.stream.IntStream;

public class FilterExample {

	public static void main(String[] args) {

		IntStream stream = IntStream.rangeClosed(1, 100);

		stream.parallel().filter(a -> a % 2 == 0).forEach(System.out::println);
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Old way");
				
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		Thread t2 = new Thread(() -> {System.out.println("New way");});
		t2.start();
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);

	}

}
