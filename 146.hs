import Data.Map.Strict

-- list comprehension
f :: (Ord k) => Map k (Map k a) -> Map [k] a
f x = fromList [([k,l], x!k!l)| k <- keys x, l<- keys (x!k)]

-- or in list Monad
f :: (Ord k) => Map k (Map k a) -> Map [k] a
f = (fromList . f') where
  f' x = do
    k <- keys x
    l <- keys (x!k)
    return ([k,l], x!k!l)