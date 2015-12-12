(ns advent-of-code.day1.part2-test
  (:require
    [clojure.test :refer :all]
    [advent-of-code.day1.part2 :refer :all]))

(deftest test-day-1-part-2
  (testing ") causes him to enter the basement at character position 1."
    (is (= 1 (count-steps-to-basement ")"))))
	(testing "()()) causes him to enter the basement at character position 5."
    (is (= 5 (count-steps-to-basement "()())")))))
