package com.example.todomvvm.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface UserDao {
    @Query("SELECT * FROM UserEntry WHERE userName=:userName and password=:password")
    UserEntry getUserEntry (String userName, String password);
    @Insert
    void insert(UserEntry user);

    @Update
    void update(UserEntry user);

    @Delete
    void delete(UserEntry user);
}
