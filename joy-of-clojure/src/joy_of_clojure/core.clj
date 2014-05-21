(ns joy-of-clojure.core)

;; Given ["Aaron" "David" "Lemmon"] returns "Lemmon, Aaron David".
;; Given [“Emma” “Heming” “Sax”] returns “Sax, Emma Heming”.
(defn rearrange [whole-name]
  (let [[f-name m-name l-name] whole-name]
    (str l-name ", " f-name " " m-name)))
