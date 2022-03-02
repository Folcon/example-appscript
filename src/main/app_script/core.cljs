(ns app-script.core
  (:require [clojure.string :as str]
            [applied-science.js-interop :as j]
            ["./entry_points" :as entry-points]))


(def ^:export mult_vals entry-points/mult_vals)


(defn sheet-app [] js/SpreadsheetApp)

(defn sheet-ui [] (.createAddonMenu (sheet-app)))


(defn poke-log []
  (js/Logger.log "TEST"))

(defn add-menu []
  (.. (sheet-ui)
    (addItem "Start", "poke-log")
    (addToUi)))

