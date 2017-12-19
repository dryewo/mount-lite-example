(ns mount-lite-example.state1
  (:require [mount.lite :as m]
            [mount-lite-example.base]))

(m/defstate state1
  :start (println "Starting state1"))

(comment
  (m/start #'state1))
