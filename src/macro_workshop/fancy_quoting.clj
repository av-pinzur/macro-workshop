(ns macro-workshop.fancy-quoting)

(defn math-operations-set []
  `#{+ - * /})

;; Hint: you actually don't need to define any more vars to get this solved
(defmacro construct-maybe
  ([] `{:type 'None})
  ([x] `{:type 'Some :value "hi"}))
