f :: Integer -> Integer -> Integer -> Integer
f n a b =
  let f x y = (x * (x+1) * y) `div` 2
      g x = (n-1) `div` x
      h x = f (g x) x
  in  h a + h b - h (a * b)