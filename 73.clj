;; http://www.4clojure.com/problem/73#prob-title

;; A tic-tac-toe board is represented by a two dimensional vector.
;; X is represented by :x, O is represented by :o, and empty is represented by :e.
;; A player wins by placing three Xs or three Os in a horizontal, vertical, or diagonal row.
;; Write a function which analyzes a tic-tac-toe board and returns :x if X has won,
;; :o if O has won, and nil if neither player has won.

(fn [v]
  (last (first
    (drop-while
      #(or (apply = :e %) (apply not= %))
        (conj (concat v (apply mapv vector v))
              (mapv nth v (range))
              (mapv #(nth (reverse %1) %2) v (range)))))))
