;; https://www.4clojure.com/problem/53

;; Given a vector of integers, find the longest consecutive sub-sequence
;; of increasing numbers. If two sub-sequences have the same length, use
;; the one that occurs first.
;; An increasing sub-sequence must have a length of 2 or greater to qualify.

#((fn [[r _]] (if (> (count r) 1) r []))
  (reduce (fn [[r a] y]
            (if (= (last a) (dec y))
              (let [b (conj a y)]
                (if (> (count b) (count r))
                  [b b]
                  [r b]))
              [r [y]])) [[] []] %))

