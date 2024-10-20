package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wx2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11265wx2 implements J44 {
    public final ArrayList a = new ArrayList();

    @Override // defpackage.J44
    public final /* synthetic */ void destroy() {
    }

    public final void a() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC10236tx2) it.next()).b();
        }
    }
}
