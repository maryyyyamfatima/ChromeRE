package defpackage;

import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class U40 extends WZ {

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    EnumC8151ns4 D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    EnumC8151ns4 E;

    @SY(type = 6)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Drawable G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    Integer I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    EnumC10552us4 f11472J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    String K;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    float L;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    Float M;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    Float N;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    float O;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    Integer P;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Bs4 Q;

    @SY(type = 13)
    C1156Ix0 R;

    public U40() {
        super("Container");
    }

    @Override // defpackage.AbstractC10593v00
    public final void O(C5277fX3 c5277fX3) {
        if (c5277fX3 == null) {
            return;
        }
        this.R = (C1156Ix0) c5277fX3.a(C1156Ix0.class);
    }

    @Override // defpackage.AbstractC10593v00
    public final WZ z(C7849n00 c7849n00) {
        UZ uz;
        int i = this.H;
        List list = this.F;
        C1156Ix0 c1156Ix0 = this.R;
        Drawable drawable = this.G;
        Integer num = this.I;
        EnumC8151ns4 enumC8151ns4 = this.E;
        Bs4 bs4 = this.Q;
        EnumC10552us4 enumC10552us4 = this.f11472J;
        EnumC8151ns4 enumC8151ns42 = this.D;
        Integer num2 = this.P;
        float f = this.O;
        float f2 = this.L;
        Float f3 = this.M;
        Float f4 = this.N;
        String str = this.K;
        int b = AbstractC2373Sg3.b(i);
        if (b == 1) {
            C4586dX w0 = C4929eX.w0(c7849n00);
            w0.i.I = true;
            uz = w0;
        } else if (b == 2) {
            uz = C10054tR2.w0(c7849n00);
        } else if (b == 3) {
            C9711sR2 w02 = C10054tR2.w0(c7849n00);
            w02.i.I = true;
            uz = w02;
        } else {
            uz = C4929eX.w0(c7849n00);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                uz.y(((WZ) it.next()).k0());
            }
        }
        if (enumC8151ns4 != null) {
            uz.x(enumC8151ns4);
        }
        if (bs4 != null) {
            uz.A(bs4);
        }
        if (enumC10552us4 != null) {
            uz.z(enumC10552us4);
        }
        if (enumC8151ns42 != null) {
            uz.w(enumC8151ns42);
        }
        if (str != null && c1156Ix0 != null) {
            c1156Ix0.c = str;
        }
        if (drawable != null) {
            uz.c(drawable);
        } else if (num != null) {
            C1000Hs c1000Hs = new C1000Hs();
            c1000Hs.c = num.intValue();
            c1000Hs.d = 0;
            uz.c(c1000Hs);
        }
        if (f > 0.5f) {
            C4586dX w03 = C4929eX.w0(c7849n00);
            w03.B(uz);
            C12054zG c12054zG = new C12054zG();
            AG ag = new AG();
            c12054zG.m(c7849n00, 0, 0, ag);
            c12054zG.i = ag;
            c12054zG.B(num2 != null ? num2.intValue() : 922746880);
            c12054zG.z(50331648);
            c12054zG.w(f2);
            c12054zG.A(f);
            C12054zG c12054zG2 = (C12054zG) ((C12054zG) c12054zG.q(EnumC12267zs4.i)).p(EnumC10209ts4.o, 0);
            EnumC10209ts4 enumC10209ts4 = EnumC10209ts4.j;
            EnumC10209ts4 enumC10209ts42 = EnumC10209ts4.h;
            if (f3 == null && f4 == null) {
                double d = f;
                ((C4586dX) ((C4586dX) w03.o(EnumC10209ts4.m, (int) Math.ceil(d))).o(enumC10209ts42, (int) Math.ceil(f / 2.0f))).o(enumC10209ts4, (int) Math.ceil(d * 1.5d));
            } else {
                float floatValue = f3 == null ? 0.0f : f3.floatValue();
                float floatValue2 = f4 != null ? f4.floatValue() : 0.0f;
                ((C4586dX) ((C4586dX) ((C4586dX) w03.o(EnumC10209ts4.g, (int) Math.ceil(BG.b(f) - floatValue))).o(EnumC10209ts4.i, (int) Math.ceil(BG.b(f) + floatValue))).o(enumC10209ts42, (int) Math.ceil(BG.b(f) - floatValue2))).o(enumC10209ts4, (int) Math.ceil(BG.b(f) + floatValue2));
                c12054zG2.x(floatValue);
                c12054zG2.y(floatValue2);
            }
            C4586dX w04 = C4929eX.w0(c7849n00);
            w04.B(w03);
            w04.B(c12054zG2);
            return w04.i;
        }
        return uz.d();
    }

    public static T40 p0(C7849n00 c7849n00) {
        T40 t40 = new T40();
        U40 u40 = new U40();
        t40.m(c7849n00, 0, 0, u40);
        t40.i = u40;
        t40.k.clear();
        return t40;
    }
}
