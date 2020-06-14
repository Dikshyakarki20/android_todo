package com.example.todomvvm.tasks;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.todomvvm.database.AppDatabase;
import com.example.todomvvm.database.Repository;
import com.example.todomvvm.database.TaskEntry;

import java.util.List;

public class TaskDateViewModel extends AndroidViewModel {

    Repository repository;

   private LiveData<List<TaskEntry>> lists;

    public TaskDateViewModel(Application application) {
        super(application);
        AppDatabase database = AppDatabase.getInstance(application);
        repository = new Repository(database);
        lists = repository.getTodayTasks();

    }

    public  LiveData<List<TaskEntry>> getTodayTasks(){
        return lists;
    }

    public void deleteTask(TaskEntry task){
        repository.deleteTask(task);
    }
}
