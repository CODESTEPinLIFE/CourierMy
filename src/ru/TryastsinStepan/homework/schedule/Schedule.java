package ru.TryastsinStepan.homework.schedule;

import ru.TryastsinStepan.homework.purpose.Purpose;

import java.util.Arrays;

public class Schedule {
    public Purpose[] purposes;

    public Schedule() {
    }

    public Schedule(Purpose[] purposes) {
        this.purposes = purposes;
    }

    public Purpose[] getPurposes() {
        return this.purposes;
    }

    public void setPurposes(Purpose[] purposes) {
        this.purposes = purposes;
    }

    @Override
    public String toString() {
        return Arrays.toString(purposes);

    }
    public void addPurpose(){
        Purpose newPurpose [] = Arrays.copyOf(purposes,purposes.length+1);
    }
    public Purpose []  removePurpose(int index){

                Purpose purpose = purposes[index];
                purposes[purposes.length] = purposes[index];
                purposes[index] = purpose;

        return  Arrays.copyOf(purposes,purposes.length-1);
    }
    public Purpose getIndexPurpose(int index){
       return purposes[index];
    }
    public int sizePurpose(){
        return purposes.length;
    }
    public double distanceRoute() {
        int totalSize = 0;
        for (int i = 0; i < purposes.length; i++) {
            totalSize+=purposes[i].getRouteLength();
        }
        return totalSize;
    }
    public double timeRoute() {
        int totalSize = 0;
        for (int i = 0; i < purposes.length; i++) {
            totalSize += purposes[i].timeExecution;
        }
        return totalSize;
    }
}

