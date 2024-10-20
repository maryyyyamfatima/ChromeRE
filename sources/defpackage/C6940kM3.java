package defpackage;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.chrome.R;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kM3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6940kM3 {
    public final C4191cM3 a;
    public final C5566gM3 b;
    public final RK2 c;
    public final LayoutAnimationController d;
    public final AM3 e;

    public C6940kM3(Context context, C4191cM3 c4191cM3) {
        this.a = c4191cM3;
        C5566gM3 c5566gM3 = new C5566gM3(this, context);
        this.b = c5566gM3;
        c5566gM3.z = true;
        c5566gM3.q0(new LinearLayoutManager(0, false));
        c5566gM3.g(new C6254iM3(this, context));
        c5566gM3.p0(null);
        this.d = AnimationUtils.loadLayoutAnimation(context, R.anim.f480_resource_name_obfuscated_res_0x7f020036);
        c5566gM3.setLayoutAnimationListener(new AnimationAnimationListenerC5910hM3(this));
        AM3 am3 = new AM3(context);
        this.e = am3;
        UD2.a(c4191cM3.h, c5566gM3, new C4878eM3());
        final RK2 rk2 = new RK2(new C6596jM3(c4191cM3), new GM3(am3));
        this.c = rk2;
        c5566gM3.n0(rk2);
        c5566gM3.post(new Runnable() { // from class: fM3
            @Override // java.lang.Runnable
            public final void run() {
                RK2.this.t();
            }
        });
    }
}
