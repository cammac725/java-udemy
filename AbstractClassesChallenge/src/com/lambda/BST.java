package com.lambda;

public class BST implements NodeList {

    private ListItem root = null;

    public BST(ListItem root) {
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
                    // there is node to the right so add at this point.
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, move left if possible
                if (currentItem.prev() != null) {
                    currentItem = currentItem.prev();
                } else {
                    // there is node to the right so add at this point
                    currentItem.setPrev(newItem);
                    return true;
                }
            } else {
                // equal so don't add
                System.out.println(newItem.getValue() + " is already present. Item not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.prev();
            } else {
                // equal: we found the item to remove
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null) {
            // no right tree, so make parent point to left tree
            if (parent.next() == item) {
                // item is the right child of this parent
                parent.setNext(item.prev());
            } else if (parent.prev() == item) {
                // item is left child of this parent
                parent.setPrev(item.prev());
            } else {
                // parent must be item (root), this deletes it and
                // sets the root to the prev
                this.root = item.prev();
            }
        } else if (item.prev() == null) {
            // no left tree so make parent point to right tree
            if (parent.next() == item) {
                // item is right child of this parent
                parent.setNext(item.next());
            } else if (parent.prev() == item) {
                // item is left child of this parent
                parent.setPrev(item.next());
            } else {
                // parent must be item (root), this deletes it and
                // sets the root to the next
                this.root = item.next();
            }
        } else {
            // neither left or right are null
            // from the right sub-tree, find the smallest value (left-most)
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.prev() != null) {
                leftmostParent = current;
                current = current.prev();
            }
            // now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node so 'current' points to smallest
                // node (the one that must now be deleted)
                item.setNext(current.next());
            } else {
                // set the smallest node's parent to point to
                // the smallest node's right child (which may be null)
                leftmostParent.setPrev(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        //recursive method
        if (root != null) {
            traverse(root.prev());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
