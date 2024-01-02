package main

import "fmt"

func main() {

	f("1l")
	fmt.Println("2")

	defer f("3")

	f("4")

	defer f("5")
	defer f("6")
	fmt.Println("7")
	f("8")
	defer f("9")

}

func f(s string) {

	fmt.Println(s)
}
