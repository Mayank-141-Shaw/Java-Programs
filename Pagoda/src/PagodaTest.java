import java.util.*;
public class PagodaTest {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		
		Pagoda pgda = new Pagoda();
		System.out.println("Pagoda Test\n");
		char ch;
		
		do {
			System.out.println("Pagoda Operation\n");
			System.out.println("1.Insert");
			System.out.println("2.Delete");
			System.out.println("3.Check empty");
			System.out.println("4.Clear");
			
			int choice=scan.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter innteger element to insert");
				pgda.insert(scan.nextInt());
				break;
			case 2:pgda.delete();
				break;
			case 3:System.out.println("Empty status = "+pgda.isEmpty());
				break;
			case 4:
				System.out.println("\nCleared");
				pgda.makeEmpty();
				break;
			default:
				System.out.println("Wrong entry\n");
				break;
			}
			
			System.out.println("\nRoot element: ");
			pgda.printPagodaRoot();
			
			System.out.println("\nDo you want to continue (Type y or n)\n");
			ch=scan.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');
	}
}
