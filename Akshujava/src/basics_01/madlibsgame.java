package basics_01;
import java.util.Scanner;
public class madlibsgame {
/*Animal = Monkey
	Place = Park
			Object = Guitar
			Adjective = Excited
			Verb = Dance
			Profession = Hero 
			One day, a ______ (animal) was walking in the ______ (place).
Suddenly, it found a ______ (object) on the ground.
The animal felt very ______ (adjective) and picked it up.
Then it started to ______ (verb) happily.
Everyone in the ______ (place) was surprised and started laughing.
At the end of the day, the animal became the ______ (profession) of the town.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter animal name: ");
		String animal=sc.nextLine();
		System.out.print("enter place name: ");
		String place=sc.nextLine();
		System.out.print("enter object name: ");
		String object=sc.nextLine();
		System.out.print("enter adj name: ");
		String adj=sc.nextLine();
		System.out.print("enter verb name: ");
		String verb=sc.nextLine();
		System.out.print("enter prof name: ");
		String prof=sc.nextLine();
		
	  System.out.println("one day,"+animal+"(animal)was walking in the"+place+".");
	  System.out.println("Suddenly, it found a "+object+"(object) on the ground.");
	  System.out.println("The animal felt very "+adj+"(adjective) and picked it up.");
	  System.out.println("Then it started to "+verb+"(verb) happily.");
	  System.out.println("Everyone in the "+place+" (place) was surprised and started laughing.\r\n"
	  		+ "At the end of the day, the animal became the "+prof+" (profession) of the town");
		
sc.close();
	}

}
