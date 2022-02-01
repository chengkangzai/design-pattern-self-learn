package com.company;

/**
 * This class call as Originator
 */
public class Editor {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void restore(EditorState state) {
        this.content = state.getContent();
    }

    public EditorState getState() {
        return new EditorState(content);
    }
}
