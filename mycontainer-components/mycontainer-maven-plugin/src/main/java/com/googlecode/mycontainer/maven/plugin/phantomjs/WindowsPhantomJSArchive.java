package com.googlecode.mycontainer.maven.plugin.phantomjs;

public class WindowsPhantomJSArchive extends PhantomJSArchive {

        public WindowsPhantomJSArchive(String version) {
                super(version);
        }

        @Override
        protected String getExtension() {
                return "zip";
        }

        @Override
        protected String getPlatform() {
                return "windows";
        }

        @Override
        public String getExecutable() {
                return "phantomjs.exe";
        }
}