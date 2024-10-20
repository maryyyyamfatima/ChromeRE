package defpackage;

import android.util.Pair;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.flags.ModuleDescriptor;
import com.google.android.libraries.elements.interfaces.JSControllerConfig;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.ThreadUtils;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: f40, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5123f40 implements InterfaceC3039Xk {
    public final Profile a;
    public Runnable b;
    public C7185l40 c;

    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    public C5123f40(Profile profile) {
        this.a = profile;
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        String str;
        C7185l40 c7185l40 = this.c;
        if (c7185l40 == null) {
            return null;
        }
        C6155i40 b = c7185l40.b();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : b.a.entrySet()) {
            hashMap.put(C7185l40.a(((Integer) entry.getKey()).intValue()), C7185l40.c(((Integer) entry.getValue()).intValue()));
        }
        hashMap.put("Connection check elapsed (ms)", String.valueOf(b.b));
        int i = b.c;
        switch (i) {
            case 0:
                str = "Unknown";
                break;
            case 1:
                str = "Ethernet";
                break;
            case 2:
                str = "WiFi";
                break;
            case ModuleDescriptor.MODULE_VERSION /* 3 */:
                str = "2G";
                break;
            case 4:
                str = "3G";
                break;
            case JSControllerConfig.DEFAULT_VM_CONTEXT_LRU_SIZE /* 5 */:
                str = "4G";
                break;
            case 6:
                str = "NONE";
                break;
            case 7:
                str = "Bluetooth";
                break;
            case 8:
                str = "5G";
                break;
            default:
                str = AbstractC9076qb1.a("Unknown connection type ", i);
                break;
        }
        hashMap.put("Connection type", str);
        return hashMap;
    }

    @Override // defpackage.InterfaceC3039Xk
    public final void b(AbstractRunnableC9679sL0 abstractRunnableC9679sL0) {
        this.b = abstractRunnableC9679sL0;
        Object obj = ThreadUtils.a;
        this.c = new C7185l40(this.a, this);
    }

    @Override // defpackage.InterfaceC3039Xk
    public final boolean a() {
        C7185l40 c7185l40 = this.c;
        c7185l40.getClass();
        Object obj = ThreadUtils.a;
        return c7185l40.a.size() == 4;
    }
}
