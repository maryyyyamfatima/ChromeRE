package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: iL3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC6249iL3 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ C7623mL3 g;

    @Override // java.lang.Runnable
    public final void run() {
        C7623mL3 c7623mL3 = this.g;
        c7623mL3.b.onWindowFocusChanged(true);
        c7623mL3.a.e(this.a);
        c7623mL3.getClass();
        AbstractC7279lL3.a.post(new RunnableC5905hL3(this));
    }

    public RunnableC6249iL3(C7623mL3 c7623mL3, View view) {
        this.g = c7623mL3;
        this.a = view;
    }
}
