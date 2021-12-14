(ns advent-of-code-clojure.day13_1
  (:require [clojure.java.io :as io])
  (:require [clojure.string :as str]))

(defn -read_coord
  "Extract the coord"
  [raw_coord]
  (map read-string (str/split raw_coord #",")))

(defn -separate_coords
  "Separate coordinates into 2 lists"
  [coords]
  [(map first coords) (map last coords)])

(defn -get_dimensions
  "Get the dimension of the matrix"
  [coords]
  [(+ (apply max (first coords)) 1) (+ (apply max (second coords)) 1)])

(defn -set_matrix_coord
  "Set a matrix point to 1 given its coordinates"
  [matrix [x y]]
  (assoc matrix x (assoc (nth matrix x) y 1)))

(defn -empty_matrix
  "Return an empty matrix of size x*y"
  [[x y]]
  (vec (repeat x (vec (repeat y 0)))))

(defn -to_matrix
  "Create a matrix from the list of coords"
  [coords]
  (let
   [dimensions (-get_dimensions (coords))]
    (do (printf "%s%n" dimensions) (reduce
                                    -set_matrix_coord
                                    (-empty_matrix dimensions)
                                    coords))))

(defn -read_paper
  "Extract the paper"
  [raw_paper]
  (-to_matrix
   (-separate_coords
    (map
     -read_coord (str/split
                  raw_paper
                  #"\n")))))

(defn -read_fold
  "Extract the fold instruction"
  [raw_instruction]
  (let [instruction (str/split
                     (last
                      (str/split
                       raw_instruction
                       #" "))
                     #"=")] [(get instruction 0) (read-string (get instruction 1))]))

(defn -day13_1
  "Day13 challenge Part 1"
  [filename] (let
              [data (str/split
                     (slurp
                      (io/resource filename))
                     #"\n\n")]
               (-read_paper (get data 0))))
