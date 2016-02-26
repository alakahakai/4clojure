;; https://www.4clojure.com/problem/146#prob-title

#(into {} (for [k (keys %)
                 l (keys (% k))]
               [[k l] ((% k) l)]))


