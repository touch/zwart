(defproject zwart "2.0.1-SNAPSHOT"
  :description "Noir and Fleet extensions"
  :url "https://github.com/touch/zwart"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"reposilite.onlinetouch.eu" "https://reposilite.onlinetouch.eu/repository/onlinetouch/"}
  :dependencies [[ org.clojure/clojure              "1.5.1"  ]
                 [ org.clojars.touch/fleet          "0.10.5-SNAPSHOT" ]
                 [ org.clojars.touch/noir 			"1.3.2-SNAPSHOT" :exclusions [org.clojure/clojure]]])
