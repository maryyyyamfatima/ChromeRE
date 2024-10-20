package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: l63, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7200l63 {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public C7200l63() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void c(float f, float f2) {
        C6170i63 c6170i63 = new C6170i63();
        c6170i63.b = f;
        c6170i63.c = f2;
        this.g.add(c6170i63);
        C5482g63 c5482g63 = new C5482g63(c6170i63, this.c, this.d);
        float b = c5482g63.b() + 270.0f;
        float b2 = c5482g63.b() + 270.0f;
        a(b);
        this.h.add(c5482g63);
        this.e = b2;
        this.c = f;
        this.d = f2;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC6512j63) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        C5826h63 c5826h63 = new C5826h63(f4, f5, f4, f5);
        c5826h63.f = this.e;
        c5826h63.g = f3;
        this.h.add(new C5138f63(c5826h63));
        this.e = f;
    }

    public final void d(float f, float f2, float f3) {
        this.a = 0.0f;
        this.b = f;
        this.c = 0.0f;
        this.d = f;
        this.e = f2;
        this.f = (f2 + f3) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
