package defpackage;

import android.view.View;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: fc4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5305fc4 {
    public final InterfaceC4961ec4 a;
    public final C4618dc4 b = new C4618dc4();

    public C5305fc4(InterfaceC4961ec4 interfaceC4961ec4) {
        this.a = interfaceC4961ec4;
    }

    public final View a(int i, int i2, int i3, int i4) {
        InterfaceC4961ec4 interfaceC4961ec4 = this.a;
        int c = interfaceC4961ec4.c();
        int d = interfaceC4961ec4.d();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a = interfaceC4961ec4.a(i);
            int b = interfaceC4961ec4.b(a);
            int e = interfaceC4961ec4.e(a);
            C4618dc4 c4618dc4 = this.b;
            c4618dc4.b = c;
            c4618dc4.c = d;
            c4618dc4.d = b;
            c4618dc4.e = e;
            if (i3 != 0) {
                c4618dc4.a = i3 | 0;
                if (c4618dc4.a()) {
                    return a;
                }
            }
            if (i4 != 0) {
                c4618dc4.a = i4 | 0;
                if (c4618dc4.a()) {
                    view = a;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean b(View view) {
        InterfaceC4961ec4 interfaceC4961ec4 = this.a;
        int c = interfaceC4961ec4.c();
        int d = interfaceC4961ec4.d();
        int b = interfaceC4961ec4.b(view);
        int e = interfaceC4961ec4.e(view);
        C4618dc4 c4618dc4 = this.b;
        c4618dc4.b = c;
        c4618dc4.c = d;
        c4618dc4.d = b;
        c4618dc4.e = e;
        c4618dc4.a = 24579 | 0;
        return c4618dc4.a();
    }
}
