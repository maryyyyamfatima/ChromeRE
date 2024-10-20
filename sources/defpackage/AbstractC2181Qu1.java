package defpackage;

import android.view.View;
import android.widget.PopupWindow;
import com.android.chrome.R;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Qu1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2181Qu1 {
    public static C3823bH3 a(final String str, ViewTreeObserverOnGlobalLayoutListenerC8754pe4 viewTreeObserverOnGlobalLayoutListenerC8754pe4, View view, String str2) {
        C3823bH3 c3823bH3;
        final KU3 b = b();
        if (b == null || !b.shouldTriggerHelpUI(str)) {
            return null;
        }
        if (str2 != null && !str2.isEmpty()) {
            c3823bH3 = new C3823bH3(view.getContext(), view, str2, str2, true, (LI2) viewTreeObserverOnGlobalLayoutListenerC8754pe4, C10021tL.f().c());
        } else {
            str.getClass();
            int i = 0;
            char c = 65535;
            switch (str.hashCode()) {
                case -1315293096:
                    if (str.equals("IPH_KeyboardAccessoryAddressFilling")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1195119663:
                    if (str.equals("IPH_KeyboardAccessoryBarSwiping")) {
                        c = 1;
                        break;
                    }
                    break;
                case -273392465:
                    if (str.equals("IPH_AutofillVirtualCardSuggestion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 532938391:
                    if (str.equals("IPH_KeyboardAccessoryPasswordFilling")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1572211206:
                    if (str.equals("IPH_KeyboardAccessoryPaymentFilling")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case ModuleDescriptor.MODULE_VERSION /* 3 */:
                case 4:
                    i = R.string.f75340_resource_name_obfuscated_res_0x7f140552;
                    break;
                case 1:
                    i = R.string.f75360_resource_name_obfuscated_res_0x7f140554;
                    break;
                case 2:
                    i = R.string.f75350_resource_name_obfuscated_res_0x7f140553;
                    break;
            }
            int i2 = i;
            c3823bH3 = new C3823bH3(view.getContext(), view, i2, i2, viewTreeObserverOnGlobalLayoutListenerC8754pe4, C10021tL.f().c());
        }
        c3823bH3.g(true);
        c3823bH3.a(new PopupWindow.OnDismissListener() { // from class: Ou1
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                KU3.this.dismissed(str);
            }
        });
        return c3823bH3;
    }

    public static KU3 b() {
        KU3 a = LU3.a(Profile.d());
        if (a.isInitialized()) {
            return a;
        }
        return null;
    }
}
