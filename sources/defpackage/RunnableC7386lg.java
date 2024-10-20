package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC7386lg implements Runnable {
    public final /* synthetic */ TextView a;
    public final /* synthetic */ Typeface g;
    public final /* synthetic */ int h;

    public RunnableC7386lg(TextView textView, Typeface typeface, int i) {
        this.a = textView;
        this.g = typeface;
        this.h = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.setTypeface(this.g, this.h);
    }
}
