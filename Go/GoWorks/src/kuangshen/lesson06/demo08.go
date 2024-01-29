package main

import "fmt"

func main() {

	s1 := []int{1, 2, 3, 4}
	s2 := make([]int, 0)

	//for
	for i := 0; i < len(s1); i++ {

		s2 = append(s2, s1[i])

	}

	fmt.Println(s1)
	fmt.Println(s2)

	//copy

	s3 := []int{5, 6, 7}
	fmt.Println(s2)
	fmt.Println(s3)

	copy(s3, s2)
	fmt.Println(s2)
	fmt.Println(s3)

}
