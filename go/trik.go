package main

import (
	"fmt"
	"strings"
)

func main() {
	var pos = 1
	var moves string
	fmt.Scanln( &moves )
	movesarr := strings.Split( strings.ToLower( moves ), "" )

	for i := 0; i < len( movesarr ); i++ {
		if pos == 1 {
			if strings.Compare( movesarr[i], "a" ) == 0 {
				pos = 2
			} else if strings.Compare( movesarr[i], "c" ) == 0 {
				pos = 3
			}
		} else if pos == 2 {
			if strings.Compare( movesarr[i], "a" ) == 0 {
				pos = 1
			} else if strings.Compare( movesarr[i], "b" ) == 0 {
				pos = 3
			}
		} else if pos == 3 {
			if strings.Compare( movesarr[i], "b" ) == 0 {
				pos = 2
			} else if strings.Compare( movesarr[i], "c" ) == 0{
				pos = 1
			}
		}
	}
	fmt.Println( pos )
}
