package defpackage;

import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jb, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1175Jb extends M74 {
    public final InterfaceC1045Ib e;
    public final C3603af2 f = new C3603af2();

    public C1175Jb(C3603af2 c3603af2, InterfaceC1045Ib interfaceC1045Ib) {
        e(c3603af2);
        this.e = interfaceC1045Ib;
    }

    public final void f(float f) {
        C3603af2 c3603af2 = this.f;
        short s = c3603af2.b;
        for (int i = 0; i < s; i++) {
            Object d = d((WeakReference) c3603af2.b(i));
            if (d != null) {
                this.e.b(d, f);
            }
        }
    }

    public final void e(C3603af2 c3603af2) {
        C3603af2 c3603af22;
        int i = 0;
        while (true) {
            c3603af22 = this.f;
            Object[] objArr = c3603af22.a;
            if (i >= objArr.length) {
                break;
            }
            objArr[i] = null;
            i++;
        }
        c3603af22.b = (short) 0;
        if (c3603af2 == null) {
            return;
        }
        short s = c3603af2.b;
        for (int i2 = 0; i2 < s; i2++) {
            c3603af22.a(c3603af2.e(i2), new WeakReference(c3603af2.b(i2)));
        }
    }

    public static Object d(WeakReference weakReference) {
        Object obj = weakReference != null ? weakReference.get() : null;
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Drawable) || ((Drawable) obj).getCallback() != null) {
            return obj;
        }
        weakReference.clear();
        return null;
    }

    @Override // defpackage.M74
    public final float b(long j) {
        LinkedHashMap linkedHashMap = this.a;
        if ((linkedHashMap == null ? 0 : linkedHashMap.size()) <= 1) {
            LinkedHashMap linkedHashMap2 = this.a;
            boolean containsKey = linkedHashMap2 == null ? false : linkedHashMap2.containsKey("default_input");
            Object d = d((WeakReference) this.f.c());
            if (d == null) {
                if (!containsKey) {
                    return this.c;
                }
                LinkedHashMap linkedHashMap3 = this.a;
                if ((linkedHashMap3 != null ? linkedHashMap3.size() : 0) <= 1) {
                    return c("default_input").c;
                }
                throw new RuntimeException("Trying to get single input of node with multiple inputs!");
            }
            if (!containsKey) {
                return this.e.get(d);
            }
            LinkedHashMap linkedHashMap4 = this.a;
            if ((linkedHashMap4 != null ? linkedHashMap4.size() : 0) <= 1) {
                float f = c("default_input").c;
                f(f);
                return f;
            }
            throw new RuntimeException("Trying to get single input of node with multiple inputs!");
        }
        throw new RuntimeException("Trying to check for single input of node with multiple inputs!");
    }
}
