package main

import "fmt"

func main() {

	r1, r2 := fun1(2, 4)
	fmt.Println(r1, r2)

}

func fun1(len, wid float64) (zc float64, area float64) {

	area = len * wid

	zc = (len + wid) * 2

	return area, zc
}
