package com.example.todomvvm.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "task")
public class TaskEntry {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private int priority;
    private String enterdate;
    private String description;
    @ColumnInfo(name="updated_at")
    private Date updatedAt;

    @Ignore
    public TaskEntry(String description, int priority, String enterdate, Date updatedAt) {
        this.description = description;
        this.enterdate = enterdate;
        this.priority = priority;
        this.updatedAt = updatedAt;

    }

    public TaskEntry(int id, String description, int priority, String enterdate, Date updatedAt) {
        this.id = id;
        this.description = description;
        this.enterdate = enterdate;
        this.priority = priority;
        this.updatedAt = updatedAt;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEnterdate(){return enterdate;}

    public  void setEnterdate(String enterdate){this.enterdate = enterdate;}

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
