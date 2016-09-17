(ns macro-workshop.apply-macro-spec
  (:require [macro-workshop.apply-macro :as macros]
            [speclj.core :refer :all]))

(describe "apply-macro"
  (it "takes a vector literal"
    (should= "[INFO] column one | column two | column three\r\n"
      (with-out-str
        (macros/log-row ["column one" "column two" "column three"]))))

  (it "takes a vector-valued symbol"
    (pending)
    (should= "[INFO] column one | column two | column three\r\n"
      (with-out-str
        (eval
          `(let [x# ["column one" "column two" "column three"]]
            (macros/log-row x#)))))))
