package main

import "fmt"

func main() {

	fmt.Println(getSum(1, 2, 3, 3, 4))
}

func getSum(nums ...int) int {

	var sum int
	for i := 0; i < len(nums); i++ {

		sum += nums[i]

	}

	return sum

}
