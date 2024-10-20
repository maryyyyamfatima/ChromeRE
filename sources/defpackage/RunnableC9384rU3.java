package defpackage;

import java.io.File;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rU3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC9384rU3 implements Runnable {
    public final File a;

    public RunnableC9384rU3(File file) {
        this.a = file;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.delete();
    }
}
