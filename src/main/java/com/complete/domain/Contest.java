package com.complete.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Rina on 25.05.2016.
 */
@Entity
public class Contest implements Serializable {
    @Transient
    private static final long serialVersionUID = -3323225680030341871L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContest;
    private String nameContest;
    private Long duration;
    private Long timeBegin;

    public Long getIdContest() {
        return idContest;
    }

    public void setIdContest(Long idContest) {
        this.idContest = idContest;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Task.class) //Task -> COntest !!!
    private Task task;

    public Contest(String nameContest, Long duration) {
        this.nameContest = nameContest;
        this.duration = duration;
    }

    public Contest() {
    }

    public String getNameContest() {
        return nameContest;
    }

    public void setNameContest(String nameContest) {
        this.nameContest = nameContest;
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public Long getTimeBegin() {
        return timeBegin;
    }

    public void setTimeBegin(Long timeBegin) {
        this.timeBegin = timeBegin;
    }

    @Override
    public String toString() {
        return "Contest{" +
                "idContest=" + idContest +
                ", nameContest='" + nameContest + '\'' +
                ", duration=" + duration +
                ", timeBegin=" + timeBegin +
                '}';
    }

}
