(ns lecture2d)

(defn fib [n]
  (loop [n0 2 r0 1 r1 1]
    (if (= n0 n)
      r1
      (recur (+' n0 1)
             r1
             (+' r0 r1)))))

(defn ratio [n]
  (float (/ (fib (+' n 1)) (fib n))))
    
