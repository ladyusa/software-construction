package lec1io;

import java.io.*;

public class ObjectRestaurantReadWrite {

    // write + read entire objects to file
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Restaurant r = new Restaurant("After Me", "Dessert", "Phahonyothin");

        FileOutputStream fileOs = new FileOutputStream("data/rest.obj");
        ObjectOutputStream out = new ObjectOutputStream(fileOs);

        out.writeObject(r);
        out.close();


        FileInputStream fileIs = new FileInputStream("data/rest.obj");
        ObjectInputStream in = new ObjectInputStream(fileIs);

        Restaurant readRes = (Restaurant) in.readObject();

        System.out.println(readRes);


    }
}
