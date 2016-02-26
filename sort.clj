(defn quick-sort [[n & ns]]
  (when n
    (let [ls (filter #(< % n) ns)
          rs (filter #(> % n) ns)]
      (lazy-cat (quick-sort ls) (list n) (quick-sort rs)))))