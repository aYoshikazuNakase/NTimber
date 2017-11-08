package jp.nakalab.ntimber;

import timber.log.Timber;

public class DebugLogTree extends Timber.DebugTree {

    @Override
    protected void log(int priority, String tag, String message, Throwable t) {
        message = "[th:" + Thread.currentThread().getName() + "] " + message;
        super.log(priority, tag, message, t);
    }
}
