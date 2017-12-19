(ns mount-lite-example.state2
  (:require [mount.lite :as m]
            [mount-lite-example.base]))

(m/defstate state2
  :start (println "Starting state2"))

(comment
  (m/start #'state2))
