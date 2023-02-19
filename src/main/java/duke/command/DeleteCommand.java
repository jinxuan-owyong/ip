package duke.command;

import duke.tasks.Task;
import duke.tasks.TaskList;
import duke.ui.UI;

public class DeleteCommand extends Command{
    private int deleteId;

    public DeleteCommand(int deleteId) {
        this.deleteId = deleteId;
    }

    @Override
    public void executor(TaskList tasks, UI ui) throws Exception {
        Task toDelete = tasks.delete(deleteId);
        ui.printTaskDeleted(toDelete.describe(), tasks.size());
    }
}