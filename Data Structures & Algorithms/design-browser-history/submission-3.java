class Page {
    String name;
    Page prev;
    Page next;

    public Page(String pageName) {
        this.name = pageName;
        this.prev = null;
        this.next = null;
    }
}

class BrowserHistory {

    private Page current;

    public BrowserHistory(String homepage) {
        current = new Page(homepage);
        current.next = null;
        current.prev = null;
    }
    
    public void visit(String url) {
        Page newPage = new Page(url);
        current.next = newPage;
        newPage.prev = current;
        current = newPage;
    }
    
    public String back(int steps) {
        if (steps < 0) return null;
        Page curr = current;
        int i = 0;
        while(i < steps && curr.prev != null) {
            curr = curr.prev;
            i++;
        }
        current = curr;
        return current.name;
    }
    
    public String forward(int steps) {
        if (steps < 0) return null;
        Page curr = current;
        int i = 0;
        while(i < steps && curr.next != null) {
            curr = curr.next;
            i++;
        }
        current = curr;
        return current.name;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */