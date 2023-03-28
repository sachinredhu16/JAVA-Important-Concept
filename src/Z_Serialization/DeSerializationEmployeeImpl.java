package Z_Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationEmployeeImpl {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("D:\\first.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Employee e = (Employee) objectInputStream.readObject();
        System.out.println(e.getName()+" "+e.getMobileNumber());

        objectInputStream.close();
        fileInputStream.close();

    }
}
