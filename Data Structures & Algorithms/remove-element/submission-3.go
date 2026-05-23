func removeElement(nums []int, val int) int {
    k := 0

    for i,_ := range(nums) {
        if nums[i] != val {
            nums[k] = nums[i]
            k++
        }
    }
    return k
}
