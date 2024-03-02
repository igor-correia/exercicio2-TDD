import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.model.TaskModel;

@RunWith(Suite.class)
@SuiteClasses({})
public class TaskModelTests {
	
	private TaskModel taskModel;
	
	@BeforeEach
	public void startModel() {
		this.taskModel = new TaskModel("Quiz de VeV", "Responder quiz da aula 6", LocalDate.now());
	}

	@Test
	public void testGetTitle() {
		assertEquals("Quiz de VeV", taskModel.getTitle());
	}
	
	@Test
	public void testGetDescription() {
		assertEquals("Responder quiz da aula 6", taskModel.getDescription());
	}
	
	@Test
	public void testGetDate() {
		assertEquals(LocalDate.now(), taskModel.getDate());
	}
	

}