#!/usr/bin/env groovy

println("Hello world")

for (a in this.args) {
	  println("Argument: " + a)
}

mylist = [7, 42, 87, 68, 6]
println "size " + mylist.size()
println mylist[0]

mymap = [mat:"hey", maggick:"magicien", dad:"It s my dad"]
println mymap.dad
println mymap.mat

mymap["mat"]= "hey, it s me !"
println mymap.mat

amPM = Calendar.getInstance().get(Calendar.AM_PM)
if (amPM == Calendar.AM)
{
	println("Good morning")
} else {
	println("Good evening")
}

square = {it * it}
println square(9)

println ([1, 2, 3, 4, 5].collect(square))

