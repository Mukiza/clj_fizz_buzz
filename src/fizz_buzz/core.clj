(ns fizz_buzz.core)
(defn fizz-buzz [number]
  (cond (= number 3) "Fizz"
        (= number 5) "Buzz"
        (= 0 (rem number 3)) "Fizz"
        :else number))
