package defpackage;

import android.view.KeyEvent;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dL3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4530dL3 implements Runnable {
    public final /* synthetic */ KeyEvent a;
    public final /* synthetic */ C5561gL3 g;

    public RunnableC4530dL3(C5561gL3 c5561gL3, KeyEvent keyEvent) {
        this.g = c5561gL3;
        this.a = keyEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.g.sendKeyEvent(this.a);
    }
}
