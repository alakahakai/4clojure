;; Write a function which takes a collection and returns one of :map, :set, :list, or :vector
;; Describing the type of collection it was given.
;; You won't be allowed to inspect their class or use the built-in predicates like list?
;; The point is to poke at them and understand their behavior.

#(cond
   (= % (merge % %)) :map
   (= (conj % :a :a) (conj % :a)) :set
   (= (first (conj % 'fst 'snd)) 'snd) :list
   :else :vector)
