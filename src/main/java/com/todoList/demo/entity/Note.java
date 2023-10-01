package com.todoList.demo.entity;import lombok.Data;import javax.persistence.*;import javax.validation.constraints.Pattern;import java.time.LocalDate;import java.time.LocalDateTime;import java.util.Date;@Entitypublic class Note {    @Id    @GeneratedValue(strategy = GenerationType.IDENTITY)    private Long id;    private String title;    @Column(columnDefinition="text",length = 500)    @Pattern(regexp = "^[A-Za-z@,;&*+-]+$", message = "Invalid input pattern")    private String content;    private LocalDateTime createdDate;    @ManyToOne//    @JoinColumn(name = "user_id")    private Employee user;    @Transient    private int employeeId;    public Note() {    }    public Note(Long id, String title, String content, LocalDateTime createdDate, Employee user, int employeeId) {        this.id = id;        this.title = title;        this.content = content;        this.createdDate = createdDate;        this.user = user;        this.employeeId = employeeId;    }    public Long getId() {        return id;    }    public void setId(Long id) {        this.id = id;    }    public String getTitle() {        return title;    }    public void setTitle(String title) {        this.title = title;    }    public String getContent() {        return content;    }    public void setContent(String content) {        this.content = content;    }    public LocalDateTime getCreatedDate() {        return createdDate;    }    public void setCreatedDate(LocalDateTime createdDate) {        this.createdDate = createdDate;    }    public Employee getUser() {        return user;    }    public void setUser(Employee user) {        this.user = user;    }    public int getEmployeeId() {        return employeeId;    }    public void setEmployeeId(int employeeId) {        this.employeeId = employeeId;    }}