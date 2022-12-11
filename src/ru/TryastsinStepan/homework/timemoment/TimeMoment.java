package ru.TryastsinStepan.homework.timemoment;

public class TimeMoment {
    private long startInterval;
    private long finishInterval;

    public TimeMoment() {
    }

    public TimeMoment(long startInterval,long finishInterval) {
        this.startInterval = startInterval;
        this.finishInterval = finishInterval;
    }

    public long getFinishInterval() {
        return finishInterval;
    }

    public void setFinishInterval(long finishInterval) {
        this.finishInterval = finishInterval;
    }

    public long getStartInterval() {
        return startInterval;
    }

    public void setStartInterval(long startInterval) {
        this.startInterval = startInterval;
    }

    @Override
    public String toString() {
        return "{"+"Время начала =" + startInterval +
                ", Время конца =" + finishInterval +
                '}';
    }
    public long calculationTime(){
        return finishInterval-startInterval;
    }
}
