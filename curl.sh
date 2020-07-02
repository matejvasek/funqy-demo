curl http://localhost:8080 \
    -X POST \
    -H "Ce-Id: 42" \
    -H "Ce-specversion: 0.3" \
    -H "Ce-Type: dev.knative.cronjob.event" \
    -H "Ce-Source: echo" \
    -H "Content-Type: application/json" \
    -d '{"s" : "answer", "i" : 42}' \
    -v
