package main

import "fmt"
import "strings"

func main() {
    var n int
    var str1, str2 string
    fmt.Scanln( &n )

    for i := 0; i < n; i++ {
        fmt.Scan( &str1, &str2 )
        fmt.Println(str1 + "\n" + str2)
        stra1 := strings.Split(str1,"")
        stra2 := strings.Split(str2,"")

        for j := 0; j < len(stra1); j++ {
            if strings.Compare( stra1[j], stra2[j] ) == 0 {
                fmt.Print(".")
            } else if strings.Compare( stra1[j], stra2[j] ) != 0 {
                fmt.Print("*")
            }
        }
        fmt.Println()
    }
}
