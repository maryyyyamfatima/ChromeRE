package defpackage;

import androidx.preference.d;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: By2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0253By2 implements Runnable {
    public final /* synthetic */ d a;

    public RunnableC0253By2(d dVar) {
        this.a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.a.T.clear();
        }
    }
}
