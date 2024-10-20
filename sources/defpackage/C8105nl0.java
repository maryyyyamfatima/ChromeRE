package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: nl0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8105nl0 extends AbstractC9896sy0 {
    public final Set a;

    public C8105nl0(Set set) {
        this.a = set;
    }

    @Override // defpackage.AbstractC9896sy0
    public final void d(EnumC11438xU enumC11438xU, String str, U80 u80, Throwable th) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((AbstractC9896sy0) it.next()).d(enumC11438xU, str, u80, th);
        }
    }
}
