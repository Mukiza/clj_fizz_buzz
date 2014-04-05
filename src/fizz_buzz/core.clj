(ns fizz_buzz.core)
(defn fizz-buzz [number]
  (cond (and (= 0 (rem number 3)) (= 0 (rem number 5))) "Fizz Buzz"
        (or (=  number 3) (not= (.indexOf (Long/toString number) "3") -1)) "Fizz"
        (or (=  number 5) (not= (.indexOf (Long/toString number) "5") -1)) "Buzz"
        (= 0 (rem  number 3)) "Fizz"
        (= 0 (rem  number 5)) "Buzz"
        :else  number))
