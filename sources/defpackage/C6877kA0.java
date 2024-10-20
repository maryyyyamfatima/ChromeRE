package defpackage;

import android.content.Context;
import com.android.chrome.R;
import java.util.Collection;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: kA0 */
/* loaded from: classes.dex */
public final class C6877kA0 implements InterfaceC4953eb2, InterfaceC11747yN0 {
    public final InterfaceC5297fb2 a;
    public final PropertyModel g;
    public final DA0 h;
    public boolean i;

    @Override // defpackage.InterfaceC4953eb2
    public final void e(OfflineItem offlineItem, OfflineItem offlineItem2) {
    }

    public C6877kA0(Context context, C8037nZ3 c8037nZ3) {
        PropertyModel propertyModel = new PropertyModel(InterfaceC9624sA0.c);
        this.g = propertyModel;
        this.a = c8037nZ3;
        c8037nZ3.a(this);
        DA0 da0 = new DA0(context);
        this.h = da0;
        UD2.a(propertyModel, da0, new EA0());
        f();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void b(Collection collection) {
        f();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void d(Collection collection) {
        f();
    }

    @Override // defpackage.InterfaceC4953eb2
    public final void c() {
        f();
    }

    @Override // defpackage.InterfaceC11747yN0
    public final void a(int i) {
        this.i = i == 7;
        f();
    }

    public final void f() {
        int i;
        InterfaceC5297fb2 interfaceC5297fb2 = this.a;
        boolean f = interfaceC5297fb2.f();
        PropertyModel propertyModel = this.g;
        if (!f) {
            i = 0;
        } else if (interfaceC5297fb2.h().isEmpty()) {
            propertyModel.m(InterfaceC9624sA0.b, this.i ? R.string.0_resource_name_obfuscated_res_0x7f140432 : R.string.0_resource_name_obfuscated_res_0x7f14042c);
            i = 1;
        } else {
            i = 2;
        }
        propertyModel.m(InterfaceC9624sA0.a, i);
    }
}
