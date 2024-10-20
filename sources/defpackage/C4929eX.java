package defpackage;

import com.facebook.yoga.YogaNative;
import com.facebook.yoga.YogaNodeJNIBase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: eX */
/* loaded from: classes.dex */
public final class C4929eX extends WZ {

    @InterfaceC6894kD2
    private List D;

    @InterfaceC6894kD2
    private EnumC8151ns4 E;

    @InterfaceC6894kD2
    private EnumC8151ns4 F;

    @InterfaceC6894kD2
    private EnumC10552us4 G;

    @InterfaceC6894kD2
    private Bs4 H;

    @InterfaceC6894kD2
    private boolean I;

    @Override // defpackage.AbstractC10593v00
    public final WZ z(C7849n00 c7849n00) {
        return this;
    }

    @Override // defpackage.AbstractC10593v00
    public final InterfaceC3331Zq1 P(C7849n00 c7849n00) {
        C9181qs4 c9181qs4 = D52.a;
        C1605Mj0 c1605Mj0 = new C1605Mj0(c7849n00);
        int i = this.I ? 2 : 1;
        long j = ((YogaNodeJNIBase) c1605Mj0.a).j;
        if (i == 0) {
            throw null;
        }
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(j, i - 1);
        EnumC8151ns4 enumC8151ns4 = this.F;
        if (enumC8151ns4 != null) {
            YogaNative.jni_YGNodeStyleSetAlignItemsJNI(((YogaNodeJNIBase) c1605Mj0.a).j, enumC8151ns4.a);
        }
        EnumC8151ns4 enumC8151ns42 = this.E;
        if (enumC8151ns42 != null) {
            YogaNative.jni_YGNodeStyleSetAlignContentJNI(((YogaNodeJNIBase) c1605Mj0.a).j, enumC8151ns42.a);
        }
        EnumC10552us4 enumC10552us4 = this.G;
        if (enumC10552us4 != null) {
            YogaNative.jni_YGNodeStyleSetJustifyContentJNI(((YogaNodeJNIBase) c1605Mj0.a).j, enumC10552us4.a);
        }
        Bs4 bs4 = this.H;
        if (bs4 != null) {
            YogaNative.jni_YGNodeStyleSetFlexWrapJNI(((YogaNodeJNIBase) c1605Mj0.a).j, bs4.a);
        }
        List<WZ> list = this.D;
        if (list != null) {
            for (WZ wz : list) {
                if (c7849n00.p()) {
                    return C7849n00.p;
                }
                C1032Hy1 c1032Hy1 = c7849n00.o;
                if (!(c1032Hy1 == null ? false : c1032Hy1.a())) {
                    c1605Mj0.A1(wz);
                } else {
                    if (c1605Mj0.I == null) {
                        c1605Mj0.I = new ArrayList();
                    }
                    c1605Mj0.I.add(wz);
                }
            }
        }
        return c1605Mj0;
    }

    public C4929eX() {
        super("Column");
    }

    public static C4586dX w0(C7849n00 c7849n00) {
        C4586dX c4586dX = new C4586dX();
        C4929eX c4929eX = new C4929eX();
        c4586dX.m(c7849n00, 0, 0, c4929eX);
        c4586dX.i = c4929eX;
        return c4586dX;
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || C4929eX.class != wz.getClass()) {
            return false;
        }
        C4929eX c4929eX = (C4929eX) wz;
        if (this.l == c4929eX.l) {
            return true;
        }
        List list = this.D;
        if (list != null) {
            if (c4929eX.D == null || list.size() != c4929eX.D.size()) {
                return false;
            }
            int size = this.D.size();
            for (int i = 0; i < size; i++) {
                if (!((WZ) this.D.get(i)).a((WZ) c4929eX.D.get(i))) {
                    return false;
                }
            }
        } else if (c4929eX.D != null) {
            return false;
        }
        EnumC8151ns4 enumC8151ns4 = this.F;
        if (enumC8151ns4 == null ? c4929eX.F != null : !enumC8151ns4.equals(c4929eX.F)) {
            return false;
        }
        EnumC8151ns4 enumC8151ns42 = this.E;
        if (enumC8151ns42 == null ? c4929eX.E != null : !enumC8151ns42.equals(c4929eX.E)) {
            return false;
        }
        EnumC10552us4 enumC10552us4 = this.G;
        if (enumC10552us4 == null ? c4929eX.G == null : enumC10552us4.equals(c4929eX.G)) {
            return this.I == c4929eX.I;
        }
        return false;
    }
}
