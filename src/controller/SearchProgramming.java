package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

public class SearchProgramming extends Menu<String> 
    {

    static String[] mc = {"Linear Search", "Binary Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchProgramming(Element element) {
        super("Search Option", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
    }

    @Override
    public void execute(int n) {
        
        switch (n) {
            case 1: {
                int value = client();
                System.out.println("Found value: " + value + " at index: " + algorithm.linearSearch(array, value));
                break;
            }
            case 2: {
                int value = client();
                System.out.println("Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
                break;
            }
            case 3:
                System.exit(0);
                break;
                }
            }
    public int client() {
        algorithm.buddleSort(array);
        library.display(array);
        int value = library.getInt("\nEnter number to find: ", 1, 100);
        return valune;
        }
    }
