package main

import "fmt"

func main() {

	for i := 1; i <= 6; i++ {

		for j := 1; j <= 6-i; j++ {

			fmt.Print(" ")

		}

		for k := 1; k <= 2*i-1; k++ {
			fmt.Print("*")
		}

		fmt.Println()

	}

	for i := 5; i >= 1; i-- {

		for j := 1; j <= 6-i; j++ {
			fmt.Print(" ")
		}

		for k := 1; k <= 2*i-1; k++ {
			fmt.Print("*")
		}

		fmt.Println()

	}

}
