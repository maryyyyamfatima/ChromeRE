package defpackage;

import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nk3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8102nk3 {
    public final ArrayList a = new ArrayList();
    public ValueAnimator b = null;
    public final C7414lk3 c = new C7414lk3(this);

    public final void a(int[] iArr, ValueAnimator valueAnimator) {
        C7758mk3 c7758mk3 = new C7758mk3(iArr, valueAnimator);
        valueAnimator.addListener(this.c);
        this.a.add(c7758mk3);
    }
}
