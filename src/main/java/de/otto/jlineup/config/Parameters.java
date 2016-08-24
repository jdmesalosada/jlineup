package de.otto.jlineup.config;

import com.beust.jcommander.Parameter;

public class Parameters {

    @Parameter(names = {"--before", "-b"})
    private boolean before = false;

    @Parameter(names = {"--after", "-a"})
    private boolean after = false;

    @Parameter(names = {"--config", "-c"}, description = "Config file - default is 'lineup.json'")
    private String configFile = "lineup.json";

    @Parameter(names = {"--working-dir", "-d"})
    private String workingDirectory = ".";

    @Parameter(names = {"--screenshot-dir", "-s"}, description = "Screenshots directory name - relative to working dir!")
    private String screenshotDirectory = "screenshots";

    @Parameter(names = {"--report-dir", "-r"}, description = "HTML report directory name - relative to working dir!")
    private String reportDirectory = "report";

    @Parameter(names = {"--compare", "-j"}, description = "Just compare the existing screenshots.")
    private boolean justCompare = false;

    public String getWorkingDirectory() {
        return workingDirectory;
    }

    public String getScreenshotDirectory() {
        return screenshotDirectory;
    }

    public String getReportDirectory() {
        return reportDirectory;
    }

    String getConfigFile() {
        return configFile;
    }

    public boolean isAfter() {
        return after;
    }

    public boolean isBefore() {
        return !after && !justCompare;
    }

    public boolean isJustCompare() {
        return justCompare;
    }
}