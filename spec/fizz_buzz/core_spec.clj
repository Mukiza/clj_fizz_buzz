(ns fizz_buzz.core-spec
  (:require [speclj.core :refer :all]
            [fizz_buzz.core :refer :all]))

(describe "FizzBuzz"
  (it "returns 1 when given 1"
    (should= 1 (fizz-buzz "1")))

  (it "returns 2 when given 2"
      (should= 2 (fizz-buzz "2")))

  (it "returns 'Fizz' when given 3"
      (should= "Fizz" (fizz-buzz "3")))

  (it "returns 4 when given 4"
      (should= 4 (fizz-buzz "4")))

  (it "returns 'Buzz' when given 5"
      (should= "Buzz" (fizz-buzz "5")))
          
  (it "returns 'Fizz' when given 6"
      (should= "Fizz" (fizz-buzz "6")))

  (it "returns '7' when given 7"
      (should= 7 (fizz-buzz "7")))

  (it "returns '8' when given 8"
      (should= 8 (fizz-buzz "8")))

  (it "returns 'Fizz' when given 9"
      (should= "Fizz" (fizz-buzz "9")))

  (it "returns 'Buzz' when given 10"
      (should= "Buzz" (fizz-buzz "10")))

  (it "returns '11' when given 11"
      (should= 11 (fizz-buzz "11")))

  (it "returns 'Fizz' when given 12"
      (should= "Fizz" (fizz-buzz "12")))

  (it "returns '13' when given 13"
      (should= "Fizz" (fizz-buzz "13")))

  (it "returns '14' when given 14"
      (should= 14 (fizz-buzz "14")))

  (it "returns 'Fizz Buzz' when given 15"
      (should= "Fizz Buzz" (fizz-buzz "15")))

  (it "returns '16' when given 16"
      (should= 16 (fizz-buzz "16")))

  (it "returns '17' when given 17"
      (should= 17 (fizz-buzz "17")))

  (it "returns '18' when given 18"
      (should= "Fizz" (fizz-buzz "18")))

  (it "returns '19' when given 19"
      (should= 19 (fizz-buzz "19")))

  (it "returns '20' when given 20"
      (should= "Buzz" (fizz-buzz "20")))

  (it "returns 'Fizz' when given 13"
      (should= "Fizz" (fizz-buzz "13")))

  (it "returns 'Buzz' when given 52"
      (should= "Buzz" (fizz-buzz "52")))

  (it "returns 'Buzz' when given 100"
      (should= "Buzz" (fizz-buzz "100")))

  (it "returns 'Fizz Buzz' when given 150"
      (should= "Fizz Buzz" (fizz-buzz "150"))))
