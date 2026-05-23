// since the solution is NOT in place iterating from the end
// makes it easier to update values in the new resultant array
func replaceElements(arr []int) []int {
	n := len(arr)
	res := make([]int, n)
	currMax := -1
	for i := n - 1; i >= 0; i-- {
		res[i] = currMax
		if arr[i] > currMax {
			currMax = arr[i]
		}
	}
	return res
} 
