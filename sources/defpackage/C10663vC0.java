package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import java.util.Arrays;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vC0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10663vC0 {
    public final Context a;
    public final AccessibilityManager b;
    public final C10320uC0 c;
    public final C1031Hy0 d;
    public DisplayMetrics e;

    public C10663vC0(Context context, C1031Hy0 c1031Hy0) {
        this.a = context;
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getApplicationContext().getSystemService("accessibility");
        this.b = accessibilityManager;
        this.c = new C10320uC0(accessibilityManager);
        this.e = context.getResources().getDisplayMetrics();
        this.d = c1031Hy0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [oC0] */
    public final C6529j92 c(final U80 u80) {
        return new C6529j92(new C5499g92(new T92() { // from class: nC0
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r14v0, types: [android.view.View$OnLayoutChangeListener, pC0] */
            /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, qC0] */
            /* JADX WARN: Type inference failed for: r8v1, types: [android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, rC0] */
            @Override // defpackage.T92
            public final void a(final C5155f92 c5155f92) {
                C5389fq4 f;
                final C10663vC0 c10663vC0 = C10663vC0.this;
                U80 u802 = u80;
                c10663vC0.getClass();
                C3184Yn c3184Yn = (C3184Yn) u802;
                final View view = c3184Yn.b;
                Integer num = c3184Yn.c;
                int intValue = num != null ? num.intValue() : 0;
                Integer num2 = c3184Yn.d;
                int intValue2 = num2 != null ? num2.intValue() : 0;
                final int d = C10663vC0.d(c10663vC0.e, intValue);
                final int d2 = C10663vC0.d(c10663vC0.e, intValue2);
                if (view == 0) {
                    f = C10663vC0.b();
                } else {
                    f = Ec4.f(view);
                    if (f == null) {
                        f = C10663vC0.b();
                    }
                }
                final C5389fq4 c5389fq4 = f;
                final ?? r14 = new View.OnLayoutChangeListener() { // from class: pC0
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                        ((C5155f92) c5155f92).c(C10663vC0.this.a(view, d, d2, c5389fq4));
                    }
                };
                final ?? r15 = new Object() { // from class: qC0
                };
                final ?? r8 = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: rC0
                    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
                    public final void onTouchExplorationStateChanged(boolean z) {
                        C10663vC0 c10663vC02 = C10663vC0.this;
                        InterfaceC9277r92 interfaceC9277r92 = c5155f92;
                        View view2 = view;
                        int i = d;
                        int i2 = d2;
                        C5389fq4 c5389fq42 = c5389fq4;
                        C10320uC0 c10320uC0 = c10663vC02.c;
                        synchronized (c10320uC0) {
                            c10320uC0.b = true;
                        }
                        ((C5155f92) interfaceC9277r92).c(c10663vC02.a(view2, i, i2, c5389fq42));
                    }
                };
                c10663vC0.b.addTouchExplorationStateChangeListener(r8);
                if (view != 0) {
                    view.addOnLayoutChangeListener(r14);
                    Ec4.o(view, new InterfaceC11483xc2() { // from class: sC0
                        @Override // defpackage.InterfaceC11483xc2
                        public final C5389fq4 a(View view2, C5389fq4 c5389fq42) {
                            int i = d;
                            int i2 = d2;
                            C10663vC0 c10663vC02 = C10663vC0.this;
                            View view3 = view;
                            ((C5155f92) c5155f92).c(c10663vC02.a(view3, i, i2, c5389fq42));
                            return Ec4.h(view3, c5389fq42);
                        }
                    });
                }
                C1031Hy0 c1031Hy0 = c10663vC0.d;
                synchronized (c1031Hy0) {
                    c1031Hy0.a.add(r15);
                }
                EnumC7791mq0.e(c5155f92, new OF(new KF() { // from class: tC0
                    @Override // defpackage.KF
                    public final void cancel() {
                        C10663vC0 c10663vC02 = C10663vC0.this;
                        View view2 = view;
                        View.OnLayoutChangeListener onLayoutChangeListener = r14;
                        C8949qC0 c8949qC0 = r15;
                        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = r8;
                        if (view2 != null) {
                            c10663vC02.getClass();
                            view2.removeOnLayoutChangeListener(onLayoutChangeListener);
                        }
                        C1031Hy0 c1031Hy02 = c10663vC02.d;
                        synchronized (c1031Hy02) {
                            c1031Hy02.a.remove(c8949qC0);
                        }
                        c10663vC02.b.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    }
                }));
                c5155f92.c(c10663vC0.a(view, d, d2, c5389fq4));
            }
        }), new InterfaceC1155Ix() { // from class: oC0
            @Override // defpackage.InterfaceC1155Ix
            public final boolean test(Object obj, Object obj2) {
                return Arrays.equals((byte[]) obj, (byte[]) obj2);
            }
        });
    }

    public final byte[] a(View view, int i, int i2, C5389fq4 c5389fq4) {
        Boolean bool;
        if (view != null) {
            i = d(this.e, view.getWidth());
            i2 = d(this.e, view.getHeight());
        }
        DisplayMetrics displayMetrics = this.e;
        float f = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        int i3 = (int) ((f / f2) + 0.5f);
        int i4 = (int) ((displayMetrics.heightPixels / f2) + 0.5f);
        int i5 = (i3 == 0 || i4 == 0) ? 1 : i4 > i3 ? 4 : 2;
        C6543jC0 c6543jC0 = (C6543jC0) C6887kC0.s.j();
        if (c6543jC0.h) {
            c6543jC0.l();
            c6543jC0.h = false;
        }
        C6887kC0 c6887kC0 = (C6887kC0) c6543jC0.g;
        c6887kC0.getClass();
        c6887kC0.o = 0;
        c6887kC0.j |= 16;
        float f3 = i;
        if (c6543jC0.h) {
            c6543jC0.l();
            c6543jC0.h = false;
        }
        C6887kC0 c6887kC02 = (C6887kC0) c6543jC0.g;
        c6887kC02.j |= 1;
        c6887kC02.k = f3;
        float f4 = i2;
        if (c6543jC0.h) {
            c6543jC0.l();
            c6543jC0.h = false;
        }
        C6887kC0 c6887kC03 = (C6887kC0) c6543jC0.g;
        c6887kC03.j |= 2;
        c6887kC03.l = f4;
        C2005Pl0 c2005Pl0 = (C2005Pl0) C2135Ql0.l.j();
        if (c2005Pl0.h) {
            c2005Pl0.l();
            c2005Pl0.h = false;
        }
        C2135Ql0 c2135Ql0 = (C2135Ql0) c2005Pl0.g;
        c2135Ql0.getClass();
        c2135Ql0.k = AbstractC2373Sg3.b(i5);
        c2135Ql0.j |= 1;
        C2135Ql0 c2135Ql02 = (C2135Ql0) c2005Pl0.j();
        if (c6543jC0.h) {
            c6543jC0.l();
            c6543jC0.h = false;
        }
        C6887kC0 c6887kC04 = (C6887kC0) c6543jC0.g;
        c6887kC04.getClass();
        c2135Ql02.getClass();
        c6887kC04.m = c2135Ql02;
        c6887kC04.j |= 4;
        C10467ue3 c10467ue3 = (C10467ue3) C10810ve3.m.j();
        float f5 = i3;
        if (c10467ue3.h) {
            c10467ue3.l();
            c10467ue3.h = false;
        }
        C10810ve3 c10810ve3 = (C10810ve3) c10467ue3.g;
        c10810ve3.j |= 1;
        c10810ve3.k = f5;
        float f6 = i4;
        if (c10467ue3.h) {
            c10467ue3.l();
            c10467ue3.h = false;
        }
        C10810ve3 c10810ve32 = (C10810ve3) c10467ue3.g;
        c10810ve32.j |= 2;
        c10810ve32.l = f6;
        C10810ve3 c10810ve33 = (C10810ve3) c10467ue3.j();
        if (c6543jC0.h) {
            c6543jC0.l();
            c6543jC0.h = false;
        }
        C6887kC0 c6887kC05 = (C6887kC0) c6543jC0.g;
        c6887kC05.getClass();
        c10810ve33.getClass();
        c6887kC05.n = c10810ve33;
        c6887kC05.j |= 8;
        int i6 = this.a.getApplicationContext().getResources().getConfiguration().smallestScreenWidthDp < 600 ? 1 : 2;
        if (c6543jC0.h) {
            c6543jC0.l();
            c6543jC0.h = false;
        }
        C6887kC0 c6887kC06 = (C6887kC0) c6543jC0.g;
        c6887kC06.getClass();
        c6887kC06.p = AbstractC2373Sg3.b(i6);
        c6887kC06.j |= 32;
        DisplayMetrics displayMetrics2 = this.e;
        C2141Qm1 f7 = c5389fq4.a.f(7);
        C1236Jn0 c1236Jn0 = (C1236Jn0) C1366Kn0.o.j();
        C1885On0 c1885On0 = C1885On0.l;
        C1755Nn0 c1755Nn0 = (C1755Nn0) c1885On0.j();
        float f8 = (int) ((f7.b / displayMetrics2.density) + 0.5f);
        if (c1755Nn0.h) {
            c1755Nn0.l();
            c1755Nn0.h = false;
        }
        C1885On0 c1885On02 = (C1885On0) c1755Nn0.g;
        c1885On02.j |= 1;
        c1885On02.k = f8;
        C1885On0 c1885On03 = (C1885On0) c1755Nn0.j();
        if (c1236Jn0.h) {
            c1236Jn0.l();
            c1236Jn0.h = false;
        }
        C1366Kn0 c1366Kn0 = (C1366Kn0) c1236Jn0.g;
        c1366Kn0.getClass();
        c1885On03.getClass();
        c1366Kn0.k = c1885On03;
        c1366Kn0.j |= 1;
        C1755Nn0 c1755Nn02 = (C1755Nn0) c1885On0.j();
        float f9 = (int) ((f7.d / displayMetrics2.density) + 0.5f);
        if (c1755Nn02.h) {
            c1755Nn02.l();
            c1755Nn02.h = false;
        }
        C1885On0 c1885On04 = (C1885On0) c1755Nn02.g;
        c1885On04.j |= 1;
        c1885On04.k = f9;
        C1885On0 c1885On05 = (C1885On0) c1755Nn02.j();
        if (c1236Jn0.h) {
            c1236Jn0.l();
            c1236Jn0.h = false;
        }
        C1366Kn0 c1366Kn02 = (C1366Kn0) c1236Jn0.g;
        c1366Kn02.getClass();
        c1885On05.getClass();
        c1366Kn02.m = c1885On05;
        c1366Kn02.j |= 4;
        C1755Nn0 c1755Nn03 = (C1755Nn0) c1885On0.j();
        float f10 = (int) ((f7.a / displayMetrics2.density) + 0.5f);
        if (c1755Nn03.h) {
            c1755Nn03.l();
            c1755Nn03.h = false;
        }
        C1885On0 c1885On06 = (C1885On0) c1755Nn03.g;
        c1885On06.j |= 1;
        c1885On06.k = f10;
        C1885On0 c1885On07 = (C1885On0) c1755Nn03.j();
        if (c1236Jn0.h) {
            c1236Jn0.l();
            c1236Jn0.h = false;
        }
        C1366Kn0 c1366Kn03 = (C1366Kn0) c1236Jn0.g;
        c1366Kn03.getClass();
        c1885On07.getClass();
        c1366Kn03.l = c1885On07;
        c1366Kn03.j |= 2;
        C1755Nn0 c1755Nn04 = (C1755Nn0) c1885On0.j();
        float f11 = (int) ((f7.c / displayMetrics2.density) + 0.5f);
        if (c1755Nn04.h) {
            c1755Nn04.l();
            c1755Nn04.h = false;
        }
        C1885On0 c1885On08 = (C1885On0) c1755Nn04.g;
        c1885On08.j |= 1;
        c1885On08.k = f11;
        C1885On0 c1885On09 = (C1885On0) c1755Nn04.j();
        if (c1236Jn0.h) {
            c1236Jn0.l();
            c1236Jn0.h = false;
        }
        C1366Kn0 c1366Kn04 = (C1366Kn0) c1236Jn0.g;
        c1366Kn04.getClass();
        c1885On09.getClass();
        c1366Kn04.n = c1885On09;
        c1366Kn04.j |= 8;
        C1366Kn0 c1366Kn05 = (C1366Kn0) c1236Jn0.j();
        if (c6543jC0.h) {
            c6543jC0.l();
            c6543jC0.h = false;
        }
        C6887kC0 c6887kC07 = (C6887kC0) c6543jC0.g;
        c6887kC07.getClass();
        c1366Kn05.getClass();
        c6887kC07.r = c1366Kn05;
        c6887kC07.j |= 128;
        C10320uC0 c10320uC0 = this.c;
        synchronized (c10320uC0) {
            if (c10320uC0.b) {
                c10320uC0.c = Boolean.valueOf(c10320uC0.a.isTouchExplorationEnabled());
                c10320uC0.b = false;
            }
            bool = c10320uC0.c;
        }
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (c6543jC0.h) {
                c6543jC0.l();
                c6543jC0.h = false;
            }
            C6887kC0 c6887kC08 = (C6887kC0) c6543jC0.g;
            c6887kC08.j |= 64;
            c6887kC08.q = booleanValue;
        }
        return ((C6887kC0) c6543jC0.j()).toByteArray();
    }

    public static int d(DisplayMetrics displayMetrics, int i) {
        return (int) ((i / displayMetrics.density) + 0.5f);
    }

    public static C5389fq4 b() {
        Hp4 c11563xp4;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            c11563xp4 = new Gp4();
        } else if (i >= 29) {
            c11563xp4 = new Ep4();
        } else {
            c11563xp4 = new C11563xp4();
        }
        c11563xp4.c(C2141Qm1.b(0, 0, 0, 0));
        return c11563xp4.b();
    }
}
