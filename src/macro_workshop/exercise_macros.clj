(ns macro-workshop.exercise-macros)

(defmacro if-nonempty-let
  "Like if-let, but treats any empty collection (as via `empty?`) as false"
  [bindings then else]
  (let [form (bindings 0) tst (bindings 1)]
    `(let [temp# ~tst]
       (if (and temp# (not (empty? temp#)))
         (let [~form temp#]
           ~then)
         ~else))))
