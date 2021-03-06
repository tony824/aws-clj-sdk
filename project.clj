(defproject portkey/aws-clj-sdk "0.1.0-SNAPSHOT"
  :description "Clojure bindings for AWS"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha19"]
                 [org.sharetribe/aws-sig4 "0.1.3"]
                 [clj-http "3.7.0"]
                 [cheshire "5.7.1"]
                 [net.cgrand/xforms "0.7.2"]
                 [org.clojure/core.async "0.3.443"]])
