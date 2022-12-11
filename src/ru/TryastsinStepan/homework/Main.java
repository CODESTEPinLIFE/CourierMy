package ru.TryastsinStepan.homework;

import ru.TryastsinStepan.homework.CourierAgent.CourierAgent;
import ru.TryastsinStepan.homework.OrderAgent.OrderAgent;
import ru.TryastsinStepan.homework.courier.Courier;
import ru.TryastsinStepan.homework.order.Order;
import ru.TryastsinStepan.homework.point.Point;
import ru.TryastsinStepan.homework.purpose.Purpose;
import ru.TryastsinStepan.homework.reader.PurposeReader;
import ru.TryastsinStepan.homework.schedule.Schedule;
import ru.TryastsinStepan.homework.timemoment.TimeMoment;
import ru.TryastsinStepan.homework.writer.PurposeWriter;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        PurposeReader purposeReader = new PurposeReader();
        Courier[] couriers = null;
        Order[] orders = {
                new Order(101, new Point(40, 20), new Point(130,250), new TimeMoment(0,8),null),
                new Order(102, new Point(35, 200), new Point(160,290), new TimeMoment(1,8),null),
        };
        File file2 = new File("Courier.txt");
        try {
            FileReader fileReader = new FileReader(file2.getAbsoluteFile());
             couriers = purposeReader.readCouriers(fileReader);
            for (Courier courier : couriers) {
                System.out.println(courier);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        CourierAgent courierAgent = new CourierAgent();
        OrderAgent orderAgent = new OrderAgent();
      for(int i = 0; i<2;i++){
         courierAgent.addOrder(couriers,4);
      }

    }
}