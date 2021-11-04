public class Main {

    static String[] tasks = new String[10];
    static String[] projects = new String[10];
    static String[] changeLog = new String[10];

    static int tasksCount = 0;
    static int projectsCount = 0;
    static int changeLogCount = 0;

    public static void displayMenu(){
        System.out.println("1.Stwórz nowe zadanie");
        System.out.println("2.Usuń zadanie");
        System.out.println("3.Stwórz nowy projekt");
        System.out.println("4.Usuń projekt");
        System.out.println("5.Wyświetl wszystkie zadania");
        System.out.println("6.Wyświetl wszystkie projekty");
        System.out.println("7.Wyświetl zmiany");
        System.out.println("0.Wyjdz");
    }

    public static void addTask(String task){
        boolean hasPlaceForNewTask = tasksCount < tasks.length;
        if (hasPlaceForNewTask){
            tasks[tasksCount] = task;
            tasksCount++;
            System.out.println("Dodano nowe zadanie " + task);
        }else {
            System.out.println("Nie udało się dodać " + task);
        }
    }

    public static void removeTask(int indexTask){
        boolean isTaskExist = indexTask < tasksCount;
        if (isTaskExist){
            for (int i = indexTask; i < tasksCount - 1; i++){
                tasks[i] = tasks[i + 1];
            }
            tasksCount--;
        }
    }



    public static void addProject(String project){
        boolean hasPlaceForNewProject = projectsCount < projects.length;
        if (hasPlaceForNewProject){
            projects[projectsCount] = project;
            projectsCount++;
            System.out.println("Dodano nowy projekt " + project);
        }else {
            System.out.println("Nie udało się dodać " + project);
        }
    }
    public static void removeProject(int indexProject){
        boolean isProjectExist = indexProject < projectsCount;
        if (isProjectExist){
            for (int i = indexProject; i < projectsCount - 1; i++){
                projects[i] = projects[i + 1];
            }
            projectsCount--;
        }
    }





    public static void main(String[] args) {

    }
}
