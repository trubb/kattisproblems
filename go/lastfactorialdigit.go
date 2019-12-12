package main

import "fmt"

func main() {
    var t, n int
    fmt.Scanln( &t )

    for i := 0; i < t; i++ {
        
        fmt.Scanln( &n )
        // cant initialize arrays in go with input values, use slice
        nFactorial := make([]int, n)
        for j := 0; j < n; j++ {
            nFactorial[j] = j+1
        }

        answer := 1
        for k := 0; k < n; k++ {
            answer *= nFactorial[k];
        }

        answer %= 10
        fmt.Println(answer)
    }
}
