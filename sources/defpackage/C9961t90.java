package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: t90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9961t90 {
    public final C4979ef4 a;
    public final XD0 b = new XD0();
    public final HashMap c = new HashMap();
    public F74 d;
    public C2394Sl e;
    public C3304Zl f;

    public C9961t90(C4979ef4 c4979ef4) {
        this.a = c4979ef4;
    }

    public final void a(Cdo cdo, AbstractC3219Yu abstractC3219Yu) {
        List list = (List) this.c.get(cdo);
        if (list == null) {
            list = new ArrayList();
            this.c.put(cdo, list);
        }
        list.add(abstractC3219Yu);
        XD0 xd0 = this.b;
        synchronized (xd0) {
            xd0.a.e(cdo, abstractC3219Yu);
        }
    }
}
