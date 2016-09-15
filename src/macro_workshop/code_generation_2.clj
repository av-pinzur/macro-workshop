(ns macro-workshop.code-generation-2)

;; you ought to be able to reuse your macro-workshop.code-generation solutions
;; for this - it's almost a literal copy-paste of the function body to the
;; macro body!

(defmacro add [x y]
  (list '+ x y))

(defmacro multiply [x y]
  (list '* x y))

(defmacro make-squarer []
  '(fn [a] (* a a)))

(defmacro make-hello-world []
  '(fn [] (print "Hello World!\n")))
