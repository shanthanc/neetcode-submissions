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
    }
    
    public void visit(String url) {
        Page newPage = new Page(url);
        current.next = newPage;
        newPage.prev = current;
        current = newPage;
    }
    
    public String back(int steps) {
        while(steps > 0 && current.prev != null) {
            current = current.prev;
            steps--;
        }
        return current.name;
    }
    
    public String forward(int steps) {
        while(steps > 0 && current.next != null) {
            current = current.next;
            steps--;
        }
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