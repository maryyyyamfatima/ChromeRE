package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: gp1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5724gp1 implements InterfaceC12080zL0 {
    public final HashMap a;

    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    public C5724gp1(Map map) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("Interest Feed", "Enabled");
        if (map != null) {
            hashMap.putAll(map);
        }
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        return this.a;
    }
}
