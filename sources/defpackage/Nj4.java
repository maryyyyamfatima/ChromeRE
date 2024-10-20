package defpackage;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.profiles.Profile;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class Nj4 extends AbstractC0185Bl {
    public final /* synthetic */ String h;
    public final /* synthetic */ Pj4 i;

    public Nj4(Pj4 pj4, String str) {
        this.i = pj4;
        this.h = str;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Pj4 pj4 = this.i;
        HashSet hashSet = pj4.a;
        String str = this.h;
        hashSet.remove(str);
        HashMap hashMap = pj4.b;
        if (hashMap.containsKey(str)) {
            Profile profile = (Profile) hashMap.get(str);
            hashMap.remove(str);
            pj4.c(str, profile);
        }
    }

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        try {
            TraceEvent i = TraceEvent.i("WarmupManager.prefetchDnsForUrlInBackground", null);
            try {
                InetAddress.getByName(new URL(this.h).getHost());
                if (i != null) {
                    i.close();
                }
            } catch (Throwable th) {
                if (i != null) {
                    try {
                        i.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (MalformedURLException | UnknownHostException unused2) {
        }
        return null;
    }
}
