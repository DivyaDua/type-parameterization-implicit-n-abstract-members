package com.knoldus.kip.assignment.ds

class Queue[T](
                private val leading: List[T],
                private val trailing: List[T]
              ) {
  private def mirror =
    if (leading.isEmpty) {
      new Queue(trailing.reverse, Nil)
    }
    else {
      this
    }

  def head: T = mirror.leading.head

  def tail : Queue[T] = {
    val q = mirror
    new Queue(q.leading.tail, q.trailing)
  }

  def enqueue(x: T): Queue[T] = new Queue(leading, x :: trailing)

  override def toString: String = {
    val list = leading ::: trailing.reverse
    list.toString
  }
}


object Queue1 extends App{

  val f1 = new Food
  val f2 = new Food
  val f3 = new Food

  val v1 = new Vegetable
  val v2 = new Vegetable

  val q1 = new Queue[Food](List(f1, f2), Nil)
  print(q1.enqueue(f3))

  val q2 = new Queue[Vegetable](List(v1, v2), Nil)
  print("\n Vegetable Queue: " + q2)

  //val q3 : Queue[Vegetable] = q1 --- This won't work
  //val q4 : Queue[Food] = q2 --- This won't work
}