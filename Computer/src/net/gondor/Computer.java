package net.gondor;

public class Computer {
	private CPU cpu;
	private RAM ram;
	private VGA vga;
	public CPU getCpu() {
		return cpu;
	}
	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}
	public RAM getRam() {
		return ram;
	}
	public void setRam(RAM ram) {
		this.ram = ram;
	}
	public VGA getVga() {
		return vga;
	}
	public void setVga(VGA vga) {
		this.vga = vga;
	}
	
	public void introMyComputer(){
		System.out.println("내 컴퓨터는 ");
		cpu.printCPUInfo();
		ram.printRAMInfo();
		vga.printVGAInfo();
	}
}
