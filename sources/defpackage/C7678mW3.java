package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: mW3 */
/* loaded from: classes.dex */
public final class C7678mW3 implements InterfaceC9641sD2 {
    public static final C1731Ni1 b;
    public final AbstractC9896sy0 a;

    @Override // defpackage.InterfaceC9641sD2
    public final int b() {
        return 225874218;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
    }

    @Override // defpackage.InterfaceC9641sD2
    public final AbstractC11362xE3 d(ByteBuffer byteBuffer) {
        C7334lW3 c7334lW3 = new C7334lW3();
        c7334lW3.c(byteBuffer.position() + TW1.a(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        return c7334lW3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0213  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [xE3] */
    @Override // defpackage.InterfaceC11013wD2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(defpackage.C7849n00 r18, defpackage.U80 r19, java.lang.String r20, java.lang.Object r21, defpackage.InterfaceC8177nx0 r22, defpackage.C8367oX r23) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7678mW3.e(n00, U80, java.lang.String, java.lang.Object, nx0, oX):void");
    }

    public C7678mW3(AbstractC9896sy0 abstractC9896sy0) {
        this.a = abstractC9896sy0;
    }

    static {
        C1601Mi1 c1601Mi1 = new C1601Mi1();
        c1601Mi1.b(1, AbstractC0915Hb.a, AbstractC0915Hb.b);
        c1601Mi1.b(2, AbstractC0915Hb.c, AbstractC0915Hb.d);
        c1601Mi1.b(4, AbstractC0915Hb.e);
        c1601Mi1.b(3, AbstractC0915Hb.f);
        c1601Mi1.b(5, AbstractC0915Hb.g);
        b = c1601Mi1.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [lo3, oe3] */
    /* JADX WARN: Type inference failed for: r5v8, types: [lo3, oe3] */
    public static float f(C3554aW3 c3554aW3, InterfaceC1045Ib interfaceC1045Ib, float f) {
        if (c3554aW3 == null) {
            return f;
        }
        C2322Rw2 c2322Rw2 = null;
        if (AbstractC0915Hb.a.equals(interfaceC1045Ib)) {
            C2322Rw2 c2322Rw22 = new C2322Rw2();
            int b2 = c3554aW3.b(6);
            if (b2 != 0) {
                c2322Rw22.a(b2 + c3554aW3.a, c3554aW3.b);
                c2322Rw2 = c2322Rw22;
            }
            return c2322Rw2 != null ? c2322Rw2.b() : f;
        }
        if (AbstractC0915Hb.b.equals(interfaceC1045Ib)) {
            C2322Rw2 c2322Rw23 = new C2322Rw2();
            int b3 = c3554aW3.b(6);
            if (b3 != 0) {
                c2322Rw23.a(b3 + c3554aW3.a, c3554aW3.b);
                c2322Rw2 = c2322Rw23;
            }
            return c2322Rw2 != null ? c2322Rw2.c() : f;
        }
        if (AbstractC0915Hb.c.equals(interfaceC1045Ib)) {
            ?? c8410oe3 = new C8410oe3();
            int b4 = c3554aW3.b(8);
            if (b4 != 0) {
                c8410oe3.a(b4 + c3554aW3.a, c3554aW3.b);
                c2322Rw2 = c8410oe3;
            }
            return c2322Rw2 != null ? c2322Rw2.b.getFloat(c2322Rw2.a + 0) : f;
        }
        if (!AbstractC0915Hb.d.equals(interfaceC1045Ib)) {
            if (!(c3554aW3.b(4) != 0)) {
                return f;
            }
            int b5 = c3554aW3.b(4);
            return b5 != 0 ? c3554aW3.b.getFloat(b5 + c3554aW3.a) : 0.0f;
        }
        ?? c8410oe32 = new C8410oe3();
        int b6 = c3554aW3.b(8);
        if (b6 != 0) {
            c8410oe32.a(b6 + c3554aW3.a, c3554aW3.b);
            c2322Rw2 = c8410oe32;
        }
        return c2322Rw2 != null ? c2322Rw2.b.getFloat(c2322Rw2.a + 4) : f;
    }
}
