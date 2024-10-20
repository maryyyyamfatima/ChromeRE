package defpackage;

import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Mj0 */
/* loaded from: classes.dex */
public final class C1605Mj0 implements InterfaceC3331Zq1, Cloneable {
    public String A;
    public String B;
    public JV3 C;
    public ArrayList D;
    public HashMap E;
    public ArrayList F;
    public String G;
    public HashSet H;
    public ArrayList I;

    /* renamed from: J */
    public Paint f11457J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public float W;
    public float X;
    public float Y;
    public int Z;
    public AbstractC11581xs4 a;
    public int a0;
    public float b0;
    public float c0;
    public long d0;
    public C7849n00 g;
    public List h;
    public List i;
    public final int[] j;
    public final float[] k;
    public C11523xj0 l;
    public C3975bk0 m;
    public C3201Yq1 n;
    public C6206iD0 o;
    public C6206iD0 p;
    public C6206iD0 q;
    public C6206iD0 r;
    public C6206iD0 s;
    public C6206iD0 t;
    public C6206iD0 u;
    public Drawable v;
    public Drawable w;
    public StateListAnimator x;
    public boolean[] y;
    public C2575Tv0 z;

    @Override // defpackage.InterfaceC7242lE1
    public final void D() {
    }

    public C1605Mj0(C7849n00 c7849n00) {
        C11924ys4 c11924ys4 = new C11924ys4(D52.a);
        this.h = new ArrayList(1);
        this.j = new int[4];
        this.k = new float[4];
        this.O = -1;
        this.P = 0;
        this.T = Float.NaN;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.X = Float.NaN;
        this.Y = Float.NaN;
        this.Z = -1;
        this.a0 = -1;
        this.b0 = -1.0f;
        this.c0 = -1.0f;
        this.g = c7849n00;
        c11924ys4.k = this;
        this.a = c11924ys4;
        this.H = new HashSet();
        boolean z = B10.a;
        this.i = null;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void S(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            YogaNative.jni_YGNodeStyleSetMaxHeightJNI(((YogaNodeJNIBase) this.a).j, View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            YogaNative.jni_YGNodeStyleSetHeightJNI(((YogaNodeJNIBase) this.a).j, Float.NaN);
        } else {
            if (mode != 1073741824) {
                return;
            }
            YogaNative.jni_YGNodeStyleSetHeightJNI(((YogaNodeJNIBase) this.a).j, View.MeasureSpec.getSize(i));
        }
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void p0(int i) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            YogaNative.jni_YGNodeStyleSetMaxWidthJNI(((YogaNodeJNIBase) this.a).j, View.MeasureSpec.getSize(i));
        } else if (mode == 0) {
            YogaNative.jni_YGNodeStyleSetWidthJNI(((YogaNodeJNIBase) this.a).j, Float.NaN);
        } else {
            if (mode != 1073741824) {
                return;
            }
            YogaNative.jni_YGNodeStyleSetWidthJNI(((YogaNodeJNIBase) this.a).j, View.MeasureSpec.getSize(i));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.InterfaceC3331Zq1 d2(defpackage.C7849n00 r10, defpackage.C1605Mj0 r11, defpackage.WZ r12, java.lang.String r13, java.util.Set r14) {
        /*
            n00 r0 = r12.r
            java.util.List r1 = r11.h
            java.util.List r2 = r11.i
            WZ r3 = r11.t1()
            r4 = 0
            r5 = 1
            r6 = 2
            if (r0 == 0) goto L5d
            if (r3 == 0) goto L5d
            boolean r0 = r11.h0()
            if (r0 == 0) goto L18
            goto L5d
        L18:
            int r0 = r1.size()
            r7 = r4
        L1d:
            if (r7 >= r0) goto L3c
            java.lang.Object r8 = r1.get(r7)
            WZ r8 = (defpackage.WZ) r8
            if (r2 != 0) goto L28
            goto L2e
        L28:
            java.lang.Object r9 = r2.get(r7)
            java.lang.String r9 = (java.lang.String) r9
        L2e:
            java.lang.String r8 = defpackage.A10.c(r8)
            boolean r8 = r14.contains(r8)
            if (r8 == 0) goto L39
            goto L5d
        L39:
            int r7 = r7 + 1
            goto L1d
        L3c:
            r11.s()
            java.lang.String r0 = defpackage.A10.c(r3)
            java.util.Iterator r1 = r14.iterator()
        L47:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L47
            r0 = r5
            goto L5e
        L5b:
            r0 = r4
            goto L5e
        L5d:
            r0 = r6
        L5e:
            if (r0 == 0) goto L85
            if (r0 == r5) goto L80
            if (r0 != r6) goto L69
            Zq1 r10 = defpackage.AbstractC3106Xx1.b(r10, r12, r4, r5)
            goto L8b
        L69:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            java.lang.String r12 = " is not a valid ReconciliationMode"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L80:
            Mj0 r10 = c2(r11, r12, r13, r14, r5)
            goto L8b
        L85:
            boolean r10 = defpackage.B10.a
            Mj0 r10 = c2(r11, r12, r13, r14, r4)
        L8b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1605Mj0.d2(n00, Mj0, WZ, java.lang.String, java.util.Set):Zq1");
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void G0(PV3 pv3) {
        if (this.D == null) {
            this.D = new ArrayList(1);
        }
        this.D.add(pv3);
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void x(ArrayList arrayList) {
        if (this.F == null) {
            this.F = new ArrayList(arrayList.size());
        }
        this.F.addAll(arrayList);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void e0(EnumC8151ns4 enumC8151ns4) {
        this.d0 |= 2;
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(((YogaNodeJNIBase) this.a).j, enumC8151ns4.a);
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void Y1(WZ wz, String str) {
        this.h.add(wz);
        List list = this.i;
        if (list != null) {
            list.add(str);
        }
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean f() {
        return this.N;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void R(float f) {
        this.d0 |= 67108864;
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 Z0(Drawable drawable) {
        this.d0 |= 262144;
        this.v = drawable;
        if (drawable != null) {
            Rect rect = new Rect();
            drawable.getPadding(rect);
            if ((rect.bottom == 0 && rect.top == 0 && rect.left == 0 && rect.right == 0) ? false : true) {
                a1(EnumC10209ts4.g, rect.left);
                a1(EnumC10209ts4.h, rect.top);
                a1(EnumC10209ts4.i, rect.right);
                a1(EnumC10209ts4.j, rect.bottom);
            }
        }
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 S1(C8600pB c8600pB) {
        EnumC10209ts4 enumC10209ts4;
        this.d0 |= 268435456;
        int length = c8600pB.g.length;
        for (int i = 0; i < length; i++) {
            if (i < 0 || i >= 4) {
                throw new IllegalArgumentException(AbstractC9076qb1.a("Given index out of range of acceptable edges: ", i));
            }
            if (i == 0) {
                enumC10209ts4 = EnumC10209ts4.g;
            } else if (i == 1) {
                enumC10209ts4 = EnumC10209ts4.h;
            } else if (i == 2) {
                enumC10209ts4 = EnumC10209ts4.i;
            } else if (i == 3) {
                enumC10209ts4 = EnumC10209ts4.j;
            } else {
                throw new IllegalArgumentException(AbstractC9076qb1.a("Given unknown edge index: ", i));
            }
            int i2 = c8600pB.g[i];
            C3201Yq1 c3201Yq1 = this.n;
            if (c3201Yq1 == null || !c3201Yq1.a) {
                YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, enumC10209ts4.a, i2);
            } else {
                C3201Yq1 w = w();
                if (w.e == null) {
                    w.e = new C2575Tv0();
                }
                w.e.f(enumC10209ts4, i2);
            }
        }
        int[] iArr = this.j;
        System.arraycopy(c8600pB.h, 0, iArr, 0, iArr.length);
        float[] fArr = this.k;
        System.arraycopy(c8600pB.a, 0, fArr, 0, fArr.length);
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void D0(C2575Tv0 c2575Tv0, int[] iArr, float[] fArr) {
        this.d0 |= 268435456;
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, 0, c2575Tv0.e(EnumC10209ts4.g));
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, 1, c2575Tv0.e(EnumC10209ts4.h));
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, 2, c2575Tv0.e(EnumC10209ts4.i));
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, 3, c2575Tv0.e(EnumC10209ts4.j));
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, 7, c2575Tv0.e(EnumC10209ts4.n));
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, 6, c2575Tv0.e(EnumC10209ts4.m));
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, 4, c2575Tv0.e(EnumC10209ts4.k));
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, 5, c2575Tv0.e(EnumC10209ts4.l));
        YogaNative.jni_YGNodeStyleSetBorderJNI(((YogaNodeJNIBase) this.a).j, 8, c2575Tv0.e(EnumC10209ts4.o));
        System.arraycopy(iArr, 0, this.j, 0, iArr.length);
        System.arraycopy(fArr, 0, this.k, 0, fArr.length);
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void G1() {
        InterfaceC3331Zq1 parent = getParent();
        if (parent != null && parent.B() == 8) {
            z1(4);
        }
        if (((parent == null || parent.c0() == null) ? 0 : parent.c0().K) == 2) {
            U1().K = 2;
        }
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void k1(float f, float f2) {
        a2(this);
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) this.a;
        Object obj = yogaNodeJNIBase.k;
        if (obj instanceof InterfaceC3331Zq1) {
            ((InterfaceC3331Zq1) obj).G1();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(yogaNodeJNIBase);
        for (int i = 0; i < arrayList.size(); i++) {
            ArrayList arrayList2 = ((YogaNodeJNIBase) arrayList.get(i)).g;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    YogaNodeJNIBase yogaNodeJNIBase2 = (YogaNodeJNIBase) it.next();
                    Object obj2 = yogaNodeJNIBase2.k;
                    if (obj2 instanceof InterfaceC3331Zq1) {
                        ((InterfaceC3331Zq1) obj2).G1();
                    }
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].j;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(yogaNodeJNIBase.j, f, f2, jArr, yogaNodeJNIBaseArr);
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            ((WZ) it2.next()).E();
        }
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 A1(WZ wz) {
        if (wz != null) {
            b2(AbstractC3106Xx1.b(this.g, wz, false, false));
        }
        return this;
    }

    public final void b2(InterfaceC3331Zq1 interfaceC3331Zq1) {
        if (interfaceC3331Zq1 == null || interfaceC3331Zq1 == C7849n00.p) {
            return;
        }
        ArrayList arrayList = ((YogaNodeJNIBase) this.a).g;
        int size = arrayList == null ? 0 : arrayList.size();
        AbstractC11581xs4 abstractC11581xs4 = this.a;
        AbstractC11581xs4 W0 = interfaceC3331Zq1.W0();
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC11581xs4;
        yogaNodeJNIBase.getClass();
        if (W0 instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase2 = (YogaNodeJNIBase) W0;
            if (yogaNodeJNIBase2.a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (yogaNodeJNIBase.g == null) {
                yogaNodeJNIBase.g = new ArrayList(4);
            }
            yogaNodeJNIBase.g.add(size, yogaNodeJNIBase2);
            yogaNodeJNIBase2.a = yogaNodeJNIBase;
            YogaNative.jni_YGNodeInsertChildJNI(yogaNodeJNIBase.j, yogaNodeJNIBase2.j, size);
        }
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 W(boolean z) {
        this.d0 |= 256;
        this.K = z;
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 G(boolean z) {
        this.d0 |= 8589934592L;
        this.L = z;
        return this;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void u1(float f) {
        this.d0 |= 8;
        YogaNative.jni_YGNodeStyleSetFlexJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void X(float f) {
        this.d0 |= 64;
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void M0(int i) {
        this.d0 |= 64;
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(((YogaNodeJNIBase) this.a).j, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void s1(float f) {
        this.d0 |= 16;
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void y1(float f) {
        this.d0 |= 32;
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 V(C6206iD0 c6206iD0) {
        this.d0 |= 2097152;
        this.q = Z1(this.q, c6206iD0);
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 D1(Drawable drawable) {
        this.d0 |= 524288;
        this.w = drawable;
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 T(int i, Paint paint) {
        if (i != -1) {
            this.O = i;
            this.f11457J = paint;
        }
        return this;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int m0() {
        return this.O;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final Paint R1() {
        return this.f11457J;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 T0(C6206iD0 c6206iD0) {
        this.d0 |= 4194304;
        this.s = Z1(this.s, c6206iD0);
        return this;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int[] q1() {
        return this.j;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final float[] o0() {
        return this.k;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 f0(C1032Hy1 c1032Hy1, C7849n00 c7849n00, WZ wz, String str) {
        HashSet hashSet;
        Set set;
        C7070kk3 c7070kk3 = c7849n00.d;
        if (c7070kk3 != null) {
            synchronized (c7070kk3) {
                hashSet = new HashSet();
                HashMap hashMap = c7070kk3.d;
                if (hashMap != null) {
                    hashSet.addAll(hashMap.keySet());
                }
                HashMap hashMap2 = c7070kk3.a;
                if (hashMap2 != null) {
                    hashSet.addAll(hashMap2.keySet());
                }
            }
            set = hashSet;
        } else {
            set = Collections.emptySet();
        }
        return d2(c7849n00, this, wz, str, set);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final InterfaceC3331Zq1 a(int i) {
        ArrayList arrayList = ((YogaNodeJNIBase) this.a).g;
        if (arrayList == null) {
            throw new IllegalStateException("YogaNode does not have children");
        }
        return (InterfaceC3331Zq1) ((YogaNodeJNIBase) arrayList.get(i)).k;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int L() {
        ArrayList arrayList = ((YogaNodeJNIBase) this.a).g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // defpackage.InterfaceC7242lE1
    public final List V0() {
        return this.h;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final List d0() {
        return this.i;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final List M1() {
        return this.I;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final Map m1() {
        return this.E;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C7849n00 getContext() {
        return this.g;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C11523xj0 E0() {
        return this.l;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void M(C11523xj0 c11523xj0) {
        this.l = c11523xj0;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C6206iD0 o1() {
        return this.q;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final Drawable l1() {
        return this.w;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C6206iD0 n0() {
        return this.s;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final WZ t1() {
        if (this.h.isEmpty()) {
            return null;
        }
        return (WZ) this.h.get(r0.size() - 1);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final String s() {
        List list = this.i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) this.i.get(r0.size() - 1);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int B() {
        return this.P;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C6206iD0 l0() {
        return this.t;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int b0() {
        return this.a0;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void N(int i) {
        this.a0 = i;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final float r0() {
        return this.c0;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void F1(float f) {
        this.c0 = f;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final float B0() {
        return this.b0;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void A(float f) {
        this.b0 = f;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int U0() {
        return this.Z;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void t(int i) {
        this.Z = i;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int d1(EnumC10209ts4 enumC10209ts4) {
        return FH0.a(this.a.b(enumC10209ts4));
    }

    @Override // defpackage.InterfaceC7242lE1
    public final InterfaceC3331Zq1 g() {
        C3201Yq1 c3201Yq1 = this.n;
        if (c3201Yq1 != null) {
            return c3201Yq1.b;
        }
        return null;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void p(InterfaceC3331Zq1 interfaceC3331Zq1) {
        if (interfaceC3331Zq1 != C7849n00.p) {
            interfaceC3331Zq1.w().c = this;
        }
        w().b = interfaceC3331Zq1;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final InterfaceC3331Zq1 k() {
        C3201Yq1 c3201Yq1 = this.n;
        if (c3201Yq1 != null) {
            return c3201Yq1.c;
        }
        return null;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C3975bk0 c0() {
        return this.m;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void v0(C3975bk0 c3975bk0) {
        this.m = c3975bk0;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final C3201Yq1 w() {
        if (this.n == null) {
            this.n = new C3201Yq1();
        }
        return this.n;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final C3975bk0 U1() {
        if (this.m == null) {
            this.m = new C3975bk0();
        }
        return this.m;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final InterfaceC3331Zq1 getParent() {
        AbstractC11581xs4 abstractC11581xs4 = this.a;
        if (abstractC11581xs4 == null || ((YogaNodeJNIBase) abstractC11581xs4).a == null) {
            return null;
        }
        return (InterfaceC3331Zq1) ((YogaNodeJNIBase) abstractC11581xs4).a.k;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C5277fX3 e() {
        C3201Yq1 c3201Yq1 = this.n;
        if (c3201Yq1 != null) {
            return c3201Yq1.f;
        }
        return null;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final WZ t0() {
        if (this.h.isEmpty()) {
            return null;
        }
        return (WZ) this.h.get(0);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final String O0() {
        List list = this.i;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) this.i.get(0);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final StateListAnimator C1() {
        return this.x;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int l() {
        return this.Q;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final EnumC9866ss4 e1() {
        return EnumC9866ss4.a(YogaNative.jni_YGNodeStyleGetDirectionJNI(((YogaNodeJNIBase) this.a).j));
    }

    @Override // defpackage.InterfaceC7242lE1
    public final float C() {
        return YogaNodeJNIBase.j(YogaNative.jni_YGNodeStyleGetHeightJNI(((YogaNodeJNIBase) this.a).j)).a;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final float K0() {
        return YogaNodeJNIBase.j(YogaNative.jni_YGNodeStyleGetWidthJNI(((YogaNodeJNIBase) this.a).j)).a;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final String W1() {
        return this.G;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int P1() {
        if (f2()) {
            return FH0.a(this.z.b(EnumC10209ts4.j));
        }
        return 0;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int H0() {
        if (!f2()) {
            return 0;
        }
        if (AbstractC9523rs4.a(this.T)) {
            this.T = e2(this.z, EnumC10209ts4.g);
        }
        return FH0.a(this.T);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int v1() {
        if (!f2()) {
            return 0;
        }
        if (AbstractC9523rs4.a(this.U)) {
            this.U = e2(this.z, EnumC10209ts4.i);
        }
        return FH0.a(this.U);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int I() {
        if (f2()) {
            return FH0.a(this.z.b(EnumC10209ts4.h));
        }
        return 0;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final String P() {
        return this.A;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final String q() {
        return this.B;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final JV3 E() {
        return this.C;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final ArrayList X0() {
        return this.D;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final String J() {
        WZ t0 = t0();
        if (t0 == null) {
            return null;
        }
        O0();
        return A10.c(t0);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C6206iD0 u() {
        return this.r;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C6206iD0 p1() {
        return this.u;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C6206iD0 r() {
        return this.o;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final C6206iD0 k0() {
        return this.p;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final float j0() {
        return this.R;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final float H1() {
        return this.S;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final ArrayList q0() {
        return this.F;
    }

    public static C1605Mj0 c2(C1605Mj0 c1605Mj0, WZ wz, String str, Set set, int i) {
        AbstractC11581xs4 abstractC11581xs4 = c1605Mj0.a;
        YogaNodeJNIBase a = abstractC11581xs4.a();
        try {
            C1605Mj0 c1605Mj02 = (C1605Mj0) super.clone();
            c1605Mj02.getClass();
            c1605Mj02.h = new ArrayList();
            if (c1605Mj02.i != null) {
                c1605Mj02.i = new ArrayList();
            }
            c1605Mj02.l = null;
            c1605Mj02.H = null;
            c1605Mj02.T = Float.NaN;
            c1605Mj02.U = Float.NaN;
            c1605Mj02.V = Float.NaN;
            c1605Mj02.W = Float.NaN;
            c1605Mj02.X = Float.NaN;
            c1605Mj02.Y = Float.NaN;
            int size = c1605Mj0.h.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = c1605Mj0.i == null ? null : new ArrayList(size);
            arrayList.add(wz);
            if (arrayList2 != null) {
                arrayList2.add(str);
            }
            C7849n00 c7849n00 = wz.r;
            for (int i2 = size - 2; i2 >= 0; i2--) {
                WZ wz2 = (WZ) c1605Mj0.h.get(i2);
                List list = c1605Mj0.i;
                if (list != null) {
                }
                String c = A10.c(wz2);
                WZ l0 = ((WZ) c1605Mj0.h.get(i2)).l0(c7849n00);
                arrayList.add(l0);
                if (c1605Mj0.i != null) {
                    arrayList2.add(c);
                }
                c7849n00 = l0.r;
            }
            Collections.reverse(arrayList);
            if (arrayList2 != null) {
                Collections.reverse(arrayList2);
            }
            C7849n00 c7849n002 = wz.r;
            c1605Mj02.g = c7849n002;
            c1605Mj02.a = a;
            a.k = c1605Mj02;
            c1605Mj02.h = arrayList;
            c1605Mj02.i = arrayList2;
            c1605Mj02.l = null;
            c1605Mj02.E = null;
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                WZ wz3 = (WZ) arrayList.get(i3);
                if (arrayList2 != null) {
                }
                A10.c(wz3);
                wz3.getClass();
            }
            ArrayList arrayList3 = c1605Mj02.F;
            c1605Mj02.F = null;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                c1605Mj02.F = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    Nq4 nq4 = (Nq4) it.next();
                    c1605Mj02.F.add(new Nq4(nq4.a, nq4.b, nq4.c.l0(c7849n002), nq4.d));
                }
            }
            WZ t0 = c1605Mj02.t0();
            c1605Mj02.O0();
            C7849n00 c7849n003 = t0.r;
            if (c1605Mj02.g() != null) {
                c1605Mj02.w().b = null;
            }
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) abstractC11581xs4;
            ArrayList arrayList4 = yogaNodeJNIBase.g;
            int size3 = arrayList4 == null ? 0 : arrayList4.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ArrayList arrayList5 = yogaNodeJNIBase.g;
                if (arrayList5 == null) {
                    throw new IllegalStateException("YogaNode does not have children");
                }
                C1605Mj0 c1605Mj03 = (C1605Mj0) ((YogaNodeJNIBase) arrayList5.get(i4)).k;
                List list2 = c1605Mj03.h;
                List list3 = c1605Mj03.i;
                int max = Math.max(0, list2.size() - 1);
                WZ wz4 = (WZ) list2.get(max);
                String str2 = list3 == null ? null : (String) list3.get(max);
                WZ l02 = wz4.l0(c7849n003);
                c1605Mj02.b2(i == 0 ? c2(c1605Mj03, l02, str2, set, 0) : d2(c7849n003, c1605Mj03, l02, str2, set));
            }
            return c1605Mj02;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.InterfaceC7242lE1
    public final AbstractC11581xs4 W0() {
        return this.a;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean a0() {
        boolean z;
        int[] iArr = this.j;
        int length = iArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            }
            if (iArr[i] != 0) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return (this.a.b(EnumC10209ts4.g) == 0.0f && this.a.b(EnumC10209ts4.h) == 0.0f && this.a.b(EnumC10209ts4.i) == 0.0f && this.a.b(EnumC10209ts4.j) == 0.0f) ? false : true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean w0() {
        C3201Yq1 c3201Yq1 = this.n;
        return (c3201Yq1 == null || c3201Yq1.b == null) ? false : true;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean g1() {
        return (this.d0 & 1073741824) != 0;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean x1() {
        return (this.d0 & 33554432) != 0;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean o() {
        return !TextUtils.isEmpty(this.A);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean C0() {
        return (this.o == null && this.p == null && this.q == null && this.r == null && this.s == null && this.t == null && this.u == null) ? false : true;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void A0(float f) {
        this.d0 |= 32768;
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void d(int i) {
        this.d0 |= 32768;
        YogaNative.jni_YGNodeStyleSetHeightJNI(((YogaNodeJNIBase) this.a).j, i);
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 z1(int i) {
        this.d0 |= 128;
        this.P = i;
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 I0(C6206iD0 c6206iD0) {
        this.d0 |= 8388608;
        this.t = Z1(this.t, c6206iD0);
        return this;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean n1() {
        return this.K;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean i() {
        return this.L;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean s0() {
        return this.M;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean P0() {
        return (this.d0 & 128) == 0 || this.P == 0;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean isInitialized() {
        return (this.a == null || this.g == null) ? false : true;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean h() {
        return (this.d0 & 1) == 0 || T1() == EnumC9866ss4.g;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean h0() {
        C3201Yq1 c3201Yq1 = this.n;
        return c3201Yq1 != null && c3201Yq1.a;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void L0(boolean z) {
        YogaNative.jni_YGNodeSetIsReferenceBaselineJNI(((YogaNodeJNIBase) this.a).j, z);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void j1(EnumC9866ss4 enumC9866ss4) {
        this.d0 |= 1;
        YogaNative.jni_YGNodeStyleSetDirectionJNI(((YogaNodeJNIBase) this.a).j, enumC9866ss4.a);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void K(EnumC10209ts4 enumC10209ts4) {
        this.d0 |= 512;
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(((YogaNodeJNIBase) this.a).j, enumC10209ts4.a);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void y0(EnumC10209ts4 enumC10209ts4, float f) {
        this.d0 |= 512;
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(((YogaNodeJNIBase) this.a).j, enumC10209ts4.a, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void w1(EnumC10209ts4 enumC10209ts4, int i) {
        this.d0 |= 512;
        YogaNative.jni_YGNodeStyleSetMarginJNI(((YogaNodeJNIBase) this.a).j, enumC10209ts4.a, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void J1(float f) {
        this.d0 |= 131072;
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void z0(int i) {
        this.d0 |= 131072;
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(((YogaNodeJNIBase) this.a).j, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void g0(float f) {
        this.d0 |= 16384;
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void f1(int i) {
        this.d0 |= 16384;
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(((YogaNodeJNIBase) this.a).j, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void O1(float f) {
        this.d0 |= 65536;
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void O(int i) {
        this.d0 |= 65536;
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(((YogaNodeJNIBase) this.a).j, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void i1(float f) {
        this.d0 |= 8192;
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void V1(int i) {
        this.d0 |= 8192;
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(((YogaNodeJNIBase) this.a).j, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void c1(EnumC10209ts4 enumC10209ts4, float f) {
        this.d0 |= 1024;
        C3201Yq1 c3201Yq1 = this.n;
        int i = enumC10209ts4.a;
        if (c3201Yq1 == null || !c3201Yq1.a) {
            YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(((YogaNodeJNIBase) this.a).j, i, f);
            return;
        }
        C3201Yq1 w = w();
        if (w.d == null) {
            w.d = new C2575Tv0();
        }
        w.d.f(enumC10209ts4, f);
        if (this.y == null) {
            this.y = new boolean[9];
        }
        boolean[] zArr = this.y;
        if (zArr != null) {
            zArr[i] = true;
        }
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void a1(EnumC10209ts4 enumC10209ts4, int i) {
        this.d0 |= 1024;
        C3201Yq1 c3201Yq1 = this.n;
        int i2 = enumC10209ts4.a;
        if (c3201Yq1 == null || !c3201Yq1.a) {
            YogaNative.jni_YGNodeStyleSetPaddingJNI(((YogaNodeJNIBase) this.a).j, i2, i);
            return;
        }
        C3201Yq1 w = w();
        if (w.d == null) {
            w.d = new C2575Tv0();
        }
        w.d.f(enumC10209ts4, i);
        boolean[] zArr = this.y;
        if (zArr != null) {
            zArr[i2] = false;
        }
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void S0(EnumC10209ts4 enumC10209ts4, float f) {
        this.d0 |= 2048;
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(((YogaNodeJNIBase) this.a).j, enumC10209ts4.a, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void I1(EnumC10209ts4 enumC10209ts4, int i) {
        this.d0 |= 2048;
        YogaNative.jni_YGNodeStyleSetPositionJNI(((YogaNodeJNIBase) this.a).j, enumC10209ts4.a, i);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void J0(EnumC12267zs4 enumC12267zs4) {
        this.d0 |= 4;
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(((YogaNodeJNIBase) this.a).j, enumC12267zs4.a);
    }

    @Override // defpackage.InterfaceC7242lE1
    public final EnumC9866ss4 m() {
        EnumC9866ss4 enumC9866ss4;
        AbstractC11581xs4 abstractC11581xs4 = this.a;
        while (true) {
            enumC9866ss4 = EnumC9866ss4.g;
            if (abstractC11581xs4 == null || abstractC11581xs4.c() != enumC9866ss4) {
                break;
            }
            abstractC11581xs4 = ((YogaNodeJNIBase) abstractC11581xs4).a;
        }
        return abstractC11581xs4 == null ? enumC9866ss4 : abstractC11581xs4.c();
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void Y(C3025Xh0 c3025Xh0) {
        if (this.H == null) {
            this.H = new HashSet();
        }
        this.H.add(c3025Xh0);
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void v() {
        this.N = true;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void y(C12046zE1 c12046zE1) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) this.a;
        yogaNodeJNIBase.h = c12046zE1;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(yogaNodeJNIBase.j, c12046zE1 != null);
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 u0(StateListAnimator stateListAnimator) {
        this.d0 |= 536870912;
        this.x = stateListAnimator;
        this.M = true;
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 n(int i) {
        this.d0 |= 1073741824;
        this.Q = i;
        this.M = true;
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 Y0(String str) {
        this.G = str;
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 H(EnumC10209ts4 enumC10209ts4, int i) {
        if (this.z == null) {
            this.z = new C2575Tv0();
        }
        this.d0 |= 33554432;
        this.z.f(enumC10209ts4, i);
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 z(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.d0 |= 134217728;
            this.A = str;
            this.B = str2;
        }
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 i0(JV3 jv3) {
        this.d0 |= 4294967296L;
        this.C = jv3;
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 x0(C6206iD0 c6206iD0) {
        this.d0 |= 16777216;
        this.r = Z1(this.r, c6206iD0);
        return this;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void E1(boolean z) {
        if (z) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) this.a;
            yogaNodeJNIBase.i = new C1476Lj0();
            YogaNative.jni_YGNodeSetHasBaselineFuncJNI(yogaNodeJNIBase.j, true);
        }
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 F(C6206iD0 c6206iD0) {
        this.d0 |= 2147483648L;
        this.u = Z1(this.u, c6206iD0);
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 h1(C6206iD0 c6206iD0) {
        this.d0 |= 1048576;
        this.o = Z1(this.o, c6206iD0);
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 Q0(C6206iD0 c6206iD0) {
        this.d0 |= Long.MIN_VALUE;
        this.p = Z1(this.p, c6206iD0);
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 K1(float f) {
        this.R = f;
        return this;
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 Z(float f) {
        this.S = f;
        return this;
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void Q(float f) {
        this.d0 |= 4096;
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(((YogaNodeJNIBase) this.a).j, f);
    }

    @Override // defpackage.InterfaceC0382Cy1
    public final void F0(int i) {
        this.d0 |= 4096;
        YogaNative.jni_YGNodeStyleSetWidthJNI(((YogaNodeJNIBase) this.a).j, i);
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final InterfaceC3331Zq1 r1() {
        this.M = true;
        return this;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int B1() {
        if (AbstractC9523rs4.a(this.V)) {
            this.V = this.a.h();
        }
        return (int) this.V;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int X1() {
        if (AbstractC9523rs4.a(this.W)) {
            this.W = this.a.i();
        }
        return (int) this.W;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int getWidth() {
        if (AbstractC9523rs4.a(this.X)) {
            this.X = this.a.g();
        }
        return (int) this.X;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int getHeight() {
        if (AbstractC9523rs4.a(this.Y)) {
            this.Y = this.a.d();
        }
        return (int) this.Y;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int L1() {
        return FH0.a(this.a.f(EnumC10209ts4.h));
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int N0() {
        return FH0.a(this.a.f(EnumC10209ts4.i));
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int j() {
        return FH0.a(this.a.f(EnumC10209ts4.j));
    }

    @Override // defpackage.InterfaceC7242lE1
    public final int N1() {
        return FH0.a(this.a.f(EnumC10209ts4.g));
    }

    @Override // defpackage.InterfaceC7242lE1
    public final boolean Q1() {
        return (this.d0 & 1024) != 0;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final Drawable c() {
        return this.v;
    }

    @Override // defpackage.InterfaceC7242lE1
    public final EnumC9866ss4 T1() {
        return this.a.c();
    }

    @Override // defpackage.InterfaceC6871k90
    public final void U(InterfaceC3331Zq1 interfaceC3331Zq1) {
        C2575Tv0 c2575Tv0;
        if (interfaceC3331Zq1 == C7849n00.p) {
            return;
        }
        if (this.m != null) {
            if (interfaceC3331Zq1.c0() == null) {
                interfaceC3331Zq1.v0(this.m);
            } else {
                this.m.b(interfaceC3331Zq1.U1());
            }
        }
        if (interfaceC3331Zq1.h()) {
            interfaceC3331Zq1.j1(T1());
        }
        if (interfaceC3331Zq1.P0()) {
            interfaceC3331Zq1.z1(this.P);
        }
        if ((this.d0 & 256) != 0) {
            interfaceC3331Zq1.W(this.K);
        }
        if ((this.d0 & 8589934592L) != 0) {
            interfaceC3331Zq1.G(this.L);
        }
        if ((this.d0 & 262144) != 0) {
            interfaceC3331Zq1.Z0(this.v);
        }
        if ((this.d0 & 524288) != 0) {
            interfaceC3331Zq1.D1(this.w);
        }
        if (this.M) {
            interfaceC3331Zq1.r1();
        }
        if ((this.d0 & 1048576) != 0) {
            interfaceC3331Zq1.h1(this.o);
        }
        if ((this.d0 & Long.MIN_VALUE) != 0) {
            interfaceC3331Zq1.Q0(this.p);
        }
        if ((this.d0 & 2097152) != 0) {
            interfaceC3331Zq1.V(this.q);
        }
        if ((this.d0 & 4194304) != 0) {
            interfaceC3331Zq1.T0(this.s);
        }
        if ((this.d0 & 8388608) != 0) {
            interfaceC3331Zq1.I0(this.t);
        }
        if ((this.d0 & 16777216) != 0) {
            interfaceC3331Zq1.x0(this.r);
        }
        if ((this.d0 & 2147483648L) != 0) {
            interfaceC3331Zq1.F(this.u);
        }
        String str = this.G;
        if (str != null) {
            interfaceC3331Zq1.Y0(str);
        }
        if ((this.d0 & 1024) != 0) {
            C3201Yq1 c3201Yq1 = this.n;
            if (c3201Yq1 == null || c3201Yq1.d == null) {
                throw new IllegalStateException("copyInto() must be used when resolving a nestedTree. If padding was set on the holder node, we must have a mNestedTreePadding instance");
            }
            for (int i = 0; i < C2575Tv0.i; i++) {
                float d = this.n.d.d(i);
                if (!AbstractC9523rs4.a(d)) {
                    EnumC10209ts4 a = EnumC10209ts4.a(i);
                    boolean[] zArr = this.y;
                    if (zArr != null && zArr[a.a]) {
                        interfaceC3331Zq1.c1(a, d);
                    } else {
                        interfaceC3331Zq1.a1(a, (int) d);
                    }
                }
            }
        }
        if ((this.d0 & 268435456) != 0) {
            C3201Yq1 c3201Yq12 = this.n;
            if (c3201Yq12 == null || (c2575Tv0 = c3201Yq12.e) == null) {
                throw new IllegalStateException("copyInto() must be used when resolving a nestedTree.If border width was set on the holder node, we must have a mNestedTreeBorderWidth instance");
            }
            interfaceC3331Zq1.D0(c2575Tv0, this.j, this.k);
        }
        if ((this.d0 & 134217728) != 0) {
            interfaceC3331Zq1.z(this.A, this.B);
        }
        if ((this.d0 & 4294967296L) != 0) {
            interfaceC3331Zq1.i0(this.C);
        }
        float f = this.R;
        if (f != 0.0f) {
            interfaceC3331Zq1.K1(f);
        }
        float f2 = this.S;
        if (f2 != 0.0f) {
            interfaceC3331Zq1.Z(f2);
        }
        if ((this.d0 & 536870912) != 0) {
            interfaceC3331Zq1.u0(this.x);
        }
        if ((this.d0 & 1073741824) != 0) {
            interfaceC3331Zq1.n(this.Q);
        }
        int i2 = this.O;
        if (i2 != -1) {
            interfaceC3331Zq1.T(i2, this.f11457J);
        }
    }

    @Override // defpackage.InterfaceC3331Zq1
    public final void b(TypedArray typedArray) {
        EnumC12267zs4 enumC12267zs4;
        EnumC10552us4 enumC10552us4;
        Bs4 bs4;
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == 7) {
                int layoutDimension = typedArray.getLayoutDimension(index, -1);
                if (layoutDimension >= 0) {
                    F0(layoutDimension);
                }
            } else if (index == 8) {
                int layoutDimension2 = typedArray.getLayoutDimension(index, -1);
                if (layoutDimension2 >= 0) {
                    d(layoutDimension2);
                }
            } else if (index == 16) {
                O(typedArray.getDimensionPixelSize(index, 0));
            } else if (index == 15) {
                V1(typedArray.getDimensionPixelSize(index, 0));
            } else {
                EnumC10209ts4 enumC10209ts4 = EnumC10209ts4.g;
                if (index == 2) {
                    a1(enumC10209ts4, typedArray.getDimensionPixelOffset(index, 0));
                } else {
                    EnumC10209ts4 enumC10209ts42 = EnumC10209ts4.h;
                    if (index == 3) {
                        a1(enumC10209ts42, typedArray.getDimensionPixelOffset(index, 0));
                    } else {
                        EnumC10209ts4 enumC10209ts43 = EnumC10209ts4.i;
                        if (index == 4) {
                            a1(enumC10209ts43, typedArray.getDimensionPixelOffset(index, 0));
                        } else {
                            EnumC10209ts4 enumC10209ts44 = EnumC10209ts4.j;
                            if (index == 5) {
                                a1(enumC10209ts44, typedArray.getDimensionPixelOffset(index, 0));
                            } else {
                                EnumC10209ts4 enumC10209ts45 = EnumC10209ts4.k;
                                if (index == 19) {
                                    a1(enumC10209ts45, typedArray.getDimensionPixelOffset(index, 0));
                                } else {
                                    EnumC10209ts4 enumC10209ts46 = EnumC10209ts4.l;
                                    if (index == 20) {
                                        a1(enumC10209ts46, typedArray.getDimensionPixelOffset(index, 0));
                                    } else {
                                        EnumC10209ts4 enumC10209ts47 = EnumC10209ts4.o;
                                        int i2 = 1;
                                        if (index == 1) {
                                            a1(enumC10209ts47, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 10) {
                                            w1(enumC10209ts4, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 11) {
                                            w1(enumC10209ts42, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 12) {
                                            w1(enumC10209ts43, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 13) {
                                            w1(enumC10209ts44, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 21) {
                                            w1(enumC10209ts45, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 22) {
                                            w1(enumC10209ts46, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 9) {
                                            w1(enumC10209ts47, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 18) {
                                            z1(typedArray.getInt(index, 0));
                                        } else if (index == 6) {
                                            W(typedArray.getBoolean(index, false));
                                        } else if (index == 0) {
                                            TypedValue typedValue = AbstractC8724pZ3.a;
                                            synchronized (typedValue) {
                                                typedArray.getValue(0, typedValue);
                                                int i3 = typedValue.type;
                                                if (i3 < 28 || i3 > 31) {
                                                    i2 = 0;
                                                }
                                            }
                                            if (i2 != 0) {
                                                Z0(new TY(typedArray.getColor(index, 0)));
                                            } else {
                                                int resourceId = typedArray.getResourceId(index, -1);
                                                if (resourceId == 0) {
                                                    Z0(null);
                                                } else {
                                                    Context context = this.g.a;
                                                    Object obj = Y50.a;
                                                    Z0(context.getDrawable(resourceId));
                                                }
                                            }
                                        } else if (index == 14) {
                                            TypedValue typedValue2 = AbstractC8724pZ3.a;
                                            synchronized (typedValue2) {
                                                typedArray.getValue(14, typedValue2);
                                                int i4 = typedValue2.type;
                                                if (i4 < 28 || i4 > 31) {
                                                    i2 = 0;
                                                }
                                            }
                                            if (i2 != 0) {
                                                D1(new TY(typedArray.getColor(index, 0)));
                                            } else {
                                                int resourceId2 = typedArray.getResourceId(index, -1);
                                                if (resourceId2 == 0) {
                                                    D1(null);
                                                } else {
                                                    Context context2 = this.g.a;
                                                    Object obj2 = Y50.a;
                                                    D1(context2.getDrawable(resourceId2));
                                                }
                                            }
                                        } else if (index == 17) {
                                            C3975bk0 U1 = U1();
                                            String string = typedArray.getString(index);
                                            U1.N |= 1;
                                            U1.a = string;
                                        } else if (index == 27) {
                                            int integer = typedArray.getInteger(index, 0);
                                            if (integer != 0) {
                                                if (integer == 1) {
                                                    i2 = 2;
                                                } else if (integer == 2) {
                                                    i2 = 3;
                                                } else {
                                                    if (integer != 3) {
                                                        throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", integer));
                                                    }
                                                    i2 = 4;
                                                }
                                            }
                                            long j = ((YogaNodeJNIBase) this.a).j;
                                            if (i2 == 0) {
                                                throw null;
                                            }
                                            YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(j, i2 - 1);
                                        } else if (index == 34) {
                                            int integer2 = typedArray.getInteger(index, 0);
                                            if (integer2 == 0) {
                                                bs4 = Bs4.g;
                                            } else if (integer2 == 1) {
                                                bs4 = Bs4.h;
                                            } else {
                                                if (integer2 != 2) {
                                                    throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", integer2));
                                                }
                                                bs4 = Bs4.i;
                                            }
                                            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(((YogaNodeJNIBase) this.a).j, bs4.a);
                                        } else if (index == 28) {
                                            int integer3 = typedArray.getInteger(index, 0);
                                            if (integer3 == 0) {
                                                enumC10552us4 = EnumC10552us4.g;
                                            } else if (integer3 == 1) {
                                                enumC10552us4 = EnumC10552us4.h;
                                            } else if (integer3 == 2) {
                                                enumC10552us4 = EnumC10552us4.i;
                                            } else if (integer3 == 3) {
                                                enumC10552us4 = EnumC10552us4.j;
                                            } else if (integer3 == 4) {
                                                enumC10552us4 = EnumC10552us4.k;
                                            } else {
                                                if (integer3 != 5) {
                                                    throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", integer3));
                                                }
                                                enumC10552us4 = EnumC10552us4.l;
                                            }
                                            YogaNative.jni_YGNodeStyleSetJustifyContentJNI(((YogaNodeJNIBase) this.a).j, enumC10552us4.a);
                                        } else if (index == 24) {
                                            YogaNative.jni_YGNodeStyleSetAlignItemsJNI(((YogaNodeJNIBase) this.a).j, EnumC8151ns4.a(typedArray.getInteger(index, 0)).a);
                                        } else if (index == 25) {
                                            e0(EnumC8151ns4.a(typedArray.getInteger(index, 0)));
                                        } else if (index == 31) {
                                            int integer4 = typedArray.getInteger(index, 0);
                                            if (integer4 == 0) {
                                                enumC12267zs4 = EnumC12267zs4.g;
                                            } else if (integer4 == 1) {
                                                enumC12267zs4 = EnumC12267zs4.h;
                                            } else {
                                                if (integer4 != 2) {
                                                    throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", integer4));
                                                }
                                                enumC12267zs4 = EnumC12267zs4.i;
                                            }
                                            J0(enumC12267zs4);
                                        } else if (index == 23) {
                                            float f = typedArray.getFloat(index, -1.0f);
                                            if (f >= 0.0f) {
                                                u1(f);
                                            }
                                        } else if (index == 30) {
                                            I1(enumC10209ts4, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 33) {
                                            I1(enumC10209ts42, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 32) {
                                            I1(enumC10209ts43, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 26) {
                                            I1(enumC10209ts44, typedArray.getDimensionPixelOffset(index, 0));
                                        } else if (index == 29) {
                                            j1(EnumC9866ss4.a(typedArray.getInteger(index, -1)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.InterfaceC7242lE1
    public final void R0() {
        List a = (this.d0 & 2) != 0 ? EY.a("alignSelf", null) : null;
        if ((this.d0 & 4) != 0) {
            a = EY.a("positionType", a);
        }
        if ((this.d0 & 8) != 0) {
            a = EY.a("flex", a);
        }
        if ((this.d0 & 16) != 0) {
            a = EY.a("flexGrow", a);
        }
        if ((this.d0 & 512) != 0) {
            a = EY.a("margin", a);
        }
        if (a != null) {
            E10.a(1, "DefaultInternalNode:ContextSpecificStyleSet", IR0.a("You should not set ", String.valueOf(TextUtils.join(", ", a)), " to a root layout in ", t0().getClass().getSimpleName()));
        }
    }

    public final Object clone() {
        try {
            return (C1605Mj0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a2(InterfaceC3331Zq1 interfaceC3331Zq1) {
        if (!B10.a || interfaceC3331Zq1 == null) {
            return;
        }
        C7849n00 c7849n00 = this.g;
        HashMap hashMap = C3025Xh0.c;
        if (interfaceC3331Zq1.V0() != null && !interfaceC3331Zq1.V0().isEmpty()) {
            WZ wz = (WZ) interfaceC3331Zq1.V0().get(0);
            if (interfaceC3331Zq1.d0() != null) {
            }
            X5.a(C3025Xh0.c.get(C3025Xh0.a(c7849n00, A10.c(wz))));
        }
        int L = interfaceC3331Zq1.L();
        for (int i = 0; i < L; i++) {
            a2(interfaceC3331Zq1.a(i));
        }
        if (interfaceC3331Zq1.w0()) {
            a2(interfaceC3331Zq1.g());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:            r2 = r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:            if (r0 != false) goto L83;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:            if (r0 != false) goto L82;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float e2(defpackage.C2575Tv0 r6, defpackage.EnumC10209ts4 r7) {
        /*
            r5 = this;
            xs4 r0 = r5.a
            ss4 r0 = r0.c()
            ss4 r1 = defpackage.EnumC9866ss4.i
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            int r1 = r7.ordinal()
            ts4 r2 = defpackage.EnumC10209ts4.l
            ts4 r3 = defpackage.EnumC10209ts4.k
            if (r1 == 0) goto L2d
            r4 = 2
            if (r1 != r4) goto L1d
            if (r0 == 0) goto L31
            goto L30
        L1d:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "Not an horizontal padding edge: "
            java.lang.String r7 = r0.concat(r7)
            r6.<init>(r7)
            throw r6
        L2d:
            if (r0 == 0) goto L30
            goto L31
        L30:
            r2 = r3
        L31:
            float r0 = r6.e(r2)
            boolean r1 = defpackage.AbstractC9523rs4.a(r0)
            if (r1 == 0) goto L3f
            float r0 = r6.b(r7)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1605Mj0.e2(Tv0, ts4):float");
    }

    public final boolean f2() {
        C3975bk0 c3975bk0;
        return (this.z == null || (c3975bk0 = this.m) == null || !c3975bk0.c()) ? false : true;
    }

    public static C6206iD0 Z1(C6206iD0 c6206iD0, C6206iD0 c6206iD02) {
        return c6206iD0 == null ? c6206iD02 : c6206iD02 == null ? c6206iD0 : new C8449ol0(c6206iD0, c6206iD02);
    }
}
