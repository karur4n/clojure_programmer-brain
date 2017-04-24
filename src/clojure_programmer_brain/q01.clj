(ns clojure-programmer-brain.q01
  (require [clojure.string :as s]))

(defn- palindrome? [s]
  (= s (s/reverse s)))

(defn run
  "10進数、2進数、8進数のいずれで表現しても回文数となる数のうち、10進数の10以上で最小の値を求めてください。"
  []
  (let [lis (range 11 java.lang.Integer/MAX_VALUE 2)] ; 10 は回文数にならない
    (first
      (filter (fn [x]
        (and
          (palindrome? (str x))
          (palindrome? (Integer/toBinaryString x))
          (palindrome? (Integer/toOctalString x))))
        lis))))
