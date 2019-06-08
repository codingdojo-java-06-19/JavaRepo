class Project{
    private String name;
    private String description;

    public String elevatorPitch(){
        return name + ": " + description;
    }

    public Project(){

    }

    public Project(String name){
        this.name = name;
    }

    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public void setName(String projectName){
        name = projectName;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String projectDescription){
        description = projectDescription;
    }
}