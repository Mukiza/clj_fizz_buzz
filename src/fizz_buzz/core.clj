(ns fizz_buzz.core)
(defn fizz-buzz [number]
  (cond (and (= 0 (rem (read-string number) 3)) (= 0 (rem (read-string number) 5))) "Fizz Buzz"
        (or (= (read-string number) 3) (not= (.indexOf number "3") -1)) "Fizz"
        (or (= (read-string number) 5) (not= (.indexOf number "5") -1)) "Buzz"
        (= 0 (rem (read-string number) 3)) "Fizz"
        (= 0 (rem (read-string number) 5)) "Buzz"
        :else (read-string number)))
