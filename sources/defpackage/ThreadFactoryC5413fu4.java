package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fu4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC5413fu4 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SplitCompatBackgroundThread");
    }
}
