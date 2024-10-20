package defpackage;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nr1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC8142nr1 {
    public static final DecelerateInterpolator a;
    public static final PathInterpolator b;
    public static final PathInterpolator c;
    public static final GH0 d;
    public static final HH0 e;
    public static final LinearInterpolator f;
    public static final UB1 g;
    public static final OvershootInterpolator h;

    static {
        new AccelerateInterpolator();
        a = new DecelerateInterpolator();
        b = new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f);
        c = new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f);
        d = new GH0();
        e = new HH0();
        f = new LinearInterpolator();
        g = new UB1();
        h = new OvershootInterpolator();
    }
}
