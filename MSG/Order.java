import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Order implements Manageable {
ArrayList<Game> orderedGameList= new ArrayList<>();
ArrayList<Integer> orderedGameCount= new ArrayList<>();

int orderNumber;
String date;
String paymentMethod;
User user;
int point;
int total;

public void Order() {
	
}

public void Order(String date, LocalDate expired, String paymentMethod, User user) {
	
}

public void setPoint() {
	
}
public void calcTotal() {
	for (int i = 0; i < orderedGameList.size(); i++) {
		total += orderedGameList.get(i).getSubtotal(orderedGameCount.get(i));
	}
}


@Override
public void read(Scanner scan) {
	//1111 1/3 신용카드 
	orderNumber = scan.nextInt();
	date = scan.next();
	paymentMethod= scan.next();
	String Id = scan.next();
	User user1 = null;
	while (true) {
		code= scan.next();
		
	}
	calcTotal();
	point = total / 1000;
	user1.addGame(this);
	
}

private void findUser(String itemId) {
	// TODO Auto-generated method stub
	
}


@Override
public void print(boolean b) {// 게임리스트 출력
	// TODO Auto-generated method stub
	System.out.printf("[%s] ", orderNumber);
    for(Game game:orderedGameList) {
        System.out.print("\t");
        game.print();
    }
	
}

@Override
public boolean matches(String kwd) {
	if (user.equals(kwd))
		return true;
	if (date.contentEquals(kwd))
		return true;
	for (Game game: orderedGameList) 
		if (game.matches(kwd))
			return true;
	return false;
}

@Override
public void modify(Scanner scan) {
	// TODO Auto-generated method stub
	
}

}
