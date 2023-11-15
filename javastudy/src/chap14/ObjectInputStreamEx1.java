package chap14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
ObjectOutputStream을 이용하여 객체를 저장한 object.ser 파일을 읽어 객체 복원하기
*/
public class ObjectInputStreamEx1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream("src/chap14/object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Customer c1 = (Customer)ois.readObject();
		Customer c2 = (Customer)ois.readObject();
		System.out.println(c1+","+c2);

		/*
		List<Customer> arr = new ArrayList<>();
		while(ois.readObject() != null)
			arr.add((Customer)ois.readObject());
		
		for(Customer c : arr)
			System.out.println(c);
		*/
		fis.close();
		ois.close();
	}
}
