package ooppackage;

public class ConcreteTelecom extends AbstractTelecom implements InterfaceTelecom, InterfaceTelecom2 {

	@Override
	public void incoming() {
		System.out.println("this is incoming from interfacetelecom");
		
		
	}

	@Override
	public void network() {
		System.out.println("this is network from interfacetelecom" );
		
	}

	@Override
	public void outgoing() {
		System.out.println("this is outgoing from interfacetelecom");

	
	}

	@Override
	public void camera() {
		System.out.println("this is camera from interfacetelecom2");
		
	}

	@Override
	public void touchpad() {
		System.out.println("this is touchpad from interfacetelecom2");
		
	}

	@Override
	public void videocall() {
		System.out.println("this is videocall from interfacetelecom2");
		
	}
	

}
