package com.example.petshop

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cat = Cat("Coco",6)
        val dog = Dog("Mochi",6)
        val scorpion = Scorpion("stinger",32)
        val pets=mutableListOf<Pet>()
        pets.add(cat)
        pets.add(dog)
        pets.add(scorpion)

        val happy = Happy("12/2")
        val sad = Sad("13/2")

    }
}
