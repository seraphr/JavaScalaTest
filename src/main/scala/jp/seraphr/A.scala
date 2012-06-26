package jp.seraphr

trait A[_E, _A <: A[_E, _A]] {
  def m: _A = this.asInstanceOf[_A]
}

class B[_E] extends A[_E, B[_E]]