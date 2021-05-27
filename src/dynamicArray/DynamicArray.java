package dynamicArray;

public class DynamicArray {
    private String[] array;
    private int size;
    private int length;

    DynamicArray(){
        size = 8;
        length = 0;
        array = new String[size];
    }

    DynamicArray(int size){
        this.size = size;
        length = size;
        array = new String[length];
    }

    /*DynamicArray(String[] array){
        size = array.length;
        length = array.length;
        this.array = new String[length];
        System.arraycopy(array,0,this.array,0, this.array.length);
    }*/

    public int getSize(){
        return length;
    }

    public String[] getArray(){
        return array;
    }

    public void setElement(String element, int index){
        if (index < 0 || index >= length){
            System.out.println("invalid action");
        } else {
            array[index] = element;
        }
    }

    public void addElement(String element){
        if (length == size) {
            extracted();
        }
        array[length] = element;
        length++;
    }

    // O(n)
    public void addElement(String element,int index){
        if(index > length || index < 0){
            System.out.println("invalid action");
        } else {
            if (length == size) {
                extracted();
            }
            for (int i = length - 1; i >= index; i++) {
                array[i + 1] = array[i];
            }
            array[index] = element;
            length++;
        }
    }

    //O(1)
    public void removeElement(){
        if (length == 0){
            System.out.println("array is empty");
        } else {
            length--;
        }
    }

    public void removeElement(int index){
        if (index >= length || index < 0) {
            System.out.println("invalid action");
        } else {
            for (int i = index; i < length - 1; i++) {
                array[i] = array[i+1];
            }
            length--;
        }
    }

    public void removeElement(String element){
        boolean check = false;
        if (length == 0){
            System.out.println("invalid action");
        } else {
            for (int i = 0; i < length; i++) {
                if (array[i].equals(element)) {
                    removeElement(i);
                    check = true;
                    break;
                }
            }
        }
    }

    public void removeAll(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            removeElement(arr[i]);
        }
    }

    public void sort(sort type){
        //boolean check;
        if(type == sort.ASC) {
            for (int i = 0; i < length; i++) {
                boolean check = false;
                for (int j = 0; j < length - i - 1; j++) {
                    if (array[j].compareTo(array[j + 1]) > 0) {
                        check = true;
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                if (!check) {
                    break;
                }
            }
        } else {
            for (int i = 0; i < length - 1; i++) {
                boolean check = false;
                for (int j = 0; j < length - i - 1; j++) {
                    if (array[j].compareTo(array[j + 1]) < 0) {
                        check = true;
                        String temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                if (!check) {
                    break;
                }
            }
        }
    }

    public void swapElements(int index1, int index2){
        if(index1 == index2){
            System.out.println("same indexes");
        } else if (index1 >= length || index2 >= length || index1 < 0 || index2 < 0){
            System.out.println("invalid action");
        } else {
                String temp = array[index1];
                array[index1] = array[index2];
                array[index2] = temp;
        }
    }

    public boolean containsElement(String element){
        if (length != 0){
            for (int i = 0; i < length; i++) {
                if (array[i].equals(element)){
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void printArray(){
        if (length == 0) {
            System.out.println("array is empty");
        } else {
            for (int i = 0; i < length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public int indexOf(String element){
        if (length != 0){
            for (int i = 0; i < length; i++) {
                if (array[i] == element) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public int lastIndexOf(String element){
        if (length != 0){
            for (int i = length - 1; i >= 0; i--) {
                if (array[i] == element) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }

    public String getElement(int index){
        return array[index];
    }

    private void extracted() {
        String temp[] = new String[size * 2];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
        size = size * 2;
    }

}
