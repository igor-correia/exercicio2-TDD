import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.model.TaskModel;
import com.model.Priority;

@RunWith(Suite.class)
@SuiteClasses({})
public class TaskModelTests {
	
	private TaskModel taskModel;
	
	@BeforeEach
	public void startModel() {
		this.taskModel = new TaskModel("Quiz de VeV", "Responder quiz da aula 6", LocalDate.now(), Priority.values()[0]);
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
	
	@Test
	public void testGetPriority() {
		Enum result = Enum.valueOf(Priority.class, "Alta");
		assertEquals(result, taskModel.getPriority());
	}
	
	@Test
	public void testSetTitle() {
		taskModel.setTitle("Quiz de percepção computacional");
		assertEquals("Quiz de percepção computacional", taskModel.getTitle());
	}
	

}