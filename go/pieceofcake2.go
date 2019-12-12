package main

import "fmt"

func main() {
    var len, hor, ver, vol int64
    fmt.Scanln( &len, &hor, &ver )
    
    vol = Max(hor, len-hor) * Max(ver, len-ver) * 4
    fmt.Println(vol)
}

// returns the larger of two ints
func Max(x, y int64) int64 {
    if x < y {
        return y
    } else {
        return x
    }
}
