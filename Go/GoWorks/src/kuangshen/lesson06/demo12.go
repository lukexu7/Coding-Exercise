package main

import "fmt"

/*
遍历map
——key value
-
*/
func main() {

	map1 := map[string]int{"Go": 100, "Java": 99, "C": 90}

	for s, i := range map1 {
		fmt.Println(s, i)

	}

}
