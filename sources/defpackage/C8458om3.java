package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.util.Collection;
import java.util.Iterator;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: om3 */
/* loaded from: classes.dex */
public final class C8458om3 implements InterfaceC4953eb2 {
    public final Context a;
    public final C6395im3 g;
    public C0461Do0 h;
    public long i;

    @Override // defpackage.InterfaceC4953eb2
    public final /* synthetic */ void c() {
    }

    public C8458om3(Context context, C6395im3 c6395im3, C6134i03 c6134i03) {
        this.a = context;
        this.g = c6395im3;
        if (c6134i03 != null) {
            c6134i03.a(this);
            this.i = a(c6134i03.g);
        }
        new C8114nm3(this).c(AbstractC0185Bl.e);
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void b(Collection collection) {
        this.i = a(collection) + this.i;
        f();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void d(Collection collection) {
        this.i -= a(collection);
        f();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void e(OfflineItem offlineItem, OfflineItem offlineItem2) {
        long j = this.i - offlineItem.E;
        this.i = j;
        this.i = j + offlineItem2.E;
        if (offlineItem2.B != 0) {
            f();
        }
    }

    public static long a(Collection collection) {
        Iterator it = collection.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((OfflineItem) it.next()).E;
        }
        return j;
    }

    public final void f() {
        if (this.h == null) {
            return;
        }
        long j = this.i;
        Context context = this.a;
        this.g.a.a.o(AbstractC6738jm3.a, context.getString(R.string.0_resource_name_obfuscated_res_0x7f140440, AbstractC6091ht0.b(j, context), AbstractC6091ht0.b(this.h.d, context)));
    }
}
