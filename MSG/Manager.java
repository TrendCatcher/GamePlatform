
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class Manager {
	public ArrayList<Manageable> mList = new ArrayList<>();
	public Scanner openFile(String filename) {
		Scanner filein = null;
		try {
			filein = new Scanner(new File(filename));
		} catch (Exception e) {
			System.out.println(filename + ": 파일 없음");
			System.exit(0);
		}
		return filein;
	}
	public Manageable find(String kwd) {
	    for (Manageable m: mList)
	    	if (m.matches(kwd))
	    		return m;
	    return null;
	}
	public List<Manageable> findAll(String kwd) {
		List<Manageable> results = new ArrayList<>();	
		for (Manageable m: mList)
			if (m.matches(kwd))
				results.add(m);
		return results;
	}
	public void readAllFile(String filename, Factory fac) {
		Scanner filein = openFile(filename);
		Manageable m = null;
		while (filein.hasNext()) {
			m = fac.create();
			m.read(filein);
			mList.add(m);
		}
		filein.close();
	}

	public void printAll() {
		for (Manageable m : mList) {
			m.print();
		}
	}
	public void deleteList() {
		
	}
	public void addList(Factory fac) {
		
	}
	public void modifyList(String filename) {
		
	}
	
}
