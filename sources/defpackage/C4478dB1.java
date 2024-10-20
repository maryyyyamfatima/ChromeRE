package defpackage;

import J.N;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.android.chrome.R;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.firstrun.LightweightFirstRunActivity;
import org.chromium.chrome.browser.metrics.UmaSessionStats;
import org.chromium.ui.base.LocalizationUtils;
import org.chromium.ui.widget.LoadingView;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dB1 */
/* loaded from: classes.dex */
public final class C4478dB1 extends AbstractC6952kP0 {
    public final /* synthetic */ LightweightFirstRunActivity f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4478dB1(LightweightFirstRunActivity lightweightFirstRunActivity, Activity activity, C8297oJ c8297oJ) {
        super(activity, c8297oJ);
        this.f = lightweightFirstRunActivity;
    }

    @Override // defpackage.AbstractC6952kP0
    public final void e(Bundle bundle) {
        SpannableString a;
        boolean z = bundle.getBoolean("IsChildAccount", false);
        int i = LightweightFirstRunActivity.n0;
        final LightweightFirstRunActivity lightweightFirstRunActivity = this.f;
        lightweightFirstRunActivity.getClass();
        lightweightFirstRunActivity.setContentView(LayoutInflater.from(lightweightFirstRunActivity).inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0168, (ViewGroup) null));
        C11997z52 c11997z52 = new C11997z52(lightweightFirstRunActivity, new Callback() { // from class: YA1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i2 = LightweightFirstRunActivity.n0;
                LightweightFirstRunActivity lightweightFirstRunActivity2 = LightweightFirstRunActivity.this;
                CustomTabActivity.W1(lightweightFirstRunActivity2, LocalizationUtils.a(lightweightFirstRunActivity2.getString(R.string.0_resource_name_obfuscated_res_0x7f1404df)));
            }
        });
        C11997z52 c11997z522 = new C11997z52(lightweightFirstRunActivity, new Callback() { // from class: ZA1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i2 = LightweightFirstRunActivity.n0;
                LightweightFirstRunActivity lightweightFirstRunActivity2 = LightweightFirstRunActivity.this;
                CustomTabActivity.W1(lightweightFirstRunActivity2, LocalizationUtils.a(lightweightFirstRunActivity2.getString(R.string.0_resource_name_obfuscated_res_0x7f140330)));
            }
        });
        C11997z52 c11997z523 = new C11997z52(lightweightFirstRunActivity, new Callback() { // from class: aB1
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                int i2 = LightweightFirstRunActivity.n0;
                LightweightFirstRunActivity lightweightFirstRunActivity2 = LightweightFirstRunActivity.this;
                CustomTabActivity.W1(lightweightFirstRunActivity2, LocalizationUtils.a(lightweightFirstRunActivity2.getString(R.string.0_resource_name_obfuscated_res_0x7f1404dc)));
            }
        });
        String w = AbstractC2281Ro1.w(lightweightFirstRunActivity.getIntent(), "org.chromium.chrome.browser.firstrun.AssociatedAppName");
        if (w == null) {
            w = "";
        }
        if (z) {
            a = AbstractC9108qg3.a(lightweightFirstRunActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f1405b6, w), new C8765pg3(c11997z52, "<LINK1>", "</LINK1>"), new C8765pg3(c11997z522, "<LINK2>", "</LINK2>"), new C8765pg3(c11997z523, "<LINK3>", "</LINK3>"));
        } else {
            a = AbstractC9108qg3.a(lightweightFirstRunActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f1405b5, w), new C8765pg3(c11997z52, "<LINK1>", "</LINK1>"), new C8765pg3(c11997z522, "<LINK2>", "</LINK2>"));
        }
        TextView textView = (TextView) lightweightFirstRunActivity.findViewById(R.id.lightweight_fre_tos_and_privacy);
        lightweightFirstRunActivity.b0 = textView;
        textView.setText(a);
        lightweightFirstRunActivity.b0.setMovementMethod(LinkMovementMethod.getInstance());
        lightweightFirstRunActivity.f0 = lightweightFirstRunActivity.findViewById(R.id.lightweight_fre_buttons);
        Button button = (Button) lightweightFirstRunActivity.findViewById(R.id.button_primary);
        lightweightFirstRunActivity.c0 = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: bB1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = LightweightFirstRunActivity.n0;
                LightweightFirstRunActivity lightweightFirstRunActivity2 = LightweightFirstRunActivity.this;
                if (lightweightFirstRunActivity2.i0) {
                    C9626sA2 g = C9626sA2.g();
                    g.b.p("Chrome.Privacy.UsageAndCrashReportingPermittedByUser", false);
                    N.MmqfIJ4g(AbstractC1171Ja0.a(g));
                    N.Mh1r7OJ$(false);
                    UmaSessionStats.a();
                    Q83 q83 = O83.a;
                    q83.p("first_run_tos_accepted", true);
                    N.MSb7o$8Q();
                    q83.p("lightweight_first_run_flow", true);
                    lightweightFirstRunActivity2.finish();
                    lightweightFirstRunActivity2.S0();
                    return;
                }
                lightweightFirstRunActivity2.j0 = true;
                lightweightFirstRunActivity2.c0.setEnabled(false);
            }
        });
        ((Button) lightweightFirstRunActivity.findViewById(R.id.button_secondary)).setOnClickListener(new View.OnClickListener() { // from class: cB1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = LightweightFirstRunActivity.n0;
                LightweightFirstRunActivity lightweightFirstRunActivity2 = LightweightFirstRunActivity.this;
                lightweightFirstRunActivity2.finish();
                AbstractActivityC4890eP0.Q0(lightweightFirstRunActivity2.getIntent(), false);
            }
        });
        lightweightFirstRunActivity.d0 = (LoadingView) lightweightFirstRunActivity.findViewById(R.id.loading_view);
        lightweightFirstRunActivity.e0 = lightweightFirstRunActivity.findViewById(R.id.loading_view_container);
        lightweightFirstRunActivity.g0 = lightweightFirstRunActivity.findViewById(R.id.privacy_disclaimer);
        lightweightFirstRunActivity.h0 = true;
        lightweightFirstRunActivity.k0 = SystemClock.elapsedRealtime();
        C0154Be3 c0154Be3 = lightweightFirstRunActivity.a0;
        if (c0154Be3 != null) {
            if (c0154Be3.get() == null) {
                lightweightFirstRunActivity.d0.a(lightweightFirstRunActivity);
                lightweightFirstRunActivity.d0.e();
                lightweightFirstRunActivity.T0(false);
            } else if (c0154Be3.get().booleanValue()) {
                lightweightFirstRunActivity.T0(false);
                lightweightFirstRunActivity.U0();
            }
        }
    }
}
