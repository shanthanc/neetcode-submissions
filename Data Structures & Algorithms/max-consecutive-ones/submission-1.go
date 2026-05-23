func findMaxConsecutiveOnes(nums []int) int {
    maxTotal := 0
    currTotal := 0
    for index := range len(nums) {
        curr := nums[index]
        if curr == 1 {
            currTotal++
        } else {
            currTotal = 0
        }
        if maxTotal < currTotal {
           maxTotal = currTotal
        }
    }
    return maxTotal
}