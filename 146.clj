;; https://www.4clojure.com/problem/146#prob-title

#(into {} (for [k (keys %)
                 l (keys (% k))]
               [[k l] ((% k) l)]))

;; In Haskell list comprehension

;; import Data.Map.Strict
;; (\x -> fromList [([k,l], x!k!l)| k <- keys x, l<- keys (x!k)])

;; or in list Monad

;; import Data.Map.Strict

;; f :: (Ord k) => Map k (Map k a) -> Map [k] a
;; f = (fromList . f') where
;;   f' x = do
;;     k <- keys x
;;     l <- keys (x!k)
;;     return ([k,l], x!k!l)

