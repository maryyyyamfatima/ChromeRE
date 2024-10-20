package defpackage;

import java.util.HashMap;
import org.chromium.content_public.browser.WebContents;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class KL1 {
    public final HashMap a = new HashMap();

    public final JL1 a(WebContents webContents) {
        if (webContents == null) {
            return new JL1(null);
        }
        HashMap hashMap = this.a;
        JL1 jl1 = (JL1) hashMap.get(webContents);
        if (jl1 != null) {
            return jl1;
        }
        JL1 jl12 = new JL1(webContents);
        hashMap.put(webContents, jl12);
        return jl12;
    }
}
