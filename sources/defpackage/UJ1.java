package defpackage;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;
import org.chromium.base.SysUtils;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class UJ1 implements InterfaceC12080zL0 {
    public final HashMap a;

    @Override // defpackage.InterfaceC12080zL0
    public final /* synthetic */ Pair c() {
        return null;
    }

    public UJ1() {
        HashMap hashMap = new HashMap(1);
        this.a = hashMap;
        hashMap.put("lowmem", Boolean.toString(SysUtils.isLowEndDevice()));
    }

    @Override // defpackage.InterfaceC12080zL0
    public final Map d() {
        return this.a;
    }
}
