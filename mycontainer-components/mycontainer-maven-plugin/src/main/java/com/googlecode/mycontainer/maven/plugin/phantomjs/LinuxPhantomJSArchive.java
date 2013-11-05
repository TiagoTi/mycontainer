package com.googlecode.mycontainer.maven.plugin.phantomjs;

public class LinuxPhantomJSArchive extends PhantomJSArchive {

        private final String arch;

        public LinuxPhantomJSArchive(String version, String arch) {
                super(version);
                this.arch = arch;
        }

        @Override
        protected String getExtension() {
                return "tar.bz2";
        }

        @Override
        protected String getPlatform() {
                return "linux";
        }

        @Override
        public String getExecutable() {
                return "bin/phantomjs";
        }
        
        @Override
        protected String getArch() {
                return this.arch;
        }
}