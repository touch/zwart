(ns zwart.fleet
  (:use 
    fleet
    fleet.runtime
    [ring.util.response :only (response content-type)] 
    compojure.response))

(extend-protocol Renderable
  fleet.util.CljString
    (render [this _] (response (.toString this))))

(extend-protocol Screenable 
  nil
    (screen [s f] ""))
