/**
 * JoinList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2.1 Jun 14, 2005 (09:15:57 EDT) WSDL2Java emitter.
 */

package org.eclipse.birt.report.soapengine.api;

public class JoinList implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private org.eclipse.birt.report.soapengine.api.JoinDefinition[] join;

	public JoinList() {
	}

	public JoinList(org.eclipse.birt.report.soapengine.api.JoinDefinition[] join) {
		this.join = join;
	}

	/**
	 * Gets the join value for this JoinList.
	 * 
	 * @return join
	 */
	public org.eclipse.birt.report.soapengine.api.JoinDefinition[] getJoin() {
		return join;
	}

	/**
	 * Sets the join value for this JoinList.
	 * 
	 * @param join
	 */
	public void setJoin(org.eclipse.birt.report.soapengine.api.JoinDefinition[] join) {
		this.join = join;
	}

	public org.eclipse.birt.report.soapengine.api.JoinDefinition getJoin(int i) {
		return this.join[i];
	}

	public void setJoin(int i, org.eclipse.birt.report.soapengine.api.JoinDefinition _value) {
		this.join[i] = _value;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof JoinList))
			return false;
		JoinList other = (JoinList) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true && ((this.join == null && other.getJoin() == null)
				|| (this.join != null && java.util.Arrays.equals(this.join, other.getJoin())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getJoin() != null) {
			for (int i = 0; i < java.lang.reflect.Array.getLength(getJoin()); i++) {
				java.lang.Object obj = java.lang.reflect.Array.get(getJoin(), i);
				if (obj != null && !obj.getClass().isArray()) {
					_hashCode += obj.hashCode();
				}
			}
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			JoinList.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "JoinList"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("join");
		elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "Join"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.eclipse.org/birt", "JoinDefinition"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		elemField.setMaxOccursUnbounded(true);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}
