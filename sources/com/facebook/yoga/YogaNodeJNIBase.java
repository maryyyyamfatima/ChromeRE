package com.facebook.yoga;

import defpackage.A10;
import defpackage.AbstractC11238ws4;
import defpackage.AbstractC11496xe3;
import defpackage.AbstractC11581xs4;
import defpackage.AbstractC3106Xx1;
import defpackage.AbstractC9076qb1;
import defpackage.As4;
import defpackage.C11523xj0;
import defpackage.C12046zE1;
import defpackage.C7849n00;
import defpackage.C8753pe3;
import defpackage.EnumC10209ts4;
import defpackage.EnumC9866ss4;
import defpackage.InterfaceC3331Zq1;
import defpackage.InterfaceC8495os4;
import defpackage.WZ;
import java.util.ArrayList;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends AbstractC11581xs4 implements Cloneable {
    public YogaNodeJNIBase a;
    private float[] arr;
    public ArrayList g;
    public C12046zE1 h;
    public InterfaceC8495os4 i;
    public long j;
    public Object k;
    private int mLayoutDirection;

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        if (j == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.j = j;
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // defpackage.AbstractC11581xs4
    public final YogaNodeJNIBase a() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeCloneJNI = YogaNative.jni_YGNodeCloneJNI(this.j);
            yogaNodeJNIBase.a = null;
            yogaNodeJNIBase.j = jni_YGNodeCloneJNI;
            yogaNodeJNIBase.g = null;
            YogaNative.jni_YGNodeClearChildrenJNI(jni_YGNodeCloneJNI);
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final float baseline(float f, float f2) {
        return this.i.a(this, f2);
    }

    public final long measure(float f, int i, float f2, int i2) {
        int height;
        int i3;
        int i4;
        C12046zE1 c12046zE1 = this.h;
        if (!(c12046zE1 != null)) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        int a = AbstractC11238ws4.a(i);
        int a2 = AbstractC11238ws4.a(i2);
        c12046zE1.getClass();
        InterfaceC3331Zq1 interfaceC3331Zq1 = (InterfaceC3331Zq1) this.k;
        WZ t0 = interfaceC3331Zq1.t0();
        interfaceC3331Zq1.O0();
        C7849n00 c7849n00 = t0.r;
        if (c7849n00 != null) {
            try {
                if (c7849n00.p()) {
                    return 0L;
                }
            } catch (Exception e) {
                throw A10.e(c7849n00, e);
            }
        }
        WZ wz = null;
        C11523xj0 E0 = interfaceC3331Zq1.f() ? interfaceC3331Zq1.E0() : null;
        int a3 = AbstractC11496xe3.a(f, a);
        int a4 = AbstractC11496xe3.a(f2, a2);
        interfaceC3331Zq1.t(a3);
        interfaceC3331Zq1.N(a4);
        C7849n00 context = interfaceC3331Zq1.getContext();
        if (!WZ.j0(t0, context) && !interfaceC3331Zq1.w0()) {
            if (E0 == null || E0.m != a3 || E0.n != a4 || t0.Q()) {
                C8753pe3 c8753pe3 = new C8753pe3(Integer.MIN_VALUE, Integer.MIN_VALUE);
                t0.G(c7849n00, interfaceC3331Zq1, a3, a4, c8753pe3);
                int i5 = c8753pe3.a;
                if (i5 < 0 || (i4 = c8753pe3.b) < 0) {
                    throw new IllegalStateException("MeasureOutput not set, ComponentLifecycle is: ".concat(String.valueOf(t0)));
                }
                if (interfaceC3331Zq1.E0() != null) {
                    interfaceC3331Zq1.E0().m = a3;
                    interfaceC3331Zq1.E0().n = a4;
                    interfaceC3331Zq1.E0().k = i5;
                    interfaceC3331Zq1.E0().l = i4;
                }
                height = i4;
                i3 = i5;
            } else {
                i3 = (int) E0.k;
                height = (int) E0.l;
            }
            interfaceC3331Zq1.A(i3);
            interfaceC3331Zq1.F1(height);
            return Float.floatToRawIntBits(r13) | (Float.floatToRawIntBits(r12) << 32);
        }
        WZ t1 = interfaceC3331Zq1.t1();
        interfaceC3331Zq1.s();
        if (t0 != t1) {
            wz = t1;
        } else if (interfaceC3331Zq1.getParent() != null) {
            wz = interfaceC3331Zq1.getParent().t0();
            interfaceC3331Zq1.getParent().O0();
        }
        if (wz != null) {
            context = wz.r;
        }
        InterfaceC3331Zq1 c = AbstractC3106Xx1.c(context, interfaceC3331Zq1, a3, a4);
        int width = c.getWidth();
        height = c.getHeight();
        i3 = width;
        interfaceC3331Zq1.A(i3);
        interfaceC3331Zq1.F1(height);
        return Float.floatToRawIntBits(r13) | (Float.floatToRawIntBits(r12) << 32);
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        ArrayList arrayList = this.g;
        if (arrayList == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        arrayList.remove(i);
        this.g.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.a = this;
        return yogaNodeJNIBase.j;
    }

    public static As4 j(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) j);
        int i = (int) (j >> 32);
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalArgumentException(AbstractC9076qb1.a("Unknown enum value: ", i));
                    }
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
        }
        return new As4(intBitsToFloat, i2);
    }

    @Override // defpackage.AbstractC11581xs4
    public final float h() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // defpackage.AbstractC11581xs4
    public final float i() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // defpackage.AbstractC11581xs4
    public final float g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // defpackage.AbstractC11581xs4
    public final float d() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // defpackage.AbstractC11581xs4
    public final float e(EnumC10209ts4 enumC10209ts4) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        int ordinal = enumC10209ts4.ordinal();
        if (ordinal == 0) {
            return this.arr[6];
        }
        if (ordinal == 1) {
            return this.arr[7];
        }
        if (ordinal == 2) {
            return this.arr[8];
        }
        if (ordinal == 3) {
            return this.arr[9];
        }
        EnumC9866ss4 enumC9866ss4 = EnumC9866ss4.i;
        if (ordinal == 4) {
            if (c() == enumC9866ss4) {
                return this.arr[8];
            }
            return this.arr[6];
        }
        if (ordinal == 5) {
            if (c() == enumC9866ss4) {
                return this.arr[6];
            }
            return this.arr[8];
        }
        throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
    }

    @Override // defpackage.AbstractC11581xs4
    public final float f(EnumC10209ts4 enumC10209ts4) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = (int) fArr[0];
        if ((i & 2) != 2) {
            return 0.0f;
        }
        int i2 = 10 - ((i & 1) != 1 ? 4 : 0);
        int ordinal = enumC10209ts4.ordinal();
        if (ordinal == 0) {
            return this.arr[i2];
        }
        if (ordinal == 1) {
            return this.arr[i2 + 1];
        }
        if (ordinal == 2) {
            return this.arr[i2 + 2];
        }
        if (ordinal == 3) {
            return this.arr[i2 + 3];
        }
        EnumC9866ss4 enumC9866ss4 = EnumC9866ss4.i;
        if (ordinal == 4) {
            if (c() == enumC9866ss4) {
                return this.arr[i2 + 2];
            }
            return this.arr[i2];
        }
        if (ordinal == 5) {
            if (c() == enumC9866ss4) {
                return this.arr[i2];
            }
            return this.arr[i2 + 2];
        }
        throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
    }

    @Override // defpackage.AbstractC11581xs4
    public final float b(EnumC10209ts4 enumC10209ts4) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        int i = (int) fArr[0];
        if ((i & 4) != 4) {
            return 0.0f;
        }
        int i2 = (14 - ((i & 1) == 1 ? 0 : 4)) - ((i & 2) != 2 ? 4 : 0);
        int ordinal = enumC10209ts4.ordinal();
        if (ordinal == 0) {
            return this.arr[i2];
        }
        if (ordinal == 1) {
            return this.arr[i2 + 1];
        }
        if (ordinal == 2) {
            return this.arr[i2 + 2];
        }
        if (ordinal == 3) {
            return this.arr[i2 + 3];
        }
        EnumC9866ss4 enumC9866ss4 = EnumC9866ss4.i;
        if (ordinal == 4) {
            if (c() == enumC9866ss4) {
                return this.arr[i2 + 2];
            }
            return this.arr[i2];
        }
        if (ordinal == 5) {
            if (c() == enumC9866ss4) {
                return this.arr[i2];
            }
            return this.arr[i2 + 2];
        }
        throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
    }

    @Override // defpackage.AbstractC11581xs4
    public final EnumC9866ss4 c() {
        float[] fArr = this.arr;
        return EnumC9866ss4.a(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }
}
