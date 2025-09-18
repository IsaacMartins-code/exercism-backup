class Badge {
    public String print(Integer id, String name, String department) {
        
        StringBuilder badge = new StringBuilder();
        
        badge.append(id == null ? "" : "[" + id + "] - ")
            .append(name)
            .append(" - ")
            .append(department == null ? "OWNER" : department.toUpperCase());
        
        return badge.toString();
    }
}
