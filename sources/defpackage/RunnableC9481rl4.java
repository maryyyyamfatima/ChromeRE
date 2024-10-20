package defpackage;

import android.view.ViewStructure;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: rl4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC9481rl4 implements Runnable {
    public final /* synthetic */ ViewStructure a;

    public RunnableC9481rl4(ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.asyncCommit();
    }
}
