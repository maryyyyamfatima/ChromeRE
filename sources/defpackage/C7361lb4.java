package defpackage;

import com.google.protobuf.MessageLite;
import java.util.BitSet;
import java.util.HashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: lb4 */
/* loaded from: classes.dex */
public final /* synthetic */ class C7361lb4 {
    public final /* synthetic */ C4708ds a;
    public final /* synthetic */ Ia4 b;
    public final /* synthetic */ C2279Ro c;
    public final /* synthetic */ C3090Xu0 d;
    public final /* synthetic */ Fa4 e;
    public final /* synthetic */ UV3 f;
    public final /* synthetic */ C3112Xy2 g;
    public final /* synthetic */ InterfaceC2938Wp3 h;
    public final /* synthetic */ C9596s52 i;

    public /* synthetic */ C7361lb4(C9596s52 c9596s52, C2279Ro c2279Ro, C4708ds c4708ds, Ia4 ia4, C3112Xy2 c3112Xy2, Fa4 fa4, UV3 uv3, C3090Xu0 c3090Xu0, InterfaceC2938Wp3 interfaceC2938Wp3) {
        this.a = c4708ds;
        this.b = ia4;
        this.c = c2279Ro;
        this.d = c3090Xu0;
        this.e = fa4;
        this.f = uv3;
        this.g = c3112Xy2;
        this.h = interfaceC2938Wp3;
        this.i = c9596s52;
    }

    public final C5501g94 a(C7849n00 c7849n00, U80 u80, MessageLite messageLite) {
        C7017kb4 c7017kb4;
        C3678as c3678as;
        C5052es c5052es;
        C12165zb4 c12165zb4 = (C12165zb4) messageLite;
        int i = C6531j94.P;
        C5501g94 c5501g94 = new C5501g94();
        C6531j94 c6531j94 = new C6531j94();
        c5501g94.m(c7849n00, 0, 0, c6531j94);
        c5501g94.i = c6531j94;
        BitSet bitSet = c5501g94.k;
        bitSet.clear();
        C2317Rv2 c2317Rv2 = c12165zb4.o;
        if (c2317Rv2 == null) {
            c2317Rv2 = C2317Rv2.l;
        }
        int i2 = c2317Rv2.j;
        if (!(i2 == 2)) {
            c7017kb4 = i2 == 1 ? (C7017kb4) c2317Rv2.k : C7017kb4.r;
        } else {
            if (i2 == 2) {
                c5052es = (C5052es) c2317Rv2.k;
            } else {
                c5052es = C5052es.l;
            }
            c7017kb4 = c5052es.k;
            if (c7017kb4 == null) {
                c7017kb4 = C7017kb4.r;
            }
        }
        float f = c7017kb4.m;
        if (f <= 0.0f) {
            f = 1.7777778f;
        }
        c5501g94.b(f);
        c5501g94.i.M = c12165zb4;
        bitSet.set(9);
        String str = c12165zb4.q;
        C4708ds c4708ds = this.a;
        HashMap hashMap = c4708ds.b;
        if (hashMap.containsKey(str)) {
            c3678as = (C3678as) hashMap.get(str);
        } else {
            C4022bs c4022bs = c4708ds.a;
            c4022bs.getClass();
            C4022bs.a(1, str);
            WB2 wb2 = (WB2) c4022bs.a.get();
            C4022bs.a(2, wb2);
            Q94 q94 = (Q94) c4022bs.b.get();
            C4022bs.a(3, q94);
            Xe4 xe4 = (Xe4) c4022bs.c.get();
            C4022bs.a(4, xe4);
            C3678as c3678as2 = new C3678as(str, wb2, q94, xe4);
            hashMap.put(str, c3678as2);
            c3678as = c3678as2;
        }
        c5501g94.i.E = c3678as;
        bitSet.set(1);
        c5501g94.i.G = this.b;
        bitSet.set(3);
        c5501g94.i.H = this.c;
        bitSet.set(4);
        c5501g94.i.F = this.d;
        bitSet.set(2);
        c5501g94.i.O = this.e;
        bitSet.set(10);
        c5501g94.i.L = this.f;
        bitSet.set(8);
        c5501g94.i.I = this.g;
        bitSet.set(5);
        c5501g94.i.f11514J = this.h;
        bitSet.set(6);
        c5501g94.i.K = this.i;
        bitSet.set(7);
        if ((c12165zb4.j & 32) != 0) {
            C10409uU c10409uU = c12165zb4.p;
            if (c10409uU == null) {
                c10409uU = C10409uU.v;
            }
            c5501g94.i.N = c10409uU;
        }
        return c5501g94;
    }
}
