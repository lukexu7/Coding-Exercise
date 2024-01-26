package main

import "fmt"

func main() {

	s1 := make([]int, 0, 5)
	fmt.Println(s1)

	s1 = append(s1, 1, 2, 3, 4, 5, 6)
	fmt.Println(s1)

	s2 := []int{100, 200, 300, 400}

	s1 = append(s1, s2...)
	fmt.Println(s1)

}
