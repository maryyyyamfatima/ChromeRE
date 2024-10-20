package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: s00 */
/* loaded from: classes.dex */
public final class C9564s00 {
    public Canvas a;
    public int b;
    public int c;
    public final /* synthetic */ ComponentHost d;

    public C9564s00(ComponentHost componentHost) {
        this.d = componentHost;
    }

    public static void a(C9564s00 c9564s00) {
        if (c9564s00.a == null) {
            return;
        }
        ComponentHost componentHost = c9564s00.d;
        C1593Mg3 c1593Mg3 = componentHost.a;
        int i = c1593Mg3 == null ? 0 : c1593Mg3.i();
        for (int i2 = c9564s00.b; i2 < i; i2++) {
            C11122wZ1 c11122wZ1 = (C11122wZ1) componentHost.a.j(i2);
            Object obj = c11122wZ1.a;
            if (!(obj instanceof View)) {
                if (c11122wZ1.c) {
                    ((Drawable) obj).draw(c9564s00.a);
                }
            } else {
                c9564s00.b = i2 + 1;
                return;
            }
        }
        c9564s00.b = c9564s00.c;
    }
}
