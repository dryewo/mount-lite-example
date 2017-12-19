(ns mount-lite-example.base
  (:require [mount.lite :as m]))

(m/defstate base
  :start (println "Starting base"))
