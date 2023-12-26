package main

import "fmt"

func main() {

	score := 60

	if score >= 90 && score <= 100 {
		fmt.Println("A")
	} else if score < 90 && score >= 80 {
		fmt.Println("B")
	}

}
