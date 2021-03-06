(ns awesome-radio.util)


(defn js-log [js-thing]
  (.log js/console js-thing))


(defn log [clj-thing]
  (js-log (pr-str clj-thing)))


(defn by-id [id]
  (.getElementById js/document id))


(def index-key-mixin
  {:key-fn (fn [idx] idx)})


(defn now
  "Returns the current timestamp."
  []
  (.now js/Date))
