(ns advent-of-code-clojure.day1
  (:require [clojure.java.io :as io])
  (:require [clojure.string :as str]))

(defn -day1
  "Day1 challenge"
  [filename]
  (let [result (let [heights (map
                              read-string
                              (str/split
                               (slurp
                                (io/resource filename))
                               #"\n"))]
                 (count
                  (filter
                   identity
                   (map
                    <
                    (drop-last 1 heights)
                    (drop 1 heights)))))]
    do
    (printf "%s%n" result)
    result))
