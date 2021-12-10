(ns advent-of-code-clojure.day1_1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-clojure.day1_1 :refer :all]))

(deftest main
  (testing "Assert that the result on the dataset is 7"
    (is (= (-day1_1 "day1.test.txt") 7))))
