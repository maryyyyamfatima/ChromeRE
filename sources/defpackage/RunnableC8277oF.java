package defpackage;

import android.graphics.Typeface;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC8277oF implements Runnable {
    public final /* synthetic */ AbstractC5593gS0 a;
    public final /* synthetic */ Typeface g;

    public RunnableC8277oF(AbstractC5593gS0 abstractC5593gS0, Typeface typeface) {
        this.a = abstractC5593gS0;
        this.g = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.g);
    }
}
