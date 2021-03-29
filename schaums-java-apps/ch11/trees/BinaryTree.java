package ch11.trees;

import java.util.AbstractCollection;
import java.util.Iterator;

public class BinaryTree<E> extends AbstractCollection {

	protected E root;
	protected BinaryTree<E> left;
	protected BinaryTree<E> right;
	protected BinaryTree<E> parent;
	protected int size;

	public BinaryTree() {

	}

	public BinaryTree(E root) {
		this.root = root;
		size = 1;
	}

	public BinaryTree(E root, BinaryTree<E> left, BinaryTree<E> right) {
		this(root);
		if (left != null) {
			this.left = left;
			left.parent = this;
			size += left.size();
		}
		if (right != null) {
			this.right = right;
			right.parent = this;
			size += right.size();
		}
	}


	public boolean equals(Object object) {
		if(object == this) {
			return true;
		} else if 
		(!(object instanceof BinaryTree)){
			return false;

		}
		BinaryTree that = (BinaryTree)object;
		return that.root.equals(this.root)
				&& that.left.equals(this.left)
				&& that.right.equals(this.right)
				&& that.parent.equals(this.parent)
				&& that.size == this.size;
	}

	public int hashCode() {
		return root.hashCode() + left.hashCode() + right.hashCode() + size;
	}

	public int size() {
		return size;
	}

	public Iterator iterator() {
		return new java.util.Iterator() {
			private boolean rootDone;
			private Iterator lIt, rIt;

			public boolean hasNext() {
				return !rootDone || lIt != null && lIt.hasNext()
						|| rIt != null && rIt.hasNext();

			}

			public Object next() {
				if (rootDone) {
					if (lIt != null && lIt.hasNext()) {
						return lIt.next();
					}
					if (rIt != null && rIt.hasNext()) {
						return rIt.next();
					}
					return null;
				}
				if (left!= null) {
					lIt = left.iterator();
				}
				if (right != null) {
					rIt = right.iterator();
				}
				rootDone = true;
				return root;
			}
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
}
