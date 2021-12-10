(ns advent-of-code-clojure.day1_2
  (:require [clojure.java.io :as io])
  (:require [clojure.string :as str]))

(defn -day1_2
  "Day1 challenge"
  [filename]
  (let
   [result (let
            [heights (map
                      read-string
                      (str/split
                       (slurp
                        (io/resource filename))
                       #"\n"))]
             (let
              [heigts_bis (map
                           +
                           (drop-last 2 heights)
                           (drop-last 1 (drop 1 heights))
                           (drop 2 heights))]
               (count
                (filter
                 identity
                 (map
                  <
                  (drop-last 1 heigts_bis)
                  (drop 1 heigts_bis))))))]
    do
    (printf "%s%n" result)
    result))
