(ns advent-of-code-clojure.day1_2-test
  (:require [clojure.test :refer :all]
            [advent-of-code-clojure.day1_2 :refer :all]))

(deftest main
  (testing "Assert that the result on the dataset is 5"
    (is (= (-day1_2 "day1.test.txt") 5))))
