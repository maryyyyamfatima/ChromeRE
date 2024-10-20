package defpackage;

import java.io.InterruptedIOException;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oN3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C8321oN3 {
    public void a() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
    }
}
