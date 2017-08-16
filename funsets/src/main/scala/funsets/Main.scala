package funsets

object Main extends App {
  import FunSets._

  val s1 = singletonSet(2)
  val s2 = singletonSet(3)
  val s3 = union(s1, s2)
  println(contains(s3, 2))
  println(contains(s3, 4))
  println(contains(s3, 3))
  println(contains(s3, 6))

  println()

  val s4 = map(s3, x => x*2)
  println(contains(s4, 2))
  println(contains(s4, 4))
  println(contains(s4, 3))
  println(contains(s4, 6))

}
