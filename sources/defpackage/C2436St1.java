package defpackage;

import java.util.Date;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: St1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2436St1 implements MA0 {
    public static final C1786Nt1 e = new O82() { // from class: Nt1
        @Override // defpackage.JA0
        public final void a(Object obj, Object obj2) {
            throw new QA0(AbstractC4809e90.a("Couldn't find encoder for type ", obj.getClass().getCanonicalName()));
        }
    };
    public static final C1916Ot1 f = new K74() { // from class: Ot1
        @Override // defpackage.JA0
        public final void a(Object obj, Object obj2) {
            ((L74) obj2).b((String) obj);
        }
    };
    public static final C2046Pt1 g = new K74() { // from class: Pt1
        @Override // defpackage.JA0
        public final void a(Object obj, Object obj2) {
            ((L74) obj2).c(((Boolean) obj).booleanValue());
        }
    };
    public static final C2306Rt1 h = new C2306Rt1();
    public final HashMap a;
    public final HashMap b;
    public final C1786Nt1 c;
    public boolean d;

    public C2436St1() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final MA0 a(Class cls, O82 o82) {
        this.a.put(cls, o82);
        this.b.remove(cls);
        return this;
    }
}
