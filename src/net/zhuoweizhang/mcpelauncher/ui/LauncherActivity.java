package net.zhuoweizhang.mcpelauncher.ui;

import net.zhuoweizhang.mcpelauncher.Utils;
import android.os.Bundle;

public class LauncherActivity extends com.mojang.minecraftpe.MainActivity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		new Utils(getApplicationContext());
		super.onCreate(savedInstanceState);
	}
}