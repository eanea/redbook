package Part4.Chapter14

trait RunnableST[A] {
  def apply[S]: ST[S,A]
}
