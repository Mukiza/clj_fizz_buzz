(ns fizz_buzz.core)
(defn fizz-buzz [number]
  (cond (and (= 0 (rem number 3)) (= 0 (rem number 5))) "Fizz Buzz"
        (= number 3) "Fizz"
        (= number 5) "Buzz"
        (= 0 (rem number 3)) "Fizz"
        (= 0 (rem number 5)) "Buzz"
        :else number))
