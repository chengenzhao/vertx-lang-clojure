(ns io.acme.clojure.sub-interface)

(import com.acme.pkg.sub.SubInterface)

(defn reverse
  ([sub-interface s] (.reverse sub-interface s)))