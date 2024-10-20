package defpackage;

import J.N;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.HashMap;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.browser_ui.site_settings.WebsitePreferenceBridge;
import org.chromium.content_public.browser.BrowserContextHandle;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public final class Oo4 {
    public final BrowserContextHandle a;
    public final boolean d;
    public final HashMap c = new HashMap();
    public final WebsitePreferenceBridge b = new WebsitePreferenceBridge();

    public Oo4(Profile profile, boolean z) {
        this.a = profile;
        this.d = z;
    }

    public final void b(No4 no4) {
        Ko4 ko4 = new Ko4();
        ko4.add(new Fo4(this));
        ko4.add(new Mo4(this));
        for (int i = 0; i < 77; i++) {
            a(ko4, i);
        }
        ko4.add(new Io4(this, no4));
        ko4.a();
    }

    public final void c(C7034ke3 c7034ke3, No4 no4) {
        if (c7034ke3.o(0)) {
            b(no4);
            return;
        }
        Ko4 ko4 = new Ko4();
        if (!c7034ke3.o(22)) {
            a(ko4, c7034ke3.f());
        } else {
            ko4.add(new Fo4(this));
            ko4.add(new Mo4(this));
        }
        ko4.add(new Io4(this, no4));
        ko4.a();
    }

    public final void a(Ko4 ko4, int i) {
        int i2;
        switch (i) {
            case 0:
            case 2:
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
            case 12:
            case 21:
            case 25:
            case 30:
            case 43:
            case 69:
            case 73:
            case 74:
            case 75:
                i2 = 1;
                break;
            case 4:
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
            case 8:
            case 9:
            case 13:
            case 15:
            case 32:
            case 38:
            case 51:
            case 53:
            case 56:
            case 57:
                i2 = 2;
                break;
            case 20:
            case 35:
                i2 = 3;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 == 0) {
            return;
        }
        if (i != 43 || AX.e().g("enable-experimental-web-platform-features")) {
            if (i != 51 || N.Mudil8Bg("WebNFC")) {
                if (i != 20 || N.Mudil8Bg("WebBluetoothNewPermissionsBackend")) {
                    int b = AbstractC2373Sg3.b(i2);
                    if (b == 0) {
                        ko4.add(new Do4(this, i));
                    } else if (b == 1) {
                        ko4.add(new Ho4(this, i));
                    } else {
                        if (b != 2) {
                            return;
                        }
                        ko4.add(new Co4(this, i));
                    }
                }
            }
        }
    }

    public final C6408io4 d(String str, String str2) {
        if (str2 != null && (str2.equals(str) || str2.equals("*"))) {
            str2 = null;
        }
        C6751jo4 b = C6751jo4.b(str);
        C6751jo4 b2 = C6751jo4.b(str2);
        Go4 go4 = new Go4(b, b2);
        HashMap hashMap = this.c;
        C6408io4 c6408io4 = (C6408io4) hashMap.get(go4);
        if (c6408io4 != null) {
            return c6408io4;
        }
        C6408io4 c6408io42 = new C6408io4(b, b2);
        hashMap.put(go4, c6408io42);
        return c6408io42;
    }
}
