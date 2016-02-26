;; http://www.4clojure.com/problem/74#prob-title

;; Given a string of comma separated integers, write a function which
;; returns a new comma separated string that only contains the numbers
;; which are perfect squares.
(fn [s]
  (clojure.string/join
    ","
    (filter #(let [n (Math/sqrt(read-string %))]
               (== n (int n))) (re-seq #"[0-9]+" s))))
