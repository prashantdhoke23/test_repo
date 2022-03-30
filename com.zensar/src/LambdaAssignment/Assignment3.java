package LambdaAssignment;
import java.awt.image.ImageProducer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
interface cps{
	boolean  vlaues(String a);
}
public class Assignment3 {
public static void main(String[] args) {
	Consumer<Integer> consumer=n->System.out.println(n);
	consumer.accept(5);
	consumer.accept(56);
	
	Predicate<String> length=(String str)-> str.length()==8;
	System.out.println(length.test("ABC"));
	
	Function<String,Integer> func=(String str)->str.length();
	System.out.println(func.apply("Prashant"));
	
	Supplier<String> supplier= ()-> "Prashant";
	  System.out.println(supplier.get());
	  
	  
}
	
}
