package defpackage;

import J.N;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.chrome.R;
import org.chromium.components.browser_ui.bottomsheet.m;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Jk */
/* loaded from: classes.dex */
public final class C1220Jk implements PB, InterfaceC2259Rk {
    public final QB a;
    public final C1090Ik g;
    public InterfaceC2129Qk h;
    public final View i;

    @Override // defpackage.PB
    public final int a() {
        return 0;
    }

    @Override // defpackage.PB
    public final int b() {
        return 0;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.PB
    public final View e() {
        return null;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.PB
    public final int g() {
        return R.string.0_resource_name_obfuscated_res_0x7f140267;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean h() {
        return false;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.PB
    public final int l() {
        return R.string.0_resource_name_obfuscated_res_0x7f140264;
    }

    @Override // defpackage.PB
    public final int m() {
        return -2;
    }

    @Override // defpackage.PB
    public final /* synthetic */ void n() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ C8385oa2 o() {
        return OB.a();
    }

    @Override // defpackage.PB
    public final /* synthetic */ void onBackPressed() {
    }

    @Override // defpackage.PB
    public final /* synthetic */ float p() {
        return 0.0f;
    }

    @Override // defpackage.PB
    public final int q() {
        return R.string.0_resource_name_obfuscated_res_0x7f140265;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.0_resource_name_obfuscated_res_0x7f140266;
    }

    @Override // defpackage.PB
    public final float t() {
        return -1.0f;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // defpackage.PB
    public final boolean v() {
        return false;
    }

    public C1220Jk(Context context, QB qb) {
        this.a = qb;
        if (AbstractC8293oI0.a()) {
            C7928nE c7928nE = UN.a;
            if (N.M09VlOh_("AssistantConsentSimplifiedText")) {
                this.i = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0044, (ViewGroup) null);
                this.g = new C1090Ik(this);
                this.i.findViewById(R.id.button_primary).setOnClickListener(new View.OnClickListener() { // from class: Fk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1220Jk c1220Jk = C1220Jk.this;
                        ((m) c1220Jk.a).l(c1220Jk, true, 9);
                        ((C1609Mk) c1220Jk.h).c(0);
                        c1220Jk.h = null;
                    }
                });
                this.i.findViewById(R.id.button_secondary).setOnClickListener(new View.OnClickListener() { // from class: Gk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C1220Jk c1220Jk = C1220Jk.this;
                        ((m) c1220Jk.a).l(c1220Jk, true, 9);
                        ((C1609Mk) c1220Jk.h).f(2);
                        c1220Jk.h = null;
                    }
                });
                this.i.findViewById(R.id.avs_consent_ui_learn_more).setOnClickListener(new View.OnClickListener() { // from class: Hk
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ((C1609Mk) C1220Jk.this.h).i.run();
                    }
                });
            }
        }
        this.i = LayoutInflater.from(context).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0042, (ViewGroup) null);
        this.g = new C1090Ik(this);
        this.i.findViewById(R.id.button_primary).setOnClickListener(new View.OnClickListener() { // from class: Fk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1220Jk c1220Jk = C1220Jk.this;
                ((m) c1220Jk.a).l(c1220Jk, true, 9);
                ((C1609Mk) c1220Jk.h).c(0);
                c1220Jk.h = null;
            }
        });
        this.i.findViewById(R.id.button_secondary).setOnClickListener(new View.OnClickListener() { // from class: Gk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1220Jk c1220Jk = C1220Jk.this;
                ((m) c1220Jk.a).l(c1220Jk, true, 9);
                ((C1609Mk) c1220Jk.h).f(2);
                c1220Jk.h = null;
            }
        });
        this.i.findViewById(R.id.avs_consent_ui_learn_more).setOnClickListener(new View.OnClickListener() { // from class: Hk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ((C1609Mk) C1220Jk.this.h).i.run();
            }
        });
    }

    @Override // defpackage.InterfaceC2259Rk
    public final void i(C1609Mk c1609Mk) {
        this.h = c1609Mk;
        m mVar = (m) this.a;
        if (!mVar.p(this, true)) {
            mVar.l(this, false, 0);
            destroy();
        } else {
            mVar.a(this.g);
        }
    }

    @Override // defpackage.InterfaceC2259Rk
    public final void dismiss() {
        this.h = null;
        ((m) this.a).l(this, true, 9);
    }

    @Override // defpackage.PB
    public final View c() {
        return this.i;
    }

    @Override // defpackage.PB
    public final void destroy() {
        InterfaceC2129Qk interfaceC2129Qk = this.h;
        if (interfaceC2129Qk != null) {
            EI2.h(10, 11, "Assistant.VoiceSearch.ConsentOutcome");
            ((C1609Mk) interfaceC2129Qk).g(false);
            this.h = null;
        }
        ((m) this.a).o(this.g);
    }
}
