# Learning Data Structures with Amazon CodeWhisperer

Learning data structures can be a daunting task, especially if you are on the hook for that coding interview for your dream company. A way to learn things faster is by decoupling concepts from implementation. This means spending more time understanding the fundamentals of the data structure and its accompanying algorithms, and less time on how to implement code for its data and operations.

This is where development companion tools based on Generative AI can be useful. By using tools like [Amazon CodeWhisperer](https://docs.aws.amazon.com/codewhisperer/latest/userguide/what-is-cwspr.html) while you are learning data structures, you can move faster from concepts to testing without spending much time with coding.

This repository contains the code generated by Amazon CodeWhisperer when [this video series](https://www.youtube.com/playlist?list=PL5bUlblGfe0IOZEW8KBAzc1bCW8UcarAD) was developed. The series focuses on the following data structures: [Arrays](https://en.wikipedia.org/wiki/Array_(data_structure)), [Matrix](https://en.wikipedia.org/wiki/Matrix_(mathematics)), [Stack](https://en.wikipedia.org/wiki/Stack_(abstract_data_type)), [Queue](https://en.wikipedia.org/wiki/Queue_(abstract_data_type)), [Linked List](https://en.wikipedia.org/wiki/Linked_list), [HashTable](https://en.wikipedia.org/wiki/Hash_table), and [Binary Search Tree](https://en.wikipedia.org/wiki/Binary_search_tree).

💡 If you want to learn how this code was built using Amazon CodeWhisperer, you can watch the YouTube series below.

[![Learning Data Structures with Amazon CodeWhisperer](images/yt-series-thumbnail.png)](https://www.youtube.com/watch?v=oAciet0gDvs&list=PL5bUlblGfe0IOZEW8KBAzc1bCW8UcarAD&index=1)

## ⏰ Checking the performance of operations

This repository provides you with a framework to measure the performance of the methods available in the data structures. This may be useful if you want to compare different implementations of algorithms—such as measuring whether the [Merge Sort](https://en.wikipedia.org/wiki/Merge_sort) is faster than the [Bubble Sort](https://en.wikipedia.org/wiki/Bubble_sort).

To use this framework, you must decorate the method of your data structure with the annotation `@TrackExecutionTime`. For example, if you have a method called `enqueue()` you should implement this method this way:

```java
@TrackExecutionTime
public void enqueue() {
   // Ask Amazon CodeWhisperer to
   // generate the code for you.
}
```

Once you have all methods properly annotated, go to the class [PerformanceChecker.java](./src/main/java/code/buildon/aws/codewhisperer/PerformanceChecker.java) and write your test code in the method checkPerformance. Then, execute the project as usual. This project uses automatic code instrumentation and detects when you have used the annotation.

```java
public void checkPerformance() {

   queue.initializeQueueWithData();

   queue.enqueue("String 1");
   queue.enqueue("String 2");
   queue.enqueue("String 3");
   
   String str = queue.dequeue();

}
```

## Security

See [CONTRIBUTING](CONTRIBUTING.md#security-issue-notifications) for more information.

## License

This project is licensed under the MIT-0 License. See the [LICENSE](./LICENSE) file.
