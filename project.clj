(defproject mount-lite-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [functionalbytes/mount-lite "2.0.0"]]
  :main ^:skip-aot mount-lite-example.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev     {:repl-options   {:init-ns user}
                       :source-paths   ["dev"]
                       :dependencies   [[org.clojure/tools.namespace "0.2.11"]
                                        [org.clojure/java.classpath "0.2.3"]]}})
