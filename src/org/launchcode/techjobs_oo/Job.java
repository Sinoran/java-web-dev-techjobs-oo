package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    public Job() {
        id = nextId;
        nextId++;
    }

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job(String name, Employer employer, Location location,
               PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }



    public String toString() {
        String dataNotAvailable = "Data not available.";
        int jobId = this.id;
        String jobName;
        String jobEmployer;
        String jobLocation;
        String jobPosition;
        String jobCoreCompetency;

        jobName = Objects.requireNonNullElse(this.name, dataNotAvailable);

        if(this.employer == null || this.employer.toString() == "") {
             jobEmployer = dataNotAvailable;
        } else {
            jobEmployer = this.employer.getValue();
        }

        if(this.location == null || this.location.toString() == "") {
            jobLocation = dataNotAvailable;
        } else {
            jobLocation = this.location.getValue();
        }

        if(this.positionType == null || this.positionType.toString() == "") {
            jobPosition = dataNotAvailable;
        } else {
            jobPosition = this.positionType.getValue();
        }

        if(this.coreCompetency == null || this.coreCompetency.toString() == "") {
            jobCoreCompetency = dataNotAvailable;
        } else {
            jobCoreCompetency = this.coreCompetency.getValue();
        }

        return "\n" + "ID: " + jobId + "\n" +
                "Name: " + jobName + "\n" +
                "Employer: " + jobEmployer + "\n" +
                "Location: " + jobLocation + "\n" +
                "Position Type: " + jobPosition + "\n" +
                "Core Competency: " + jobCoreCompetency + "\n";

    }


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
