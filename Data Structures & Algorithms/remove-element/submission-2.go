func removeElement(nums []int, val int) int {
    k := 0

    for i, value := range(nums) {
        if value != val {
            nums[k] = nums[i]
            k++
        }
    }
    return k
}
