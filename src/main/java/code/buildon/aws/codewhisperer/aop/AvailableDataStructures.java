package code.buildon.aws.codewhisperer.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

import code.buildon.aws.codewhisperer.adt.Array;
import code.buildon.aws.codewhisperer.adt.BinarySearchTree;
import code.buildon.aws.codewhisperer.adt.HashTable;
import code.buildon.aws.codewhisperer.adt.LinkedList;
import code.buildon.aws.codewhisperer.adt.Matrix;
import code.buildon.aws.codewhisperer.adt.Queue;
import code.buildon.aws.codewhisperer.adt.Stack;

public abstract class AvailableDataStructures implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired protected Array array;
    @Autowired protected Matrix matrix;
    @Autowired protected LinkedList linkedList;
    @Autowired protected Stack stack;
    @Autowired protected Queue queue;
    @Autowired protected HashTable hashTable;
    @Autowired protected BinarySearchTree bst;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        checkPerformance();
    }

    public abstract void checkPerformance();
    
}
