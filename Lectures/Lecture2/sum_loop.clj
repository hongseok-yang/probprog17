(ns lecture2b)

(defn sq [x] (* x x))

(defn g [n]
  (loop [n0 n r0 0]
    (if (= n0 0) 
      r0 
      (recur (- n0 1) (+ (sq n0) r0)))))
