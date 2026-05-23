func findMaxConsecutiveOnes(nums []int) int {
	n := len(nums)
    maxTotal := 0
    total := 0
    for i := 0 ; i < n; i++ {
        if nums[i] == 1 {
            total = total + 1
            maxTotal = max(maxTotal, total)
        } else {
            total = 0 
        } 
    }
    return maxTotal
}