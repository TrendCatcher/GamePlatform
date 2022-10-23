import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Game implements Manageable {
	ArrayList<String> imagePath = new ArrayList<>();//�⺻Ű
	ArrayList<String> genre = new ArrayList<>();
	ArrayList<String> language = new ArrayList<>();
	ArrayList<String> TAG = new ArrayList<>();
	int like;
	int price;
	int sales;
	int players;
	int ageRating;
	int gameNumber;
	String name;
	LocalDate releaseDate;
	String developer;
	String version;
	String distributor;
	String OS;
	String memory;
	String processor;
	String introduction;
	double discount;
	double playtime;
	public int point;

	
	
	public void getName(){
		
	}
	public boolean isReleased(LocalDate releaseDate) {
		return false;// LocalDate������ ���� Ŭ������ ����
		
	}

	@Override
	public void read(Scanner scan) {
		// TODO Auto-generated method stub
		developer= scan.next();
		version= scan.next();
		distributor= scan.next();
		OS= scan.next();
		memory= scan.next();
		processor= scan.next();
		introduction= scan.next();
		name = fillLength(scan.next(), 20);
		price = scan.nextInt();
		
	}
	static String fillLength(String origin, int len) {
		StringBuilder buil = new StringBuilder(origin);
		for (int i = origin.getBytes().length; i < len; i++)
			buil.append(' ');
		return buil.toString();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("[�����][%s] ���Ӹ� %s\t",  releaseDate,  name);
		System.out.printf("����: %5d��\n", price);
		System.out.printf("������: %s, ����:%s, ����������:%s\n", developer, version, distributor);
		System.out.printf("<<�ּһ��>>\n OS: %s, �޸�:%s, ���μ���:%s\n", OS, memory, processor);
		System.out.printf("���ӼҰ�: %s", introduction);


		
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
	protected int getSubtotal(Integer integer) {
		return price * gameNumber;  
	};
	
}
