package defpackage;

import android.text.TextUtils;
import com.android.chrome.R;
import java.nio.ByteBuffer;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: r1 */
/* loaded from: classes.dex */
public final class C9226r1 implements InterfaceC9641sD2 {
    @Override // defpackage.InterfaceC9641sD2
    public final int b() {
        return 168774763;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final /* synthetic */ void c(InterfaceC8177nx0 interfaceC8177nx0) {
    }

    @Override // defpackage.InterfaceC9641sD2
    public final AbstractC11362xE3 d(ByteBuffer byteBuffer) {
        C8884q1 c8884q1 = new C8884q1();
        C8884q1.h(byteBuffer, c8884q1);
        return c8884q1;
    }

    @Override // defpackage.InterfaceC11013wD2
    public final void e(C7849n00 c7849n00, U80 u80, String str, Object obj, InterfaceC8177nx0 interfaceC8177nx0, C8367oX c8367oX) {
        C8884q1 c8884q1 = (C8884q1) obj;
        TZ l = interfaceC8177nx0.l();
        int b = c8884q1.b(6);
        String str2 = null;
        String d = b != 0 ? c8884q1.d(b + c8884q1.a) : null;
        int b2 = c8884q1.b(4);
        String d2 = b2 != 0 ? c8884q1.d(b2 + c8884q1.a) : null;
        boolean z = !TextUtils.isEmpty(d);
        boolean z2 = !TextUtils.isEmpty(d2);
        if (z && z2) {
            str2 = AbstractC8192o0.a(d2, " ", d);
        } else if (z) {
            str2 = d;
        } else if (z2) {
            str2 = d2;
        }
        if (!TextUtils.isEmpty(c8884q1.i())) {
            String i = c8884q1.i();
            BY by = (BY) l.h.b0();
            by.a = (byte) (by.a | 2);
            by.k = i;
            l.k();
        }
        if (str2 != null) {
            l.h(str2);
        }
        if (c8884q1.b(14) != 0) {
            l.j(c8884q1.j());
        }
        String i2 = c8884q1.i();
        if (!TextUtils.isEmpty(i2) && c8884q1.j()) {
            interfaceC8177nx0.g(R.id.elements_accessibility_view_tag_id, i2);
        }
        int i3 = 0;
        boolean z3 = false;
        int i4 = 1;
        while (true) {
            int b3 = c8884q1.b(12);
            if (i3 < (b3 != 0 ? c8884q1.g(b3) : 0)) {
                int b4 = c8884q1.b(12);
                int i5 = b4 != 0 ? c8884q1.b.getInt((i3 * 4) + c8884q1.e(b4)) : 0;
                if (i5 != 2 && i5 != 4) {
                    if (i5 == 7) {
                        ((BY) l.h.b0()).U1().K = 2;
                        l.k();
                    } else {
                        switch (i5) {
                            case 10:
                                z3 = true;
                                break;
                            case 13:
                                ((BY) l.h.b0()).U1().M = 1;
                                l.k();
                                break;
                        }
                    }
                    i3++;
                }
                if (i5 > i4) {
                    i4 = i5;
                }
                i3++;
            } else {
                String str3 = i4 != 2 ? i4 != 4 ? i4 != 14 ? i4 != 11 ? i4 != 12 ? "" : "android.widget.RadioButton" : "android.widget.Spinner" : "android.widget.CompoundButton" : "android.widget.ImageView" : "android.widget.Button";
                C3975bk0 U1 = ((BY) l.h.b0()).U1();
                U1.N |= 4194304;
                U1.y = str3;
                l.k();
                if (i4 == 12 || i4 == 14) {
                    interfaceC8177nx0.o();
                    interfaceC8177nx0.setChecked(z3);
                }
                int b5 = c8884q1.b(16);
                int i6 = b5 != 0 ? c8884q1.b.getInt(b5 + c8884q1.a) : 0;
                if (i6 == 1) {
                    l.l(1);
                    return;
                }
                if (i6 == 2) {
                    l.l(8);
                    return;
                }
                if (i6 == 3) {
                    l.l(2);
                    return;
                } else if (i6 == 4) {
                    l.l(4);
                    return;
                } else {
                    l.l(0);
                    return;
                }
            }
        }
    }

    public static void f(C8884q1 c8884q1, InterfaceC8177nx0 interfaceC8177nx0) {
        if (interfaceC8177nx0.f() || interfaceC8177nx0.n() || interfaceC8177nx0.s()) {
            if (c8884q1.b(14) != 0) {
                interfaceC8177nx0.l().j(c8884q1.j());
            }
        }
    }
}
