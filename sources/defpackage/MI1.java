package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Bitmap;
import com.android.chrome.R;
import org.chromium.chrome.browser.tab.Tab;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class MI1 extends C10084tX2 {
    public final Activity p;
    public final C6201iC0 q;
    public final Tab r;
    public YI1 s;

    public MI1(Activity activity, Tab tab, String str, QO qo, QB qb, InterfaceC10140th1 interfaceC10140th1) {
        super(activity, tab.m(), str, qo, qb, interfaceC10140th1);
        this.p = activity;
        this.r = tab;
        this.q = new C6201iC0(activity, tab, false);
        this.s = null;
        N.MJ3oAy5s();
    }

    @Override // defpackage.AbstractC5420fw
    public final void c() {
        if (this.s == null) {
            this.s = new YI1(this.p, this.q);
        }
        this.s.c(new Runnable() { // from class: LI1
            @Override // java.lang.Runnable
            public final void run() {
                MI1 mi1 = MI1.this;
                Bitmap b = mi1.s.b();
                mi1.k = b;
                if (b == null) {
                    ZN3.b(R.string.0_resource_name_obfuscated_res_0x7f140a37, 1, mi1.p).d();
                } else {
                    mi1.e();
                }
            }
        });
    }
}
