package me.tguima.appeatit.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.util.EventLogTags

@Entity
data class Recipe(@PrimaryKey(autoGenerate = true)
                  var id : Int = 0,
                  var name : String,
                  var description:String,
                  var price: Float)