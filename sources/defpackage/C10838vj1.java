package defpackage;

import J.N;
import android.app.Activity;
import android.graphics.Canvas;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.chrome.browser.ntp.IncognitoNewTabPageView;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.site_settings.CookieControlsServiceBridge;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: vj1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10838vj1 extends AbstractC5426fx implements InterfaceC2296Rr1 {
    public final Activity l;
    public final String m;
    public final IncognitoNewTabPageView n;
    public final C10495uj1 o;
    public ViewOnClickListenerC6375ij1 p;
    public InterfaceC6032hj1 q;
    public final int r;

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final String getUrl() {
        return "chrome-native://newtab/";
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void n(String str) {
    }

    @Override // defpackage.InterfaceC5451g12
    public final String q() {
        return "newtab";
    }

    public static void e(C10838vj1 c10838vj1) {
        c10838vj1.getClass();
        C12008z71 a = C12008z71.a();
        Activity activity = c10838vj1.l;
        a.d(activity, activity.getString(R.string.f74350_resource_name_obfuscated_res_0x7f1404eb), null, Profile.d().f(true));
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final void destroy() {
        C10838vj1 c10838vj1 = this.o.a;
        ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij1 = c10838vj1.p;
        if (viewOnClickListenerC6375ij1 != null) {
            viewOnClickListenerC6375ij1.g.d(c10838vj1.q);
        }
        super.destroy();
    }

    public C10838vj1(Activity activity, C7857n12 c7857n12) {
        super(c7857n12);
        this.l = activity;
        this.r = c7857n12.a().getColor(R.color.f25490_resource_name_obfuscated_res_0x7f070803);
        C10495uj1 c10495uj1 = new C10495uj1(this);
        this.o = c10495uj1;
        this.m = c7857n12.a().getResources().getString(R.string.f78140_resource_name_obfuscated_res_0x7f1406c3);
        IncognitoNewTabPageView incognitoNewTabPageView = (IncognitoNewTabPageView) LayoutInflater.from(c7857n12.a()).inflate(R.layout.f59090_resource_name_obfuscated_res_0x7f0e01b1, (ViewGroup) null);
        this.n = incognitoNewTabPageView;
        incognitoNewTabPageView.a = c10495uj1;
        ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij1 = new ViewOnClickListenerC6375ij1();
        this.p = viewOnClickListenerC6375ij1;
        if (!viewOnClickListenerC6375ij1.h) {
            viewOnClickListenerC6375ij1.a = new CookieControlsServiceBridge(viewOnClickListenerC6375ij1);
            viewOnClickListenerC6375ij1.h = true;
        }
        C10152tj1 c10152tj1 = new C10152tj1(c10495uj1);
        this.q = c10152tj1;
        this.p.g.a(c10152tj1);
        incognitoNewTabPageView.i.e(this.p);
        incognitoNewTabPageView.i.a(this.p);
        ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij12 = this.p;
        if (viewOnClickListenerC6375ij12.h) {
            N.Ml$8f4xR(viewOnClickListenerC6375ij12.a.a);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            incognitoNewTabPageView.setDefaultFocusHighlightEnabled(false);
        }
        d(incognitoNewTabPageView);
    }

    @Override // defpackage.InterfaceC2296Rr1
    public final boolean f() {
        IncognitoNewTabPageView incognitoNewTabPageView = this.n;
        if (incognitoNewTabPageView.getWidth() == 0 || incognitoNewTabPageView.getHeight() == 0) {
            return false;
        }
        ViewOnClickListenerC6375ij1 viewOnClickListenerC6375ij1 = incognitoNewTabPageView.a.a.p;
        int i = viewOnClickListenerC6375ij1.l;
        int i2 = viewOnClickListenerC6375ij1.j;
        boolean z = (i == i2 && viewOnClickListenerC6375ij1.k == viewOnClickListenerC6375ij1.i) ? false : true;
        viewOnClickListenerC6375ij1.k = viewOnClickListenerC6375ij1.i;
        viewOnClickListenerC6375ij1.l = i2;
        return (!z && incognitoNewTabPageView.getWidth() == incognitoNewTabPageView.j && incognitoNewTabPageView.getHeight() == incognitoNewTabPageView.k && incognitoNewTabPageView.h.getScrollY() == incognitoNewTabPageView.l) ? false : true;
    }

    @Override // defpackage.AbstractC5426fx, defpackage.InterfaceC5451g12
    public final int t() {
        return this.r;
    }

    @Override // defpackage.InterfaceC5451g12
    public final String getTitle() {
        return this.m;
    }

    @Override // defpackage.InterfaceC2296Rr1
    public final void g(Canvas canvas) {
        IncognitoNewTabPageView incognitoNewTabPageView = this.n;
        incognitoNewTabPageView.getClass();
        Ge4.e(incognitoNewTabPageView);
        incognitoNewTabPageView.draw(canvas);
        incognitoNewTabPageView.j = incognitoNewTabPageView.getWidth();
        incognitoNewTabPageView.k = incognitoNewTabPageView.getHeight();
        incognitoNewTabPageView.l = incognitoNewTabPageView.h.getScrollY();
    }
}
