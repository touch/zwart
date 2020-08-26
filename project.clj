(defproject zwart "2"
  :description "Noir and Fleet extensions"
  :url "https://github.com/touch/zwart"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :repositories {"jenkins.onlinetouch.eu" "https://jenkins.onlinetouch.eu/plugin/repository/everything/"}
  :dependencies [[ org.clojure/clojure              "1.5.1"  ]
                 [ org.clojars.touch/fleet          "0.10.4" ]
                 [ org.clojars.touch/noir 			"1.3.1" :exclusions [org.clojure/clojure]]])
