package net.gondor.computer;

import net.gondor.CPU;
import net.gondor.Computer;
import net.gondor.RAM;
import net.gondor.VGA;

public class Main {
	public static void main(String[] args) {
		CPU cpu = new IntelCPU("인텔","i5");
		RAM ram = new SamsumRAM("16GB","삼성");
		VGA vga = new NVidiaVGA("GTX-960","MSI");
		Computer computer = new Computer();
		
		
		computer.setCpu(cpu);
		computer.setRam(ram);
		computer.setVga(vga);
		computer.introMyComputer();
		
	}
}
