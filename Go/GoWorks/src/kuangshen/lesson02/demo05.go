package main

import "fmt"

func main() {
	score := 60

	switch score {
	case 90, 50:
		fmt.Println("A")
	}
}
