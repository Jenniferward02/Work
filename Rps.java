import java.util.*;

public class Rps {
public static void main(String args[]) {
Scanner scan= new Scanner(System.in);
Random gen =new Random();

int pc, cc;

System.out.println("Welcome to Rock Paper Sissors");
System.out.println("To choose Rock input 1");
System.out.println("To choose Sissors input 2");
System.out.println("To choose Paper input 3");
System.out.println("To choose Lizard input 4");
System.out.println("To choose Spock input 5");
pc=scan.nextInt();
while (pc>5||pc<0) {
System.out.println("To choose a number between 1 and 5");
pc=scan.nextInt();
}
cc=gen.nextInt(5)+1;

if (pc==1){
System.out.println("You choose Rock");
} else if (pc==2){
System.out.println("You choose Sissors");
} else if (pc==3) {
System.out.println("You choose Paper");
} 
else if (pc==4) {
System.out.println("You choose Lizzard");
}
else if (pc==5) {
System.out.println("You choose Spock");
}

if (cc==1){
System.out.println("The computer choose Rock");
} else if (cc==2){
System.out.println("The computer choose Sissors");
} else if (cc==3){
System.out.println("The computer choose Paper");
}
 else if (cc==4){
System.out.println("The computer choose Lizzard");
}
 else if (cc==5){
System.out.println("The computer choose Spock");
}

if (cc>pc) {
System.out.println("You Win!");
} else if (pc==5&&cc==1) {
System.out.println("You Win!");
} else if (cc==pc){
System.out.println("Tie.");
} else {
System.out.println("Computer Wins...");
}




}
}
