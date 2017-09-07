(ns portkey.aws.swf.-2012-01-25 (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "swf", :region "ap-northeast-1"},
    :ssl-common-name "swf.ap-northeast-1.amazonaws.com",
    :endpoint "https://swf.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "swf", :region "eu-west-1"},
    :ssl-common-name "swf.eu-west-1.amazonaws.com",
    :endpoint "https://swf.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "swf", :region "us-east-2"},
    :ssl-common-name "swf.us-east-2.amazonaws.com",
    :endpoint "https://swf.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "swf", :region "ap-southeast-2"},
    :ssl-common-name "swf.ap-southeast-2.amazonaws.com",
    :endpoint "https://swf.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credential-scope {:service "swf", :region "cn-north-1"},
    :ssl-common-name "swf.cn-north-1.amazonaws.com.cn",
    :endpoint "https://swf.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credential-scope {:service "swf", :region "sa-east-1"},
    :ssl-common-name "swf.sa-east-1.amazonaws.com",
    :endpoint "https://swf.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "swf", :region "ap-southeast-1"},
    :ssl-common-name "swf.ap-southeast-1.amazonaws.com",
    :endpoint "https://swf.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "swf", :region "ap-northeast-2"},
    :ssl-common-name "swf.ap-northeast-2.amazonaws.com",
    :endpoint "https://swf.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "swf", :region "ca-central-1"},
    :ssl-common-name "swf.ca-central-1.amazonaws.com",
    :endpoint "https://swf.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "swf", :region "eu-central-1"},
    :ssl-common-name "swf.eu-central-1.amazonaws.com",
    :endpoint "https://swf.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "swf", :region "eu-west-2"},
    :ssl-common-name "swf.eu-west-2.amazonaws.com",
    :endpoint "https://swf.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope {:service "swf", :region "us-gov-west-1"},
    :ssl-common-name "swf.us-gov-west-1.amazonaws.com",
    :endpoint "https://swf.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "swf", :region "us-west-2"},
    :ssl-common-name "swf.us-west-2.amazonaws.com",
    :endpoint "https://swf.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "swf", :region "us-east-1"},
    :ssl-common-name "swf.us-east-1.amazonaws.com",
    :endpoint "https://swf.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "swf", :region "us-west-1"},
    :ssl-common-name "swf.us-west-1.amazonaws.com",
    :endpoint "https://swf.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "swf", :region "ap-south-1"},
    :ssl-common-name "swf.ap-south-1.amazonaws.com",
    :endpoint "https://swf.ap-south-1.amazonaws.com"}})

(comment TODO support "json")
