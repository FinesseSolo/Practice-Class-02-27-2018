import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students person1 = new Students ("Anthony","Francis","Smith","4567");
		Students person2 = new Students ("Alexus","Cristina","Stone","7895");

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please Enter Your information" );
		Students Ant = new Students (scanner.next(), scanner.next(), scanner.next(), scanner.next());

		System.out.println("Hello Anthony Francis Smith How are you?"+"\n 1.Anthony Francis Smith CS Senior"+"\n 2. Computer Science"+"\n 3. Senior "+"\n 4. Exit");
		






	}

}
