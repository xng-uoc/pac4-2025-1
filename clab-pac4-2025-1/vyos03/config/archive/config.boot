interfaces {
    ethernet eth0 {
        address "172.20.20.13/24"
        address "3fff:172:20:20::8/64"
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
        certificate "MIID2jCCAsKgAwIBAgICBnowDQYJKoZIhvcNAQELBQAwVzELMAkGA1UEBhMCVVMxCTAHBgNVBAcTADEVMBMGA1UEChMMY29udGFpbmVybGFiMQkwBwYDVQQLEwAxGzAZBgNVBAMTEnBhYzQtMjAyNS0xIGxhYiBDQTAeFw0yNTEwMjYxNjA2MDdaFw0yNjEwMjYxNjA2MDdaMFoxCzAJBgNVBAYTAlVTMQkwBwYDVQQHEwAxFTATBgNVBAoTDGNvbnRhaW5lcmxhYjEJMAcGA1UECxMAMR4wHAYDVQQDExV2eW9zMDMucGFjNC0yMDI1LTEuaW8wggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQDJOjA46ZH88hI8OtymibNeXMy+lmutKRAq6xgm+3qy6AoT9ZeBNzbU884OpTr4SGPm5/vASR24s+XqwPFazRWmU1xCGJNEc7RXQaqSTbViUBpKyMBQvWggIzyal6o5l/6YHNySVWv/DcnF6eZILOGbVzbghtfThcpjC6O9f/D9N39pkx2X5F6cXay0k3ZR+J7MclPZl0xg+tTeUit+D7jchXGkboCnIXWiq7YE6xt2e8EX5sUf0cgEJHU5wk3sY3Wg0C3yU/IwQ8ket0P7+UTMbusQHbreyyu50OXVdT8SjhHG9kcci9I1Sy8CPZdSCd+Fwc+KbxK1tdyCTzH3b7MbAgMBAAGjgawwgakwDgYDVR0PAQH/BAQDAgWgMB0GA1UdJQQWMBQGCCsGAQUFBwMCBggrBgEFBQcDATAOBgNVHQ4EBwQFAQIDBAYwHwYDVR0jBBgwFoAUEy+0lJhfEVfc8Fz8dSVChHH6MXYwRwYDVR0RBEAwPoIGdnlvczAzghdjbGFiLXBhYzQtMjAyNS0xLXZ5b3MwM4IVdnlvczAzLnBhYzQtMjAyNS0xLmlvhwSsFBQNMA0GCSqGSIb3DQEBCwUAA4IBAQC+K1OahJyAE403quzLvu33zY331WL6vINUUKGE7m4/ThUVmsuIy+aFq+FXdltCMD/kKCFTjHuwQc6I8RvYKrOSbbW172TFwSQOKZiNpU/L1YN2RJOhLOgrwUwwZ740K85DM89jN97qsiVprSRgLauc9b5KHeJvZY0WoYfXVBCIom2Py2fFfD0wQ7szudBHmdkE/z0/TCWyLB3KH6aNMN8aU2iG2vENDccZI5IYS/CS1LTyOeKN0Bpx49wjMrC8KsG6EmVRPSWw7O9A0gjaW8ToOoSA0iTTlz8VyGcYba/IPlel9G2CpLCPwHlq/lpv5CbHR8/upPiVRlYj0Tv2T6Pm"
        private {
            key "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDJOjA46ZH88hI8OtymibNeXMy+lmutKRAq6xgm+3qy6AoT9ZeBNzbU884OpTr4SGPm5/vASR24s+XqwPFazRWmU1xCGJNEc7RXQaqSTbViUBpKyMBQvWggIzyal6o5l/6YHNySVWv/DcnF6eZILOGbVzbghtfThcpjC6O9f/D9N39pkx2X5F6cXay0k3ZR+J7MclPZl0xg+tTeUit+D7jchXGkboCnIXWiq7YE6xt2e8EX5sUf0cgEJHU5wk3sY3Wg0C3yU/IwQ8ket0P7+UTMbusQHbreyyu50OXVdT8SjhHG9kcci9I1Sy8CPZdSCd+Fwc+KbxK1tdyCTzH3b7MbAgMBAAECggEAGR+1Pp3W9txob3Gv8/EUXo86lv8j4YJTfPBOWyuh1a2H+Jb8vArfQzZPf1+c3bv4ES/crFTUq6d2aNl/KOWbMuGMjsoPtQe3N//AYrTmFSjIJ5cp/8quMfkES47tF3TFOku8NF8K9VTM4PODp3ZHEsSQWvcrAkNdkgE1h+bt+UdYPn9qwqKaFNTdcyfEHgDp7mnlG/xTpoL9oxSmJ8yMNghUSu5ZXtEm60SZX7Rfm4mKsbYvAor59dAEwbizbSHTZkPdogiNQsFPFrWLl7y3umHSjEdeyj5dqZ6Hs9sfhG9vQarsBRYXOL+vtpfjzD2ujn0UrIfjXD/U3XG7iDtGHQKBgQD1I9qaUvOfnjGGU6tEef6gKLm3pXKjSZz0VE8wn8zktzfh7G6sm2K/5dCrVhux1HiDiPsNf9+OoL9iLk+ul4k1X7oX4g95Sneye6r1Sp+u8ofZw47VUNxGvPTnM3fYjzNhYEKxttavJ9dO2TMRgRrN3zUc/mipMozWjyFYjUwY1QKBgQDSJFFOkOBkZ8/wwNLxWqyMKx4yLZ88ZGOdDWey4U4badGUT0ea8Xa6eudRMVAtXNWCIUAi6fxQW+cFEWC41cKA85DzWsUcu/sd2QtD9+gMbE4gdD9VYjiro/QPM9IWqy7l3cGAB0w5cWJHPWe+XKy3knGhNfxfZw8lWkuudayULwKBgDFG8cyP3DU74Yy1CPqM42hih2KpOXAlfg2HXRvTI6beRbd+hYjg+2rD0bx/ZLXMliUqxfyitde/7HjaAl6AS66U/Z2LbbzeAU25mlYQmCTcz/4wV2f+BymZFknbiL3Zm2R5qy56KJGxGpDZDHD6WN8FfXHEmllYtgLzZqqcTK25AoGBALZMBTDH47GWkUBEtnnj9C3AtfhHtYy5deTnnR8D7zM+0C39vJuAf0P0nLjFs802bI3v9GiVXWoE39t4oNSXs50ULpm+E6MCvCy/fdNfuzETv47N6adTht/3YiDSDp3VsOB+SH+dVRW788rjTR1J3hd99g8o+x90EyKPO3pD4QvHAoGAKHEqVuj9J6OHZKulQM8t0Ok04n9ql0bUOiwlZgw+Wd/kaPuy0TxAPYm1sL/kXkxCPMKkvRIwmihfRKe60ihgf05pMQeHKXOul6wLnmv+VPhcmNb7rqENqXpwJG574uCVf8RoGH8bSEscJKvsRzg891JRDc37jvZ64cDtILbsGLQ="
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
    host-name "vyos03"
    login {
        user admin {
            authentication {
                encrypted-password "$6$rounds=656000$zDnpj/vU0Fw1VDno$34s/xwQoGOvAmftDk.XDawUG/29M6Ke.l9AlBFx03V79TV4sYIxKdKnyjcNXTFJjgSqyhCZOfAqL5QjGMmvY//"
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
