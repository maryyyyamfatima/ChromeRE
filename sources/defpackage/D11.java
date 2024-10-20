package defpackage;

import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class D11 extends H11 {
    public final ArrayList g;
    public final /* synthetic */ I11 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D11(I11 i11, ArrayList arrayList) {
        super(i11);
        this.h = i11;
        this.g = arrayList;
    }

    @Override // defpackage.H11
    public final void a() {
        Set set;
        I11 i11 = this.h;
        N11 n11 = i11.a.s;
        R11 r11 = i11.a;
        JU ju = i11.r;
        if (ju == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(ju.b);
            Map map = ju.d;
            for (C3588ad c3588ad : map.keySet()) {
                if (!r11.l.containsKey(c3588ad.b)) {
                    X5.a(map.get(c3588ad));
                    throw null;
                }
            }
            set = hashSet;
        }
        n11.p = set;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((BaseGmsClient) ((InterfaceC3129Yc) it.next())).j(i11.o, r11.s.p);
        }
    }
}
