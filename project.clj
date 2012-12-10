(defproject zwart "0.1.0"
  :description "Noir and Fleet extensions"
  :url "https://github.com/touch/zwart"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[ org.clojure/clojure              "1.4.0"  ]
                 [ org.clojars.touch/fleet          "0.10.2" ]
                 [ noir                             "1.2.2" :exclusions [org.clojure/clojure]]])