package org.chromium.chrome.browser.safe_browsing.settings;

import J.N;
import android.content.Context;
import android.content.res.Resources;
import androidx.preference.Preference;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import defpackage.AT0;
import defpackage.AbstractC2281Ro1;
import defpackage.AbstractC3841bL1;
import defpackage.AbstractC4249cY1;
import defpackage.AbstractC4871eL1;
import defpackage.BD2;
import defpackage.C10282u52;
import defpackage.C10625v52;
import defpackage.C4998ej;
import defpackage.EI2;
import defpackage.FI2;
import defpackage.InterfaceC4184cL1;
import defpackage.InterfaceC9213qy2;
import defpackage.NG2;
import defpackage.ZX1;
import org.chromium.base.Callback;
import org.chromium.chrome.browser.safe_browsing.settings.SafeBrowsingSettingsFragment;
import org.chromium.components.browser_ui.settings.SettingsLauncher;
import org.chromium.components.browser_ui.settings.TextMessagePreference;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public class SafeBrowsingSettingsFragment extends SafeBrowsingSettingsFragmentBase implements AT0, NG2, InterfaceC9213qy2 {
    public static final /* synthetic */ int n0 = 0;
    public SettingsLauncher k0;
    public RadioButtonGroupSafeBrowsingPreference l0;
    public int m0;

    @Override // org.chromium.chrome.browser.safe_browsing.settings.SafeBrowsingSettingsFragmentBase
    public final int R0() {
        return R.xml.0_resource_name_obfuscated_res_0x7f180034;
    }

    @Override // defpackage.AT0
    public final void f(SettingsLauncher settingsLauncher) {
        this.k0 = settingsLauncher;
    }

    public final void U0(int i) {
        if (i == 1) {
            V0(5);
        } else if (i == 2) {
            V0(4);
        }
        if (i == 2) {
            this.k0.c(getActivity(), EnhancedProtectionSettingsFragment.class);
        } else if (i == 1) {
            this.k0.c(getActivity(), StandardProtectionSettingsFragment.class);
        }
    }

    public final void V0(int i) {
        int i2 = this.m0;
        String str = "";
        String str2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "" : "TailoredSecurity" : "SecurityInterstitial" : "SurfaceExplorerPromoSlinger" : "SafetyCheck" : "ParentSettings" : "Default";
        EI2.h(i, 8, "SafeBrowsing.Settings.UserAction.".concat(str2));
        switch (i) {
            case 0:
                str = "ShowedFrom".concat(str2);
                break;
            case 1:
                str = "EnhancedProtectionClicked";
                break;
            case 2:
                str = "StandardProtectionClicked";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                str = "DisableSafeBrowsingClicked";
                break;
            case 4:
                str = "EnhancedProtectionExpandArrowClicked";
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                str = "StandardProtectionExpandArrowClicked";
                break;
            case 6:
                str = "DisableSafeBrowsingDialogConfirmed";
                break;
            case 7:
                str = "DisableSafeBrowsingDialogDenied";
                break;
        }
        FI2.a("SafeBrowsing.Settings." + str);
    }

    @Override // org.chromium.chrome.browser.safe_browsing.settings.SafeBrowsingSettingsFragmentBase
    public final void S0() {
        this.m0 = AbstractC2281Ro1.m("SafeBrowsingSettingsFragment.AccessPoint", 0, this.l);
        InterfaceC4184cL1 interfaceC4184cL1 = new InterfaceC4184cL1() { // from class: AT2
            @Override // defpackage.InterfaceC4184cL1
            public final /* synthetic */ boolean a(Preference preference) {
                return false;
            }

            @Override // defpackage.InterfaceC4184cL1
            public final /* synthetic */ boolean b(Preference preference) {
                return AbstractC3841bL1.a(this, preference);
            }

            @Override // defpackage.InterfaceC4184cL1
            public final /* synthetic */ boolean c() {
                return AbstractC9008qO.a();
            }

            @Override // defpackage.InterfaceC4184cL1
            public final boolean d(Preference preference) {
                int i = SafeBrowsingSettingsFragment.n0;
                String str = preference.q;
                if ("text_managed".equals(str) || "safe_browsing_radio_button_group".equals(str)) {
                    return N.MAU7_6Tq();
                }
                return false;
            }
        };
        RadioButtonGroupSafeBrowsingPreference radioButtonGroupSafeBrowsingPreference = (RadioButtonGroupSafeBrowsingPreference) M0("safe_browsing_radio_button_group");
        this.l0 = radioButtonGroupSafeBrowsingPreference;
        int MdyQjr8h = N.MdyQjr8h();
        int i = this.m0;
        radioButtonGroupSafeBrowsingPreference.W = MdyQjr8h;
        radioButtonGroupSafeBrowsingPreference.X = i;
        RadioButtonGroupSafeBrowsingPreference radioButtonGroupSafeBrowsingPreference2 = this.l0;
        radioButtonGroupSafeBrowsingPreference2.Y = this;
        radioButtonGroupSafeBrowsingPreference2.Z = interfaceC4184cL1;
        AbstractC4871eL1.b(interfaceC4184cL1, radioButtonGroupSafeBrowsingPreference2);
        this.l0.j = this;
        TextMessagePreference textMessagePreference = (TextMessagePreference) M0("text_managed");
        textMessagePreference.U = interfaceC4184cL1;
        AbstractC4871eL1.b(interfaceC4184cL1, textMessagePreference);
        textMessagePreference.S(AbstractC3841bL1.a(interfaceC4184cL1, this.l0));
        V0(0);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [zT2] */
    @Override // defpackage.InterfaceC9213qy2
    public final boolean l(Preference preference, Object obj) {
        String str = preference.q;
        int intValue = ((Integer) obj).intValue();
        int MdyQjr8h = N.MdyQjr8h();
        if (intValue == MdyQjr8h) {
            return true;
        }
        if (intValue == 0) {
            V0(3);
        } else if (intValue == 1) {
            V0(2);
        } else if (intValue == 2) {
            V0(1);
        }
        if (intValue == 0) {
            this.l0.W(MdyQjr8h);
            Context K = K();
            C10625v52 c10625v52 = new C10625v52(K, new Callback() { // from class: zT2
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    Boolean bool = (Boolean) obj2;
                    int i = SafeBrowsingSettingsFragment.n0;
                    SafeBrowsingSettingsFragment safeBrowsingSettingsFragment = SafeBrowsingSettingsFragment.this;
                    safeBrowsingSettingsFragment.getClass();
                    if (bool.booleanValue()) {
                        safeBrowsingSettingsFragment.V0(6);
                    } else {
                        safeBrowsingSettingsFragment.V0(7);
                    }
                    if (bool.booleanValue()) {
                        N.MzV0f_Xz(0);
                        safeBrowsingSettingsFragment.l0.W(0);
                    }
                }
            });
            Resources resources = K.getResources();
            BD2 bd2 = new BD2(AbstractC4249cY1.B);
            bd2.e(AbstractC4249cY1.a, new C10282u52(c10625v52));
            bd2.d(AbstractC4249cY1.c, resources, R.string.0_resource_name_obfuscated_res_0x7f14097c);
            bd2.e(AbstractC4249cY1.f, resources.getString(R.string.0_resource_name_obfuscated_res_0x7f14097b));
            bd2.d(AbstractC4249cY1.j, resources, R.string.0_resource_name_obfuscated_res_0x7f14097a);
            bd2.c(AbstractC4249cY1.v, 1);
            bd2.d(AbstractC4249cY1.n, resources, R.string.0_resource_name_obfuscated_res_0x7f1402f4);
            c10625v52.b = bd2.a();
            ZX1 zx1 = new ZX1(new C4998ej(K));
            c10625v52.a = zx1;
            zx1.l(c10625v52.b, 1, false);
        } else {
            N.MzV0f_Xz(intValue);
        }
        return true;
    }

    public static String T0(Context context) {
        String str;
        int MdyQjr8h = N.MdyQjr8h();
        if (MdyQjr8h == 2) {
            str = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140979);
        } else if (MdyQjr8h == 1) {
            str = context.getString(R.string.0_resource_name_obfuscated_res_0x7f140985);
        } else {
            if (MdyQjr8h == 0) {
                return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140855);
            }
            str = "";
        }
        return context.getString(R.string.0_resource_name_obfuscated_res_0x7f140856, str);
    }
}
