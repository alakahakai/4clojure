;; http://www.4clojure.com/problem/75#prob-title

;; Two numbers are coprime if their greatest common divisor equals 1.
;; Euler's totient function f(x) is defined as the number of positive integers
;; less than x which are coprime to x. The special case f(1) equals 1.
;; Write a function which calculates Euler's totient function.

(fn [x]
  (if (= 1 x)
    1
    (count (filter #(= 1 ((fn [a b](if (zero? b) a (recur b (mod a b)))) x %)) (range 1 x)))))
