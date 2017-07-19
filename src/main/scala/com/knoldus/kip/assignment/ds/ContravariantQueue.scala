package com.knoldus.kip.assignment.ds

class ContravariantQueue[-T] {

  def add(x: T): Unit = print("\n" + x)
}

object Queue3 extends App{

  val f1 = new Food

  val fr = new Fruit

  val v1 = new Vegetable

  val q1 = new ContravariantQueue[Food]
  q1.add(f1)

  val q2 = new ContravariantQueue[Vegetable]
  q2.add(v1)

 // val q3 : ContravariantQueue[Fruit] = q2
  // --- This won't work

  val q4: ContravariantQueue[Fruit] = q1
  //q4.add(f1)----This won't work
  q4.add(fr)
}
