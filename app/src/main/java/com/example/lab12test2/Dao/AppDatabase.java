package com.example.lab12test2.Dao;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.lab12test2.Entity.MapMarker;

@Database(entities = {MapMarker.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract MarkerDao markerDao();
}
