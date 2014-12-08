run:
	sbt android:package
	adb install -r target/android-bin/Big-Oh-debug.apk

clean:
	sbt clean clean-files

release:
	sbt android:package-release
