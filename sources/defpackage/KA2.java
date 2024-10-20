package defpackage;

import J.N;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.privacy_sandbox.LearnMoreFragment;
import org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxSettingsFragmentV3;
import org.chromium.components.browser_ui.bottomsheet.m;
import org.chromium.components.browser_ui.settings.SettingsLauncher;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KA2 implements PB {
    public final QB a;
    public final JA2 g;
    public final Context h;
    public final SettingsLauncher i;
    public boolean j = false;
    public final View k;

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
        return R.string.f83470_resource_name_obfuscated_res_0x7f1408ec;
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
        return R.string.f83440_resource_name_obfuscated_res_0x7f1408e9;
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
        return R.string.f83480_resource_name_obfuscated_res_0x7f1408ed;
    }

    @Override // defpackage.PB
    public final /* synthetic */ boolean r() {
        return true;
    }

    @Override // defpackage.PB
    public final int s() {
        return R.string.f83460_resource_name_obfuscated_res_0x7f1408eb;
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
        return true;
    }

    public KA2(final Context context, QB qb, SettingsLauncher settingsLauncher) {
        this.a = qb;
        this.h = context;
        this.i = settingsLauncher;
        View inflate = LayoutInflater.from(context).inflate(R.layout.f60110_resource_name_obfuscated_res_0x7f0e022a, (ViewGroup) null);
        this.k = inflate;
        this.g = new JA2(this);
        TextView textView = (TextView) inflate.findViewById(R.id.privacy_sandbox_notice_sheet_description);
        textView.setText(AbstractC9108qg3.a(context.getString(R.string.f83450_resource_name_obfuscated_res_0x7f1408ea), new C8765pg3(new C11997z52(context, new Callback() { // from class: GA2
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                KA2.this.i.c(context, LearnMoreFragment.class);
            }
        }), "<link>", "</link>")));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        inflate.findViewById(R.id.ack_button).setOnClickListener(new View.OnClickListener() { // from class: HA2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KA2 ka2 = KA2.this;
                ((m) ka2.a).l(ka2, true, 9);
            }
        });
        inflate.findViewById(R.id.settings_button).setOnClickListener(new View.OnClickListener() { // from class: IA2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KA2 ka2 = KA2.this;
                ka2.j = true;
                N.Mq9orIwX(1);
                ((m) ka2.a).l(ka2, true, 9);
                PrivacySandboxSettingsFragmentV3.S0(ka2.h, ka2.i, 2);
            }
        });
    }

    @Override // defpackage.PB
    public final View c() {
        return this.k;
    }

    @Override // defpackage.PB
    public final void destroy() {
        ((m) this.a).o(this.g);
    }
}
