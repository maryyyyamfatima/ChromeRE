package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Looper;
import android.view.inputmethod.EditorInfo;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: so0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC9838so0 extends AbstractBinderC1177Jb1 {
    public EditorInfo a;
    public int g;
    public int h;
    public String i;
    public Rect j;
    public Point k;
    public C7744mi1 l;
    public final HandlerC9495ro0 m = new HandlerC9495ro0(this, Looper.getMainLooper());

    public static C2192Qw2 a(float[] fArr) {
        C2192Qw2 c2192Qw2 = new C2192Qw2();
        c2192Qw2.b = (int) fArr[0];
        c2192Qw2.c = (int) fArr[1];
        return c2192Qw2;
    }
}
