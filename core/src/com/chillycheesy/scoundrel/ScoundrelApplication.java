package com.chillycheesy.scoundrel;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import java.util.logging.FileHandler;

public class ScoundrelApplication extends ApplicationAdapter {
	private Stage stage;
	
	@Override
	public void create () {
		final Viewport viewport = new ScreenViewport();
		stage = new Stage(viewport);

		final FileHandle fileHandler = Gdx.files.internal("metalui/metal-ui.json");
		final Skin skin = new Skin(fileHandler);

		final TextButton button1 = new TextButton("Hello, world! 1", skin);
		stage.addActor(button1);

		final TextButton button2 = new TextButton("Hello, world! 2", skin);
		stage.addActor(button2);

		final TextButton button3 = new TextButton("Hello, world! 3", skin);
		stage.addActor(button3);

		final Table root = new Table();
		root.setDebug(true);
		stage.addActor(root);
		root.setFillParent(true);

		root.add(button1);
		root.add(button2);
		root.add(button3).grow();
	}

	@Override
	public void resize(int width, int height) {
		final Viewport viewport = stage.getViewport();
		viewport.update(width, height, true);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0, 1);
		stage.act();
		stage.draw();
	}
	
	@Override
	public void dispose () {
		stage.dispose();
	}
}
