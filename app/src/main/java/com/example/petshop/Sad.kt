package com.example.petshop

class Sad(date:String):Mood(date) {
    override fun mood(): String {
        return "At $date it is sad"
    }
}