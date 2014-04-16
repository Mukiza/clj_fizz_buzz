(ns fizz_buzz.core)

(defn divisible-by-three? [number]
    (= 0 (rem number 3)))

(defn divisible-by-five? [number]
    (= 0 (rem number 5)))

(defn contains? [number value] 
    (not= (.indexOf (Long/toString number) value) -1))

(defn fizz-buzz [number]
  (cond (and (divisible-by-three? number) (divisible-by-five? number)) "Fizz Buzz"
        (or (=  number 3) (contains? number "3")) "Fizz"
        (or (=  number 5) (contains? number "5")) "Buzz"
        (= 0 (rem  number 3)) "Fizz"
        (= 0 (rem  number 5)) "Buzz"
        :else  number))
