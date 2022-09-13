package com.halo.code.design.memento;

import java.util.Stack;

/**
 * 备忘录管理角色
 */
public class DraftsBox {

    private final Stack<ArticleMemento> STACK = new Stack<ArticleMemento>();

    public ArticleMemento getMemento() {
        ArticleMemento articleMemento = STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento) {
        STACK.push(articleMemento);
    }
}
