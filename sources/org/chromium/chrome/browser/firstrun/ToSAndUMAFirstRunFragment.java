package org.chromium.chrome.browser.firstrun;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.fragment.app.c;
import com.android.chrome.R;
import defpackage.AX;
import defpackage.AbstractActivityC4890eP0;
import defpackage.AbstractC7296lP0;
import defpackage.AbstractC9108qg3;
import defpackage.C11997z52;
import defpackage.C8765pg3;
import defpackage.C9626sA2;
import defpackage.DU0;
import defpackage.EI2;
import defpackage.InterfaceC7640mP0;
import defpackage.M41;
import defpackage.O83;
import java.util.LinkedList;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.customtabs.CustomTabActivity;
import org.chromium.chrome.browser.firstrun.FirstRunActivity;
import org.chromium.chrome.browser.firstrun.ToSAndUMAFirstRunFragment;
import org.chromium.chrome.browser.signin.services.FREMobileIdentityConsistencyFieldTrial;
import org.chromium.ui.base.LocalizationUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class ToSAndUMAFirstRunFragment extends c implements InterfaceC7640mP0, DU0 {
    public static final /* synthetic */ int l0 = 0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public Button f0;
    public CheckBox g0;
    public TextView h0;
    public View i0;
    public View j0;
    public long k0;

    @Override // androidx.fragment.app.c
    public final View i0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.0_resource_name_obfuscated_res_0x7f0e0117, viewGroup, false);
    }

    @Override // androidx.fragment.app.c
    public void f0(Context context) {
        super.f0(context);
        ((AbstractActivityC4890eP0) AbstractC7296lP0.a(this)).W.j(new Callback() { // from class: QN3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj) {
                return new ZE(this, obj);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj) {
                ((Boolean) obj).booleanValue();
                ToSAndUMAFirstRunFragment toSAndUMAFirstRunFragment = ToSAndUMAFirstRunFragment.this;
                toSAndUMAFirstRunFragment.c0 = true;
                toSAndUMAFirstRunFragment.P0(false);
                if (toSAndUMAFirstRunFragment.b0) {
                    toSAndUMAFirstRunFragment.Q0();
                }
            }
        });
    }

    @Override // androidx.fragment.app.c
    public void v0(View view, Bundle bundle) {
        this.i0 = view.findViewById(R.id.title);
        View findViewById = view.findViewById(R.id.progress_spinner);
        this.j0 = findViewById;
        findViewById.setVisibility(8);
        this.f0 = (Button) view.findViewById(R.id.terms_accept);
        this.g0 = (CheckBox) view.findViewById(R.id.send_report_checkbox);
        this.h0 = (TextView) view.findViewById(R.id.tos_and_privacy);
        this.f0.setOnClickListener(new View.OnClickListener() { // from class: RN3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ToSAndUMAFirstRunFragment toSAndUMAFirstRunFragment = ToSAndUMAFirstRunFragment.this;
                toSAndUMAFirstRunFragment.d0 = true;
                toSAndUMAFirstRunFragment.k0 = SystemClock.elapsedRealtime();
                toSAndUMAFirstRunFragment.P0(true);
            }
        });
        this.g0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: SN3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                ToSAndUMAFirstRunFragment.this.e0 = z;
            }
        });
        this.h0.setMovementMethod(LinkMovementMethod.getInstance());
        Q0();
        if (M0() && O83.a.e("skip_welcome_page", false)) {
            N0(true);
        }
    }

    @Override // defpackage.InterfaceC7640mP0
    public final void e() {
        View view = this.i0;
        if (view == null) {
            return;
        }
        view.sendAccessibilityEvent(8);
    }

    @Override // androidx.fragment.app.c
    public final void I0(boolean z) {
        super.I0(z);
        if (this.i0 == null) {
            return;
        }
        if (!z) {
            N0(false);
        } else {
            this.g0.jumpDrawablesToCurrentState();
        }
    }

    @Override // defpackage.InterfaceC7640mP0
    public void a() {
        this.b0 = true;
        P0(false);
        if (this.c0) {
            Q0();
        }
    }

    @Override // defpackage.InterfaceC7640mP0
    public final void reset() {
        N0(false);
        this.g0.setChecked(this.e0);
    }

    @Override // defpackage.DU0
    public final void o(boolean z) {
        this.e0 = z;
    }

    public final void Q0() {
        String O;
        if (AbstractC7296lP0.a(this) == null) {
            return;
        }
        Object obj = FREMobileIdentityConsistencyFieldTrial.a;
        boolean z = false;
        boolean equals = AX.e().g("force-disable-signin-fre") ? false : "OldFreWithUmaDialog6".equals(FREMobileIdentityConsistencyFieldTrial.getFirstRunTrialGroup());
        boolean z2 = ((FirstRunActivity) AbstractC7296lP0.a(this)).e0.getBoolean("IsChildAccount", false);
        boolean z3 = (M0() || C9626sA2.g().b()) ? false : true;
        LinkedList linkedList = new LinkedList();
        linkedList.add(new C8765pg3(new C11997z52(K(), new Callback() { // from class: UN3
            @Override // org.chromium.base.Callback
            public final ZE e0(Object obj2) {
                return new ZE(this, obj2);
            }

            @Override // org.chromium.base.Callback
            public final void onResult(Object obj2) {
                int i = ToSAndUMAFirstRunFragment.l0;
                ToSAndUMAFirstRunFragment toSAndUMAFirstRunFragment = ToSAndUMAFirstRunFragment.this;
                if (toSAndUMAFirstRunFragment.W()) {
                    FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(toSAndUMAFirstRunFragment);
                    CustomTabActivity.W1(firstRunActivity, LocalizationUtils.a(firstRunActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f1404df)));
                }
            }
        }), "<TOS_LINK>", "</TOS_LINK>"));
        if (!equals) {
            linkedList.add(new C8765pg3(new C11997z52(K(), new Callback() { // from class: VN3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    int i = ToSAndUMAFirstRunFragment.l0;
                    ToSAndUMAFirstRunFragment toSAndUMAFirstRunFragment = ToSAndUMAFirstRunFragment.this;
                    if (toSAndUMAFirstRunFragment.W()) {
                        FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(toSAndUMAFirstRunFragment);
                        CustomTabActivity.W1(firstRunActivity, LocalizationUtils.a(firstRunActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f140330)));
                    }
                }
            }), "<ATOS_LINK>", "</ATOS_LINK>"));
        }
        if (z2) {
            linkedList.add(new C8765pg3(new C11997z52(K(), new Callback() { // from class: TN3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    int i = ToSAndUMAFirstRunFragment.l0;
                    ToSAndUMAFirstRunFragment toSAndUMAFirstRunFragment = ToSAndUMAFirstRunFragment.this;
                    if (toSAndUMAFirstRunFragment.W()) {
                        FirstRunActivity firstRunActivity = (FirstRunActivity) AbstractC7296lP0.a(toSAndUMAFirstRunFragment);
                        CustomTabActivity.W1(firstRunActivity, LocalizationUtils.a(firstRunActivity.getString(R.string.0_resource_name_obfuscated_res_0x7f1404dc)));
                    }
                }
            }), "<PRIVACY_LINK>", "</PRIVACY_LINK>"));
        }
        if (equals && !z3) {
            linkedList.add(new C8765pg3(new C11997z52(K(), new Callback() { // from class: WN3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    int i = ToSAndUMAFirstRunFragment.l0;
                    ToSAndUMAFirstRunFragment toSAndUMAFirstRunFragment = ToSAndUMAFirstRunFragment.this;
                    new EU0(toSAndUMAFirstRunFragment.B0(), ((InterfaceC3562aY1) toSAndUMAFirstRunFragment.getActivity()).N(), toSAndUMAFirstRunFragment, toSAndUMAFirstRunFragment.e0);
                }
            }), "<UMA_LINK>", "</UMA_LINK>"));
        }
        if (equals) {
            O = O(z2 ? R.string.0_resource_name_obfuscated_res_0x7f140a61 : R.string.0_resource_name_obfuscated_res_0x7f140a60);
            if (!z3) {
                StringBuilder a = M41.a(O, "\n");
                a.append(O(R.string.0_resource_name_obfuscated_res_0x7f140a5f));
                O = a.toString();
            }
        } else {
            O = O(z2 ? R.string.0_resource_name_obfuscated_res_0x7f1404c5 : R.string.0_resource_name_obfuscated_res_0x7f1404c4);
        }
        this.h0.setText(AbstractC9108qg3.a(O, (C8765pg3[]) linkedList.toArray(new C8765pg3[0])));
        if (M0() || C9626sA2.g().b()) {
            z = O83.a.e("first_run_tos_accepted", false) ? C9626sA2.g().c() : true;
        }
        this.e0 = z;
        this.g0.setChecked(z);
        if (L0()) {
            return;
        }
        if (!equals) {
            this.e0 = !z3;
        }
        this.g0.setVisibility(8);
    }

    public final void P0(boolean z) {
        if (!this.d0 || M0()) {
            if (z) {
                N0(true);
            }
        } else {
            if (!z) {
                EI2.n(SystemClock.elapsedRealtime() - this.k0, "MobileFre.TosFragment.SpinnerVisibleDuration");
            }
            ((FirstRunActivity) AbstractC7296lP0.a(this)).T0(this.e0);
            ((FirstRunActivity) AbstractC7296lP0.a(this)).U0();
        }
    }

    public final void N0(boolean z) {
        boolean z2 = !z;
        O0(z2);
        this.i0.setVisibility(z2 ? 0 : 4);
        this.j0.setVisibility(z ? 0 : 8);
    }

    public final boolean M0() {
        return (this.b0 && this.c0) ? false : true;
    }

    public final void O0(boolean z) {
        int i = z ? 0 : 8;
        this.f0.setVisibility(i);
        this.h0.setVisibility(i);
        if (L0()) {
            this.g0.setVisibility(i);
        }
    }

    public boolean L0() {
        Object obj = FREMobileIdentityConsistencyFieldTrial.a;
        if (AX.e().g("force-disable-signin-fre") ? false : "OldFreWithUmaDialog6".equals(FREMobileIdentityConsistencyFieldTrial.getFirstRunTrialGroup())) {
            return false;
        }
        return M0() || C9626sA2.g().b();
    }
}
