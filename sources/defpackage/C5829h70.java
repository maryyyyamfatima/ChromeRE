package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: h70, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5829h70 {
    public final N70 a;
    public final C7203l70 b;
    public final C7553m80 c;
    public final C6515j70 d;
    public final C4460d80 e;
    public final C6859k70 f;
    public final C8921q70 g;
    public float h;
    public float i;
    public boolean j;
    public final float k;
    public final float l;
    public final float m;
    public final boolean n;
    public C4424d20 o;
    public C4424d20 p;
    public C4424d20 q;
    public float r;
    public float s;
    public boolean t;
    public float u;
    public float v;

    public C5829h70(N70 n70, Context context, ViewGroup viewGroup, C9537rv0 c9537rv0) {
        this.a = n70;
        this.n = n70.o0 == 0;
        this.g = new C8921q70(n70);
        this.b = new C7203l70(n70, context, viewGroup, c9537rv0);
        this.c = new C7553m80(n70, context, viewGroup, c9537rv0);
        this.d = new C6515j70(n70, context, viewGroup, c9537rv0);
        this.e = new C4460d80(context, c9537rv0);
        this.f = new C6859k70(context, c9537rv0);
        this.k = context.getResources().getDimension(R.dimen.f30100_resource_name_obfuscated_res_0x7f080153);
        this.l = context.getResources().getDimension(R.dimen.f30090_resource_name_obfuscated_res_0x7f080152);
        context.getResources().getDimension(R.dimen.f30070_resource_name_obfuscated_res_0x7f080150);
        context.getResources().getDimension(R.dimen.f37970_resource_name_obfuscated_res_0x7f08063c);
        this.m = context.getResources().getDisplayMetrics().density;
    }

    public final void a(String str) {
        this.d.o(str);
    }

    public final void c(float f) {
        if (this.t) {
            return;
        }
        N70 n70 = this.a;
        if (n70.x0(2) || this.n) {
            int round = Math.round(n70.t / n70.a);
            if (n70.x0(2)) {
                this.u = 0.0f;
                this.v = round;
            } else {
                boolean isLayoutRtl = LocalizationUtils.isLayoutRtl();
                float B0 = n70.B0() + n70.A + n70.p;
                float f2 = this.m;
                float f3 = B0 * f2;
                float f4 = round - f3;
                float f5 = f - (n70.v * f2);
                if ((isLayoutRtl && f5 > f3) || (!isLayoutRtl && f5 < f4)) {
                    this.u = isLayoutRtl ? f3 : 0.0f;
                    this.v = f4;
                } else {
                    this.u = isLayoutRtl ? 0.0f : f4;
                    this.v = f3;
                }
            }
            this.t = true;
            if (this.p == null) {
                C4424d20 c4424d20 = new C4424d20(n70.z0());
                this.p = c4424d20;
                c4424d20.o = 218L;
                c4424d20.addListener(new C5485g70(this));
            }
            this.p.cancel();
            this.p.start();
        }
    }

    public final void b(String str, String str2) {
        C4424d20 c4424d20 = this.o;
        if (c4424d20 != null) {
            c4424d20.cancel();
        }
        this.e.n();
        if (str2 == null) {
            C7553m80 c7553m80 = this.c;
            c7553m80.d();
            c7553m80.z.setText(AbstractC0288Cf2.k(str));
            c7553m80.l(true);
            this.j = false;
            this.h = 0.0f;
            this.i = 1.0f;
            return;
        }
        C7203l70 c7203l70 = this.b;
        c7203l70.d();
        c7203l70.y.setText(AbstractC0288Cf2.k(str));
        c7203l70.z.setText(AbstractC0288Cf2.k(str2));
        c7203l70.l(true);
        this.j = true;
        this.h = 1.0f;
        this.i = 0.0f;
    }
}
