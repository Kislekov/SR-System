package by.ostis.common.sctpсlient.model;

public class ScAddress {
	
	private short segment;
	private short offset;

	public ScAddress(short segment, short offset) {
		this.segment = segment;
		this.offset = offset;
	}

	public short getSegment() {
		return segment;
	}

	public void setSegment(short segment) {
		this.segment = segment;
	}

	public short getOffset() {
		return offset;
	}

	public void setOffset(short offset) {
		this.offset = offset;
	}
}
