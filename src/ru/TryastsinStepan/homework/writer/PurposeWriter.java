package ru.TryastsinStepan.homework.writer;

import ru.TryastsinStepan.homework.purpose.Purpose;

import java.io.*;

public class PurposeWriter {
    public static void write(Writer out, Purpose [] purposes) throws IOException{
       try(BufferedWriter fileWriter = new BufferedWriter(out)){
           fileWriter.write(purposes.length + "\n");
           for(Purpose purpose : purposes){
               fileWriter.write(purpose.getOrder().getNumberOrder() +", "+
                       purpose.getStartPoint().getX() + ", " + purpose.getStartPoint().getY()+", "+ purpose.getTimeMoment()+
                       ", "+  purpose.getTimeMoment() + ", "+ purpose.getRouteLength()+"\n ");
           }
           fileWriter.close();
       }catch(IOException e){
           e.printStackTrace();;
       }
    }
}
