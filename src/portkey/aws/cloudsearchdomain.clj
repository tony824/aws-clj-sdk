(ns portkey.aws.cloudsearchdomain (:require [portkey.aws]))

(def endpoints 'nil)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.bucket/value (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.bucket/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/bucket (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.bucket/value :portkey.aws.cloudsearchdomain.bucket/count]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/sort (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/double clojure.core/double?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/expr (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/deletes clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/partial clojure.core/boolean?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggester (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/bucket-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/bucket :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/fields (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/field-value))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/start clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggestions-size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/query-parser (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"simple" "simple", :simple "simple", "structured" "structured", :structured "structured", "lucene" "lucene", :lucene "lucene", "dismax" "dismax", :dismax "dismax"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.document-service-exception/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.document-service-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/document-service-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.document-service-exception/status :portkey.aws.cloudsearchdomain.document-service-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/highlight (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/adds clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/hit-list (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/hit :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/query-options (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/content-type (clojure.spec.alpha/conformer (clojure.core/let [m__56599__auto__ {"application/json" "application/json", :application/json "application/json", "application/xml" "application/xml", :application/xml "application/xml"}] (clojure.core/fn [s__56600__auto__] (m__56599__auto__ s__56600__auto__ :clojure.spec.alpha/invalid))) (clojure.core/comp clojure.core/keyword portkey.awsgen/dashed)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/exprs (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggest-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-response/suggest (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggest-model))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggest-response/status :portkey.aws.cloudsearchdomain.suggest-response/suggest]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/filter-query (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hits/hit (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/hit-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/hits (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.hits/found :portkey.aws.cloudsearchdomain.hits/start :portkey.aws.cloudsearchdomain.hits/cursor :portkey.aws.cloudsearchdomain.hits/hit]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/facet (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/string (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/size clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-status (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.search-status/timems :portkey.aws.cloudsearchdomain.search-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/min (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/max (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/count (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/missing (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/sum (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/sum-of-squares (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/mean (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.field-stats/stddev (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/double))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/field-stats (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.field-stats/min :portkey.aws.cloudsearchdomain.field-stats/max :portkey.aws.cloudsearchdomain.field-stats/count :portkey.aws.cloudsearchdomain.field-stats/missing :portkey.aws.cloudsearchdomain.field-stats/sum :portkey.aws.cloudsearchdomain.field-stats/sumOfSquares :portkey.aws.cloudsearchdomain.field-stats/mean :portkey.aws.cloudsearchdomain.field-stats/stddev]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/stat (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-exception/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-exception (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.search-exception/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggestions (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/suggestion-match :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/long clojure.core/int?)

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/partial (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/partial))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/expr (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/expr))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/query-parser (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/query-parser))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/filter-query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/filter-query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/return (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/return))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/sort (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/sort))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/start (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/start))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/cursor (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/cursor))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/facet (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/facet))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/highlight (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/highlight))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/query-options (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/query-options))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-request/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/stat))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-request (portkey.awsgen/json-keys :req-un [:portkey.aws.cloudsearchdomain.search-request/query] :opt-un [:portkey.aws.cloudsearchdomain.search-request/partial :portkey.aws.cloudsearchdomain.search-request/expr :portkey.aws.cloudsearchdomain.search-request/queryParser :portkey.aws.cloudsearchdomain.search-request/filterQuery :portkey.aws.cloudsearchdomain.search-request/return :portkey.aws.cloudsearchdomain.search-request/sort :portkey.aws.cloudsearchdomain.search-request/start :portkey.aws.cloudsearchdomain.search-request/cursor :portkey.aws.cloudsearchdomain.search-request/facet :portkey.aws.cloudsearchdomain.search-request/size :portkey.aws.cloudsearchdomain.search-request/highlight :portkey.aws.cloudsearchdomain.search-request/queryOptions :portkey.aws.cloudsearchdomain.search-request/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/stats (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/field-stats))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-request/documents (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/blob))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-request/content-type (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/content-type))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/upload-documents-request (portkey.awsgen/json-keys :req-un [:portkey.aws.cloudsearchdomain.upload-documents-request/documents :portkey.aws.cloudsearchdomain.upload-documents-request/contentType] :opt-un []))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/fields (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/fields))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/exprs (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/exprs))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.hit/highlights (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/highlights))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/hit (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.hit/id :portkey.aws.cloudsearchdomain.hit/fields :portkey.aws.cloudsearchdomain.hit/exprs :portkey.aws.cloudsearchdomain.hit/highlights]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/cursor (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/adds (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/adds))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/deletes (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/deletes))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.upload-documents-response/warnings (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/document-service-warnings))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/upload-documents-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.upload-documents-response/status :portkey.aws.cloudsearchdomain.upload-documents-response/adds :portkey.aws.cloudsearchdomain.upload-documents-response/deletes :portkey.aws.cloudsearchdomain.upload-documents-response/warnings]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.bucket-info/buckets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/bucket-list))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/bucket-info (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.bucket-info/buckets]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggestion-match/suggestion (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggestion-match/score (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggestion-match/id (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggestion-match (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggestion-match/suggestion :portkey.aws.cloudsearchdomain.suggestion-match/score :portkey.aws.cloudsearchdomain.suggestion-match/id]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/document-service-warnings (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/document-service-warning :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.document-service-warning/message (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/document-service-warning (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.document-service-warning/message]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/blob (clojure.spec.alpha/and clojure.core/bytes? (clojure.spec.alpha/conformer portkey.awsgen/base64-encode portkey.awsgen/base64-decode)))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/field-value (clojure.spec.alpha/coll-of :portkey.aws.cloudsearchdomain/string :max-count nil))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-model/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-model/found (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-model/suggestions (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggestions))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-model (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggest-model/query :portkey.aws.cloudsearchdomain.suggest-model/found :portkey.aws.cloudsearchdomain.suggest-model/suggestions]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-status/timems (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/long))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-status/rid (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/string))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-status (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.suggest-status/timems :portkey.aws.cloudsearchdomain.suggest-status/rid]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/return (clojure.spec.alpha/and clojure.core/string?))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/highlights (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/string))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-request/query (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/query))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-request/suggester (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggester))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.suggest-request/size (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/suggestions-size))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/suggest-request (portkey.awsgen/json-keys :req-un [:portkey.aws.cloudsearchdomain.suggest-request/query :portkey.aws.cloudsearchdomain.suggest-request/suggester] :opt-un [:portkey.aws.cloudsearchdomain.suggest-request/size]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/status (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/search-status))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/hits (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/hits))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/facets (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/facets))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain.search-response/stats (clojure.spec.alpha/and :portkey.aws.cloudsearchdomain/stats))
(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/search-response (portkey.awsgen/json-keys :req-un [] :opt-un [:portkey.aws.cloudsearchdomain.search-response/status :portkey.aws.cloudsearchdomain.search-response/hits :portkey.aws.cloudsearchdomain.search-response/facets :portkey.aws.cloudsearchdomain.search-response/stats]))

