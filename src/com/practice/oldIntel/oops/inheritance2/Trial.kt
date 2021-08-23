package com.practice.oldIntel.oops.inheritance2

class Trial {
    val list: ArrayList<Person> = arrayListOf()

    init {
        list.add(Person())
//        list.add(Being())
        list.add(Student())
    }
}