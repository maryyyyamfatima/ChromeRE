package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Hb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0915Hb {
    public static final C0655Fb a = new C0655Fb();
    public static final C0785Gb b = new C0785Gb();
    public static final C0525Eb c = new C0525Eb();
    public static final C0135Bb d = new C0135Bb();
    public static final C0005Ab e = new C0005Ab();
    public static final C0395Db f = new C0395Db();
    public static final C0265Cb g = new C0265Cb();

    public static View a(Object obj, InterfaceC1045Ib interfaceC1045Ib) {
        if (!(obj instanceof View)) {
            throw new RuntimeException(KR0.a("Animating '", interfaceC1045Ib.getName(), "' is only supported on Views (got ", String.valueOf(obj), ")"));
        }
        return (View) obj;
    }

    public static float d(View view, boolean z) {
        float f2 = 0.0f;
        while (view != null && (view.getParent() instanceof View) && (!(view instanceof J91) || !(view instanceof InterfaceC10392uQ2))) {
            f2 += z ? view.getX() : view.getY();
            view = (View) view.getParent();
        }
        return f2;
    }

    public static View b(Drawable drawable) {
        Object callback;
        while (true) {
            callback = drawable.getCallback();
            if (!(callback instanceof Drawable)) {
                break;
            }
            drawable = (Drawable) callback;
        }
        if (callback instanceof View) {
            return (View) callback;
        }
        return null;
    }

    public static ArrayList c(J91 j91) {
        int e2 = j91.e();
        ArrayList arrayList = null;
        for (int i = 0; i < e2; i++) {
            C11122wZ1 d2 = j91.d(i);
            if (d2.a instanceof Drawable) {
                C9645sE1 c9645sE1 = d2.d.b;
                if (c9645sE1 instanceof C9645sE1) {
                    if ((c9645sE1.j.m & 4) != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add((Drawable) d2.a);
                    }
                }
            }
        }
        return arrayList;
    }
}
