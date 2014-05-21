(ns joy-of-clojure.core-test
  (:require [expectations :refer :all]
            [joy-of-clojure.core :refer :all]))

;; Exploring truthiness.
(expect :truthy (if true :truthy :falsey))
(expect :truthy (if [] :truthy :falsey))
(expect :falsey (if nil :truthy :falsey))
(expect :falsey (if false :truthy :falsey))

;; Nil vs false.
(expect "Actually nil" (when (nil? nil) "Actually nil"))

;; Nil punning
(expect '(1 2 3) (seq [1 2 3]))
(expect nil (seq []))

;; Destructuring
(expect "Steele, Guy Lewis" (rearrange ["Guy" "Lewis" "Steele"]))
