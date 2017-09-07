(ns portkey.aws.athena (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "athena", :region "ap-northeast-1"},
    :ssl-common-name "athena.ap-northeast-1.amazonaws.com",
    :endpoint "https://athena.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "athena", :region "eu-west-1"},
    :ssl-common-name "athena.eu-west-1.amazonaws.com",
    :endpoint "https://athena.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "athena", :region "us-east-2"},
    :ssl-common-name "athena.us-east-2.amazonaws.com",
    :endpoint "https://athena.us-east-2.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "athena", :region "ap-southeast-1"},
    :ssl-common-name "athena.ap-southeast-1.amazonaws.com",
    :endpoint "https://athena.ap-southeast-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "athena", :region "us-west-2"},
    :ssl-common-name "athena.us-west-2.amazonaws.com",
    :endpoint "https://athena.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "athena", :region "us-east-1"},
    :ssl-common-name "athena.us-east-1.amazonaws.com",
    :endpoint "https://athena.us-east-1.amazonaws.com"}})

(comment TODO support "json")
