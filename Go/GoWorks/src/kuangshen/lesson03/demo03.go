package main

func main() {

	a, b := swap("haha", "hihi")
	println(a)
	println(b)
}

func swap(x, y string) (string, string) {
	return y, x
}
