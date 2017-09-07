(ns portkey.aws.iot-data (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.iot-data.method-not-allowed-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/method-not-allowed-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.method-not-allowed-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.unauthorized-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/unauthorized-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.unauthorized-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.invalid-request-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/invalid-request-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.invalid-request-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.get-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data/get-thing-shadow-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.get-thing-shadow-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data/json-document (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iot-data.delete-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data/delete-thing-shadow-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.delete-thing-shadow-request/thingName] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.get-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/get-thing-shadow-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.get-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.service-unavailable-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/service-unavailable-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.service-unavailable-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data/payload (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.iot-data/error-message (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data/topic (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.iot-data.request-entity-too-large-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/request-entity-too-large-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.request-entity-too-large-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.internal-failure-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/internal-failure-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.internal-failure-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.resource-not-found-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/resource-not-found-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.resource-not-found-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.conflict-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/conflict-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.conflict-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data/qos (clojure.spec.alpha/and clojure.core/int? (fn* [p1__56642__56643__auto__] (clojure.core/<= 0 p1__56642__56643__auto__)) (fn* [p1__56644__56645__auto__] (clojure.core/<= p1__56644__56645__auto__ 1))))

(clojure.spec.alpha/def :portkey.aws.iot-data/thing-name (clojure.spec.alpha/and clojure.core/string? (clojure.core/fn [s__56601__auto__] (clojure.core/<= 1 (clojure.core/count s__56601__auto__))) (clojure.core/fn [s__56602__auto__] (clojure.core/< (clojure.core/count s__56602__auto__) 128)) (clojure.core/fn [s__56603__auto__] (clojure.core/re-matches #"[a-zA-Z0-9_-]+" s__56603__auto__))))

(clojure.spec.alpha/def :portkey.aws.iot-data.publish-request/topic (clojure.spec.alpha/and :portkey.aws.iot-data/topic))
(clojure.spec.alpha/def :portkey.aws.iot-data.publish-request/qos (clojure.spec.alpha/and :portkey.aws.iot-data/qos))
(clojure.spec.alpha/def :portkey.aws.iot-data.publish-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data/payload))
(clojure.spec.alpha/def :portkey.aws.iot-data/publish-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.publish-request/topic] :opt-un [:portkey.aws.iot-data.publish-request/qos :portkey.aws.iot-data.publish-request/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.throttling-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/throttling-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.throttling-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.update-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/update-thing-shadow-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.update-thing-shadow-response/payload]))

(clojure.spec.alpha/def :portkey.aws.iot-data.unsupported-document-encoding-exception/message (clojure.spec.alpha/and :portkey.aws.iot-data/error-message))
(clojure.spec.alpha/def :portkey.aws.iot-data/unsupported-document-encoding-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.iot-data.unsupported-document-encoding-exception/message]))

(clojure.spec.alpha/def :portkey.aws.iot-data.delete-thing-shadow-response/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/delete-thing-shadow-response (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.delete-thing-shadow-response/payload] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.iot-data.update-thing-shadow-request/thing-name (clojure.spec.alpha/and :portkey.aws.iot-data/thing-name))
(clojure.spec.alpha/def :portkey.aws.iot-data.update-thing-shadow-request/payload (clojure.spec.alpha/and :portkey.aws.iot-data/json-document))
(clojure.spec.alpha/def :portkey.aws.iot-data/update-thing-shadow-request (portkey.awsgen/json-keys :req-un [:portkey.aws.iot-data.update-thing-shadow-request/thingName :portkey.aws.iot-data.update-thing-shadow-request/payload] :opt-un []))

(clojure.core/defn delete-thing-shadow ([input__56767__auto__] (delete-thing-shadow input__56767__auto__ portkey.aws/*http-client*)) ([input58326 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.iot-data/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "DELETE", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/things/{thingName}/shadow"), :body (clojure.spec.alpha/unform :portkey.aws.iot-data/DeleteThingShadowRequest input58326)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"thingName" "thingName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58325] (clojure.core/let [errors__56772__auto__ {"ResourceNotFoundException" :portkey.aws.iot-data/resource-not-found-exception, "InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "ThrottlingException" :portkey.aws.iot-data/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data/unsupported-document-encoding-exception}] (if (clojure.core/= nil (:status response58325)) (clojure.spec.alpha/unform :portkey.aws.iot-data/delete-thing-shadow-response (:body response58325)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58325 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58325)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58325})))))))))))

(clojure.core/defn get-thing-shadow ([input__56767__auto__] (get-thing-shadow input__56767__auto__ portkey.aws/*http-client*)) ([input58328 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.iot-data/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/things/{thingName}/shadow"), :body (clojure.spec.alpha/unform :portkey.aws.iot-data/GetThingShadowRequest input58328)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"thingName" "thingName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58327] (clojure.core/let [errors__56772__auto__ {"InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "ResourceNotFoundException" :portkey.aws.iot-data/resource-not-found-exception, "ThrottlingException" :portkey.aws.iot-data/throttling-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "ServiceUnavailableException" :portkey.aws.iot-data/service-unavailable-exception, "InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data/unsupported-document-encoding-exception}] (if (clojure.core/= nil (:status response58327)) (clojure.spec.alpha/unform :portkey.aws.iot-data/get-thing-shadow-response (:body response58327)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58327 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58327)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58327})))))))))))

(clojure.core/defn publish ([input__56767__auto__] (publish input__56767__auto__ portkey.aws/*http-client*)) ([input58330 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.iot-data/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/topics/{topic}"), :body (clojure.spec.alpha/unform :portkey.aws.iot-data/PublishRequest input58330)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"topic" "topic"}) (portkey.awsgen/params-to-querystring {"qos" "qos"}) (portkey.awsgen/params-to-payload "payload") (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58329] (clojure.core/let [errors__56772__auto__ {"InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception}] (if (clojure.core/= nil (:status response58329)) true (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58329 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58329)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58329})))))))))))

(clojure.core/defn update-thing-shadow ([input__56767__auto__] (update-thing-shadow input__56767__auto__ portkey.aws/*http-client*)) ([input58332 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.iot-data/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/things/{thingName}/shadow"), :body (clojure.spec.alpha/unform :portkey.aws.iot-data/UpdateThingShadowRequest input58332)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {"thingName" "thingName"}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload "payload") (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response58331] (clojure.core/let [errors__56772__auto__ {"MethodNotAllowedException" :portkey.aws.iot-data/method-not-allowed-exception, "UnauthorizedException" :portkey.aws.iot-data/unauthorized-exception, "InvalidRequestException" :portkey.aws.iot-data/invalid-request-exception, "ServiceUnavailableException" :portkey.aws.iot-data/service-unavailable-exception, "RequestEntityTooLargeException" :portkey.aws.iot-data/request-entity-too-large-exception, "InternalFailureException" :portkey.aws.iot-data/internal-failure-exception, "ConflictException" :portkey.aws.iot-data/conflict-exception, "ThrottlingException" :portkey.aws.iot-data/throttling-exception, "UnsupportedDocumentEncodingException" :portkey.aws.iot-data/unsupported-document-encoding-exception}] (if (clojure.core/= nil (:status response58331)) (clojure.spec.alpha/unform :portkey.aws.iot-data/update-thing-shadow-response (:body response58331)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response58331 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response58331)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response58331})))))))))))
