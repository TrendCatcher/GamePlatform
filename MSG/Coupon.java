import java.time.LocalDate;
import java.util.Scanner;

public abstract class Coupon implements Manageable {
String serialNumber;
String name;
double discount;
LocalDate expiryDate;

public boolean isValid(LocalDate expiryDate) {
	return false;
	
}
@Override
public void read(Scanner scan) {
	// TODO Auto-generated method stub
	serialNumber= scan.next();
	name= scan.next();
	
}
@Override
public void print() {
	// TODO Auto-generated method stub
	System.out.printf("[%s] %s\t",  serialNumber,  name);
	
}
@Override
public boolean matches(String kwd) {
	// TODO Auto-generated method stub
	if (name.contains(kwd))
	    return true;
	if (kwd.length() > 2 && name.contains(kwd))
	    return true;
	return false;
}
boolean matches(String[] kwdArr) {
	for (String kwd: kwdArr) {
		if (!matches(kwd))
			return false;
	}
	return true;
}
@Override
public void modify(Scanner scan) {
	// TODO Auto-generated method stub
	
}

}
