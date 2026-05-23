func isAnagram(s string, t string) bool {
    slen := len(s)
    tlen := len(t)
    
    if slen != tlen {
        return false
    }

    sset := make(map[rune]int)
    tset := make(map[rune]int)

    for _, r := range s {
        val, exists := sset[r]
        
        if exists {
            sset[r] = val + 1
        } else {
            sset[r] = 1
        }
    }

    for _, r := range t {
        val ,exists := tset[r]

        if exists {
            tset[r] = val + 1
        } else {
            tset[r] = 1
        }
    }

    for _, r := range s {
        sval, existss := sset[r]
        tval, existst := tset[r]

        if existss && existst {
            if sval != tval {
                return false
            } 
        } else {
            return false
        }
    }
    return true; 
}