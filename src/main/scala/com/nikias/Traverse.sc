package com.nikias

object Traverse {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  import scala.concurrent.{ ExecutionContext, Future }

  def traverseFuture[A, B](as : List[A])(f : A => Future[B])(implicit ec : ExecutionContext) : Future[List[B]] =
    Future.traverse(as)(f)                        //> traverseFuture: [A, B](as: List[A])(f: A => scala.concurrent.Future[B])(impl
                                                  //| icit ec: scala.concurrent.ExecutionContext)scala.concurrent.Future[List[B]]
                                                  //| 
}