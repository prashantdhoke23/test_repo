package LambdaAssignment;
 interface FunctionalInterfacee{
	int addvalue(int a , int b);
}
public class Assignment1 {
	public static void main(String[] args) {
		FunctionalInterfacee rgg= (a,b)->(a+b);
		System.out.println("Addition of a and b =" + rgg.addvalue(3,4));
		FunctionalInterfacee rgg1= (a,b)->(a-b);
		System.out.println("Subtraction of a and b =" + rgg1.addvalue(9,4));
		FunctionalInterfacee rgg2= (a,b)->(a*b);
		System.out.println("Multiplication of a and b =" + rgg2.addvalue(3,4));
		FunctionalInterfacee rgg3= (a,b)->(a/b);
		System.out.println("Addition of a and b =" + rgg3.addvalue(10,2));
	}

}
