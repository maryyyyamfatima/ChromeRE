package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.ThreadUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qx, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9205qx {
    public final /* synthetic */ C9547rx a;

    public C9205qx(C9547rx c9547rx) {
        this.a = c9547rx;
    }

    public final void a(C0245Bx c0245Bx) {
        Object obj = ThreadUtils.a;
        C9547rx c9547rx = this.a;
        c9547rx.c = true;
        c9547rx.d = c0245Bx;
        Iterator it = new ArrayList(c9547rx.b).iterator();
        while (it.hasNext()) {
            C9890sx c9890sx = (C9890sx) it.next();
            c9890sx.h = c0245Bx;
            c9890sx.i = true;
            C11605xx c11605xx = c9890sx.g;
            if (c11605xx != null) {
                c11605xx.a(c0245Bx);
                c9890sx.g = null;
                c9890sx.i = false;
            }
        }
    }
}
