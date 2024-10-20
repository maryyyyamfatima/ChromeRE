package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.autofill.settings.AutofillPaymentMethodsFragment;
import org.chromium.chrome.browser.browsing_data.ClearBrowsingDataTabsFragment;
import org.chromium.chrome.browser.document.ChromeLauncherActivity;
import org.chromium.chrome.browser.history.HistoryActivity;
import org.chromium.chrome.browser.history_clusters.f;
import org.chromium.chrome.browser.omnibox.a;
import org.chromium.chrome.browser.password_manager.PasswordManagerLauncher;
import org.chromium.chrome.browser.safety_check.SafetyCheckSettingsFragment;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.browser_ui.accessibility.AccessibilitySettings;
import org.chromium.components.browser_ui.site_settings.SiteSettings;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.components.omnibox.action.HistoryClustersAction;
import org.chromium.components.omnibox.action.OmniboxPedal;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.ui.base.DeviceFormFactor;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Sq2 */
/* loaded from: classes.dex */
public final class C2422Sq2 extends C6456ix {
    public final InterfaceC4272cc2 h;
    public final InterfaceC9158qp i;
    public final C5348fk j;

    @Override // defpackage.C6456ix, defpackage.InterfaceC7471lu0
    public final int f() {
        return 8;
    }

    public C2422Sq2(Context context, C1245Jp c1245Jp, InterfaceC6495j34 interfaceC6495j34, TH0 th0, InterfaceC6114hx interfaceC6114hx, InterfaceC4272cc2 interfaceC4272cc2, InterfaceC9158qp interfaceC9158qp) {
        super(context, c1245Jp, interfaceC6495j34, th0, interfaceC6114hx);
        this.j = new C5348fk(0);
        this.h = interfaceC4272cc2;
        this.i = interfaceC9158qp;
    }

    @Override // defpackage.C6456ix, defpackage.InterfaceC7471lu0
    public final PropertyModel g() {
        return new PropertyModel(AbstractC2942Wq2.d);
    }

