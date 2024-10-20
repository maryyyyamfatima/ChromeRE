package defpackage;

import android.util.SparseArray;
import com.android.chrome.R;
import com.google.android.libraries.elements.converters.h;
import com.google.android.libraries.elements.interfaces.PbToFb;
import com.google.protobuf.MessageLite;
import com.youtube.android.libraries.elements.StatusOr;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: tQ2 */
/* loaded from: classes.dex */
public final class C10049tQ2 implements InterfaceC8520ox0 {
    public static final AbstractC0952Hi1 i;
    public static final UF0 j = new UF0();
    public final AbstractC1472Li1 c;
    public final AbstractC9896sy0 d;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final SparseArray a = new SparseArray();
    public final SparseArray b = new SparseArray();
    public final boolean e = Boolean.FALSE.booleanValue();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(192475008, "AnimatedVectorType");
        hashMap.put(160982084, "CellType");
        hashMap.put(158796298, "CollectionType");
        hashMap.put(158796327, "ContainerType");
        hashMap.put(191923252, "EditableTextType");
        hashMap.put(158796345, "ImageType");
        hashMap.put(158796380, "TextType");
        hashMap.put(193805739, "ExpandableTextType");
        hashMap.put(197633010, "ScrollableContainerType");
        i = AbstractC0952Hi1.b(hashMap);
    }

    public C10049tQ2(TL2 tl2, TL2 tl22, AbstractC1472Li1 abstractC1472Li1, AbstractC9896sy0 abstractC9896sy0, C3242Yy2 c3242Yy2) {
        C0172Bi1 listIterator = ((AbstractC0562Ei1) tl2.values()).listIterator(0);
        while (listIterator.hasNext()) {
            C7150ky0 c7150ky0 = (C7150ky0) listIterator.next();
            this.a.put(c7150ky0.c, c7150ky0);
        }
        Iterable[] iterableArr = {tl22.values(), abstractC1472Li1};
        for (int i2 = 0; i2 < 2; i2++) {
            Iterable iterable = iterableArr[i2];
        }
        TQ0 tq0 = new TQ0(iterableArr);
        HashSet hashSet = new HashSet();
        int i3 = AbstractC1472Li1.h;
        C1342Ki1 c1342Ki1 = new C1342Ki1();
        Iterator it = tq0.iterator();
        while (true) {
            C2431Ss1 c2431Ss1 = (C2431Ss1) it;
            if (!c2431Ss1.hasNext()) {
                break;
            }
            int i4 = ((OX0) ((C7494ly0) c2431Ss1.next()).c).d.a;
            if (!hashSet.add(Integer.valueOf(i4))) {
                c1342Ki1.f(Integer.valueOf(i4));
                abstractC9896sy0.a(EnumC11438xU.z, "Multiple type converters found and removed for extension " + i4);
            }
        }
        this.c = c1342Ki1.g();
        Iterator it2 = tq0.iterator();
        while (true) {
            C2431Ss1 c2431Ss12 = (C2431Ss1) it2;
            if (!c2431Ss12.hasNext()) {
                Boolean bool = Boolean.FALSE;
                this.f = ((Boolean) c3242Yy2.a).booleanValue();
                this.g = bool.booleanValue();
                this.h = bool.booleanValue();
                this.d = abstractC9896sy0;
                AbstractC7895n74.a = new C8239o74(abstractC9896sy0);
                AbstractC2162Qq2.a.set(this.e);
                return;
            }
            C7494ly0 c7494ly0 = (C7494ly0) c2431Ss12.next();
            int i5 = ((OX0) c7494ly0.c).d.a;
            if (!this.c.contains(Integer.valueOf(i5))) {
                this.b.put(i5, c7494ly0);
            }
        }
    }

    public final WZ d(C7849n00 c7849n00, U80 u80, byte[] bArr, H10 h10) {
        C3184Yn a;
        C3235Yx0 b;
        if (u80 == null) {
            u80 = U80.a;
        }
        C3184Yn c3184Yn = (C3184Yn) u80;
        c3184Yn.getClass();
        C3054Xn c3054Xn = new C3054Xn(c3184Yn);
        c3054Xn.e = h10;
        boolean z = this.e;
        if (z) {
            c3054Xn.s = Integer.toString(System.identityHashCode(bArr));
            a = c3054Xn.a();
        } else {
            a = c3054Xn.a();
        }
        C3184Yn c3184Yn2 = a;
        C5427fx0 c5427fx0 = new C5427fx0();
        AtomicBoolean atomicBoolean = AbstractC2162Qq2.a;
        StatusOr convert = PbToFb.convert(ByteBuffer.wrap(bArr), AbstractC2162Qq2.a.get(), this.f, this.h);
        if (convert.a()) {
            C5427fx0.j(ByteBuffer.wrap((byte[]) convert.c()), c5427fx0);
            int value = convert.b().getCode().value();
            if (value != 0) {
                this.d.d(EnumC11438xU.A, AbstractC9076qb1.a("Failed to convert Element to Flatbuffers:", value), c3184Yn2, null);
                return C6533jA0.p0(c7849n00).i;
            }
            C1680My0 e = e(c7849n00, c3184Yn2, c5427fx0, null, h10);
            if (!z || (b = AbstractC12203zi0.b(c5427fx0, null, null, null)) == null) {
                return e;
            }
            C10488ui0 c10488ui0 = new C10488ui0(null, null);
            synchronized (c10488ui0.e) {
                c10488ui0.d = b;
            }
            Sq4 p0 = Tq4.p0(c7849n00);
            p0.x(e);
            ((BY) p0.h.b0()).l = c10488ui0;
            return p0.d();
        }
        throw new IllegalStateException("status: ".concat(String.valueOf(convert.b())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [xG3] */
    public final C1680My0 e(C7849n00 c7849n00, U80 u80, C5427fx0 c5427fx0, InterfaceC6115hx0 interfaceC6115hx0, H10 h10) {
        if (this.e && ((C3184Yn) u80).t == null) {
            throw new IllegalStateException("Element tree missing id in debug mode.");
        }
        C11029wG3 c11029wG3 = InterfaceC11372xG3.a;
        ?? r1 = ((C3184Yn) u80).e;
        if (r1 != 0) {
            c11029wG3 = r1;
        }
        WZ f = f(c7849n00, u80, c5427fx0, interfaceC6115hx0, Collections.synchronizedList(new ArrayList()), 0, true);
        int i2 = C1680My0.I;
        C1550Ly0 c1550Ly0 = new C1550Ly0();
        C1680My0 c1680My0 = new C1680My0();
        c1550Ly0.m(c7849n00, 0, 0, c1680My0);
        c1550Ly0.i = c1680My0;
        BitSet bitSet = c1550Ly0.k;
        bitSet.clear();
        c1550Ly0.i.F = f == null ? null : f.k0();
        bitSet.set(1);
        c1550Ly0.i.G = this;
        bitSet.set(2);
        c1550Ly0.i.H = c11029wG3;
        bitSet.set(3);
        c1550Ly0.i.D = h10;
        bitSet.set(0);
        if (interfaceC6115hx0 != null) {
            c1550Ly0.i.E = interfaceC6115hx0;
        }
        if (c5427fx0.k() != null && !c5427fx0.k().equals("deprecated_option_force_clip_bounds")) {
            c1550Ly0.n(c5427fx0.k());
        }
        TZ.e(4, bitSet, c1550Ly0.j);
        return c1550Ly0.i;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(5:(1:(1:52)(7:53|54|55|56|(2:58|59)(2:68|(1:70)(1:71))|(1:61)(3:63|(1:65)|66)|62))|56|(0)(0)|(0)(0)|62)|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ef, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f0, code lost:            r10 = r7;        r19 = "Error while converting ";        r14 = r6;     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d0, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d1, code lost:            r14 = r6;        r10 = r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:            r0 = th;     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01ce, code lost:            r10 = r7;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017f A[Catch: all -> 0x01c1, ty0 -> 0x01c5, Ir1 -> 0x01c9, TryCatch #5 {Ir1 -> 0x01c9, ty0 -> 0x01c5, all -> 0x01c1, blocks: (B:59:0x0158, B:63:0x017f, B:65:0x019f, B:66:0x01b0, B:68:0x015d, B:70:0x0169), top: B:56:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015d A[Catch: all -> 0x01c1, ty0 -> 0x01c5, Ir1 -> 0x01c9, TryCatch #5 {Ir1 -> 0x01c9, ty0 -> 0x01c5, all -> 0x01c1, blocks: (B:59:0x0158, B:63:0x017f, B:65:0x019f, B:66:0x01b0, B:68:0x015d, B:70:0x0169), top: B:56:0x0145 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006d  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v8, types: [sy0] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [U80] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r21v0, types: [hx0] */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v5, types: [TF0] */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.WZ f(defpackage.C7849n00 r18, defpackage.U80 r19, defpackage.C5427fx0 r20, defpackage.InterfaceC6115hx0 r21, java.util.List r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10049tQ2.f(n00, U80, fx0, hx0, java.util.List, int, boolean):WZ");
    }

    public final List a(C7849n00 c7849n00, U80 u80, final InterfaceC6115hx0 interfaceC6115hx0, C5427fx0 c5427fx0, final List list, boolean z) {
        WZ f;
        int i2 = c5427fx0.i();
        if (i2 == 0) {
            C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
            return OL2.j;
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(i2, null));
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList2.add(Integer.valueOf(i3));
        }
        if (!z) {
            Collections.shuffle(arrayList2);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            final int intValue = ((Integer) arrayList2.get(i4)).intValue();
            final C5427fx0 h = c5427fx0.h(intValue);
            if (z) {
                int i5 = C2981Wy1.F;
                C2721Uy1 c2721Uy1 = new C2721Uy1();
                C2981Wy1 c2981Wy1 = new C2981Wy1();
                c2721Uy1.m(c7849n00, 0, 0, c2981Wy1);
                c2721Uy1.i = c2981Wy1;
                c2721Uy1.k.clear();
                c2721Uy1.w(new InterfaceC7161l00() { // from class: sQ2
                    @Override // defpackage.InterfaceC7161l00
                    public final WZ a(C7849n00 c7849n002, U80 u802) {
                        return C10049tQ2.this.f(c7849n002, u802, h, interfaceC6115hx0, list, intValue, false);
                    }
                });
                c2721Uy1.x(u80);
                TZ.e(1, c2721Uy1.k, c2721Uy1.j);
                f = c2721Uy1.i;
            } else {
                f = f(c7849n00, u80, h, interfaceC6115hx0, list, intValue, false);
            }
            arrayList.set(((Integer) arrayList2.get(i4)).intValue(), f);
        }
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next != null) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WZ b(TF0 tf0, C7849n00 c7849n00, C3184Yn c3184Yn, C5427fx0 c5427fx0, List list, InterfaceC6115hx0 interfaceC6115hx0, boolean z) {
        C3184Yn c3184Yn2;
        C8367oX c8367oX;
        h hVar;
        UF0 uf0;
        C3184Yn c3184Yn3;
        h hVar2;
        h hVar3;
        C7150ky0 c7150ky0 = (C7150ky0) this.a.get(tf0.j());
        if (c7150ky0 == null) {
            return null;
        }
        AbstractC11362xE3 a = c7150ky0.d.a(tf0.f(6));
        UF0 l = c5427fx0.l();
        if (l == null) {
            l = j;
        }
        UF0 uf02 = l;
        if (c5427fx0.m() == null || c5427fx0.m().j() != 158796298) {
            c3184Yn2 = c3184Yn;
        } else {
            C3054Xn c3054Xn = new C3054Xn(c3184Yn);
            c3054Xn.x = new AtomicReference();
            c3184Yn2 = c3054Xn.a();
        }
        String k = c5427fx0.k();
        List a2 = a(c7849n00, c3184Yn2, interfaceC6115hx0, c5427fx0, list, c7150ky0.e);
        if (RP0.k(uf02, 168774585) != null) {
            AbstractC0562Ei1 abstractC0562Ei1 = c3184Yn2.v != null ? null : c3184Yn2.q;
            if (abstractC0562Ei1 == null) {
                C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
                abstractC0562Ei1 = OL2.j;
            }
            c8367oX = new C8367oX(abstractC0562Ei1);
        } else {
            c8367oX = null;
        }
        boolean z2 = c7150ky0.c == 168777401;
        h hVar4 = new h(c3184Yn2.b(), z2, c3184Yn2.j);
        if (interfaceC6115hx0 != null) {
            AbstractC5771gx0 a3 = interfaceC6115hx0.a(hVar4);
            C3054Xn c3054Xn2 = new C3054Xn(c3184Yn2);
            c3054Xn2.q = a3;
            c3184Yn2 = c3054Xn2.a();
            hVar = a3;
        } else {
            hVar = hVar4;
        }
        C3184Yn c3184Yn4 = c3184Yn2;
        hVar4.d = c7150ky0.b.a(c7849n00, c3184Yn4, a, k, uf02, c8367oX, a2);
        InterfaceC7238lD2 interfaceC7238lD2 = c7150ky0.a;
        if (z) {
            uf0 = uf02;
            c3184Yn3 = c3184Yn4;
            hVar2 = hVar;
            hVar3 = hVar4;
            ((C7582mD2) interfaceC7238lD2).a(c7849n00, c3184Yn4, k, hVar4, interfaceC6115hx0);
        } else {
            uf0 = uf02;
            c3184Yn3 = c3184Yn4;
            hVar2 = hVar;
            hVar3 = hVar4;
        }
        if (!z2) {
            ((C7582mD2) interfaceC7238lD2).c(c7849n00, c3184Yn3, k, uf0, hVar2, c8367oX);
            String str = c3184Yn3.t;
            if (str != null && c3184Yn3.u) {
                hVar2.g(R.id.elements_tree_debug_id, str);
            }
        }
        C8884q1 c8884q1 = new C8884q1();
        if (RP0.m(uf0, c8884q1)) {
            C9226r1.f(c8884q1, hVar2);
        }
        WZ r = hVar2.r(c7849n00);
        hVar3.d = null;
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WZ c(TF0 tf0, C7849n00 c7849n00, C3184Yn c3184Yn, C5427fx0 c5427fx0, List list, InterfaceC6115hx0 interfaceC6115hx0, boolean z) {
        C8367oX c8367oX;
        h hVar;
        h hVar2;
        h hVar3;
        C3184Yn c3184Yn2 = c3184Yn;
        C7494ly0 c7494ly0 = (C7494ly0) this.b.get(tf0.j());
        if (c7494ly0 == null) {
            return null;
        }
        MessageLite a = AbstractC5180fE1.a(tf0.f(6), ((OX0) c7494ly0.c).c.h(), XF0.d());
        UF0 l = c5427fx0.l();
        if (l == null) {
            l = new UF0();
        }
        UF0 uf0 = l;
        String k = c5427fx0.k();
        a(c7849n00, c3184Yn, interfaceC6115hx0, c5427fx0, list, false);
        if (RP0.k(uf0, 168774585) != null) {
            AbstractC0562Ei1 abstractC0562Ei1 = c3184Yn2.v != null ? null : c3184Yn2.q;
            if (abstractC0562Ei1 == null) {
                C0172Bi1 c0172Bi1 = AbstractC0562Ei1.g;
                abstractC0562Ei1 = OL2.j;
            }
            c8367oX = new C8367oX(abstractC0562Ei1);
        } else {
            c8367oX = null;
        }
        h hVar4 = new h(c3184Yn.b(), false, false);
        if (interfaceC6115hx0 != null) {
            AbstractC5771gx0 a2 = interfaceC6115hx0.a(hVar4);
            C3054Xn c3054Xn = new C3054Xn(c3184Yn2);
            c3054Xn.q = a2;
            hVar = a2;
            c3184Yn2 = c3054Xn.a();
        } else {
            hVar = hVar4;
        }
        hVar4.d = c7494ly0.b.a(c7849n00, c3184Yn2, a);
        InterfaceC7238lD2 interfaceC7238lD2 = c7494ly0.a;
        if (z) {
            hVar2 = hVar;
            hVar3 = hVar4;
            ((C7582mD2) interfaceC7238lD2).a(c7849n00, c3184Yn2, k, hVar4, interfaceC6115hx0);
        } else {
            hVar2 = hVar;
            hVar3 = hVar4;
        }
        ((C7582mD2) interfaceC7238lD2).c(c7849n00, c3184Yn2, k, uf0, hVar2, c8367oX);
        String str = c3184Yn2.t;
        if (str != null && c3184Yn2.u) {
            hVar2.g(R.id.elements_tree_debug_id, str);
        }
        C8884q1 c8884q1 = new C8884q1();
        if (RP0.m(uf0, c8884q1)) {
            C9226r1.f(c8884q1, hVar2);
        }
        WZ r = hVar2.r(c7849n00);
        hVar3.d = null;
        return r;
    }
}
