import java.util.*;

public class Tictactoe {

public static void main(String args[]) {

Scanner scan= new Scanner(System.in);

char t1,t2,t3,t4,t5,t6,t7,t8,t9;
t1='_';
t2='_';
t3='_';
t4='_';
t5='_';
t6='_';
t7='_';
t8='_';
t9='_';


int counter,input1,input2,works,works2,win;
works=0;
works2=0;
win=0;
counter=0;

while(win==0) {

while(works==0) {
System.out.println("Player 1 Input Where You Would Like To Move (1 - 9) : ");


input1=scan.nextInt();

while(input1>9||input1<1) {
System.out.println("Area Invalid, Pick Again: ");
input1=scan.nextInt();
}


if (input1==1 ){
	if (t1=='X'||t1=='O') {
		System.out.println("Sorry That Area Is Taken... ");
	} else {
		t1='X';
		works=1;
	}
}
else if (input1==2 ){
	if (t2=='X'||t2=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t2='X';
		works=1;
		
	}
}
else if (input1==3 ){
	if (t3=='X'||t3=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t3='X';
		works=1;
	}
}
else if (input1==4 ){
	if (t4=='X'||t4=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t4='X';
		works=1;
	}
}
else if (input1==5 ){
	if (t5=='X'||t5=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t5='X';
		works=1;
	}
}
else if (input1==6 ){
	if (t6=='X'||t6=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t6='X';
		works=1;
	}
}
else if (input1==7 ){
	if (t7=='X'||t7=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t7='X';
		works=1;
	}
}
else if (input1==8 ){
	if (t8=='X'||t8=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t8='X';
		works=1;
	}
}
else if (input1==9 ){
	if (t9=='X'||t9=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t9='X';
		works=1;
	}
}
System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println("Current Board: ");
System.out.println();
System.out.println(t1+" | "+t2+" | "+t3);
System.out.println("_________");
System.out.println();
System.out.println(t4+" | "+t5+" | "+t6);
System.out.println("_________");
System.out.println();
System.out.println(t7+" | "+t8+" | "+t9);
System.out.println();
System.out.println();System.out.println();System.out.println();System.out.println();
works2=0;

if (t1=='X' && t5=='X' && t9=='X') {
System.out.println("Player 1 Wins");
win=1;
return;
} else if (t1=='X' && t2=='X' && t3=='X') {
System.out.println("Player 1 Wins");
win=1;
return;
} else if (t4=='X' && t5=='X' && t6=='X') {
System.out.println("Player 1 Wins");
win=1;
return;
} else if (t7=='X' && t8=='X' && t9=='X') {
System.out.println("Player 1 Wins");
win=1;
return;
} else if (t7=='X' && t5=='X' && t3=='X') {
System.out.println("Player 1 Wins");
win=1;
return;
} else if (t1=='X' && t4=='X' && t7=='X') {
System.out.println("Player 1 Wins");
win=1;
return;
} else if (t2=='X' && t5=='X' && t8=='X') {
System.out.println("Player 1 Wins");
win=1;
return;
} else if (t3=='X' && t6=='X' && t9=='X') {
System.out.println("Player 1 Wins");
win=1;
return;
} else if (t1=='O' && t5=='O' && t9=='O') {
System.out.println("Player 2 Wins");
win=1;
return;
} else if (t1=='O' && t2=='O' && t3=='O') {
System.out.println("Player 2 Wins");
win=1;
return;
} else if (t4=='O' && t5=='O' && t6=='O') {
System.out.println("Player 2 Wins");
win=1;
return;
} else if (t7=='O' && t8=='O' && t9=='O') {
System.out.println("Player 2 Wins");
win=1;
return;
} else if (t7=='O' && t5=='O' && t3=='O') {
System.out.println("Player 2 Wins");
win=1;
return;
} else if (t1=='O' && t4=='O' && t7=='O') {
System.out.println("Player 2 Wins");
win=1;
return;
} else if (t2=='O' && t5=='O' && t8=='O') {
System.out.println("Player 2 Wins");
win=1;
return;
} else if (t3=='O' && t6=='O' && t9=='O') {
System.out.println("Player 2 Wins");
win=1;
return;
}


}
counter++;
if (counter==9) {
System.out.println("It is a Tie");
win=1;
return;
}

while(works2==0) {
System.out.println("Player 2 Input Where You Would Like To Move (1 - 9) : ");


input2=scan.nextInt();

while(input2>9||input2<1) {
System.out.println("Area Invalid, Pick Again: ");
input2=scan.nextInt();
}

if (input2==1 ){
	if (t1=='X'||t1=='O') {
		System.out.println("Sorry That Area Is Taken... ");
	} else {
		t1='O';
		works2=1;
	}
}
else if (input2==2 ){
	if (t2=='X'||t2=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t2='O';
		works2=1;
	}
}
else if (input2==3 ){
	if (t3=='X'||t3=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t3='O';
		works2=1;
	}
}
else if (input2==4 ){
	if (t4=='X'||t4=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t4='O';
		works2=1;
	}
}
else if (input2==5 ){
	if (t5=='X'||t5=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t5='O';
		works2=1;
	}
}
else if (input2==6 ){
	if (t6=='X'||t6=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t6='O';
		works2=1;
	}
}
else if (input2==7 ){
	if (t7=='X'||t7=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t7='O';
		works2=1;
	}
}
else if (input2==8 ){
	if (t8=='X'||t8=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t8='O';
		works2=1;
	}
}
else if (input2==9 ){
	if (t9=='X'||t9=='O') {
		System.out.println("Sorry That Area Is Taken... ");

	} else {
		t9='O';
		works2=1;
	}
}

System.out.println();System.out.println();System.out.println();System.out.println();
System.out.println("Current Board: ");
System.out.println();
System.out.println(t1+" | "+t2+" | "+t3);
System.out.println("_________");
System.out.println();
System.out.println(t4+" | "+t5+" | "+t6);
System.out.println("_________");
System.out.println();
System.out.println(t7+" | "+t8+" | "+t9);
System.out.println();
System.out.println();System.out.println();System.out.println();System.out.println();
works=0;

if (t1=='X' && t5=='X' && t9=='X') {
System.out.println("Player 1 Wins");
win=1;
} else if (t1=='X' && t2=='X' && t3=='X') {
System.out.println("Player 1 Wins");
win=1;
} else if (t4=='X' && t5=='X' && t6=='X') {
System.out.println("Player 1 Wins");
win=1;
} else if (t7=='X' && t8=='X' && t9=='X') {
System.out.println("Player 1 Wins");
win=1;
} else if (t7=='X' && t5=='X' && t3=='X') {
System.out.println("Player 1 Wins");
win=1;
} else if (t1=='X' && t4=='X' && t7=='X') {
System.out.println("Player 1 Wins");
win=1;
} else if (t2=='X' && t5=='X' && t8=='X') {
System.out.println("Player 1 Wins");
win=1;
} else if (t3=='X' && t6=='X' && t9=='X') {
System.out.println("Player 1 Wins");
win=1;
} else if (t1=='O' && t5=='O' && t9=='O') {
System.out.println("Player 2 Wins");
win=1;
} else if (t1=='O' && t2=='O' && t3=='O') {
System.out.println("Player 2 Wins");
win=1;
} else if (t4=='O' && t5=='O' && t6=='O') {
System.out.println("Player 2 Wins");
win=1;
} else if (t7=='O' && t8=='O' && t9=='O') {
System.out.println("Player 2 Wins");
win=1;
} else if (t7=='O' && t5=='O' && t3=='O') {
System.out.println("Player 2 Wins");
win=1;
} else if (t1=='O' && t4=='O' && t7=='O') {
System.out.println("Player 2 Wins");
win=1;
} else if (t2=='O' && t5=='O' && t8=='O') {
System.out.println("Player 2 Wins");
win=1;
} else if (t3=='O' && t6=='O' && t9=='O') {
System.out.println("Player 2 Wins");
win=1;
}

}

counter++;
if (counter==9) {
System.out.println("It is a Tie");
win=1;
}

}//end of while for loop







}
}
