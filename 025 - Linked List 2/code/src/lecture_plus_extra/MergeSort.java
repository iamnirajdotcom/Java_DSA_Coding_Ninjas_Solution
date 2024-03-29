package lecture_plus_extra;

/**
 * Code : Merge Sort
 * Send Feedback
 *  Given a singly linked list of integers, sort it using 'Merge Sort.'
 * Note :
 * No need to print the list, it has already been taken care. Only return the new head to the list.
 * Input format :
 * The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
 *
 * The first and the only line of each test case or query contains the elements of the singly linked list separated by a single space.
 * Remember/Consider :
 * While specifying the list elements for input, -1 indicates the end of the singly linked list and hence, would never be a list element
 * Output format :
 * For each test case/query, print the elements of the sorted singly linked list.
 *
 * Output for every test case will be printed in a seperate line.
 * Constraints :
 * 1 <= t <= 10^2
 * 0 <= M <= 10^5
 * Where M is the size of the singly linked list.
 *
 * Time Limit: 1sec
 * Sample Input 1 :
 * 1
 * 10 9 8 7 6 5 4 3 -1
 * Sample Output 1 :
 *  3 4 5 6 7 8 9 10
 *  Sample Output 2 :
 * 2
 * -1
 * 10 -5 9 90 5 67 1 89 -1
 * Sample Output 2 :
 * -5 1 5 9 10 67 89 90
 */

public class MergeSort {

    public static Node<Integer> mergeSort(Node<Integer> head) {
        // Base Case
        if (head == null || head.next == null){
            return head;
        }

        // divide the array in two part
        Node<Integer> midPoint = FindMidPointInLL.midPoint(head);
        Node<Integer> secondHead = midPoint.next;
        midPoint.next = null;
        Node<Integer> firstHead = head;

        // solve small problem
        firstHead = mergeSort(firstHead);
        secondHead = mergeSort(secondHead);

        return MergeTwoLL.mergeTwoSortedLinkedLists(firstHead,secondHead);
    }


    public static void main(String[] args) {
        Node<Integer> head = TakingLLInputs.takingInput();
        head = mergeSort(head);
        PrintLL.printLL(head);
    }
}
