(defproject clojure-sample "1.0.1"
  :description "Hello World Clojure Web App"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [compojure "1.1.1"]
                 [ring/ring-jetty-adapter "1.1.2"]]
:java-agents [[com.datadoghq/dd-java-agent "0.55.0"]]
:jvm-opts ["-Ddd.trace.debug=true"]
:main ^:skip-aot sample.app)
