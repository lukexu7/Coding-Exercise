package main

import "fmt"

func main() {

	arr := [5]int{1, 3, 2, 4, 6}

	for i := 0; i < len(arr); i++ {

		for j := 0; j < i; j++ {
			if arr[i] < arr[j] {
				arr[j], arr[i] = arr[i], arr[j]
			}
		}

	}

	fmt.Println(arr)

}

func dubbleSort(arr [...]int) {

	for i := 1; i < len(arr); i++ {
		for j := 0; j < len(arr)-i; j++ {

			if arr[j] > arr[j+1] {

				arr[j], arr[j+1] = arr[j+1], arr[j]
			}

		}

	}

}
