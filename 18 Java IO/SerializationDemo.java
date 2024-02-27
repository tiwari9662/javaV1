import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo  {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setGender('M');
        animal.setName("Bolt");
        
        try {
            FileOutputStream fos = new FileOutputStream("animal.ser",true);
            // FileOutputStream fos = new FileOutputStream("animal.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(animal);
            System.out.println("Success..");
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}