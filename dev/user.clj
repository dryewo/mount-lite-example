(ns user
  (:require [clojure.tools.namespace.repl :refer [refresh]]
            [mount.lite :as m]))

(defn start []
  (m/start))

(defn stop []
  (m/stop))

(defn reset []
  (m/stop)
  (refresh :after 'user/start))
