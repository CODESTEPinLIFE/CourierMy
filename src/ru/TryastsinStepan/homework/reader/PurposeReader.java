package ru.TryastsinStepan.homework.reader;

import ru.TryastsinStepan.homework.courier.Courier;
import ru.TryastsinStepan.homework.point.Point;
import ru.TryastsinStepan.homework.purpose.Purpose;

import java.io.*;

public class PurposeReader {
    public static Courier[] readCouriers(Reader in) throws FileNotFoundException {
        BufferedReader fileReader = new BufferedReader(in);
        Courier[] couriers = null;
        try{
            String string = fileReader.readLine();
             for(int index = 0; string!= null;index++){
                 if(index == 0){
                     int size = Integer.parseInt(string);
                     couriers = new Courier[size];
                 }
                 else{

                     String[] split = string.split(", ");
                     String name = split[0];
                     int age = Integer.parseInt(split[1]);
                     int speed = Integer.parseInt(split[2]);
                     int x = Integer.parseInt(split[3]);
                     int y = Integer.parseInt(split[4]);
                     Point point = new Point(x,y);

                     Courier courier = new Courier(name,age,speed,point);
                     couriers[index-1] = courier;



                 }
                 string = fileReader.readLine();
             }
        }catch(IOException e){
            e.printStackTrace();
        }



        return couriers;
    }
}
