import java.util.ArrayList;
import java.util.Scanner;

public abstract class User implements Manageable {
	private static final Game Game = null;
	ArrayList<String> myGenre= new ArrayList<>();
	ArrayList<User> friendList= new ArrayList<>();
	ArrayList<Game> myGameList= new ArrayList<>();
	ArrayList<String> myCouponList= new ArrayList<>();
	ArrayList<Integer> myPlaytimeList= new ArrayList<>();

	String ID;
	String PW;
	String name;
	String birthday;
	String contact;
	int age;
	int point;
	int userNumber;
	String nickname;
	String tier;

//리스트 요소 추가
public void addGame(Order order) {
	myGameList.add(Game);
	point += Game.point;
	}
public void addFriend(User user) {
	friendList.add(user);
	point += user.point;
	}
public void addCoupon(Coupon coupon) {
	myCouponList.add(coupon);
	point += coupon.point;
}
public void addMyGenre(String myGenre) {
	myGenre.add(myGenre);
	point += myGenre.point;
}

//리스트 요소 삭제
public void deleteGame() {
	myGameList.remove(Game);
	point += Game.point;
}
public void deleteFriend(User user) {
	friendList.remove(user);
	point += user.point;
}
public void deleteCoupon(Coupon coupon) {
	myCouponList.remove(coupon);
	point += coupon.point;
}
public void deleteMyGenre() {
	myGenre.remove(myGenre);
	point += myGenre.point;
}
@Override
public void read(Scanner scan) {
	// TODO Auto-generated method stub
	ID = scan.next();
	PW = scan.next();
	name = scan.next();
	birthday= scan.next();
	contact = scan.next();

}
@Override
public void print() {
	// TODO Auto-generated method stub
	System.out.printf("[%s] (%d점)\n", ID, point);
	for (Game Game: myGameList)
		Game.print(false);

}
@Override
public boolean matches(String kwd) {
	// TODO Auto-generated method stub
	if (ID.equals(kwd))
		return true;
	for (Game Game: myGameList)
		if (Game.matches(kwd))
			return true;
	return false;
}

@Override
public void modify(Scanner scan) {
	// TODO Auto-generated method stub

}
public static User findUser(User user) {
	// TODO Auto-generated method stub
	return null;
}

}
