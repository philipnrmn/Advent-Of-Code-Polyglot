#!/usr/bin/env lein exec
(ns advent-of-code.day1.part1)

(defn parens-to-nums
  "Maps a string of parentheses to a numeric seq: ( => 1; ) => -1."
  [parens]
  (map 
    #(condp = %
      \( 1
      \) -1
      0) ; ignore other chars
    parens))

(defn find-right-floor 
  [parens]
  (reduce + (parens-to-nums parens)))

(defn -main
  [input]
  (println 
    (find-right-floor input)))

; boilerplate, allows direct execution with `lein exec`
(try (require 'leiningen.exec)
  (when @(ns-resolve 'leiningen.exec '*running?*)
      (apply -main (rest *command-line-args*)))
    (catch java.io.FileNotFoundException e))
