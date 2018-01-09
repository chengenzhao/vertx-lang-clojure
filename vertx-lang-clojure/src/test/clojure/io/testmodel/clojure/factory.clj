(ns io.testmodel.clojure.factory)

(import io.vertx.codegen.testmodel.Factory)
(import io.vertx.core.Handler)

(defn create-abstract-handler-user-type
  ([handler] (Factory/createAbstractHandlerUserType handler)))
(defn create-concrete-handler-user-type
  ([handler] (Factory/createConcreteHandlerUserType handler)))
(defn create-concrete-handler-user-type-extension
  ([handler] (Factory/createConcreteHandlerUserTypeExtension handler)))