(ns portkey.aws.sns (:require [portkey.aws]))

(def
 endpoints
 '{"ap-northeast-1"
   {:credential-scope {:service "sns", :region "ap-northeast-1"},
    :ssl-common-name "sns.ap-northeast-1.amazonaws.com",
    :endpoint "https://sns.ap-northeast-1.amazonaws.com"},
   "eu-west-1"
   {:credential-scope {:service "sns", :region "eu-west-1"},
    :ssl-common-name "sns.eu-west-1.amazonaws.com",
    :endpoint "https://sns.eu-west-1.amazonaws.com"},
   "us-east-2"
   {:credential-scope {:service "sns", :region "us-east-2"},
    :ssl-common-name "sns.us-east-2.amazonaws.com",
    :endpoint "https://sns.us-east-2.amazonaws.com"},
   "ap-southeast-2"
   {:credential-scope {:service "sns", :region "ap-southeast-2"},
    :ssl-common-name "sns.ap-southeast-2.amazonaws.com",
    :endpoint "https://sns.ap-southeast-2.amazonaws.com"},
   "cn-north-1"
   {:credential-scope {:service "sns", :region "cn-north-1"},
    :ssl-common-name "sns.cn-north-1.amazonaws.com.cn",
    :endpoint "https://sns.cn-north-1.amazonaws.com.cn"},
   "sa-east-1"
   {:credential-scope {:service "sns", :region "sa-east-1"},
    :ssl-common-name "sns.sa-east-1.amazonaws.com",
    :endpoint "https://sns.sa-east-1.amazonaws.com"},
   "ap-southeast-1"
   {:credential-scope {:service "sns", :region "ap-southeast-1"},
    :ssl-common-name "sns.ap-southeast-1.amazonaws.com",
    :endpoint "https://sns.ap-southeast-1.amazonaws.com"},
   "ap-northeast-2"
   {:credential-scope {:service "sns", :region "ap-northeast-2"},
    :ssl-common-name "sns.ap-northeast-2.amazonaws.com",
    :endpoint "https://sns.ap-northeast-2.amazonaws.com"},
   "ca-central-1"
   {:credential-scope {:service "sns", :region "ca-central-1"},
    :ssl-common-name "sns.ca-central-1.amazonaws.com",
    :endpoint "https://sns.ca-central-1.amazonaws.com"},
   "eu-central-1"
   {:credential-scope {:service "sns", :region "eu-central-1"},
    :ssl-common-name "sns.eu-central-1.amazonaws.com",
    :endpoint "https://sns.eu-central-1.amazonaws.com"},
   "eu-west-2"
   {:credential-scope {:service "sns", :region "eu-west-2"},
    :ssl-common-name "sns.eu-west-2.amazonaws.com",
    :endpoint "https://sns.eu-west-2.amazonaws.com"},
   "us-gov-west-1"
   {:credential-scope {:service "sns", :region "us-gov-west-1"},
    :ssl-common-name "sns.us-gov-west-1.amazonaws.com",
    :endpoint "https://sns.us-gov-west-1.amazonaws.com"},
   "us-west-2"
   {:credential-scope {:service "sns", :region "us-west-2"},
    :ssl-common-name "sns.us-west-2.amazonaws.com",
    :endpoint "https://sns.us-west-2.amazonaws.com"},
   "us-east-1"
   {:credential-scope {:service "sns", :region "us-east-1"},
    :ssl-common-name "sns.us-east-1.amazonaws.com",
    :endpoint "https://sns.us-east-1.amazonaws.com"},
   "us-west-1"
   {:credential-scope {:service "sns", :region "us-west-1"},
    :ssl-common-name "sns.us-west-1.amazonaws.com",
    :endpoint "https://sns.us-west-1.amazonaws.com"},
   "ap-south-1"
   {:credential-scope {:service "sns", :region "ap-south-1"},
    :ssl-common-name "sns.ap-south-1.amazonaws.com",
    :endpoint "https://sns.ap-south-1.amazonaws.com"}})

(comment TODO support "query")
