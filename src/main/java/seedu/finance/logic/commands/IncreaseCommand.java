package seedu.finance.logic.commands;

import static seedu.finance.logic.parser.CliSyntax.PREFIX_AMOUNT;

import seedu.finance.logic.CommandHistory;
import seedu.finance.logic.commands.exceptions.CommandException;
import seedu.finance.model.Model;

/**
 * Increases the budget limit for the month or week by specified amount
 */
public class IncreaseCommand extends Command {

    public static final String COMMAND_WORD = "increase";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Increases the budget for week/month "
            + "by the amount specified. "
            + "Existing budget will be changed accordingly.\n"
            + "Parameters: AMOUNT (must be positive integer) "
            + PREFIX_AMOUNT + "[AMOUNT]\n"
            + "Example: " + COMMAND_WORD + " "
            + PREFIX_AMOUNT + "100.50";


    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "Increase command not implemented yet";

    @Override
    public CommandResult execute(Model model, CommandHistory history) throws CommandException {
        throw new CommandException(MESSAGE_NOT_IMPLEMENTED_YET);
    }
}
