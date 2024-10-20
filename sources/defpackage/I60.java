package defpackage;

import J.N;
import android.content.Context;
import android.view.ContextMenu;
import android.view.View;
import com.android.chrome.R;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;
import org.chromium.url.GURL;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class I60 implements InterfaceC4695dp4 {
    public final InterfaceC8544p12 a;
    public final InterfaceC4226cT3 b;
    public final Runnable c;
    public final String d;
    public View e;

    public I60(C8887q12 c8887q12, InterfaceC4226cT3 interfaceC4226cT3, Runnable runnable, String str) {
        this.a = c8887q12;
        this.b = interfaceC4226cT3;
        this.c = runnable;
        this.d = str;
    }

    public final void a(ContextMenu contextMenu, View view, G60 g60) {
        H60 h60 = new H60(this, g60);
        boolean z = false;
        for (int i = 0; i < 8; i++) {
            if (c(i, g60) && i != 2) {
                z = true;
                if (i == 1 && c(2, g60)) {
                    if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:show_open_in_tab_group_menu_item_first"), false)) {
                        contextMenu.add(0, 2, 0, b(view.getContext(), 2)).setOnMenuItemClickListener(h60);
                        contextMenu.add(0, i, 0, b(view.getContext(), i)).setOnMenuItemClickListener(h60);
                    } else {
                        contextMenu.add(0, i, 0, b(view.getContext(), i)).setOnMenuItemClickListener(h60);
                        contextMenu.add(0, 2, 0, b(view.getContext(), 2)).setOnMenuItemClickListener(h60);
                    }
                } else {
                    contextMenu.add(0, i, 0, b(view.getContext(), i)).setOnMenuItemClickListener(h60);
                }
            }
        }
        if (z) {
            this.b.a(false);
            this.e = view;
            view.addOnAttachStateChangeListener(new F60(this));
            g60.d();
            FI2.a(this.d + ".ContextMenu.Shown");
        }
    }

    public final boolean c(int i, G60 g60) {
        if (!g60.e(i)) {
            return false;
        }
        if (i == 1) {
            return true;
        }
        InterfaceC8544p12 interfaceC8544p12 = this.a;
        if (i == 2) {
            C10218tu1 c10218tu1 = AbstractC6265iP.d;
            StringBuilder sb = new StringBuilder();
            sb.append("TabGridLayoutAndroid");
            sb.append(":");
            sb.append("enable_tab_group_auto_creation");
            return !CachedFeatureFlags.b(c10218tu1.b(sb.toString()), true) && interfaceC8544p12.b();
        }
        if (i == 3) {
            return interfaceC8544p12.e();
        }
        if (i == 4) {
            return interfaceC8544p12.c();
        }
        if (i != 5) {
            return i == 7;
        }
        GURL url = g60.getUrl();
        return url != null && N.MXyz2Okt(url);
    }

    public final int b(Context context, int i) {
        if (i == 1) {
            if (AbstractC5177fD3.e(context)) {
                if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:enable_tab_group_auto_creation"), true) && this.a.b()) {
                    return R.string.f71410_resource_name_obfuscated_res_0x7f1403ad;
                }
            }
            return R.string.f71400_resource_name_obfuscated_res_0x7f1403ac;
        }
        if (i == 2) {
            return R.string.f71410_resource_name_obfuscated_res_0x7f1403ad;
        }
        if (i == 3) {
            return R.string.f71380_resource_name_obfuscated_res_0x7f1403aa;
        }
        if (i == 4) {
            return R.string.f71430_resource_name_obfuscated_res_0x7f1403af;
        }
        if (i == 5) {
            return R.string.f71480_resource_name_obfuscated_res_0x7f1403b4;
        }
        if (i != 7) {
            return 0;
        }
        return R.string.f84470_resource_name_obfuscated_res_0x7f140953;
    }
}
