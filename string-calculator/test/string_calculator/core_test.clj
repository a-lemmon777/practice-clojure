(ns string-calculator.core-test
  (:require [expectations :refer :all]
            [string-calculator.core :refer :all]))

;; An empty string should return 0
(expect 0 (sum-a-string ""))

;; A single digit should return itself
(expect 1 (sum-a-string "1"))

;; Two numbers separated by a comma should be summed
(expect 3 (sum-a-string "1,2"))

;; Any amount of comma separated should be summed
(expect 15 (sum-a-string "1,2,3,4,5"))

;; New line character should be treated as a separator
(expect 6 (sum-a-string "1\n2,3"))

;; Custom delimiters should be treated as separators
(expect 3 (sum-a-string "//;\n1;2"))

;; Numbers bigger than 1000 should be ignored
(expect 2 (sum-a-string "1001,2"))

;; Negative numbers should throw an exception
(expect Exception (sum-a-string "-1,2"))

;; Multiple character delimiters should be treated as separators
(expect 6 (sum-a-string "//[***]\n1***2***3"))

;; Multiple delimiters should be treated as separators
(expect 6 (sum-a-string "//[*][%]\n1*2%3"))

;; Multiple multiple-character delimiters should be treated as separators
(expect 6 (sum-a-string "//[***][%]\n1***2%3"))
