package com.example.java26.conversation;

import java.util.ArrayList;
import java.util.List;

public class Comment {
//    private int conversationID;
//    private int commentId;
//    private int parentCommentId;
    private final String author;
    private final String text;
    //private Comment reply;
private List<Comment> comments = new ArrayList<>();


    public Comment(String author, String text) {
        this.author = author;
        this.text = text;
    }
    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public void addReply(Comment reply) {
        comments.add(reply);
    }

    public void printThread(String indentation) {
        IO.println(indentation + author + ": " + text);
        for (Comment comment : comments) {
            comment.printThread(indentation + "   ");
        }
    }

//    public void setReply(Comment reply) {
//        if (reply == this)
//            throw new IllegalArgumentException("You can't reply to this!");
//        this.reply = reply;
//    }

    static void main(){
        Comment firstComment = new Comment("John Doe", "Vad tycker du om java?");

        Comment reply1 = new Comment("Bob", "Jag gillar det");
        Comment reply2 = new Comment("Charlie", "Jag gillar det också");

        reply1.addReply(reply2);

        firstComment.addReply(reply1);
        firstComment.addReply(reply2);

        firstComment.printThread("");
    }

}
