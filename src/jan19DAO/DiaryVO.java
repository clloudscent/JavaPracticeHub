package jan19DAO;

public class DiaryVO {
    private String id;
    private String title;
    private String content;
    private String createDate;
    private String updatedDate;
    private String writer;

    public DiaryVO(String id, String title, String content, String createDate, String updatedDate, String writer){
        this.id = id;
        this.title = title;
        this.content = content;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
        this.writer = writer;
    }

    public DiaryVO() {

    }


    public DiaryVO(String updateInputId, String updateTitle, String updateContent) {
        this.id = updateInputId;
        this.title = updateTitle;
        this.content =updateContent;
    }

    public DiaryVO(String title, String content, String today, String inputId) {
        this.title = title;
        this.content = content;
        this.createDate = today;
        this.updatedDate = today;
        this.writer = inputId;
    }

    public DiaryVO(String today) {
        this.updatedDate = today;
    }

    public String getId(){return id;}
    public String getTitle(){return title;}
    public String getContent(){return content;}
    public String getCreateDate(){return createDate;}
    public String getUpdatedDate(){return updatedDate;}
    public String getWriter(){return writer;}


    public void setId(String id){this.id = id;}
    public void setTitle(String title){this.title = title;}
    public void setContent(String content){this.content = content;}
    public void setCreateDate(String createDate){this.createDate = createDate;}
    public void setUpdatedDate(String updatedDate){this.updatedDate = updatedDate;}
    public void setWriter(String writer){this.writer = writer;}
}
