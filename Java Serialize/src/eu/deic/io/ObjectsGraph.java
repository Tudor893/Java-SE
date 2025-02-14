package eu.deic.io;

import java.io.Serializable;
import java.net.URL;
import java.util.Objects;

public class ObjectsGraph implements Serializable {

	private static final long serialVersionUID = 2L;
	
	private URL o1;
	private URL o2;
	
	public ObjectsGraph(URL webAddress1, URL webAddress2) {
		o1 = webAddress1;
		o2 = webAddress2;
	}

	public URL getO1() {
		return o1;
	}

	public URL getO2() {
		return o2;
	}
	
	@Override
	public int hashCode() {
		int resultHash = 1 * this.o1.hashCode() + 31*o2.hashCode();
		return resultHash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectsGraph other = (ObjectsGraph) obj;
		return Objects.equals(o1, other.o1) && Objects.equals(o2, other.o2);
	}

	@Override
	public String toString() {
		return "eu.deic.io.ObjectsGraph@" + this.hashCode() + " - [o1=" + o1 + ", o2=" + o2 + "]";
	}
	
	
}// end class
