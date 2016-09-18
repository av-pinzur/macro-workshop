(ns macro-workshop.apply-macro
  (:require [speclj.core :refer :all])
  (:require [clojure.string :as string]))

(defmacro log [& args]
  `(println (str "[INFO] " (string/join " | " ~(vec args)))))

(defn log-row [row]
  (eval (cons `log row)))
