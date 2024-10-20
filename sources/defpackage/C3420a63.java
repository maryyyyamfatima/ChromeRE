package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: a63 */
/* loaded from: classes.dex */
public final class C3420a63 implements C50 {
    public final String a;
    public final List b;
    public final boolean c;

    public C3420a63(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.C50
    public final Z40 a(JJ1 jj1, AbstractC11937yv abstractC11937yv) {
        return new C5817h50(jj1, abstractC11937yv, this);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + "}";
    }
}
