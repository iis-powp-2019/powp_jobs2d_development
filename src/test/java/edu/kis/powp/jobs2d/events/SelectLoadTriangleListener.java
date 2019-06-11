package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;
import edu.kis.powp.jobs2d.command.manager.DriverCommandManager;
import edu.kis.powp.jobs2d.features.CommandsFeature;
import edu.kis.powp.jobs2d.features.MoveFeature;

public class SelectLoadTriangleListener implements ActionListener {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		List<DriverCommand> commands = new ArrayList<DriverCommand>();
	
		commands.add(new SetPositionCommand(-100+MoveFeature.x, 0+MoveFeature.y));
		commands.add(new OperateToCommand(0+MoveFeature.x, -200+MoveFeature.y));
		commands.add(new OperateToCommand(100+MoveFeature.x, 0+MoveFeature.y));
		commands.add(new OperateToCommand(-100+MoveFeature.x, 0+MoveFeature.y));

		DriverCommandManager manager = CommandsFeature.getDriverCommandManager();
		manager.setCurrentCommand(commands, "TopSecretCommand");
	}
}