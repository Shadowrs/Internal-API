package org.parabot.api.io;

/**
 * Keeps track of a progress
 *
 * @author Everel
 */
public interface ProgressListener {

    /**
     * Called when progress increased
     *
     * @param value
     */
    public void onProgressUpdate(double value);

    /**
     * Updates upload speed
     *
     * @param mbPerSecond
     */
    public void updateDownloadSpeed(double mbPerSecond);

}
