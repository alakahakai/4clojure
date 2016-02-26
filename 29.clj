;; https://www.4clojure.com/problem/29#prob-title

;; Write a function which takes a string and returns a new
;; string containing only the capital letters.

#(apply str (re-seq #"[A-Z]" %))

;; In Haskell
;; filter (`elem` ['A'..'Z'])