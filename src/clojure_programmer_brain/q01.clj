(ns clojure-programmer-brain.q01
  (require [clojure.string :as s]))

(defn- binarize [n]
  (Integer/toBinaryString n))

(defn- octalize [n]
  (Integer/toOctalString n))

(defn- palindrome? [s]
  (= s (s/reverse s)))

(defn run
  "10進数、2進数、8進数のいずれで表現しても回文数となる数のうち、10進数の10以上で最小の値を求めてください。"
  []
  (let [lis (range 10 (java.lang.Integer/MAX_VALUE))]
    (first
      (filter (fn [x]
        (and
          (palindrome? (str x))
          (palindrome? (binarize x))
          (palindrome? (octalize x))))
        lis))))
