(ns advent-of-code.day1.part1-test
  (:require
    [clojure.test :refer :all]
    [advent-of-code.day1.part1 :refer :all]))

(deftest test-day1-part1
  (testing "(()) and ()() both result in floor 0."
    (is (= 0 (find-right-floor "(())")))
    (is (= 0 (find-right-floor "()()"))))
	(testing "((( and (()(()( both result in floor 3."
    (is (= 3 (find-right-floor "(((")))
    (is (= 3 (find-right-floor "(()(()("))))
	(testing "))((((( also results in floor 3."
    (is (= 3 (find-right-floor "))((((("))))
	(testing "()) and ))( both result in floor -1 (the first basement level)."
    (is (= -1 (find-right-floor "())")))
    (is (= -1 (find-right-floor "))("))))
	(testing "))) and )())()) both result in floor -3.")
    (is (= -3 (find-right-floor ")))")))
    (is (= -3 (find-right-floor ")())())"))))

