(ns advent-of-code.core)

(defn -main
  "Apply the `main` method from the given namespace"
  [day part & args]
    (let [ns_ (str "advent-of-code" \. day \. part)
          fn_ (symbol ns_ "-main")]
      (do
        (require (symbol ns_))
        (apply (resolve fn_) args))))
