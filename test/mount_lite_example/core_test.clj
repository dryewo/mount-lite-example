(ns mount-lite-example.core-test
  (:require [clojure.test :refer :all]
            [mount-lite-example.core :refer :all]
            [mount-lite-example.base :as b]
            [mount-lite-example.state1 :as s1]
            [mount-lite-example.state2 :as s2]
            [mount.lite :as m]))

(deftest a-test
  (testing "Should start only necessary components"
    (is (= [#'b/base #'s1/state1]
           (m/start #'s1/state1)))
    (m/stop)
    (is (= [#'b/base #'s2/state2]
           (m/start #'s2/state2)))
    (m/stop))
  )
