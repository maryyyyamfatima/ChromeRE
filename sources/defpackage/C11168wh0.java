package defpackage;

import android.os.Handler;
import java.util.Collection;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: wh0 */
/* loaded from: classes.dex */
public final class C11168wh0 implements InterfaceC4953eb2 {
    public Boolean a;
    public final C9177qs0 g;
    public final AbstractC4610db2 h;

    public final void a() {
        Boolean valueOf = Boolean.valueOf(this.h.g.isEmpty());
        if (valueOf.equals(this.a)) {
            return;
        }
        this.a = valueOf;
        boolean booleanValue = valueOf.booleanValue();
        C5237fP3 c5237fP3 = this.g.a.d;
        if (c5237fP3 == null) {
            return;
        }
        c5237fP3.i.N(!booleanValue);
    }

    public C11168wh0(C6134i03 c6134i03, C9177qs0 c9177qs0) {
        this.h = c6134i03;
        this.g = c9177qs0;
        new Handler().post(new Runnable() { // from class: vh0
            @Override // java.lang.Runnable
            public final void run() {
                C11168wh0.this.a();
            }
        });
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void c() {
        a();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void b(Collection collection) {
        a();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void d(Collection collection) {
        a();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void e(OfflineItem offlineItem, OfflineItem offlineItem2) {
        a();
    }
}
