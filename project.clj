(defproject zwart "2.0.1-SNAPSHOT"
  :description "Noir and Fleet extensions"
  :url "https://github.com/touch/zwart"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[ org.clojure/clojure              "1.8.0"  ]
                 [ org.clojars.touch/fleet          "0.10.5-SNAPSHOT" ]
                 [ org.clojars.touch/noir 			"1.3.2-SNAPSHOT" :exclusions [org.clojure/clojure]]]
  :pom-plugins [[com.theoryinpractise/clojure-maven-plugin "1.3.23"
                 {:extensions "true"
                  :configuration ([:sourceDirectories [:sourceDirectory "src"]]
                                  [:temporaryOutputDirectory "true"]
                                  [:vmargs "-Xmx256m -XX:MaxPermSize=256m -XX:+UseConcMarkSweepGC -XX:+CMSClassUnloadingEnabled"])
                  :executions [:execution
                               [:id "compile-clojure"]
                               [:phase "compile"]
                               [:goals [:goal "compile"]]]}]])
