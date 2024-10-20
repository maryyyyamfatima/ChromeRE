package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import java.text.BreakIterator;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class TG3 extends WZ {
    public static final /* synthetic */ int n0 = 0;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.BOOL)
    boolean D;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    UG3 E;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int F;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean G;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.STRING)
    CharSequence H;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    TextUtils.TruncateAt I;

    /* renamed from: J */
    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean f11471J;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    float K;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    int L;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int M;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int N;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int O;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.BOOL)
    boolean P;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int Q;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_TEXT)
    float R;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    int S;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.INT)
    int T;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.INT)
    int U;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_SIZE)
    int V;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.INT)
    int W;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.INT)
    int X;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_SIZE)
    int Y;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    int Z;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    float a0;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    float b0;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_OFFSET)
    float c0;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.BOOL)
    boolean d0;

    @SY(type = 0)
    @InterfaceC6894kD2(resType = EnumC11068wO2.FLOAT)
    float e0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.STRING)
    CharSequence f0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    ColorStateList g0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    C2200Qy0 h0;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_TEXT)
    int i0;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int j0;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean k0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Typeface l0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    K84 m0;

    @Override // defpackage.AbstractC10593v00
    public final int N() {
        return 30;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean e() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final int m() {
        return 2;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean r() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean s() {
        return true;
    }

    public TG3() {
        super("Text");
        this.F = 0;
        this.G = true;
        this.M = -1;
        this.N = -1;
        this.O = 0;
        this.Q = 0;
        this.R = Float.MAX_VALUE;
        this.S = -16776961;
        this.T = -1;
        this.U = Integer.MAX_VALUE;
        this.V = Integer.MAX_VALUE;
        this.W = -1;
        this.X = Integer.MIN_VALUE;
        this.Y = 0;
        this.Z = -7829368;
        this.d0 = true;
        this.e0 = 1.0f;
        this.g0 = AbstractC9329rJ3.b;
        this.i0 = -1;
        this.j0 = AbstractC9329rJ3.c;
        this.l0 = AbstractC9329rJ3.d;
        this.m0 = AbstractC9329rJ3.e;
    }

    @Override // defpackage.WZ
    public final InterfaceC2671Uo1 W() {
        return new SG3();
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || TG3.class != wz.getClass()) {
            return false;
        }
        TG3 tg3 = (TG3) wz;
        if (this.D != tg3.D) {
            return false;
        }
        UG3 ug3 = this.E;
        if (ug3 == null ? tg3.E != null : !ug3.equals(tg3.E)) {
            return false;
        }
        if (this.F != tg3.F || Float.compare(0.0f, 0.0f) != 0 || this.G != tg3.G) {
            return false;
        }
        CharSequence charSequence = this.H;
        if (charSequence == null ? tg3.H != null : !charSequence.equals(tg3.H)) {
            return false;
        }
        TextUtils.TruncateAt truncateAt = this.I;
        if (truncateAt == null ? tg3.I != null : !truncateAt.equals(tg3.I)) {
            return false;
        }
        if (this.f11471J != tg3.f11471J || Float.compare(this.K, tg3.K) != 0 || this.L != tg3.L || this.M != tg3.M || this.N != tg3.N || this.O != tg3.O || this.P != tg3.P || this.Q != tg3.Q || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.R, tg3.R) != 0 || this.S != tg3.S || this.T != tg3.T || this.U != tg3.U || this.V != tg3.V || this.W != tg3.W || this.X != tg3.X || this.Y != tg3.Y || this.Z != tg3.Z || Float.compare(this.a0, tg3.a0) != 0 || Float.compare(this.b0, tg3.b0) != 0 || Float.compare(this.c0, tg3.c0) != 0 || this.d0 != tg3.d0 || Float.compare(this.e0, tg3.e0) != 0) {
            return false;
        }
        CharSequence charSequence2 = this.f0;
        if (charSequence2 == null ? tg3.f0 != null : !charSequence2.equals(tg3.f0)) {
            return false;
        }
        ColorStateList colorStateList = this.g0;
        if (colorStateList == null ? tg3.g0 != null : !colorStateList.equals(tg3.g0)) {
            return false;
        }
        C2200Qy0 c2200Qy0 = this.h0;
        if (c2200Qy0 == null ? tg3.h0 != null : !c2200Qy0.equals(tg3.h0)) {
            return false;
        }
        if (this.i0 != tg3.i0 || this.j0 != tg3.j0 || this.k0 != tg3.k0) {
            return false;
        }
        Typeface typeface = this.l0;
        if (typeface == null ? tg3.l0 != null : !typeface.equals(tg3.l0)) {
            return false;
        }
        K84 k84 = this.m0;
        K84 k842 = tg3.m0;
        return k84 == null ? k842 == null : k84.equals(k842);
    }

    @Override // defpackage.WZ
    public final void V(InterfaceC2671Uo1 interfaceC2671Uo1, InterfaceC2671Uo1 interfaceC2671Uo12) {
        SG3 sg3 = (SG3) interfaceC2671Uo1;
        SG3 sg32 = (SG3) interfaceC2671Uo12;
        sg3.a = sg32.a;
        sg3.b = sg32.b;
        sg3.c = sg32.c;
        sg3.d = sg32.d;
        sg3.e = sg32.e;
        sg3.f = sg32.f;
        sg3.g = sg32.g;
        sg3.h = sg32.h;
        sg3.i = sg32.i;
        sg3.j = sg32.j;
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        TG3 tg3 = (TG3) super.k0();
        tg3.A = new SG3();
        return tg3;
    }

    @Override // defpackage.AbstractC10593v00
    public final void F(C7849n00 c7849n00) {
        C3272Ze2 c3272Ze2;
        C3272Ze2 c3272Ze22;
        C3272Ze2 c3272Ze23;
        C3272Ze2 c3272Ze24;
        C3272Ze2 c3272Ze25;
        C3272Ze2 c3272Ze26;
        C3272Ze2 c3272Ze27;
        C3272Ze2 c3272Ze28;
        C3272Ze2 c3272Ze29;
        C3272Ze2 c3272Ze210;
        C3272Ze2 c3272Ze211;
        C3272Ze2 c3272Ze212;
        C3272Ze2 c3272Ze213;
        C3272Ze2 c3272Ze214;
        int[] iArr;
        TG3 tg3;
        C3272Ze2 c3272Ze215;
        C3272Ze2 c3272Ze216 = new C3272Ze2();
        C3272Ze2 c3272Ze217 = new C3272Ze2();
        C3272Ze2 c3272Ze218 = new C3272Ze2();
        C3272Ze2 c3272Ze219 = new C3272Ze2();
        C3272Ze2 c3272Ze220 = new C3272Ze2();
        C3272Ze2 c3272Ze221 = new C3272Ze2();
        C3272Ze2 c3272Ze222 = new C3272Ze2();
        C3272Ze2 c3272Ze223 = new C3272Ze2();
        C3272Ze2 c3272Ze224 = new C3272Ze2();
        C3272Ze2 c3272Ze225 = new C3272Ze2();
        C3272Ze2 c3272Ze226 = new C3272Ze2();
        C3272Ze2 c3272Ze227 = new C3272Ze2();
        C3272Ze2 c3272Ze228 = new C3272Ze2();
        C3272Ze2 c3272Ze229 = new C3272Ze2();
        C3272Ze2 c3272Ze230 = new C3272Ze2();
        C3272Ze2 c3272Ze231 = new C3272Ze2();
        C3272Ze2 c3272Ze232 = new C3272Ze2();
        C3272Ze2 c3272Ze233 = new C3272Ze2();
        C3272Ze2 c3272Ze234 = new C3272Ze2();
        C3272Ze2 c3272Ze235 = new C3272Ze2();
        C3272Ze2 c3272Ze236 = new C3272Ze2();
        C3272Ze2 c3272Ze237 = new C3272Ze2();
        C3272Ze2 c3272Ze238 = new C3272Ze2();
        C3272Ze2 c3272Ze239 = new C3272Ze2();
        C3272Ze2 c3272Ze240 = new C3272Ze2();
        C3272Ze2 c3272Ze241 = new C3272Ze2();
        C3272Ze2 c3272Ze242 = new C3272Ze2();
        Typeface typeface = AbstractC9329rJ3.a;
        TextUtils.TruncateAt[] truncateAtArr = AbstractC9672sJ3.a;
        Resources.Theme theme = c7849n00.a.getTheme();
        boolean z = B10.a;
        TypedArray k = c7849n00.k(JG2.c1);
        int resourceId = k.getResourceId(0, -1);
        k.recycle();
        int[] iArr2 = JG2.W0;
        if (resourceId != -1) {
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(resourceId, iArr2);
            c3272Ze212 = c3272Ze228;
            c3272Ze213 = c3272Ze227;
            c3272Ze211 = c3272Ze229;
            c3272Ze214 = c3272Ze226;
            c3272Ze2 = c3272Ze225;
            c3272Ze22 = c3272Ze224;
            c3272Ze23 = c3272Ze223;
            c3272Ze24 = c3272Ze222;
            c3272Ze25 = c3272Ze221;
            c3272Ze26 = c3272Ze220;
            c3272Ze27 = c3272Ze219;
            c3272Ze28 = c3272Ze218;
            c3272Ze29 = c3272Ze217;
            c3272Ze210 = c3272Ze216;
            AbstractC9672sJ3.b(obtainStyledAttributes, c3272Ze216, c3272Ze217, c3272Ze218, c3272Ze219, c3272Ze220, c3272Ze221, c3272Ze222, c3272Ze23, c3272Ze22, c3272Ze2, c3272Ze214, c3272Ze213, c3272Ze212, c3272Ze211, c3272Ze230, c3272Ze231, c3272Ze232, c3272Ze233, c3272Ze234, c3272Ze235, c3272Ze236, c3272Ze237, c3272Ze238, c3272Ze239, c3272Ze240, c3272Ze241, c3272Ze242);
            obtainStyledAttributes.recycle();
            iArr = iArr2;
        } else {
            c3272Ze2 = c3272Ze225;
            c3272Ze22 = c3272Ze224;
            c3272Ze23 = c3272Ze223;
            c3272Ze24 = c3272Ze222;
            c3272Ze25 = c3272Ze221;
            c3272Ze26 = c3272Ze220;
            c3272Ze27 = c3272Ze219;
            c3272Ze28 = c3272Ze218;
            c3272Ze29 = c3272Ze217;
            c3272Ze210 = c3272Ze216;
            c3272Ze211 = c3272Ze229;
            c3272Ze212 = c3272Ze228;
            c3272Ze213 = c3272Ze227;
            c3272Ze214 = c3272Ze226;
            iArr = iArr2;
        }
        TypedArray k2 = c7849n00.k(iArr);
        AbstractC9672sJ3.b(k2, c3272Ze210, c3272Ze29, c3272Ze28, c3272Ze27, c3272Ze26, c3272Ze25, c3272Ze24, c3272Ze23, c3272Ze22, c3272Ze2, c3272Ze214, c3272Ze213, c3272Ze212, c3272Ze211, c3272Ze230, c3272Ze231, c3272Ze232, c3272Ze233, c3272Ze234, c3272Ze235, c3272Ze236, c3272Ze237, c3272Ze238, c3272Ze239, c3272Ze240, c3272Ze241, c3272Ze242);
        k2.recycle();
        Object obj = c3272Ze210.a;
        if (obj != null) {
            tg3 = this;
            c3272Ze215 = c3272Ze230;
            tg3.I = (TextUtils.TruncateAt) obj;
        } else {
            tg3 = this;
            c3272Ze215 = c3272Ze230;
        }
        Object obj2 = c3272Ze29.a;
        if (obj2 != null) {
            tg3.K = ((Float) obj2).floatValue();
        }
        Object obj3 = c3272Ze28.a;
        if (obj3 != null) {
            tg3.d0 = ((Boolean) obj3).booleanValue();
        }
        Object obj4 = c3272Ze27.a;
        if (obj4 != null) {
            tg3.e0 = ((Float) obj4).floatValue();
        }
        Object obj5 = c3272Ze26.a;
        if (obj5 != null) {
            tg3.X = ((Integer) obj5).intValue();
        }
        Object obj6 = c3272Ze25.a;
        if (obj6 != null) {
            tg3.U = ((Integer) obj6).intValue();
        }
        Object obj7 = c3272Ze24.a;
        if (obj7 != null) {
            tg3.W = ((Integer) obj7).intValue();
        }
        Object obj8 = c3272Ze23.a;
        if (obj8 != null) {
            tg3.T = ((Integer) obj8).intValue();
        }
        Object obj9 = c3272Ze22.a;
        if (obj9 != null) {
            tg3.Y = ((Integer) obj9).intValue();
        }
        Object obj10 = c3272Ze2.a;
        if (obj10 != null) {
            tg3.V = ((Integer) obj10).intValue();
        }
        Object obj11 = c3272Ze214.a;
        if (obj11 != null) {
            tg3.P = ((Boolean) obj11).booleanValue();
        }
        Object obj12 = c3272Ze213.a;
        if (obj12 != null) {
            tg3.f0 = (CharSequence) obj12;
        }
        Object obj13 = c3272Ze212.a;
        if (obj13 != null) {
            tg3.g0 = (ColorStateList) obj13;
        }
        Object obj14 = c3272Ze211.a;
        if (obj14 != null) {
            tg3.S = ((Integer) obj14).intValue();
        }
        Object obj15 = c3272Ze215.a;
        if (obj15 != null) {
            tg3.L = ((Integer) obj15).intValue();
        }
        Object obj16 = c3272Ze231.a;
        if (obj16 != null) {
            tg3.i0 = ((Integer) obj16).intValue();
        }
        Object obj17 = c3272Ze232.a;
        if (obj17 != null) {
            tg3.E = (UG3) obj17;
        }
        Object obj18 = c3272Ze233.a;
        if (obj18 != null) {
            tg3.F = ((Integer) obj18).intValue();
        }
        Object obj19 = c3272Ze234.a;
        if (obj19 != null) {
            tg3.O = ((Integer) obj19).intValue();
        }
        Object obj20 = c3272Ze235.a;
        if (obj20 != null) {
            tg3.Q = ((Integer) obj20).intValue();
        }
        Object obj21 = c3272Ze236.a;
        if (obj21 != null) {
            tg3.j0 = ((Integer) obj21).intValue();
        }
        Object obj22 = c3272Ze237.a;
        if (obj22 != null) {
            tg3.c0 = ((Float) obj22).floatValue();
        }
        Object obj23 = c3272Ze238.a;
        if (obj23 != null) {
            tg3.a0 = ((Float) obj23).floatValue();
        }
        Object obj24 = c3272Ze239.a;
        if (obj24 != null) {
            tg3.b0 = ((Float) obj24).floatValue();
        }
        Object obj25 = c3272Ze240.a;
        if (obj25 != null) {
            tg3.Z = ((Integer) obj25).intValue();
        }
        Object obj26 = c3272Ze241.a;
        if (obj26 != null) {
            tg3.m0 = (K84) obj26;
        }
        Object obj27 = c3272Ze242.a;
        if (obj27 != null) {
            tg3.l0 = (Typeface) obj27;
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void G(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1, int i, int i2, C8753pe3 c8753pe3) {
        Context context;
        CharSequence charSequence;
        int i3;
        Layout layout;
        int i4;
        Layout layout2;
        int i5;
        int i6;
        int b;
        int i7;
        Integer valueOf;
        TG3 tg3;
        Float f;
        Integer num;
        Layout layout3;
        Layout layout4;
        CharSequence charSequence2 = this.f0;
        TextUtils.TruncateAt truncateAt = this.I;
        boolean z = this.d0;
        int i8 = this.X;
        int i9 = this.U;
        int i10 = this.W;
        int i11 = this.T;
        int i12 = this.Y;
        int i13 = this.V;
        float f2 = this.c0;
        float f3 = this.a0;
        float f4 = this.b0;
        int i14 = this.Z;
        boolean z2 = this.P;
        ColorStateList colorStateList = this.g0;
        int i15 = this.S;
        int i16 = this.i0;
        CharSequence charSequence3 = this.H;
        float f5 = this.K;
        float f6 = this.e0;
        int i17 = this.j0;
        Typeface typeface = this.l0;
        UG3 ug3 = this.E;
        int i18 = this.F;
        int i19 = this.O;
        int i20 = this.Q;
        float f7 = this.R;
        Typeface typeface2 = AbstractC9329rJ3.a;
        if (TextUtils.isEmpty(charSequence2)) {
            c8753pe3.a = 0;
            c8753pe3.b = 0;
            layout3 = null;
            num = null;
            valueOf = null;
            f = null;
            layout4 = null;
            tg3 = this;
        } else {
            boolean z3 = truncateAt == null && i9 != Integer.MAX_VALUE;
            int i21 = z3 ? i9 + 1 : i9;
            UG3 ug32 = UG3.TEXT_START;
            Layout a = AbstractC9329rJ3.a(c7849n00, i, truncateAt, z, i21, f2, f3, f4, i14, z2, charSequence2, colorStateList, i15, i16, f5, f6, i17, typeface, ug3 != null ? ug3 : ug32, interfaceC3331Zq1.T1(), i10, i11, i12, i13, c7849n00.a.getResources().getDisplayMetrics().density, i18, i19, i20, f7);
            Context context2 = c7849n00.a;
            if (!z3 || i9 <= 0) {
                context = context2;
                charSequence = charSequence2;
                i3 = i9;
            } else if (a.getLineCount() > i9) {
                charSequence = charSequence2;
                i3 = i9;
                context = context2;
                a = AbstractC9329rJ3.a(c7849n00, i, truncateAt, z, i9, f2, f3, f4, i14, z2, charSequence2.subSequence(0, a.getLineEnd(i9 - 1)), colorStateList, i15, i16, f5, f6, i17, typeface, ug3 != null ? ug3 : ug32, interfaceC3331Zq1.T1(), i10, i11, i12, i13, context2.getResources().getDisplayMetrics().density, i18, i19, i20, f7);
            } else {
                context = context2;
                charSequence = charSequence2;
                i3 = i9;
            }
            Layout layout5 = a;
            c8753pe3.a = AbstractC11496xe3.b(i, layout5.getWidth());
            int height = layout5.getHeight() + 0;
            int lineCount = layout5.getLineCount();
            Float valueOf2 = Float.valueOf(layout5.getPaint().descent());
            if (lineCount < i8) {
                b = (i8 - lineCount) * Math.round((r2.getFontMetricsInt(null) * f6) + f5);
                layout2 = null;
                layout = layout5;
            } else {
                if (!TextUtils.isEmpty(charSequence3)) {
                    int i22 = 0;
                    while (true) {
                        if (i22 >= layout5.getLineCount()) {
                            i22 = -1;
                            break;
                        } else if (layout5.getEllipsisCount(i22) > 0) {
                            break;
                        } else {
                            i22++;
                        }
                    }
                    int i23 = i22;
                    if (i23 >= 0) {
                        if (charSequence3 instanceof Spannable) {
                            i5 = 0;
                            for (AbsoluteSizeSpan absoluteSizeSpan : (AbsoluteSizeSpan[]) ((Spannable) charSequence3).getSpans(0, charSequence3.length(), AbsoluteSizeSpan.class)) {
                                i5 = Math.max(absoluteSizeSpan.getSize(), i5);
                            }
                        } else {
                            i5 = 0;
                        }
                        if (charSequence instanceof Spannable) {
                            int lineStart = layout5.getLineStart(i23);
                            i6 = 0;
                            for (AbsoluteSizeSpan absoluteSizeSpan2 : (AbsoluteSizeSpan[]) ((Spannable) charSequence).getSpans(lineStart, (layout5.getLineEnd(i23) - lineStart) + 1, AbsoluteSizeSpan.class)) {
                                i6 = Math.max(absoluteSizeSpan2.getSize(), i6);
                            }
                        } else {
                            i6 = 0;
                        }
                        if (i5 > i6) {
                            layout2 = AbstractC9329rJ3.a(c7849n00, View.MeasureSpec.makeMeasureSpec(layout5.getWidth(), 1073741824), truncateAt, z, i3, f2, f3, f4, i14, z2, i23 > 0 ? TextUtils.concat("1\n", charSequence3) : charSequence3, colorStateList, i15, i16, f5, f6, i17, typeface, ug3 != null ? ug3 : ug32, interfaceC3331Zq1.T1(), i10, i11, i12, i13, context.getResources().getDisplayMetrics().density, i18, i19, i20, f7);
                            layout = layout5;
                            b = AbstractC9329rJ3.b(layout, i23, layout2);
                        }
                    }
                }
                layout = layout5;
                i4 = i2;
                layout2 = null;
                int b2 = AbstractC11496xe3.b(i4, height);
                c8753pe3.b = b2;
                i7 = c8753pe3.a;
                if (i7 >= 0 || b2 < 0) {
                    c8753pe3.a = Math.max(i7, 0);
                    c8753pe3.b = Math.max(c8753pe3.b, 0);
                    E10.a(2, "TextSpec:WrongTextSize", "Text layout measured to less than 0 pixels");
                }
                Integer valueOf3 = Integer.valueOf(c8753pe3.a);
                valueOf = Integer.valueOf(c8753pe3.b);
                tg3 = this;
                f = valueOf2;
                Layout layout6 = layout;
                num = valueOf3;
                layout3 = layout2;
                layout4 = layout6;
            }
            height = b + height;
            i4 = i2;
            int b22 = AbstractC11496xe3.b(i4, height);
            c8753pe3.b = b22;
            i7 = c8753pe3.a;
            if (i7 >= 0) {
            }
            c8753pe3.a = Math.max(i7, 0);
            c8753pe3.b = Math.max(c8753pe3.b, 0);
            E10.a(2, "TextSpec:WrongTextSize", "Text layout measured to less than 0 pixels");
            Integer valueOf32 = Integer.valueOf(c8753pe3.a);
            valueOf = Integer.valueOf(c8753pe3.b);
            tg3 = this;
            f = valueOf2;
            Layout layout62 = layout;
            num = valueOf32;
            layout3 = layout2;
            layout4 = layout62;
        }
        SG3 sg3 = (SG3) tg3.A;
        sg3.d = layout4;
        sg3.b = layout3;
        sg3.g = num;
        sg3.e = valueOf;
        sg3.f = f;
    }

    @Override // defpackage.AbstractC10593v00
    public final void y(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1) {
        float f;
        int i;
        boolean z;
        boolean z2;
        float f2;
        CharSequence charSequence;
        int i2;
        int i3;
        int i4;
        UG3 ug3;
        int i5;
        boolean z3;
        ColorStateList colorStateList;
        int i6;
        int i7;
        float f3;
        float f4;
        K84 k84;
        int i8;
        Typeface typeface;
        int i9;
        boolean z4;
        TextUtils.TruncateAt truncateAt;
        CharSequence charSequence2;
        float f5;
        C3272Ze2 c3272Ze2;
        C3272Ze2 c3272Ze22;
        int i10;
        float f6;
        Layout layout;
        int i11;
        int i12;
        int i13;
        Layout layout2;
        float f7;
        TG3 tg3;
        C3272Ze2 c3272Ze23;
        C3272Ze2 c3272Ze24;
        Float f8;
        C3272Ze2 c3272Ze25;
        C3272Ze2 c3272Ze26;
        TG3 tg32;
        int i14;
        C3272Ze2 c3272Ze27;
        C3272Ze2 c3272Ze28;
        Class<ClickableSpan> cls;
        CharSequence charSequence3;
        C3272Ze2 c3272Ze29;
        C3272Ze2 c3272Ze210;
        int i15;
        int i16;
        int i17;
        float f9;
        int i18;
        float f10;
        float f11;
        float f12;
        int i19;
        float f13;
        int i20;
        int i21;
        int i22;
        boolean z5;
        ColorStateList colorStateList2;
        int i23;
        int i24;
        float f14;
        float f15;
        int i25;
        Typeface typeface2;
        UG3 ug32;
        boolean z6;
        TextUtils.TruncateAt truncateAt2;
        C7849n00 c7849n002;
        InterfaceC3331Zq1 interfaceC3331Zq12;
        C3272Ze2 c3272Ze211;
        int i26;
        int i27;
        CharSequence charSequence4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        float f16;
        int i28;
        int i29;
        int i30;
        boolean z7;
        TextUtils.TruncateAt truncateAt3;
        Class<ClickableSpan> cls2;
        InterfaceC3331Zq1 interfaceC3331Zq13;
        InterfaceC3331Zq1 interfaceC3331Zq14;
        int i31;
        int i32;
        CharSequence charSequence7;
        C7849n00 c7849n003;
        InterfaceC3331Zq1 interfaceC3331Zq15;
        C3272Ze2 c3272Ze212 = new C3272Ze2();
        C3272Ze2 c3272Ze213 = new C3272Ze2();
        C3272Ze2 c3272Ze214 = new C3272Ze2();
        C3272Ze2 c3272Ze215 = new C3272Ze2();
        CharSequence charSequence8 = this.f0;
        TextUtils.TruncateAt truncateAt4 = this.I;
        boolean z8 = this.d0;
        int i33 = this.U;
        int i34 = this.W;
        int i35 = this.T;
        int i36 = this.Y;
        int i37 = this.V;
        float f17 = this.c0;
        float f18 = this.a0;
        float f19 = this.b0;
        int i38 = this.Z;
        boolean z9 = this.P;
        ColorStateList colorStateList3 = this.g0;
        int i39 = this.S;
        int i40 = this.i0;
        float f20 = this.K;
        float f21 = this.e0;
        K84 k842 = this.m0;
        int i41 = this.j0;
        Typeface typeface3 = this.l0;
        UG3 ug33 = this.E;
        int i42 = this.F;
        int i43 = this.O;
        CharSequence charSequence9 = this.H;
        float f22 = this.R;
        boolean z10 = this.f11471J;
        boolean z11 = this.k0;
        SG3 sg3 = (SG3) this.A;
        Layout layout3 = sg3.b;
        Layout layout4 = sg3.d;
        Integer num = sg3.g;
        Integer num2 = sg3.e;
        Float f23 = sg3.f;
        Typeface typeface4 = AbstractC9329rJ3.a;
        c3272Ze212.a = charSequence8;
        if (TextUtils.isEmpty(charSequence8)) {
            f8 = null;
            tg32 = this;
        } else {
            float width = (interfaceC3331Zq1.getWidth() - interfaceC3331Zq1.N1()) - interfaceC3331Zq1.N0();
            float height = (interfaceC3331Zq1.getHeight() - interfaceC3331Zq1.L1()) - interfaceC3331Zq1.j();
            UG3 ug34 = UG3.TEXT_START;
            if (layout4 != null && num.intValue() == width && num2.intValue() == height) {
                c3272Ze213.a = layout4;
                f5 = width;
                f = height;
                i = i36;
                z = z11;
                ug3 = ug33;
                i9 = i33;
                z4 = z8;
                truncateAt = truncateAt4;
                charSequence2 = charSequence8;
                c3272Ze2 = c3272Ze213;
                c3272Ze22 = c3272Ze212;
                i5 = i34;
                z3 = z9;
                colorStateList = colorStateList3;
                i6 = i39;
                i7 = i40;
                f3 = f20;
                f4 = f21;
                k84 = k842;
                i8 = i41;
                typeface = typeface3;
                z2 = z10;
                f2 = f22;
                charSequence = charSequence9;
                i2 = i43;
                i3 = i42;
                i4 = i35;
            } else {
                f = height;
                i = i36;
                z = z11;
                z2 = z10;
                f2 = f22;
                charSequence = charSequence9;
                i2 = i43;
                i3 = i42;
                i4 = i35;
                ug3 = ug33;
                i5 = i34;
                z3 = z9;
                colorStateList = colorStateList3;
                i6 = i39;
                i7 = i40;
                f3 = f20;
                f4 = f21;
                k84 = k842;
                i8 = i41;
                typeface = typeface3;
                i9 = i33;
                z4 = z8;
                truncateAt = truncateAt4;
                charSequence2 = charSequence8;
                f5 = width;
                c3272Ze2 = c3272Ze213;
                c3272Ze22 = c3272Ze212;
                c3272Ze2.a = AbstractC9329rJ3.a(c7849n00, View.MeasureSpec.makeMeasureSpec((int) width, 1073741824), truncateAt4, z8, i33, f17, f18, f19, i38, z3, charSequence8, colorStateList, i6, i7, f3, f4, i8, typeface, ug33 != null ? ug33 : ug34, interfaceC3331Zq1.T1(), i5, i4, i, i37, c7849n00.a.getResources().getDisplayMetrics().density, i3, i2, 0, f2);
            }
            Layout layout5 = (Layout) c3272Ze2.a;
            float height2 = layout5 == null ? 0 : layout5.getHeight() - 0;
            int ordinal = k84.ordinal();
            Float valueOf = ordinal != 1 ? ordinal != 2 ? Float.valueOf(0.0f) : Float.valueOf(f - height2) : Float.valueOf((f - height2) / 2.0f);
            if (z && TextUtils.isEmpty(charSequence)) {
                charSequence = "…";
            }
            if (TextUtils.isEmpty(charSequence) || layout3 != null) {
                i10 = 1;
                f6 = f5;
                layout = layout3;
            } else {
                float f24 = f5;
                f6 = f24;
                i10 = 1;
                layout = AbstractC9329rJ3.a(c7849n00, View.MeasureSpec.makeMeasureSpec((int) f24, 1073741824), truncateAt, z4, i9, f17, f18, f19, i38, z3, charSequence, colorStateList, i6, i7, f3, f4, i8, typeface, ug3 != null ? ug3 : ug34, interfaceC3331Zq1.T1(), i5, i4, i, i37, c7849n00.a.getResources().getDisplayMetrics().density, i3, i2, 0, f2);
            }
            int i44 = i9;
            if (z2 && i44 == Integer.MAX_VALUE && !z3) {
                Layout layout6 = (Layout) c3272Ze2.a;
                float spacingAdd = layout6.getSpacingAdd() + interfaceC3331Zq1.getHeight();
                Rect rect = new Rect();
                int lineCount = layout6.getLineCount();
                while (true) {
                    int i45 = lineCount;
                    if (i45 <= 0) {
                        i11 = i10;
                        break;
                    }
                    lineCount = i45 - 1;
                    layout6.getLineBounds(lineCount, rect);
                    if (AbstractC9329rJ3.b(layout6, lineCount, layout) + rect.bottom <= spacingAdd) {
                        i11 = i45;
                        break;
                    }
                }
            } else {
                i11 = i44;
            }
            Layout layout7 = (Layout) c3272Ze2.a;
            int i46 = 0;
            while (true) {
                if (i46 >= layout7.getLineCount()) {
                    i46 = -1;
                    break;
                } else if (layout7.getEllipsisCount(i46) > 0) {
                    break;
                } else {
                    i46++;
                }
            }
            if (i46 == -1 && i11 < ((Layout) c3272Ze2.a).getLineCount()) {
                i46 = i11 - 1;
            }
            int i47 = i46;
            if (!z2 || i44 != Integer.MAX_VALUE || z3 || i11 >= ((Layout) c3272Ze2.a).getLineCount()) {
                i12 = i47;
                i13 = i11;
                layout2 = layout;
                f7 = f6;
            } else {
                float f25 = f6;
                f7 = f25;
                i12 = i47;
                i13 = i11;
                layout2 = layout;
                c3272Ze2.a = AbstractC9329rJ3.a(c7849n00, View.MeasureSpec.makeMeasureSpec((int) f25, 1073741824), truncateAt, z4, i11, f17, f18, f19, i38, z3, charSequence2, colorStateList, i6, i7, f3, f4, i8, typeface, ug3 != null ? ug3 : ug34, interfaceC3331Zq1.T1(), i5, i4, i, i37, c7849n00.a.getResources().getDisplayMetrics().density, i3, i2, 0, f2);
            }
            Class<ClickableSpan> cls3 = ClickableSpan.class;
            Layout layout8 = layout2;
            if (layout8 == null || (i14 = i12) == -1) {
                tg3 = this;
                c3272Ze213 = c3272Ze2;
                c3272Ze23 = c3272Ze214;
                c3272Ze24 = c3272Ze215;
                f8 = valueOf;
                c3272Ze25 = c3272Ze22;
                c3272Ze26 = c3272Ze25;
            } else {
                EH3 eh3 = interfaceC3331Zq1.T1() == EnumC9866ss4.i ? GH3.d : GH3.c;
                Layout.Alignment alignment = layout8.getAlignment();
                CharSequence charSequence10 = charSequence2;
                boolean b = eh3.b(charSequence10, charSequence2.length());
                int i48 = (alignment == Layout.Alignment.ALIGN_NORMAL ? i10 : 0) ^ (b ? 1 : 0);
                Layout layout9 = (Layout) c3272Ze2.a;
                float lineWidth = layout8.getLineWidth(layout8.getLineCount() - 1);
                if (!b && i48 != 0) {
                    lineWidth = f7 - lineWidth;
                } else if (!b) {
                    lineWidth = (f7 - lineWidth) + (f7 - layout9.getLineWidth(i14));
                } else if (i48 != 0) {
                    lineWidth -= f7 - layout9.getLineWidth(i14);
                }
                int offsetForHorizontal = layout9.getOffsetForHorizontal(i14, lineWidth);
                if (offsetForHorizontal <= 0 || charSequence == null) {
                    tg3 = this;
                    c3272Ze27 = c3272Ze2;
                    c3272Ze28 = c3272Ze27;
                    cls = cls3;
                    charSequence3 = charSequence10;
                    c3272Ze29 = c3272Ze214;
                    c3272Ze210 = c3272Ze215;
                    i15 = i4;
                    i16 = i3;
                    i17 = i2;
                    f9 = f2;
                    i18 = i38;
                    f10 = f19;
                    f11 = f18;
                    f12 = f17;
                    i19 = i37;
                    f13 = f7;
                    i20 = i;
                    i21 = i13;
                    i22 = i5;
                    z5 = z3;
                    colorStateList2 = colorStateList;
                    i23 = i6;
                    i24 = i7;
                    f14 = f3;
                    f15 = f4;
                    i25 = i8;
                    typeface2 = typeface;
                    ug32 = ug3;
                    z6 = z4;
                    truncateAt2 = truncateAt;
                    c3272Ze25 = c3272Ze22;
                    c3272Ze26 = c3272Ze25;
                    c7849n002 = c7849n00;
                    interfaceC3331Zq12 = interfaceC3331Zq1;
                } else {
                    int i49 = offsetForHorizontal - 1;
                    if (z) {
                        BreakIterator wordInstance = BreakIterator.getWordInstance();
                        wordInstance.setText(charSequence10.toString());
                        wordInstance.following(i49);
                        i26 = wordInstance.previous();
                        tg3 = this;
                        c3272Ze211 = c3272Ze2;
                        c3272Ze28 = c3272Ze211;
                        if (i26 > layout9.getLineStart(i14)) {
                            cls2 = cls3;
                            i32 = i14;
                            charSequence7 = charSequence10;
                            charSequence5 = charSequence7;
                            c3272Ze29 = c3272Ze214;
                            c3272Ze210 = c3272Ze215;
                            f16 = f17;
                            i28 = i37;
                            i29 = i;
                            i30 = i5;
                            z7 = z4;
                            truncateAt3 = truncateAt;
                            c3272Ze26 = c3272Ze22;
                            c7849n003 = c7849n00;
                        } else {
                            i26 = i49;
                            i32 = i14;
                            charSequence7 = charSequence10;
                            charSequence5 = charSequence7;
                            c3272Ze29 = c3272Ze214;
                            c3272Ze210 = c3272Ze215;
                            f16 = f17;
                            i28 = i37;
                            i29 = i;
                            i30 = i5;
                            z7 = z4;
                            truncateAt3 = truncateAt;
                            c3272Ze26 = c3272Ze22;
                            c7849n003 = c7849n00;
                            cls2 = cls3;
                        }
                        InterfaceC3331Zq1 interfaceC3331Zq16 = interfaceC3331Zq1;
                        while (true) {
                            c7849n00 = c7849n003;
                            int i50 = i26 - 1;
                            interfaceC3331Zq15 = interfaceC3331Zq16;
                            if (!Character.isWhitespace(charSequence7.charAt(i50)) || i50 <= layout9.getLineStart(i32)) {
                                break;
                            }
                            interfaceC3331Zq16 = interfaceC3331Zq15;
                            i26 = i50;
                            c7849n003 = c7849n00;
                        }
                        interfaceC3331Zq13 = interfaceC3331Zq15;
                        charSequence6 = charSequence;
                        CharSequence charSequence11 = charSequence7;
                        i27 = i32;
                        charSequence4 = charSequence11;
                    } else {
                        tg3 = this;
                        c3272Ze211 = c3272Ze2;
                        c3272Ze28 = c3272Ze211;
                        i26 = i49;
                        i27 = i14;
                        charSequence4 = charSequence10;
                        charSequence5 = charSequence4;
                        c3272Ze29 = c3272Ze214;
                        c3272Ze210 = c3272Ze215;
                        charSequence6 = charSequence;
                        f16 = f17;
                        i28 = i37;
                        i29 = i;
                        i30 = i5;
                        z7 = z4;
                        truncateAt3 = truncateAt;
                        c3272Ze26 = c3272Ze22;
                        cls2 = cls3;
                        interfaceC3331Zq13 = interfaceC3331Zq1;
                    }
                    if (layout9.getEllipsisCount(i27) > 0) {
                        int ellipsisStart = layout9.getEllipsisStart(i27) + layout9.getLineStart(i27);
                        if (i26 > ellipsisStart) {
                            i26 = ellipsisStart;
                        }
                    }
                    if (i26 < 0) {
                        i26 = 0;
                    } else if (i26 > charSequence5.length()) {
                        i26 = charSequence5.length();
                    }
                    SpannableString spannableString = new SpannableString(charSequence6);
                    if (spannableString.length() > 0) {
                        interfaceC3331Zq14 = interfaceC3331Zq13;
                        i31 = 0;
                        spannableString.setSpan(new C6995kX3(), 0, spannableString.length(), 18);
                    } else {
                        interfaceC3331Zq14 = interfaceC3331Zq13;
                        i31 = 0;
                    }
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    charSequenceArr[i31] = charSequence4.subSequence(i31, i26);
                    charSequenceArr[i10] = spannableString;
                    SpannableString spannableString2 = new SpannableString(TextUtils.concat(charSequenceArr));
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableString2.getSpans(i31, spannableString2.length(), cls2);
                    int length = spannableString2.length() - spannableString.length();
                    int length2 = clickableSpanArr.length;
                    int i51 = i31;
                    while (i51 < length2) {
                        ClickableSpan clickableSpan = clickableSpanArr[i51];
                        int spanStart = spannableString2.getSpanStart(clickableSpan);
                        ClickableSpan[] clickableSpanArr2 = clickableSpanArr;
                        int spanEnd = spannableString2.getSpanEnd(clickableSpan);
                        if (spanStart < length && spanEnd >= length) {
                            spannableString2.removeSpan(clickableSpan);
                            spannableString2.setSpan(clickableSpan, spanStart, length, 0);
                        }
                        i51++;
                        clickableSpanArr = clickableSpanArr2;
                    }
                    c7849n002 = c7849n00;
                    interfaceC3331Zq12 = interfaceC3331Zq14;
                    cls = cls2;
                    f12 = f16;
                    i19 = i28;
                    i20 = i29;
                    i22 = i30;
                    z6 = z7;
                    truncateAt2 = truncateAt3;
                    c3272Ze27 = c3272Ze211;
                    i15 = i4;
                    i16 = i3;
                    i17 = i2;
                    f9 = f2;
                    i18 = i38;
                    f10 = f19;
                    f11 = f18;
                    f13 = f7;
                    i21 = i13;
                    z5 = z3;
                    colorStateList2 = colorStateList;
                    i23 = i6;
                    i24 = i7;
                    f14 = f3;
                    f15 = f4;
                    i25 = i8;
                    typeface2 = typeface;
                    ug32 = ug3;
                    c3272Ze25 = c3272Ze22;
                    charSequence3 = spannableString2;
                }
                Layout a = AbstractC9329rJ3.a(c7849n002, View.MeasureSpec.makeMeasureSpec((int) f13, 1073741824), truncateAt2, z6, i21, f12, f11, f10, i18, z5, charSequence3, colorStateList2, i23, i24, f14, f15, i25, typeface2, ug32 != null ? ug32 : ug34, interfaceC3331Zq12.T1(), i22, i15, i20, i19, c7849n002.a.getResources().getDisplayMetrics().density, i16, i17, 0, f9);
                c3272Ze25.a = charSequence3;
                c3272Ze27.a = a;
                cls3 = cls;
                c3272Ze213 = c3272Ze28;
                c3272Ze23 = c3272Ze29;
                c3272Ze24 = c3272Ze210;
                f8 = valueOf;
            }
            CharSequence charSequence12 = (CharSequence) c3272Ze25.a;
            if (charSequence12 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence12;
                c3272Ze23.a = (ClickableSpan[]) spanned.getSpans(0, charSequence12.length(), cls3);
                c3272Ze24.a = (ImageSpan[]) spanned.getSpans(0, charSequence12.length(), ImageSpan.class);
            }
            c3272Ze212 = c3272Ze26;
            tg32 = tg3;
        }
        SG3 sg32 = (SG3) tg32.A;
        sg32.h = (CharSequence) c3272Ze212.a;
        sg32.i = (Layout) c3272Ze213.a;
        sg32.j = f8;
        sg32.a = (ClickableSpan[]) c3272Ze214.a;
        sg32.c = (ImageSpan[]) c3272Ze215.a;
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        Typeface typeface = AbstractC9329rJ3.a;
        return new IH3();
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        boolean z;
        IH3 ih3 = (IH3) obj;
        int i = this.L;
        ColorStateList colorStateList = this.g0;
        int i2 = this.N;
        int i3 = this.M;
        boolean z2 = this.G;
        C2200Qy0 c2200Qy0 = this.h0;
        InterfaceC2671Uo1 interfaceC2671Uo1 = this.A;
        CharSequence charSequence = ((SG3) interfaceC2671Uo1).h;
        Layout layout = ((SG3) interfaceC2671Uo1).i;
        Float f = ((SG3) interfaceC2671Uo1).j;
        ClickableSpan[] clickableSpanArr = ((SG3) interfaceC2671Uo1).a;
        ImageSpan[] imageSpanArr = ((SG3) interfaceC2671Uo1).c;
        Typeface typeface = AbstractC9329rJ3.a;
        float floatValue = f == null ? 0.0f : f.floatValue();
        String d = c7849n00.d();
        ih3.a = layout;
        ih3.g = floatValue;
        ih3.h = z2;
        ih3.j = charSequence;
        ih3.n = clickableSpanArr;
        if (ih3.x == null) {
            if (clickableSpanArr != null) {
                for (ClickableSpan clickableSpan : clickableSpanArr) {
                    if (clickableSpan instanceof C7259lH3) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                ih3.x = new Handler();
            }
        }
        ih3.getClass();
        ih3.i = clickableSpanArr != null && clickableSpanArr.length > 0;
        ih3.m = i;
        ih3.v = 0.0f;
        ih3.A = c2200Qy0;
        if (colorStateList == null) {
            colorStateList = AbstractC9329rJ3.b;
        }
        ih3.k = colorStateList;
        ih3.l = colorStateList.getDefaultColor();
        Layout layout2 = ih3.a;
        if (layout2 != null) {
            layout2.getPaint().setColor(ih3.k.getColorForState(ih3.getState(), ih3.l));
        }
        if (i2 >= 0 && i3 <= charSequence.length() && i2 < i3) {
            ih3.g(i2, i3);
        } else {
            ih3.g(0, 0);
        }
        if (imageSpanArr != null) {
            for (ImageSpan imageSpan : imageSpanArr) {
                Drawable drawable = imageSpan.getDrawable();
                drawable.setCallback(ih3);
                drawable.setVisible(true, false);
            }
        }
        ih3.o = imageSpanArr;
        ih3.z = d;
        C2200Qy0 c2200Qy02 = ih3.A;
        if (c2200Qy02 != null) {
            Layout layout3 = ih3.a;
            CharSequence charSequence2 = ih3.j;
            if (charSequence2 instanceof Spanned) {
                AbstractC1810Ny0[] abstractC1810Ny0Arr = (AbstractC1810Ny0[]) ((Spanned) charSequence2).getSpans(0, charSequence2.length(), AbstractC1810Ny0.class);
                c2200Qy02.a = abstractC1810Ny0Arr;
                for (AbstractC1810Ny0 abstractC1810Ny0 : abstractC1810Ny0Arr) {
                    abstractC1810Ny0.d(layout3, charSequence2);
                }
            }
        }
        ih3.invalidateSelf();
    }

    @Override // defpackage.AbstractC10593v00
    public final void M(C7849n00 c7849n00, Object obj) {
        AbstractC1810Ny0[] abstractC1810Ny0Arr;
        IH3 ih3 = (IH3) obj;
        Typeface typeface = AbstractC9329rJ3.a;
        ih3.a = null;
        ih3.g = 0.0f;
        ih3.j = null;
        ih3.n = null;
        ih3.i = false;
        ih3.m = 0;
        ih3.getClass();
        ih3.k = null;
        ih3.l = 0;
        C2200Qy0 c2200Qy0 = ih3.A;
        if (c2200Qy0 != null && (abstractC1810Ny0Arr = c2200Qy0.a) != null) {
            for (AbstractC1810Ny0 abstractC1810Ny0 : abstractC1810Ny0Arr) {
                abstractC1810Ny0.f();
            }
            c2200Qy0.a = null;
        }
        ih3.A = null;
        ImageSpan[] imageSpanArr = ih3.o;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = ih3.o[i].getDrawable();
                drawable.setCallback(null);
                drawable.setVisible(false, false);
            }
            ih3.o = null;
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void I(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        CharSequence charSequence = this.f0;
        boolean z = this.P;
        Typeface typeface = AbstractC9329rJ3.a;
        WeakHashMap weakHashMap = Ec4.a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        CharSequence e = accessibilityNodeInfoCompat.e();
        accessibilityNodeInfoCompat.r(e != null ? e : charSequence);
        if (e != null) {
            charSequence = e;
        }
        accessibilityNodeInfoCompat.o(charSequence);
        accessibilityNodeInfoCompat.a(256);
        accessibilityNodeInfoCompat.a(512);
        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
        accessibilityNodeInfo.setMovementGranularities(11);
        if (z) {
            return;
        }
        accessibilityNodeInfo.setMultiLine(true);
    }

    @Override // defpackage.AbstractC10593v00
    public final int l() {
        boolean z = this.D;
        ClickableSpan[] clickableSpanArr = ((SG3) this.A).a;
        Typeface typeface = AbstractC9329rJ3.a;
        if (!z || clickableSpanArr == null) {
            return 0;
        }
        return clickableSpanArr.length;
    }

    @Override // defpackage.AbstractC10593v00
    public final void J(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i, int i2, int i3) {
        CharSequence charSequence = this.f0;
        SG3 sg3 = (SG3) this.A;
        Layout layout = sg3.i;
        ClickableSpan[] clickableSpanArr = sg3.a;
        Typeface typeface = AbstractC9329rJ3.a;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            ClickableSpan clickableSpan = clickableSpanArr[i];
            int spanStart = spanned.getSpanStart(clickableSpan);
            int spanEnd = spanned.getSpanEnd(clickableSpan);
            int lineForOffset = layout.getLineForOffset(spanStart);
            int lineVisibleEnd = lineForOffset == layout.getLineForOffset(spanEnd) ? spanEnd : layout.getLineVisibleEnd(lineForOffset);
            Path path = AbstractC9329rJ3.f;
            layout.getSelectionPath(spanStart, lineVisibleEnd, path);
            RectF rectF = AbstractC9329rJ3.h;
            path.computeBounds(rectF, true);
            int i4 = ((int) rectF.left) + i2;
            int i5 = ((int) rectF.top) + i3;
            int i6 = i2 + ((int) rectF.right);
            int i7 = i3 + ((int) rectF.bottom);
            Rect rect = AbstractC9329rJ3.g;
            rect.set(i4, i5, i6, i7);
            if (rect.isEmpty()) {
                rect.set(0, 0, 1, 1);
                accessibilityNodeInfoCompat.l(rect);
                accessibilityNodeInfoCompat.o("");
                return;
            }
            accessibilityNodeInfoCompat.l(rect);
            accessibilityNodeInfoCompat.n(true);
            AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.a;
            accessibilityNodeInfo.setFocusable(true);
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setVisibleToUser(true);
            accessibilityNodeInfoCompat.r(spanned.subSequence(spanStart, spanEnd));
            accessibilityNodeInfoCompat.m("android.widget.Button");
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final int k(int i, int i2) {
        CharSequence charSequence = this.f0;
        SG3 sg3 = (SG3) this.A;
        Layout layout = sg3.i;
        ClickableSpan[] clickableSpanArr = sg3.a;
        Typeface typeface = AbstractC9329rJ3.a;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (int i3 = 0; i3 < clickableSpanArr.length; i3++) {
                ClickableSpan clickableSpan = clickableSpanArr[i3];
                int spanStart = spanned.getSpanStart(clickableSpan);
                int spanEnd = spanned.getSpanEnd(clickableSpan);
                Path path = AbstractC9329rJ3.f;
                layout.getSelectionPath(spanStart, spanEnd, path);
                RectF rectF = AbstractC9329rJ3.h;
                path.computeBounds(rectF, true);
                if (rectF.contains(i, i2)) {
                    return i3;
                }
            }
        }
        return Integer.MIN_VALUE;
    }
}