(clojure.spec.alpha/def :portkey.aws.cloudsearchdomain/facets (clojure.spec.alpha/map-of :portkey.aws.cloudsearchdomain/string :portkey.aws.cloudsearchdomain/bucket-info))

(clojure.core/defn search ([input__56767__auto__] (search input__56767__auto__ portkey.aws/*http-client*)) ([input57882 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.cloudsearchdomain/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2013-01-01/search?format=sdk&pretty=true"), :body (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain/SearchRequest input57882)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"partial" "partial", "expr" "expr", "fq" "filterQuery", "q" "query", "return" "return", "sort" "sort", "q.options" "queryOptions", "start" "start", "cursor" "cursor", "q.parser" "queryParser", "facet" "facet", "size" "size", "highlight" "highlight", "stats" "stats"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57881] (clojure.core/let [errors__56772__auto__ {"SearchException" :portkey.aws.cloudsearchdomain/search-exception}] (if (clojure.core/= nil (:status response57881)) (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain/search-response (:body response57881)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57881 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57881)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57881})))))))))))

(clojure.core/defn suggest ([input__56767__auto__] (suggest input__56767__auto__ portkey.aws/*http-client*)) ([input57884 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.cloudsearchdomain/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "GET", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2013-01-01/suggest?format=sdk&pretty=true"), :body (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain/SuggestRequest input57884)} (portkey.awsgen/params-to-header {}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {"q" "query", "suggester" "suggester", "size" "size"}) (portkey.awsgen/params-to-payload nil) (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57883] (clojure.core/let [errors__56772__auto__ {"SearchException" :portkey.aws.cloudsearchdomain/search-exception}] (if (clojure.core/= nil (:status response57883)) (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain/suggest-response (:body response57883)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57883 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57883)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57883})))))))))))

(clojure.core/defn upload-documents ([input__56767__auto__] (upload-documents input__56767__auto__ portkey.aws/*http-client*)) ([input57886 http-client__56768__auto__] (clojure.core/let [endpoint__56769__auto__ (portkey.aws.cloudsearchdomain/endpoints portkey.aws/*region*) sig-opts__56770__auto__ (clojure.core/into (:credential-scope endpoint__56769__auto__) portkey.aws/*credentials*)] (clojure.core/-> {:method "POST", :headers {"content-type" "application/json"}, :url (clojure.core/str (:endpoint (endpoints portkey.aws/*region*)) "/2013-01-01/documents/batch?format=sdk"), :body (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain/UploadDocumentsRequest input57886)} (portkey.awsgen/params-to-header {"contentType" ["Content-Type" nil]}) (portkey.awsgen/params-to-uri {}) (portkey.awsgen/params-to-querystring {}) (portkey.awsgen/params-to-payload "documents") (clojure.core/update :body (fn* [p1__56766__56771__auto__] (clojure.core/some-> p1__56766__56771__auto__ cheshire.core/generate-string))) (portkey.aws/sign-v4 sig-opts__56770__auto__) (http-client__56768__auto__ (clojure.core/fn [response57885] (clojure.core/let [errors__56772__auto__ {"DocumentServiceException" :portkey.aws.cloudsearchdomain/document-service-exception}] (if (clojure.core/= nil (:status response57885)) (clojure.spec.alpha/unform :portkey.aws.cloudsearchdomain/upload-documents-response (:body response57885)) (clojure.core/if-some [[type__56773__auto__ spec__56774__auto__] (clojure.core/find errors__56772__auto__ (clojure.core/get-in response57885 [:headers "x-amzn-ErrorType"]))] (clojure.core/let [m__56775__auto__ (clojure.spec.alpha/unform spec__56774__auto__ (cheshire.core/parse-string (:body response57885)))] (throw (clojure.core/ex-info (clojure.core/str type__56773__auto__ ": " (:message m__56775__auto__)) m__56775__auto__))) (throw (clojure.core/ex-info "Unexpected response" {:response response57885})))))))))))
