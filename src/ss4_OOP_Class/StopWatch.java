package ss4_OOP_Class;

import java.util.Date;

public class StopWatch {
    private Date startTime, endTime;

    public StopWatch() {
        this.startTime = new Date();
    }


    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        double sum = 0;
        double count = 0;
        for (int i = 0; i < 100000000; i++) {
            for (int j = 0; j < 1000000000; j++) {
                sum += i + j;
                count++;
            }
        }
        stopWatch.stop();
        System.out.println("vòng lập trên chạy hết " + stopWatch.getElapsedTime());

    }

}
