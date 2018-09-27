package me.tguima.appeatit.data.local.dao

import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Query
import io.reactivex.Single

interface BaseDAO<T> {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(t : List<T>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(t : T)

}