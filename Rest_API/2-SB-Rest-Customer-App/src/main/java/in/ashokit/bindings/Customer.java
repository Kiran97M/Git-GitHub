package in.ashokit.bindings;
 import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

private Integer customerId;
private String customerName;
private long customerPhno;
public Integer getCustomerId() {
	return customerId;
}
public void setCustomerId(Integer customerId) {
	this.customerId = customerId;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public long getCustomerPhno() {
	return customerPhno;
}
public void setCustomerPhno(long customerPhno) {
	this.customerPhno = customerPhno;
}
@Override
public String toString() {
	return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerPhno=" + customerPhno
			+ "]";

}}