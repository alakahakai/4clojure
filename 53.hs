-- https://www.4clojure.com/problem/53

longest :: [Integer] -> [Integer]
longest = g . foldl f ([],[]) where
  g (r,_)
    | length r > 1 = r
    | otherwise    = []
  f (r,a) b
    | not (null a) && b == last a + 1 =
        let a' = a ++ [b]
        in if length a' > length r
             then (a', a')
             else (r, a')
    | otherwise = (r, [b])
