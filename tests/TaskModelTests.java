import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.model.TaskModel;

@RunWith(Suite.class)
@SuiteClasses({})
public class TaskModelTests {
	
	private TaskModel taskModel;
	
	@BeforeEach
	public void startModel() {
		this.taskModel = new TaskModel("Quiz de VeV");
	}

	@Test
	public void testGetTitle() {
		assertEquals("Quiz de VeV", taskModel.getTitle());
	}
}
