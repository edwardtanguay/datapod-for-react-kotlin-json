#!/usr/bin/env kotlin

println("Hello, World!")

val months = arrayOf(
    "January", "February", "March", "April",
    "May", "June", "July", "August",
    "September", "October", "November", "December"
)

// Loop through using forEach
months.forEach { month ->
    println(month)
}

class Car(
    val make: String = "Unknown",
    val model: String = "Unspecified",
    val year: Int = 2023
) {
    // Custom toString() for display
    override fun toString(): String {
        return "$year $make $model"
    }
}

// Create car object
val myCar = Car("Toyota", "Corolla", 2020)

// Display using toString() implicitly
println(myCar)
