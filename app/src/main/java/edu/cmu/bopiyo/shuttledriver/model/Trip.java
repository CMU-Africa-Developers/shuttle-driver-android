package edu.cmu.bopiyo.shuttledriver.model;

/**
 * Created by Bryan Lamtoo
 * Carnegie Mellon University - Africa
 * 2019-10-26
 */
public class Trip {

    private String name;
    private long startTime;
    private String driveID;
    private String routeID;
    private boolean isRecurrent;
    private long startDate;
    private long endDate;



//    public Trip(String name, long startTime, String driveID, String routeID, boolean isRecurrent, long startDate, long endDate) {
//        this.name = name;
//        this.startTime = startTime;
//        this.driveID = driveID;
//        this.routeID = routeID;
//        this.isRecurrent = isRecurrent;
//        this.startDate = startDate;
//        this.endDate = endDate;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public String getDriveID() {
        return driveID;
    }

    public void setDriveID(String driveID) {
        this.driveID = driveID;
    }

    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public boolean isRecurrent() {
        return isRecurrent;
    }

    public void setRecurrent(boolean recurrent) {
        isRecurrent = recurrent;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getEndDate() {
        return endDate;
    }

    public void setEndDate(long endDate) {
        this.endDate = endDate;
    }
}
