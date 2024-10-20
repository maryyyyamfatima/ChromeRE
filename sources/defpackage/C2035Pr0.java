package defpackage;

import android.text.TextUtils;
import java.util.List;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.components.offline_items_collection.UpdateDelta;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Pr0 */
/* loaded from: classes.dex */
public final class C2035Pr0 implements InterfaceC1303Ka2 {
    public final /* synthetic */ C2165Qr0 a;

    @Override // defpackage.InterfaceC1303Ka2
    public final void b(List list) {
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void e(C6161i50 c6161i50) {
    }

    @Override // defpackage.InterfaceC1303Ka2
    public final void d(OfflineItem offlineItem, UpdateDelta updateDelta) {
        C2165Qr0 c2165Qr0 = this.a;
        PropertyModel propertyModel = c2165Qr0.b;
        PD2 pd2 = InterfaceC2295Rr0.a;
        if (propertyModel.i(pd2) == null) {
            if (!TextUtils.equals(c2165Qr0.c, offlineItem.y.i())) {
                return;
            } else {
                c2165Qr0.b.k(InterfaceC2295Rr0.j, true);
            }
        } else if (!offlineItem.a.equals(((OfflineItem) c2165Qr0.b.i(pd2)).a)) {
            return;
        }
        c2165Qr0.b.o(pd2, offlineItem);
        if (offlineItem.B == 0 && c2165Qr0.b.h(InterfaceC2295Rr0.b) != 1) {
            c2165Qr0.a(1);
            return;
        }
        if (offlineItem.B == 2 && c2165Qr0.b.h(InterfaceC2295Rr0.b) != 2) {
            c2165Qr0.a(2);
            return;
        }
        if (offlineItem.B == 6) {
            PropertyModel propertyModel2 = c2165Qr0.b;
            ND2 nd2 = InterfaceC2295Rr0.b;
            if (propertyModel2.h(nd2) != 4 && c2165Qr0.b.h(nd2) != 3) {
                c2165Qr0.a(4);
                return;
            }
        }
        if (offlineItem.B != 3 || c2165Qr0.b.h(InterfaceC2295Rr0.b) == 3) {
            return;
        }
        c2165Qr0.h.run();
    }

    public C2035Pr0(C2165Qr0 c2165Qr0) {
        this.a = c2165Qr0;
    }
}
