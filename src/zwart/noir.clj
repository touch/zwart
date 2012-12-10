(ns zwart.noir
	(:require noir.core, noir.options))

(defn prefix-url [url]
  (cond
    (string? url) (str (:uri-prefix noir.options/*options*) url)
    (seq?    url) (map prefix-url url)
    (vector? url) (vec (map prefix-url url))
    :else    url))

(defmacro defpage
  [& args]
  (let [n             (if (>= (count args) 2) 2 #_else 1)
        prefixed-args (concat
                        (prefix-url (take n args))
                        (drop n args))]
        (prn prefixed-args)
    `(noir.core/defpage ~@prefixed-args)))
