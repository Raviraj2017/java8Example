class Employee {
    int eno;
    String ename;
    Employee(int eno, String ename){
        this.eno= eno;
        this.ename = ename;
    }
    /**
     * @return the ename
     */
    public String getEname() {
        return ename;
    }
    /**
     * @param ename the ename to set
     */
    public void setEname(String ename) {
        this.ename = ename;
    }
    /**
     * @return the eno
     */
    public int getEno() {
        return eno;
    }
    /**
     * @param eno the eno to set
     */
    public void setEno(int eno) {
        this.eno = eno;
    }
    public String toString(){
        return eno+":" + ename;
    }
}