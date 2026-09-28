class Page {
    String name;
    Page prev;
    Page next;
    public Page() {
        this.name = null;
        this.prev = null;
        this.next = null;
    }
    public Page(String pageName) {
        this.name = pageName;
        this.prev = null;
        this.next = null;
    }
}

class BrowserHistory {

    private Page home;
    private Page current;
    private int n;

    public BrowserHistory(String homepage) {
        home = new Page(homepage);
        home.next = null;
        home.prev = null;
        current = home;
        n = 1;
    }
    
    public void visit(String url) {
        Page newPage = new Page(url);
        if (home == null) {
            home = newPage;
            home.prev = null;
            home.next = null;
            current = home;
            n = 1;
            return;
        }
        current.next = newPage;
        newPage.prev = current;
        current = newPage;
        n++;
    }
    
    public String back(int steps) {
        if (steps < 0 || home == null) return null;
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
        if (steps < 0 || home == null) return null;
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