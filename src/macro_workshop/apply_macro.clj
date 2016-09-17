(ns macro-workshop.apply-macro
  (:require [speclj.core :refer :all])
  (:require [clojure.string :as string]))

(defmacro log [& args]
  `(println (str "[INFO] " (string/join " | " ~(vec args)))))

(defmacro log-row [row]
  `(log ~@row)) ;; replace me
