(ns macro-workshop.code-generation)

;; remember: you can use normal clojure sequence functions to generate code!

(defn generate-addition [a b]
  (list '+ a b))

(defn generate-multiplication [a b]
  (list '* a b))

(defn generate-squarer []
  '(fn [a] (* a a)))

(defn generate-hello-world-definition []
  '(fn [] (print "Hello World!\n")))
