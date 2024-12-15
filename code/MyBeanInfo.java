public class MyBeanInfo implements BeanInfo{
	@Override
	public PropertyDescriptor[] getPropertyDescriptors(){
		try{
			PropertyDescriptor nameDescriptor = new PropertyDescriptor("name", MyBean.class);
			nameDescriptor.setDispplayName("Name");
			nameDescriptor.setSHortDescription("The name property of MyBean");
			return new PropertyDescriptor[]{nameDescriptor};
		}catch(Inspector
	}
}
