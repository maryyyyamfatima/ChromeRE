package defpackage;

import android.view.inputmethod.InputConnection;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes4.dex */
public final class Di4 implements Runnable {
    public final /* synthetic */ InputConnection a;

    public Di4(UR ur) {
        this.a = ur;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.performEditorAction(2);
    }
}