    @Override // defpackage.C6456ix, defpackage.AbstractC12286zw, defpackage.InterfaceC7444lp3
    public final void b(int i, AutocompleteMatch autocompleteMatch, PropertyModel propertyModel) {
        Object c2812Vq2;
        super.b(i, autocompleteMatch, propertyModel);
        PD2 pd2 = AbstractC2942Wq2.a;
        final OmniboxPedal omniboxPedal = autocompleteMatch.x;
        propertyModel.o(pd2, omniboxPedal);
        PD2 pd22 = AbstractC2942Wq2.b;
        ((C4959ec2) this.h).getClass();
        int i2 = omniboxPedal.a;
        if (i2 >= 0 && i2 < 41) {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 7 && i2 != 12) {
                if (i2 == 27) {
                    c2812Vq2 = new C2812Vq2(R.drawable.0_resource_name_obfuscated_res_0x7f0901e9, true);
                } else if (i2 != 31 && i2 != 33 && i2 != 35) {
                    c2812Vq2 = new C2812Vq2(R.drawable.0_resource_name_obfuscated_res_0x7f090181, false);
                }
            }
            c2812Vq2 = new C2812Vq2(R.drawable.0_resource_name_obfuscated_res_0x7f090181, false);
        } else if (i2 == 10001) {
            c2812Vq2 = new C2812Vq2(R.drawable.0_resource_name_obfuscated_res_0x7f090243, true);
        } else {
            c2812Vq2 = new C2812Vq2(R.drawable.0_resource_name_obfuscated_res_0x7f090181, false);
        }
        propertyModel.o(pd22, c2812Vq2);
        propertyModel.o(AbstractC2942Wq2.c, new View.OnClickListener() { // from class: Rq2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f fVar;
                C2422Sq2 c2422Sq2 = C2422Sq2.this;
                ((a) c2422Sq2.i).o.Z(null, 12, false);
                C4959ec2 c4959ec2 = (C4959ec2) c2422Sq2.h;
                c4959ec2.getClass();
                OmniboxPedal omniboxPedal2 = omniboxPedal;
                int i3 = omniboxPedal2.a;
                if (i3 >= 10000 && i3 < 10002) {
                    if (i3 == 10001 && (fVar = c4959ec2.b) != null) {
                        H81 h81 = fVar.a;
                        Context context = h81.g;
                        boolean a = DeviceFormFactor.a(context);
                        String str = ((HistoryClustersAction) omniboxPedal2).c;
                        InterfaceC9270r81 interfaceC9270r81 = h81.o;
                        if (a) {
                            Tab a2 = interfaceC9270r81.a();
                            if (a2 == null) {
                                return;
                            }
                            a2.d(new LoadUrlParams(new Uri.Builder().scheme("chrome").authority("history").path("journeys").appendQueryParameter("q", str).build().toString(), 0));
                            return;
                        }
                        Intent i4 = interfaceC9270r81.i();
                        i4.putExtra("org.chromium.chrome.browser.history_clusters.show", true);
                        i4.putExtra("org.chromium.chrome.browser.history_clusters.query", str);
                        context.startActivity(i4);
                        return;
                    }
                    return;
                }
                I53 i53 = new I53();
                Activity activity = c4959ec2.a;
                if (i3 == 1) {
                    i53.b(activity, ClearBrowsingDataTabsFragment.class, null);
                } else if (i3 == 2) {
                    PasswordManagerLauncher.a(activity, 0, c4959ec2.c);
                } else if (i3 == 3) {
                    i53.b(activity, AutofillPaymentMethodsFragment.class, null);
                } else if (i3 != 4) {
                    if (i3 == 7) {
                        int i5 = SafetyCheckSettingsFragment.m0;
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("SafetyCheckSettingsFragment.safetyCheckImmediateRun", true);
                        i53.b(activity, SafetyCheckSettingsFragment.class, bundle);
                    } else if (i3 == 12) {
                        i53.b(activity, SiteSettings.class, null);
                    } else if (i3 != 27) {
                        if (i3 == 31) {
                            i53.b(activity, null, null);
                        } else if (i3 != 33) {
                            if (i3 == 35) {
                                i53.b(activity, AccessibilitySettings.class, null);
                            }
                        } else if (activity instanceof ChromeActivity) {
                            ((ChromeActivity) activity).Y(R.id.open_history_menu_id, false);
                        } else {
                            Intent intent = new Intent();
                            intent.setClass(activity.getApplicationContext(), HistoryActivity.class);
                            intent.putExtra("org.chromium.chrome.browser.incognito_mode", false);
                            AbstractC2281Ro1.a(intent);
                            activity.startActivity(intent);
                        }
                    } else if (activity instanceof ChromeActivity) {
                        ((ChromeActivity) activity).g1().d(new LoadUrlParams("chrome://dino", 5));
                    } else {
                        Context applicationContext = activity.getApplicationContext();
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("chrome://dino/"));
                        intent2.setComponent(new ComponentName(applicationContext, (Class<?>) ChromeLauncherActivity.class));
                        intent2.putExtra("REUSE_URL_MATCHING_TAB_ELSE_NEW_TAB", true);
                        intent2.setFlags(268959744);
                        AbstractC2281Ro1.a(intent2);
                        activity.startActivity(intent2);
                    }
                } else if (activity instanceof ChromeActivity) {
                    ((ChromeActivity) activity).Y(R.id.new_incognito_tab_menu_id, false);
                } else {
                    Intent b = C1761No1.b(activity.getApplicationContext(), true);
                    AbstractC2281Ro1.a(b);
                    activity.startActivity(b);
                }
                EI2.h(i3, 41, "Omnibox.SuggestionUsed.Pedal");
            }
        });
        propertyModel.m(AbstractC0240Bw.d, 1);
        int i3 = omniboxPedal.a;
        if (i3 >= 0 && i3 < 41) {
            this.j.add(Integer.valueOf(i2));
        }
    }

    @Override // defpackage.AbstractC12286zw, defpackage.InterfaceC7471lu0
    public final void d(boolean z) {
        if (z) {
            return;
        }
        C5348fk c5348fk = this.j;
        c5348fk.getClass();
        C5004ek c5004ek = new C5004ek(c5348fk);
        while (c5004ek.hasNext()) {
            EI2.h(((Integer) c5004ek.next()).intValue(), 41, "Omnibox.PedalShown");
        }
        c5348fk.clear();
    }

    @Override // defpackage.C6456ix, defpackage.InterfaceC7444lp3
    public final boolean c(AutocompleteMatch autocompleteMatch, int i) {
        return autocompleteMatch.x != null && i < 3;
    }
}
