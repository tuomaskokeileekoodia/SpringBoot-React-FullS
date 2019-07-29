package com.in28minutes.fullstack.springboot.maven.crud.springbootfullstackcrudfullstackwithmaven.course;

import java.util.Objects;

public class Course {

    private Long id;
    private String username;
    private String description;

    public Course() {
    }

    public Course(long id, String username, String description) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id.equals(course.id) &&
                username.equals(course.username) &&
                description.equals(course.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, description);
    }
}
