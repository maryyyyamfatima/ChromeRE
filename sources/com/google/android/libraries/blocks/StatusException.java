package com.google.android.libraries.blocks;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class StatusException extends RuntimeException {
    public StatusException(String str, StackTraceElement[] stackTraceElementArr) {
        super(str);
        if (stackTraceElementArr != null) {
            setStackTrace(stackTraceElementArr);
        }
    }
}
