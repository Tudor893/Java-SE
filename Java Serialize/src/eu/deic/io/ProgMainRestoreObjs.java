package eu.deic.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.net.URL;

public class ProgMainRestoreObjs {

	public static void main(String[] args) {
		System.out.println("Restoring objects from storage ...!");
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("objs4.txt"));
			
			URL webAddress3 =  (URL) in.readObject();
			ObjectsGraph og = (ObjectsGraph) in.readObject();
			boolean eb = (og.getO1() == og.getO2()) && (og.getO1() == webAddress3);
			System.out.println("eb = " + eb + ",og = " + og.toString() + ", wa3 = " + webAddress3);
			in.close();
			
			System.out.println("finished reading objects!");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
