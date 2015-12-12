#!/usr/bin/env lein exec
(ns advent-of-code.day1.part2)

(defn parens-to-nums
  "Maps a string of parentheses to a sequence of numbers: `()` becomes [1 -1]"
  [parens]
  (map 
    #(condp = %
      \( 1
      \) -1
      0) ; ignore other chars
    parens))

(defn index-of-sum
  "Finds the first index at which the nums sequence sums to the target"
  [sum nums index target]
    (let [first-num (first nums)]
      (if (= first-num nil)
        -1 ; sequence never sums to the target, don't recurse
        (let [sum (+ sum first-num)
              nums (rest nums)
              index (+ 1 index)]
          (if (= sum target)
            index
            (index-of-sum sum nums index target))))))

(defn count-steps-to-basement
  [parens]
  (index-of-sum 0 (parens-to-nums parens) 0 -1))

(defn -main
  [input]
  (println 
    (count-steps-to-basement input)))

(try (require 'leiningen.exec)
  (when @(ns-resolve 'leiningen.exec '*running?*)
      (apply -main (rest *command-line-args*)))
    (catch java.io.FileNotFoundException e))
