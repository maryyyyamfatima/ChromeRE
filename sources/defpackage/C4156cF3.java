package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: cF3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4156cF3 implements GA1 {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.GA1
    public final void b() {
        Iterator it = AbstractC10296u74.d(this.a).iterator();
        while (it.hasNext()) {
            ((TE3) it.next()).b();
        }
    }

    @Override // defpackage.GA1
    public final void a() {
        Iterator it = AbstractC10296u74.d(this.a).iterator();
        while (it.hasNext()) {
            ((TE3) it.next()).a();
        }
    }

    @Override // defpackage.GA1
    public final void onDestroy() {
        Iterator it = AbstractC10296u74.d(this.a).iterator();
        while (it.hasNext()) {
            ((TE3) it.next()).onDestroy();
        }
    }
}
