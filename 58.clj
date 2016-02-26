;; Write a function which allows you to create function compositions.
;; The parameter list should take a variable number of functions, and
;; create a function that applies them from right-to-left.

(fn [& f]
  (fn [& args]
    (reduce #(%2 %1) (apply (last f) args) (rest (reverse f)))))