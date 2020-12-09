package com.lambda;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // list was empty, so this item becomes the head
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater, move right is possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next so insert at end of list.
                    currentItem.setNext(newItem).setPrev(currentItem);
                    return true;
                }
            }
            else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.prev() != null) {
                    currentItem.prev().setNext(newItem).setPrev(currentItem.prev());
                    newItem.setNext(currentItem).setPrev(newItem);
                } else {
                    // the node with no previous is the root
                    newItem.setNext(this.root).setPrev((newItem));
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present. Item not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue() + ".");
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found the item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.prev().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next() .setPrev(currentItem.prev());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else { // comparison > 0
                // we are at an item greater than the one to be deleted
                // item is not in the list
                return false;
            }
        }
        // we have reached the end of the list without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty.");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
