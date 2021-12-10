(ns advent-of-code-clojure.day1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-clojure.day1 :refer :all]))

(deftest main
  (testing "Assert that the result on the dataset is 1167"
    (is (= (-day1 "day1.test.txt") 7))))
