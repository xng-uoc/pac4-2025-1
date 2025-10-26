interfaces {
    ethernet eth0 {
        address "172.20.20.16/24"
        address "3fff:172:20:20::a/64"
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
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0xIGxhYiBDQTAeFw0yNTEwMjYxNjA2MDdaFw0yNjEwMjYxNjA2MDdaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDYucGFjNC0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQC4PkUGD5FeGQU/2BjQ6oAUK588JBbXHkD3vT8pCbW6iL2Ai2cxqEHO1eIU3rpKIcaLcggD5ydkVrZf9sh/Gx7Pb780NEzjav9KxyPqFr1tOwh3EXToxhdPOwrmMrGvF0XzdrDpeFwWYiuANJjoO4JTcagp+frpL60O8Pp4nhwk9M2pkwaGKVeCwbRFwCMvUvxI85HQ1YImdXrPCV3alovst435xgbEnJke41dQcqYv8s/XdDB19iMFlq0YAg6Qw5O4KW0aqNyHJe/lmAAuKFFy7cZmAyb8bmc/m1h4rWNaYywQG0K3hKvKh8MDzxVGPpul66VzOHlKsutGEbe4AMQJAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUEy+0lJhfEVfc8Fz8dSVChHH6MXYwRwYDVR0RBEAwPoIGdnlvczA2ghdjbGFiLXBhYzQtMjAyNS0xLXZ5b3MwNoIVdnlvczA2LnBhYzQtMjAyNS0xLmlvhwSsFBQQMA0GCSqGSIb3DQEBCwUAA4IBAQAtZNXfLIWW4X6YTfM0t78jnHN2sada4VhaTGdKUniWWGq1MrJ7B2XXY3Sg3GNjKA+SXV9dkEaBXM5u+h0ILbInOnqAOz6SBkNueLDsLi0kw1q9H8y8HiWF+Svjx3HL0v/koXV/nAbIF+KKPNYoQNSOzF1tdXARdK7NaIg8pkJ/CCuF83FMnK1hvotiiG/V1Vq2eNkbfQmC3+clawlV7CYQJy1+r35mmsnpQZpM2e3LkIIZuxzSrrXHibDNJiSXmI34Mu4elhGtOvbR7RqGSeqL5sJK1VEqYx9+QmoBYg56qG3LIoPVn+/m83NYATTeO3oLit3igu61bY2p+8AFdN6l"
        private {
            key "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQC4PkUGD5FeGQU/2BjQ6oAUK588JBbXHkD3vT8pCbW6iL2Ai2cxqEHO1eIU3rpKIcaLcggD5ydkVrZf9sh/Gx7Pb780NEzjav9KxyPqFr1tOwh3EXToxhdPOwrmMrGvF0XzdrDpeFwWYiuANJjoO4JTcagp+frpL60O8Pp4nhwk9M2pkwaGKVeCwbRFwCMvUvxI85HQ1YImdXrPCV3alovst435xgbEnJke41dQcqYv8s/XdDB19iMFlq0YAg6Qw5O4KW0aqNyHJe/lmAAuKFFy7cZmAyb8bmc/m1h4rWNaYywQG0K3hKvKh8MDzxVGPpul66VzOHlKsutGEbe4AMQJAgMBAAECggEAJX5+m3olkimzWMfIXROr1u79q8aIY2TDwebgaKCSPBDBx9wWtxNPuSDrrmWZMabn+c7N9MVgzdmbqbHWIY/KWFqcZapTD2Dh7TzTgTr5d7YwxdJmoUxWyAfy8t/UKxaoZKB95jVZQDDgO2n4yCH8JrEVkN1Pg47xP/4oas16WsaieoojlxlEMGwL5kvkUrRAVHKE3SszQBoCw7Lwqj28S/bVs+RJiUJI6lmDcDrThxNSR/HRJnfi7WesWoEZa8/f+VA98kW3Dbi1geBcwjaZ2ThHQgNn9VG07AQFz803dvf522q68C+8cVkNIUfjvm/vI1VNF24YIiE4i9eUoZj59QKBgQDTVK1yxV9bUs8sc/TAJrxhjPve+98WsA21uPteZQBH66L4oqZA3Y08WUPUFqo80cYcjyHHU9psGBvoNVWGqBMnf3qx2GLaS6e2sgIWJ/tIp2FTmEksI/A/jMHsUU/qXDJKkGN7Kyyt+3YHeoFIqZJk10PXkCMkNqMgrraIX/6T/wKBgQDfL9u6T4r7hX5ldFH35XhaV3xxeteVwwt79bedWgQCv3hm/YX6C02WnNhkADZ6kXc+60OXLQeDnVR/25oCaU6rCsiol3w/KtFBYuwa/30/dxH6GgNED0MC8jFlK5ZhPtl4sCxchSH8D38YTE193nWOQNYh1Koedw+uszl4TKwH9wKBgGokGYmPgDlJ+iwFgWQREISeXtK8BmxKuFgRNI9QgzecLhpa9s2VeR5aZyrax14Mrkghy4FlqEqqQTn7r50WRaiM6n7wg5XIcc/c0Bd4tUjkaImn7vhwhHYmqC+dF1pKPCgfJRfzs1ke90UCTnTEVna3d6eJCV1i48PCfIM6U47ZAoGAbuhCYWAbqYeZ2uKlxPFUEFi/L0kjDnnhIBVnzBqqOY9aTpuXUz0ArmJ8qZztdZUJ08tnSB2JSV8KWYsQCji4bgiq1BSLGny1ha+ZsoTZgYsy9LyueMi4vSMLZsH1NZfcy7uIH+XMkIxG1RU9wNmmQy12+1LJwt/ZfC/11BENv9sCgYBmFfoA6Zx3yfJbQKlla+UWpMnx2WEWA386cXNhFEdjqzEWJDAUi+74KhhR1ui+MSRV2XEN+Q/sDNQROTeDvGjJreQ2uoj+WmDH9t3qaJBGg4LdSbWl1wILl2aHZ63II+9W1H7IXWDI9b61x3IQVglVUPmR3LxnegFYKY29iTzVag=="
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
    host-name "vyos06"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$XGkkpCWEbWMHS6qR$XC5g7n9Lze/4c4CYeEMxOuPn9UdzdfnfZyvWPEBDMpOKvdlP.90eVOsnvWd7nyneVYhgOScnxQ9oKWPo3OmsH."
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
