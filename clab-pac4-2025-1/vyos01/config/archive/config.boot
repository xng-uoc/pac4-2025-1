interfaces {
    ethernet eth0 {
        address "172.20.20.11/24"
        address "3fff:172:20:20::7/64"
        description "Management Interface"
    }
    loopback lo {
    }
}
pki {
    ca clab {
        certificate "MIIDizCCAnOgAwIBAgICB+MwDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0xIGxhYiBDQTAeFw0yNTEwMjYxNjA2MDZaFw0yNjEwMjYxNjA2MDZaMFcxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMRswGQYDVQQDExJwYWM0LTIwMjUtMSBsYWIgQ0EwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDTCqRQceTjjgkJal9QvhDhKFqTFlyWTYGwRgyxzfZSP2uKs/PY5LamS0Rh+9X3ERUQrpgNXYPFtQubpmPKnO4DCjFRIBqA1LmtfsheKAXJFJILr/Zna6ER47M5utWJeAYppVrYXIvqcFff7V+9qCMFmMib5Iuri8cScxKhGFqtUHBJ0YoT6avWuTTtzUyh8ucCyLZqB6XSYWHM0GYJ1zSjeVGzcziQg9JRXtbVSkmAqASKhxChElJGLdT4KBiL39DWCW1x4qV4bFGhuOc8jm7gBeDbODyjQPS/4KsHrtilO+P/jajXmdsTJetw9F2l5pjhCbxo/jbAmrBBkR+ccWBVAgMBAAGjYTBfMA4GA1UdDwEB/wQEAwIChDAdBgNVHSUEFjAUBggrBgEFBQcDAgYIKwYBBQUHAwEwDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUEy+0lJhfEVfc8Fz8dSVChHH6MXYwDQYJKoZIhvcNAQELBQADggEBAKd31mZ5vHVUIQv+O5Y1jzUnyoRdlewRXpPgbHmhnnWczj1iyWX8FqQS/XDKryy81E7VF7+kAqCYfTtVQWKi1eebJ3bEuG+/UD8sCmdybLqDhlf06YO8VOHYu4KNamzvmnXG63fl8vwxC67uO5HyKEyEf8U7abbfAk1B+jjCeniK1NpswlFU3CtIBjbhV3kVZUWkNJOVLbgN6JB6ukbzzfCJ2DasEVWo7dkeC27JvnrALEqgPAqdDI3hXFgtKXbSp9PaZrvYF6fL4yV/139SfPdkQZ+7IuI+9swbVeUV9zkRHuoVvK0q6XycG1LYILfefl+XYZxEe/znPmYTiY9WwL4="
    }
    certificate self {
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0xIGxhYiBDQTAeFw0yNTEwMjYxNjA2MDdaFw0yNjEwMjYxNjA2MDdaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDEucGFjNC0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCbkisB9yVu8BLIfEVUDCesngc+Rdkod9I+c28H4c6YOjfHYLCwnpk3yKwEBt9D0swMtlbcwVeveKqcFZimAwmQtzMaCdtxOnsmHKDT6eYD8TpuIcojJ2SsBXJtcTQ6LiFy761XIb0ZZoc/gGOdlBqacQrMBtUQBEFaAB5yZDaUzD8yOLgMc2aQSTC6YxwWy3mRYtkgkjO7MYOXwRCzgbVCPYbD8N2365KDx1VidPDrt4CclvadqG2EdqUo6SJqXm/ebVbuUOQ5vMSDMwg8GoA2SQh2zH3U6T+HlBFeJXd9o4rPQUgec4OBMxVh/aU12Mp3pS8ZXyVmXNFwx2x4yGSNAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUEy+0lJhfEVfc8Fz8dSVChHH6MXYwRwYDVR0RBEAwPoIGdnlvczAxghdjbGFiLXBhYzQtMjAyNS0xLXZ5b3MwMYIVdnlvczAxLnBhYzQtMjAyNS0xLmlvhwSsFBQLMA0GCSqGSIb3DQEBCwUAA4IBAQBlaU74nVhUNQxSmuhoXLgyR6rs+HxL3bfP4UvIEwyJm4Uva09HY3IhmuhDNEtzTThz90I6ba87iAIqHC/e9ghkDGIt2a8Qkf1m70f+BQGUzGyDONU52JbU17W6Bo+OhdKJf0SCN5xYMOLM8elqMyfsZy7N3YTyDeGGHOvoCp+71hsCwgqHC9HffIMElb1UfQymnDnpcVhJBHhnPvKtDtkWPtodbtPsI7ZvWSL3zqaab0ls7okc08r9DA2MYylq9WMYM8HIxf4a2hOdaZxnhZ4qsdbn82l183E2AH5l7aAxidYHJ3XVXR1J7Lfg4ReTLmXwuS8JKvUqDINmnftniM/9"
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCbkisB9yVu8BLIfEVUDCesngc+Rdkod9I+c28H4c6YOjfHYLCwnpk3yKwEBt9D0swMtlbcwVeveKqcFZimAwmQtzMaCdtxOnsmHKDT6eYD8TpuIcojJ2SsBXJtcTQ6LiFy761XIb0ZZoc/gGOdlBqacQrMBtUQBEFaAB5yZDaUzD8yOLgMc2aQSTC6YxwWy3mRYtkgkjO7MYOXwRCzgbVCPYbD8N2365KDx1VidPDrt4CclvadqG2EdqUo6SJqXm/ebVbuUOQ5vMSDMwg8GoA2SQh2zH3U6T+HlBFeJXd9o4rPQUgec4OBMxVh/aU12Mp3pS8ZXyVmXNFwx2x4yGSNAgMBAAECggEABxgM97SGo5t1OJwSe3DoQG+RunxfMoB2P2YU1QBUiW4ClaGgpPxY1cM3KG7ZlvaBjf6kxHSMWrWVdNnqQX9OQoGMGVhqOVLpz/s9ts2wMRO6rtBB7xG9V9FexKoesAMWM0jF6xatHT+m4RWQbuk7DLnxyVhyNkScNOFGm7/bALSjMlwjgR75wbcDGFxEP8jxhPjBcjsnyhY6AhgEzSD6vFb6akvBUO3Idm5HrXeSlHidgXwWDn4F3/JCLAyPTBz3C1PyoW1sT7Q+8yBFAVmUQTArVpAZZLyb0S+t3UcAQek7vxXdPh632ANSsWBiNsELGjUfdjUYajHYbqZOwiFyUQKBgQDIWSad3tvs74HLvO4EFlIfukoQrg16C9Zw2r5a96q4q/v2J5Tr3mZWeDO5bNxfL+RlMIrl/1HJjzuWD5o53jF1rUXnBllPVCk1OlKaZAkDXv2CSsxwM4syKQfxwOcIK7iJQ0BC+zQn8bE+iYtilXL4jESlA4cszelye/P86lgL3QKBgQDGyOLLJyxHNjmll0tmk4PzjYgMn5yEOkHVPkhTEBhtgr7BwO+By4yCEcIA715Ff5HRD+rH/9rVmAJce2TitSkAfSWBNCFA4ETaIp9FYR4pP9p3ymJFD1QlG2V2suXxHIiUFb2m9Opom9L4ZT+hQEh3i3U6zBZKArcETKpvzBlIcQKBgFFGKS497AWwG31lBUFPNL1+OvGNShZKmxFpC3OnqPAFhM8Uu4r7y5Qkawc7rCJJMWQDTzWCX9Fec5OqfKwhAPt18TeJEc3mnFjlcgEDt8xQSpMCePDDWCJfFsPxt0dPRSsZxwXlFgFmQLrX3V1+twcxD9/JEJsSZTN2KUJeZp1ZAoGAChHzK0d4vsLIeNMJRtECRjxNQBZ131z0KNFW6J5QHnwZHcegWnrtS0mLAnEd3Xdw855Szn7vnxJsTDMUEUgMI7IzTDBP3vF9i29lkiYxWPWbI6ZlBAqawKZ6pWC6tVQ0twvC58pQdawvK9Y1Ov3+rc+qyKe+GVG548XefHtibIECgYEAhpX+9F0g+QxiAlMD7nObSng4VFaCiyJtsxtsoljv0JnkCNKNcr6Z2+Igj+Dv7LrMNxT53bUXML8j4L4biI4TUJpQQyMAyHKiJ5iOilPDPcCgiw809r8qVKkZTq3SS/aFmc+Jw+hX6tQU9GXhvsS5j6+1KC3hCs5jMS+jfI83FBE="
        }
    }
}
service {
    https {
        api {
            keys {
                id admin {
                    key "admin"
                }
            }
            rest {
            }
        }
        certificates {
            ca-certificate "clab"
            certificate "self"
        }
        listen-address "0.0.0.0"
    }
    ntp {
        allow-client {
            address "127.0.0.0/8"
            address "169.254.0.0/16"
            address "10.0.0.0/8"
            address "172.16.0.0/12"
            address "192.168.0.0/16"
            address "::1/128"
            address "fe80::/10"
            address "fc00::/7"
        }
        server time1.vyos.net {
        }
        server time2.vyos.net {
        }
        server time3.vyos.net {
        }
    }
    ssh {
        listen-address "0.0.0.0"
    }
}
system {
    config-management {
        commit-revisions "100"
    }
    host-name "vyos01"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$AXvcQ4GaIEVpxZLT$fCEJUQ3ZtxavXwcf6tHWHV2ymRZCuSovViP.5NlXGXy/Reyynp.8JKy0KsI/AMw4eCADxlRRLleN97jlrRPze1"
                public-keys clab {
                    key "AAAAB3NzaC1yc2EAAAADAQABAAABgQCrNNRvXqLqgzLt/RnlXU5HGKIjhQWlW5hr0OCJz8zMR9TeraWe+pOehLlzhJQ4Nd9SF/7mekT2jQitbv47Nrb9p2FRAnoxRVWuGXc+tPsa8tlZnV9cVZ7EBaxRU27xBmU0bfLI8u08/atsCsri30nPoZj0MvGMLHDnp++FA+3NM/3WNOdv+eJ06H0KNmW8swq/tzkWbX+OmxCG3FDs9l0Q1mcMVePHwCy1AwClkcd3bOpIcvQ6h49wBlTwoKK8tmcbuT62wkN2AWEcYwTHgul1P0JTtUbYylX+q5lBqMcZm0YWJMY2idyGHLyOCPNaV+YdiegvnIqyKLfiUEQ3nyUQK9KpiNQs2xFZ5TUg26wzZpvAyzRpLYlycw3L6Rc82fKxO60ZgZsmvtzYEga8Cp+KMMdOhbzBxn5rRy1pTp7CgVFLldEL9i2HBzaJEqwbsC5DdjzxoU0wYUq/jvBfGY8wutQHp2txCaMGUOA/GEYPUuzKQRFj5JgKwYkMxZ0oock="
                    type "ssh-rsa"
                }
            }
        }
    }
    syslog {
        local {
            facility all {
                level "info"
            }
            facility local7 {
                level "debug"
            }
        }
    }
}


// Warning: Do not remove the following line.
// vyos-config-version: "bgp@6:broadcast-relay@1:cluster@2:config-management@1:conntrack@6:conntrack-sync@2:container@3:dhcp-relay@2:dhcp-server@11:dhcpv6-server@6:dns-dynamic@4:dns-forwarding@4:firewall@19:flow-accounting@1:https@7:ids@1:interfaces@33:ipoe-server@4:ipsec@13:isis@3:l2tp@9:lldp@3:mdns@1:monitoring@2:nat@8:nat66@3:ntp@3:openconnect@3:openvpn@4:ospf@2:pim@1:policy@8:pppoe-server@11:pptp@5:qos@2:quagga@11:reverse-proxy@3:rip@1:rpki@2:salt@1:snmp@3:ssh@2:sstp@6:system@29:vrf@3:vrrp@4:vyos-accel-ppp@2:wanloadbalance@4:webproxy@2"
// Release version: 1.5-stream-2025-Q2
