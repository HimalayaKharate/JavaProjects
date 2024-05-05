package application;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Task implements Serializable {
    private int id;
    private String Description;
    private String Title;
    private final LocalDateTime dateTime;
    private Boolean isDone;

    private Boolean IsUpdated = false;
    private LocalDateTime updateDateTime;

    public Task(int id, String description, String title) {
        this.id = id;
        Description = description;
        Title = title;
        dateTime = LocalDateTime.now();
        isDone = false;
    }

    public void displayTask(){
        System.out.println(this);
    }

    public void setDone(){
        isDone = true;
    }

    public void UpdateTask(String title, String description){
        IsUpdated = true;
        this.Title = title;
        this.Description = description;
        this.isDone = false;
        this.updateDateTime = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return
        """
                Title : %s
                Description : %s
                DateTime : %ta %te, %tY %tT %tp
                isDone : %s""".formatted(Title, Description, dateTime, dateTime,dateTime, dateTime, dateTime, isDone) +
                (this.IsUpdated ? "%nUpdate Time : %ta %te, %tY %tT %tp".formatted(updateDateTime,updateDateTime,updateDateTime,updateDateTime,updateDateTime):"");
    }

    public String getTitle() {
        return Title;
    }

    public int getId() {
        return id;
    }
}
