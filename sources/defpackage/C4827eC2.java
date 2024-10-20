package defpackage;

import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eC2 */
/* loaded from: classes.dex */
public final class C4827eC2 {
    public final String a;
    public final Set b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    public C4827eC2(String str, Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = str;
        this.b = set;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final YB2 b(String str, boolean z) {
        return new YB2(this.a, str, Boolean.valueOf(z), new C6305iX(this.c, this.d, this.e, this.f, this.g, AbstractC1472Li1.o(this.b), new ZB2(), new C3453aC2()));
    }

    public final YB2 a(String str, String str2) {
        return new YB2(this.a, str, str2, new C6305iX(this.c, this.d, this.e, this.f, this.g, AbstractC1472Li1.o(this.b), new InterfaceC4484dC2() { // from class: bC2
            @Override // defpackage.InterfaceC4484dC2
            public final Object a(Object obj) {
                return (String) obj;
            }
        }, new InterfaceC4484dC2() { // from class: cC2
            @Override // defpackage.InterfaceC4484dC2
            public final Object a(Object obj) {
                return (String) String.class.cast(obj);
            }
        }));
    }
}
