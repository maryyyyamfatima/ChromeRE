package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.MovementMethod;
import android.view.View;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class BI3 extends WZ {
    public static final /* synthetic */ int k0 = 0;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    int D;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int E;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean F;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    TextUtils.TruncateAt G;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean H;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int I;

    /* renamed from: J */
    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    Integer f11437J;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.STRING)
    CharSequence K;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    ColorStateList L;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int M;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.STRING)
    CharSequence N;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DRAWABLE)
    Drawable O;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List P;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int Q;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int R;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int S;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    MovementMethod T;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    boolean U;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int V;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.COLOR)
    int W;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    int X;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    ColorStateList Y;

    @SY(type = ModuleDescriptor.MODULE_VERSION)
    @InterfaceC6894kD2(resType = EnumC11068wO2.DIMEN_TEXT)
    int Z;

    @SY(type = JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    List a0;

    @SY(type = 13)
    @InterfaceC6894kD2(resType = EnumC11068wO2.NONE)
    Typeface b0;
    public C6206iD0 c0;
    public C6206iD0 d0;
    public PD0 e0;
    public PD0 f0;
    public PD0 g0;
    public PD0 h0;
    public PD0 i0;
    public PD0 j0;

    @Override // defpackage.AbstractC10593v00
    public final int N() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean e() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final int m() {
        return 3;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean q() {
        return true;
    }

    @Override // defpackage.AbstractC10593v00
    public final boolean s() {
        return true;
    }

    public BI3() {
        super("TextInput");
        this.E = -1;
        this.F = true;
        this.I = 8388627;
        this.K = NI3.d;
        this.L = NI3.c;
        this.M = 0;
        this.N = NI3.e;
        this.O = NI3.f;
        this.P = Collections.emptyList();
        this.Q = 1;
        this.R = Integer.MAX_VALUE;
        this.S = 1;
        this.T = NI3.h;
        this.U = false;
        this.V = 0;
        this.W = -7829368;
        this.X = 1;
        this.Y = NI3.b;
        this.Z = -1;
        this.a0 = Collections.emptyList();
        this.b0 = NI3.g;
    }

    @Override // defpackage.WZ
    public final AbstractC6726jk3 X() {
        return new AI3();
    }

    @Override // defpackage.WZ, defpackage.SC0
    /* renamed from: f0 */
    public final boolean a(WZ wz) {
        if (this == wz) {
            return true;
        }
        if (wz == null || BI3.class != wz.getClass()) {
            return false;
        }
        BI3 bi3 = (BI3) wz;
        if (this.D != bi3.D || this.E != bi3.E || this.F != bi3.F) {
            return false;
        }
        TextUtils.TruncateAt truncateAt = this.G;
        if (truncateAt == null ? bi3.G != null : !truncateAt.equals(bi3.G)) {
            return false;
        }
        if (this.H != bi3.H || this.I != bi3.I) {
            return false;
        }
        Integer num = this.f11437J;
        if (num == null ? bi3.f11437J != null : !num.equals(bi3.f11437J)) {
            return false;
        }
        CharSequence charSequence = this.K;
        if (charSequence == null ? bi3.K != null : !charSequence.equals(bi3.K)) {
            return false;
        }
        ColorStateList colorStateList = this.L;
        if (colorStateList == null ? bi3.L != null : !colorStateList.equals(bi3.L)) {
            return false;
        }
        if (this.M != bi3.M) {
            return false;
        }
        CharSequence charSequence2 = this.N;
        if (charSequence2 == null ? bi3.N != null : !charSequence2.equals(bi3.N)) {
            return false;
        }
        Drawable drawable = this.O;
        if (drawable == null ? bi3.O != null : !drawable.equals(bi3.O)) {
            return false;
        }
        List list = this.P;
        if (list == null ? bi3.P != null : !list.equals(bi3.P)) {
            return false;
        }
        if (this.Q != bi3.Q || this.R != bi3.R || this.S != bi3.S) {
            return false;
        }
        MovementMethod movementMethod = this.T;
        if (movementMethod == null ? bi3.T != null : !movementMethod.equals(bi3.T)) {
            return false;
        }
        if (this.U != bi3.U || this.V != bi3.V || this.W != bi3.W || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || this.X != bi3.X) {
            return false;
        }
        ColorStateList colorStateList2 = this.Y;
        if (colorStateList2 == null ? bi3.Y != null : !colorStateList2.equals(bi3.Y)) {
            return false;
        }
        if (this.Z != bi3.Z) {
            return false;
        }
        List list2 = this.a0;
        if (list2 == null ? bi3.a0 != null : !list2.equals(bi3.a0)) {
            return false;
        }
        Typeface typeface = this.b0;
        Typeface typeface2 = bi3.b0;
        return typeface == null ? typeface2 == null : typeface.equals(typeface2);
    }

    @Override // defpackage.WZ
    public final WZ k0() {
        BI3 bi3 = (BI3) super.k0();
        bi3.z = new AI3();
        return bi3;
    }

    @Override // defpackage.AbstractC10593v00
    public final void f(C7849n00 c7849n00) {
        CharSequence charSequence = this.N;
        ColorDrawable colorDrawable = NI3.a;
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference(charSequence);
        AbstractC6726jk3 abstractC6726jk3 = this.z;
        ((AI3) abstractC6726jk3).b = atomicReference;
        ((AI3) abstractC6726jk3).c = atomicReference2;
        ((AI3) abstractC6726jk3).a = 0;
    }

    @Override // defpackage.AbstractC10593v00
    public final void F(C7849n00 c7849n00) {
        ColorDrawable colorDrawable = NI3.a;
        TypedArray k = c7849n00.k(new int[]{R.attr.textColorHighlight});
        try {
            Integer valueOf = Integer.valueOf(k.getColor(0, 0));
            if (valueOf != null) {
                this.f11437J = valueOf;
            }
        } finally {
            k.recycle();
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void G(C7849n00 c7849n00, InterfaceC3331Zq1 interfaceC3331Zq1, int i, int i2, C8753pe3 c8753pe3) {
        CharSequence charSequence = this.K;
        Drawable drawable = this.O;
        int i3 = this.W;
        ColorStateList colorStateList = this.Y;
        ColorStateList colorStateList2 = this.L;
        Integer num = this.f11437J;
        int i4 = this.Z;
        Typeface typeface = this.b0;
        int i5 = this.X;
        int i6 = this.I;
        boolean z = this.F;
        int i7 = this.Q;
        int i8 = this.M;
        List list = this.P;
        boolean z2 = this.U;
        TextUtils.TruncateAt truncateAt = this.G;
        int i9 = this.S;
        int i10 = this.R;
        int i11 = this.E;
        int i12 = this.D;
        AtomicReference atomicReference = ((AI3) this.z).c;
        ColorDrawable colorDrawable = NI3.a;
        CharSequence charSequence2 = (CharSequence) atomicReference.get();
        MI3 mi3 = new MI3(c7849n00.a);
        CharSequence charSequence3 = charSequence2 instanceof Spannable ? charSequence2.toString() : charSequence2;
        if (drawable == NI3.a) {
            drawable = mi3.getBackground();
        }
        NI3.b(c7849n00, mi3, charSequence, NI3.a(c7849n00, drawable), i3, colorStateList, colorStateList2, num, i4, typeface, i5, i6, z, i7, 0, i8, list, z2, truncateAt, i9, i10, i11, mi3.getMovementMethod(), charSequence3, true, i12);
        mi3.measure(PM1.a(i), PM1.a(i2));
        c8753pe3.b = mi3.getMeasuredHeight();
        if (View.MeasureSpec.getMode(i) == 0) {
            c8753pe3.a = 0;
        } else {
            c8753pe3.a = Math.min(View.MeasureSpec.getSize(i), mi3.getMeasuredWidth());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.AbstractC10593v00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean S(defpackage.WZ r55, defpackage.WZ r56) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.BI3.S(WZ, WZ):boolean");
    }

    @Override // defpackage.AbstractC10593v00
    public final Object B(Context context) {
        ColorDrawable colorDrawable = NI3.a;
        return new LI3(context);
    }

    @Override // defpackage.AbstractC10593v00
    public final void H(C7849n00 c7849n00, Object obj) {
        LI3 li3 = (LI3) obj;
        CharSequence charSequence = this.K;
        Drawable drawable = this.O;
        int i = this.W;
        ColorStateList colorStateList = this.Y;
        ColorStateList colorStateList2 = this.L;
        Integer num = this.f11437J;
        int i2 = this.Z;
        Typeface typeface = this.b0;
        int i3 = this.X;
        int i4 = this.I;
        boolean z = this.F;
        int i5 = this.Q;
        int i6 = this.V;
        int i7 = this.M;
        List list = this.P;
        boolean z2 = this.U;
        int i8 = this.S;
        int i9 = this.R;
        TextUtils.TruncateAt truncateAt = this.G;
        int i10 = this.E;
        MovementMethod movementMethod = this.T;
        boolean z3 = this.H;
        int i11 = this.D;
        AI3 ai3 = (AI3) this.z;
        AtomicReference atomicReference = ai3.c;
        AtomicReference atomicReference2 = ai3.b;
        ColorDrawable colorDrawable = NI3.a;
        if (z3 && !li3.q) {
            li3.q = true;
            li3.setKeyListener(li3.getKeyListener());
        }
        atomicReference2.set(li3);
        NI3.b(c7849n00, li3, charSequence, NI3.a(c7849n00, drawable), i, colorStateList, colorStateList2, num, i2, typeface, i3, i4, z, i5, i6, i7, list, z2, truncateAt, i8, i9, i10, movementMethod, (CharSequence) atomicReference.get(), false, i11);
        li3.m = atomicReference;
    }

    @Override // defpackage.AbstractC10593v00
    public final void x(C7849n00 c7849n00, Object obj) {
        LI3 li3 = (LI3) obj;
        List list = this.a0;
        ColorDrawable colorDrawable = NI3.a;
        WZ wz = c7849n00.f;
        C6206iD0 c6206iD0 = wz == null ? null : ((BI3) wz).c0;
        if (wz != null) {
        }
        if (wz != null) {
        }
        if (wz != null) {
        }
        C6206iD0 c6206iD02 = wz == null ? null : ((BI3) wz).d0;
        if (wz != null) {
        }
        li3.getClass();
        if (list != null && list.size() > 0) {
            TextWatcher ki3 = list.size() == 1 ? (TextWatcher) list.get(0) : new KI3(list);
            li3.o = ki3;
            if (ki3 != null && (ki3 instanceof C8171nw0)) {
                ((C8171nw0) ki3).a = li3;
            }
            li3.addTextChangedListener(ki3);
        }
        li3.l = c7849n00;
        li3.a = c6206iD0;
        li3.g = null;
        li3.h = null;
        li3.i = null;
        li3.j = c6206iD02;
        li3.k = null;
    }

    @Override // defpackage.AbstractC10593v00
    public final void M(C7849n00 c7849n00, Object obj) {
        AtomicReference atomicReference = ((AI3) this.z).b;
        ColorDrawable colorDrawable = NI3.a;
        ((LI3) obj).m = null;
        atomicReference.set(null);
    }

    @Override // defpackage.AbstractC10593v00
    public final void L(Object obj) {
        LI3 li3 = (LI3) obj;
        ColorDrawable colorDrawable = NI3.a;
        TextWatcher textWatcher = li3.o;
        if (textWatcher != null) {
            li3.removeTextChangedListener(textWatcher);
            TextWatcher textWatcher2 = li3.o;
            if (textWatcher2 != null && (textWatcher2 instanceof C8171nw0)) {
                ((C8171nw0) textWatcher2).a = null;
            }
            li3.o = null;
        }
        li3.l = null;
        li3.a = null;
        li3.g = null;
        li3.h = null;
        li3.i = null;
        li3.j = null;
        li3.k = null;
    }

    @Override // defpackage.WZ
    public final void n0(QD0 qd0) {
        PD0 pd0 = this.e0;
        if (pd0 != null) {
            pd0.getClass();
            qd0.a(this.e0);
        }
        PD0 pd02 = this.f0;
        if (pd02 != null) {
            pd02.getClass();
            qd0.a(this.f0);
        }
        PD0 pd03 = this.g0;
        if (pd03 != null) {
            pd03.getClass();
            qd0.a(this.g0);
        }
        PD0 pd04 = this.h0;
        if (pd04 != null) {
            pd04.getClass();
            qd0.a(this.h0);
        }
        PD0 pd05 = this.i0;
        if (pd05 != null) {
            pd05.getClass();
            qd0.a(this.i0);
        }
        PD0 pd06 = this.j0;
        if (pd06 != null) {
            pd06.getClass();
            qd0.a(this.j0);
        }
    }

    @Override // defpackage.AbstractC10593v00
    public final void T(AbstractC6726jk3 abstractC6726jk3, AbstractC6726jk3 abstractC6726jk32) {
        AI3 ai3 = (AI3) abstractC6726jk3;
        AI3 ai32 = (AI3) abstractC6726jk32;
        ai32.a = ai3.a;
        ai32.b = ai3.b;
        ai32.c = ai3.c;
    }
}
