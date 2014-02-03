(ns fizz_buzz.core-spec
  (:require [speclj.core :refer :all]
            [fizz_buzz.core :refer :all]))

(describe "FizzBuzz"
  (it "returns 1 when given 1"
    (should= 1 (fizz-buzz 1)))

  (it "returns 2 when given 2"
      (should= 2 (fizz-buzz 2)))

  (it "returns 'Fizz' when given 3"
      (should= "Fizz" (fizz-buzz 3)))

  (it "returns 4 when given 4"
      (should= 4 (fizz-buzz 4)))

  (it "returns 'Buzz' when given 5"
      (should= "Buzz" (fizz-buzz 5)))
          
  (it "returns 'Fizz' when given 6"
      (should= "Fizz" (fizz-buzz 6) )))
