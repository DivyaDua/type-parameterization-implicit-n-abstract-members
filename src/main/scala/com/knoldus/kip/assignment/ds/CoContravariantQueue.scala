package com.knoldus.kip.assignment.ds

class CoContravariantQueue[-S, +T] {

  def write(x: S): T = {
    x match {
      case res: T => res
    }
  }

}

object Queue6 extends App{

  val f1 = new Food

  val fr1 = new Fruit

  val o1 = new Orange

  val a1 = new Apple

  val b1 = new BadOrange

  val v1 = new Vegetable

  val v2 = new VeryBadOrange

  val q = new CoContravariantQueue[Fruit,BadOrange]

  print("1st :" + q.write(fr1))

  //print("2nd :" + q.write(f1))--This won't work

  print("3rd :" + q.write(o1))
  print("4th :" + q.write(b1))
  print("5th :" + q.write(a1))
  print("6th :" + q.write(v2))

  //print("7th :" + q.write(v1))--This won't work
}
