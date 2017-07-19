package com.knoldus.kip.assignment.ds

class UpperBoundQueue[T] (
                            private val leading: List[T],
                            private val trailing: List[T]
                          ) {
  private def mirror =
    if (leading.isEmpty) {
      new UpperBoundQueue(trailing.reverse, Nil)
    }
    else {
      this
    }

  //def head: T = mirror.leading.head

  def tail : UpperBoundQueue[T] = {
    val q = mirror
    new UpperBoundQueue(q.leading.tail, q.trailing)
  }

  def enqueue[U <:T](x: T): UpperBoundQueue[T] = new UpperBoundQueue(leading, x :: trailing)

  override def toString: String = {
    val list = leading ::: trailing.reverse
    list.toString
  }

}

object Queue5 extends App{

  val fr1 = new Fruit

  val o1 = new Orange
  val o2 = new Orange

  val a1 = new Apple

  val b1 = new BadOrange

  val q2 = new UpperBoundQueue[Orange](List(o1, o2), Nil)
  //q2.enqueue(a1)--This won't work
  //q2.enqueue(fr1)--This won't work

  val q3 = q2.enqueue(b1)

  print("\n Vegetable Queue: " + q3)


}
