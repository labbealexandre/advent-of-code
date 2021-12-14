(ns advent-of-code-clojure.day13_1-test
  (:require [clojure.test :refer :all]
            [advent-of-code-clojure.day13_1 :refer :all]))

(deftest -empty_matrix-test
  (testing "Assert that the matrix has size 3*4"
    (let
     [output (-empty_matrix [3 4])]
      (and
       (is (= (count output) 3))
       (is (= (count (get output 0)) 4))))))

(deftest -get_dimensions-test
  (testing "Assert that the dimesions are [11, 16]"
    (let
     [output (-get_dimensions [[2 10] [15 1]])]
      (is (= output [11 16])))))

(deftest -set_matrix_coord-test
  (testing "Assert coordinates 1 2 coorespond to 1"
    (let
     [output (-set_matrix_coord [[0 0 0] [0 0 0]] [1 2])]
      (is (= (get (get output 1) 2) 1)))))

(deftest -to-matrix-test
  (testing "Asset that coordinates 2 15 and 10 1 are set to 1"
    (let
     [output (-to_matrix [[2 15] [10 1]])]
      (and
       (is (= (get (get output 2) 15) 1))
       (is (= (get (get output 10) 1) 1))))))

;; (deftest main
;;   (testing "Assert that the result on the dataset is 17"
;;     (is (= (-day13_1 "day13.test.txt") 17))))
