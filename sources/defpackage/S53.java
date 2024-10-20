package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class S53 {
    public static final C4534dM2 m = new C4534dM2(0.5f);
    public final AbstractC11676y90 a;
    public final AbstractC11676y90 b;
    public final AbstractC11676y90 c;
    public final AbstractC11676y90 d;
    public final InterfaceC11333x90 e;
    public final InterfaceC11333x90 f;
    public final InterfaceC11333x90 g;
    public final InterfaceC11333x90 h;
    public final C2445Sv0 i;
    public final C2445Sv0 j;
    public final C2445Sv0 k;
    public final C2445Sv0 l;

    public static R53 a(Context context, AttributeSet attributeSet, int i, int i2) {
        return b(context, attributeSet, i, i2, new C6129i(0));
    }

    public static R53 b(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC11333x90 interfaceC11333x90) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, JG2.n0, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, resourceId2);
        }
        TypedArray obtainStyledAttributes2 = contextThemeWrapper.obtainStyledAttributes(JG2.K0);
        try {
            int i3 = obtainStyledAttributes2.getInt(0, 0);
            int i4 = obtainStyledAttributes2.getInt(3, i3);
            int i5 = obtainStyledAttributes2.getInt(4, i3);
            int i6 = obtainStyledAttributes2.getInt(2, i3);
            int i7 = obtainStyledAttributes2.getInt(1, i3);
            InterfaceC11333x90 c = c(obtainStyledAttributes2, 5, interfaceC11333x90);
            InterfaceC11333x90 c2 = c(obtainStyledAttributes2, 8, c);
            InterfaceC11333x90 c3 = c(obtainStyledAttributes2, 9, c);
            InterfaceC11333x90 c4 = c(obtainStyledAttributes2, 7, c);
            InterfaceC11333x90 c5 = c(obtainStyledAttributes2, 6, c);
            R53 r53 = new R53();
            AbstractC11676y90 a = EM1.a(i4);
            r53.a = a;
            R53.b(a);
            r53.e = c2;
            AbstractC11676y90 a2 = EM1.a(i5);
            r53.b = a2;
            R53.b(a2);
            r53.f = c3;
            AbstractC11676y90 a3 = EM1.a(i6);
            r53.c = a3;
            R53.b(a3);
            r53.g = c4;
            AbstractC11676y90 a4 = EM1.a(i7);
            r53.d = a4;
            R53.b(a4);
            r53.h = c5;
            return r53;
        } finally {
            obtainStyledAttributes2.recycle();
        }
    }

    public static InterfaceC11333x90 c(TypedArray typedArray, int i, InterfaceC11333x90 interfaceC11333x90) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC11333x90;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new C6129i(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new C4534dM2(peekValue.getFraction(1.0f, 1.0f)) : interfaceC11333x90;
    }

    public S53(R53 r53) {
        this.a = r53.a;
        this.b = r53.b;
        this.c = r53.c;
        this.d = r53.d;
        this.e = r53.e;
        this.f = r53.f;
        this.g = r53.g;
        this.h = r53.h;
        this.i = r53.i;
        this.j = r53.j;
        this.k = r53.k;
        this.l = r53.l;
    }

    public S53() {
        this.a = new C6620jR2();
        this.b = new C6620jR2();
        this.c = new C6620jR2();
        this.d = new C6620jR2();
        this.e = new C6129i(0.0f);
        this.f = new C6129i(0.0f);
        this.g = new C6129i(0.0f);
        this.h = new C6129i(0.0f);
        this.i = new C2445Sv0();
        this.j = new C2445Sv0();
        this.k = new C2445Sv0();
        this.l = new C2445Sv0();
    }

    public final boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(C2445Sv0.class) && this.j.getClass().equals(C2445Sv0.class) && this.i.getClass().equals(C2445Sv0.class) && this.k.getClass().equals(C2445Sv0.class);
        float a = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a ? 1 : (this.f.a(rectF) == a ? 0 : -1)) == 0 && (this.h.a(rectF) > a ? 1 : (this.h.a(rectF) == a ? 0 : -1)) == 0 && (this.g.a(rectF) > a ? 1 : (this.g.a(rectF) == a ? 0 : -1)) == 0) && ((this.b instanceof C6620jR2) && (this.a instanceof C6620jR2) && (this.c instanceof C6620jR2) && (this.d instanceof C6620jR2));
    }
}
