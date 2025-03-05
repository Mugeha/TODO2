package models;

import io.ebean.Finder;
import io.ebean.Model;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="tasks")
public class Task extends Model {
    @Id
    public Long id;

    public String title;

    public String note;

    public Date reminder;

    public static final Finder<Long, Task> find = new Finder<>(Task.class);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getReminder() {
        return reminder;
    }

    public void setReminder(Date reminder) {
        this.reminder = reminder;
    }
}