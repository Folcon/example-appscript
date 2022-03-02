(ns app-script.hooks
  (:require [clojure.java.io :as io]))


(defn build-hook
  {:shadow.build/stage :flush}
  [build-state & args]
  (println (keys build-state))
  (spit
    (io/file "app-script-src" "Code.js")
    (slurp (io/file "src/js/app_script/custom_functions.js"))
    :append true)
  build-state)
