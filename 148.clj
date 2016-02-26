;; https://www.4clojure.com/problem/148#prob-title

;; Write a function which calculates the sum of all natural numbers
;; under n (first argument) which are evenly divisible by at least
;; one of a and b (second and third argument).
;; Numbers a and b are guaranteed to be coprimes.

;; Note: Some test cases have a very large n, so the most obvious
;; solution will exceed the time limit.

(fn [n a b]
  (let [f #(/ (*' %1 (inc %1) %2) 2)
        g #(quot (dec n) %)
        r (*' a b)]
    (- (+' (f (g a) a) (f (g b) b)) (f (g r) r))))