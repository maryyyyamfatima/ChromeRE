package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kg */
/* loaded from: classes.dex */
public final class C7042kg extends DP2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ WeakReference c;
    public final /* synthetic */ C10132tg d;

    @Override // defpackage.DP2
    public final void c(int i) {
    }

    public C7042kg(C10132tg c10132tg, int i, int i2, WeakReference weakReference) {
        this.d = c10132tg;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.DP2
    public final void d(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        C10132tg c10132tg = this.d;
        if (c10132tg.m) {
            c10132tg.l = typeface;
            TextView textView = (TextView) this.c.get();
            if (textView != null) {
                WeakHashMap weakHashMap = Ec4.a;
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC7386lg(textView, typeface, c10132tg.j));
                } else {
                    textView.setTypeface(typeface, c10132tg.j);
                }
            }
        }
    }
}
