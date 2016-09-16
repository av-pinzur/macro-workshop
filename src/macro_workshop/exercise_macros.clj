(ns macro-workshop.exercise-macros
  (:require [speclj.core :refer :all]))

(defmacro if-nonempty-let
  "Like if-let, but treats any empty collection (as via `empty?`) as false"
  [bindings then else]
  (if-not (vector? bindings)
    (throw (AssertionError. "if-nonempty-let requires a name/value vector binding")))
  (let [form (bindings 0) tst (bindings 1)]
    `(let [temp# ~tst]
       (if-not (seqable? temp#)
         (throw (AssertionError. "if-nonempty-let requires bound values to be seqable")))
       (if (and temp# (not (empty? temp#)))
         (let [~form temp#]
           ~then)
         ~else))))
