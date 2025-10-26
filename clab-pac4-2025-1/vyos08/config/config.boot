interfaces {
    ethernet eth0 {
        address "172.20.20.18/24"
        address "3fff:172:20:20::2/64"
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
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0xIGxhYiBDQTAeFw0yNTEwMjYxNjA2MDdaFw0yNjEwMjYxNjA2MDdaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDgucGFjNC0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQD9TWdSeJH6cCv4G4RgVXC8Ar4JRhmrdCKTMgoUVV7DbV6i8GbUPaHsXrPPktIBb9OfRyTF7oyi5qQSoiGdY1J8nkR/U5Z/xPXHhFlBAq/l6rwJecEH6VTc6LVkZHU9ZBcnDajmK6beY1HAovKbey93Y1Pmx1QWlFP0N1GtF6JUBf7EyW7r/zadHhhkEIaMA/nzBS9S6c7NjVkCZ4bgU3Dh8SvLl1xRub5rkW1qw8XPre3S7tzypfD2LzuHe2tKT9PSWau5or83czqTcxp9JnceKEYAy0kajAuuh9Tl9sry6g5zpP562YFaaMARBvAGK6qXs/8EDDBjJlDVw/Ssx+VBAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUEy+0lJhfEVfc8Fz8dSVChHH6MXYwRwYDVR0RBEAwPoIGdnlvczA4ghdjbGFiLXBhYzQtMjAyNS0xLXZ5b3MwOIIVdnlvczA4LnBhYzQtMjAyNS0xLmlvhwSsFBQSMA0GCSqGSIb3DQEBCwUAA4IBAQCvUNZh8xEf++rJr+ukwRDV5yGrZcd7M5H6KELpXHLxyEbXhOUNxVEdB4iRSgKbsrXqqfY114ZtLZ5t/GmX7stAflpZnX+363G+YeUwRadGkMRToU3Wvn0N/2vGj8w/kHLTCvO56dErp4uUHNsUnSY4aE5WeL7+0847gr7gIihUFSTHwkLd3wfk1FG/yWA6zSjkThtriDBVdvon6spNCLoTgc33LFjRfDIQfQf4XjVnCjwKMxO4Wj/WdlffpA7spsCISzQUuZnaxauTaR8phl5KOvcQzbFfnF3CqTHTkvj4i5CIY+tu6AxNvubfwY+POwrtPWKiT89BWwVmrQCPPo7t"
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQD9TWdSeJH6cCv4G4RgVXC8Ar4JRhmrdCKTMgoUVV7DbV6i8GbUPaHsXrPPktIBb9OfRyTF7oyi5qQSoiGdY1J8nkR/U5Z/xPXHhFlBAq/l6rwJecEH6VTc6LVkZHU9ZBcnDajmK6beY1HAovKbey93Y1Pmx1QWlFP0N1GtF6JUBf7EyW7r/zadHhhkEIaMA/nzBS9S6c7NjVkCZ4bgU3Dh8SvLl1xRub5rkW1qw8XPre3S7tzypfD2LzuHe2tKT9PSWau5or83czqTcxp9JnceKEYAy0kajAuuh9Tl9sry6g5zpP562YFaaMARBvAGK6qXs/8EDDBjJlDVw/Ssx+VBAgMBAAECggEAGF52/z8sRBzAjikPjjkKFHxrDfdZht4waVraD2S7Li/6d9CLBAY96sCdqe2lGJBKmrs8dXJiw1VPGZ/RfhPNHsIXMuy2wOoQ/zXjZFa+127C0mKNSJaRHIOi19q2UMatV4t/4Uz3y9NgTRkgIAc05NaAfuZUV6vDe+5KhE2Ox2hvP9sSHiXuxXMCWuF6BiQiJQ5gLZjix+CRxP6ui6btudI2ob+aft4oo9TKIx9ZYpA3jT+nAKrQxQwHgi73dZtIfO+nWrnLyWYIO8sfhq0iMIZSaiC5BSsvQQ7mU/lKaZV0b3uV7BkbLhN70NCkBb508nA+pvbnChYBW7vODIFxRQKBgQD+qQ/x9y/Am33POWeBW5Ub6/gIlPTPzLSOSitSSI/unaRh3YmG7R4gww49k75fqdbPPrwjnOZ9/cOAbR9Wyw2snIkKy8xGsZml9EQsmuyjDR0AtWLu2elXxnlpgBT8dOE9mzJjBj3unhdmlXkBLXij4fQ7x+vW+RY2jc8gvpwoBwKBgQD+ooM0EMiaNVzkre+CqsM6ZBd0dOkAwkOM+wyEFFBDV8BI+i9HwGyy+Z6DhpFBM/ITMPT1AghQLfF+g93mwVRW3m6kfJc7STzJslVTj5z8UVaCi7d7L4iT+57eRKTYpeljduDoiEIdOVjdjROFwEcTgQn7DhnaSaj+j16wGy3mdwKBgQCLGiHhk5n75XNlO//zwujB5bUISwUmdLSzfIQJYCVuu6FM68vxbZglYSZoMEmuy4DQl34BHfUxIOonPnP93tBLVv3sbcHZY61/3ttWWhGkRsdu2aV+vn0dOwaawCG2fMmD80AkowY1TxmNKVx9bi8VpZjZBq0mMc0WY4OeaT+3BQKBgEEBhhNVsZDEzMlIqlumcp7GjMJbUlyyO4KTWNejQ/ZdQaaf0FA2DMoINfKH+S83Lra9idu+wBaQFBXjXlQZyQlAUejGMemdwdoQH/5sLHyx2y8KsjXNpcV5uE4wIhF5EcMlxzc2CgLh8BDngjNkKgENsVmZePokUfNi8J5u4eHzAoGAVjFJLa9JjoXV9zUDYZmJpF3yUtE9Q/NY63T8vRL60x41iJfwrJvqdsyEkSqkFQe0dtebyowJ75iL27hwR3vLUlJdblRnI9ZHxSmUo2oHuSzwnbCIt/CuJNnyCJ+wkz5ooOEzhcqc4BV/xZsC4dd0LM3jmCmL14FQCM6At8XrKk8="
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
    host-name "vyos08"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$WS.7pf//bAYOk1X3$k9EX1DrDxhFSNz144cTrrOR2raJv3fgKPD3kmp.1d4lB.kHZqLpfkaBiecRsIagHmuvHBHfS7eOMbSoZ02Vi//"
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
