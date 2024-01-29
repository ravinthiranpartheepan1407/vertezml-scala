package vertezml

object Mean {
    def mean(numbers: List[Double]): Double = {
        if(numbers.isEmpty) throw new IllegalArgumentException("List is Empty")
        numbers.sum / numbers.length
    }
}