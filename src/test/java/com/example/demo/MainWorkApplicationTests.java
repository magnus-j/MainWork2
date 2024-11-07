package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainWorkApplicationTests {

	@Test
	public void testThatProductionIdataReturnsPaperOnGetMainWork() {
		ProductionIdata prodIdata = new ProductionIdata();
		
		assertEquals(MainWork.Paper, prodIdata.getMainWork());
	}

	@Test
	public void testThatProductionIdataReturnsProductionOnGetDepartment() {
		ProductionIdata prodIdata = new ProductionIdata();
		
		assertEquals("Production", prodIdata.getDepartment());
	}

	@Test
	public void testThatDevIdataReturnsDigitalOnGetMainWork() {
		DevIdata devIdata = new DevIdata();
		
		assertEquals(MainWork.Digital, devIdata.getMainWork());
	}

	@Test
	public void testThatDevIDataReturnsDevelopmentonGetDepartment() {
		DevIdata devIdata = new DevIdata();
		
		assertEquals("Development", devIdata.getDepartment());
	}
}
