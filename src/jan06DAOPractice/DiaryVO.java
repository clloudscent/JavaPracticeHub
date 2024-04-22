package jan06DAOPractice;

public class DiaryVO {
    private String id;
    private String title;
    private String content;
    private String createdDate;
    private String updatedDate;
    private String writer;



    public DiaryVO(){

    }

    public DiaryVO(String id, String title, String content, String createdDate, String updatedDate, String writer){
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
        this.updatedDate = updatedDate;
        this.writer = writer;
    }

    public DiaryVO(String title, String content, String today, String inputId) {
        this.title = title;
        this.content =content;
        this.createdDate = today;
        this.updatedDate = today;
        this.writer = inputId;
    }
/*
    public static DiaryVO makeDiaryVOToUpdate(String updateInputId, String updateTitle, String updateContent, String updatedDate){
        DiaryVO diaryVOToUpdate = new DiaryVO(updateInputId, updateTitle, updateContent);
        diaryVOToUpdate.setUpdatedDate(updatedDate);
        return diaryVOToUpdate;
    }*/

    public DiaryVO(String updateInputId, String updateTitle, String updateContent) {
        this.id = updateInputId;
        this.title = updateTitle;
        this.content =updateContent;
    }

    public String getId(){return id;}
    public String getTitle(){return title;}
    public String getContent(){return content;}
    public String getCreatedDate(){return createdDate;}
    public String getUpdatedDate(){return updatedDate;}
    public String getWriter(){return writer;}


    public void setId(String id){this.id = id;}
    public void setTitle(String title){this.title = title;}
    public void setContent(String content){this.content = content;}
    public void setCreatedDate(String createdDate){this.createdDate = createdDate;}
    public void setUpdatedDate(String updatedDate){this.updatedDate = updatedDate;}
    public void setWriter(String writer){this.writer = writer;}
}
