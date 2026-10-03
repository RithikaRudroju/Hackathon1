import java.util.Scanner;
class WaterBill	{
public static void main(String []args)  {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the water consumption");
double Bill = sc.nextInt();
if (Bill <= 500) {
System.out.println("The bill is Rs.100");
}
else  {
System.out.println("The bill is Rs.200");
 }
sc.close();

}

}
