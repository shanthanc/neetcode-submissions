func hasDuplicate(nums []int) bool {
    n := len(nums)
    dupMap := make(map[int]int)
    for i := 0; i < n; i++ {
        _, exists := dupMap[nums[i]]
        if exists {
            return true
        } else {
            dupMap[nums[i]] = 1
        }
    }
    return false;
}
