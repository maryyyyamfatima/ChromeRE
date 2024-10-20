package org.chromium.components.webapps;

import J.N;
import android.graphics.Bitmap;
import android.util.Pair;
import defpackage.AbstractC6858k7;
import defpackage.InterfaceC7546m7;
import defpackage.PD2;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes2.dex */
public class AddToHomescreenMediator implements InterfaceC7546m7 {
    public long a = N.MBJ_fnwd(this);
    public final PropertyModel g;
    public final WindowAndroid h;
    public AppData i;

    public AddToHomescreenMediator(PropertyModel propertyModel, WindowAndroid windowAndroid) {
        this.g = propertyModel;
        this.h = windowAndroid;
    }

    public void setIcon(Bitmap bitmap, boolean z, boolean z2) {
        if (z2) {
            bitmap = WebappsIconUtils.createHomeScreenIconFromWebIcon(bitmap, true);
        }
        PD2 pd2 = AbstractC6858k7.d;
        Pair pair = new Pair(bitmap, Boolean.valueOf(z));
        PropertyModel propertyModel = this.g;
        propertyModel.o(pd2, pair);
        propertyModel.k(AbstractC6858k7.f, true);
    }

    public void setWebAppInfo(String str, String str2, boolean z) {
        PD2 pd2 = AbstractC6858k7.a;
        PropertyModel propertyModel = this.g;
        propertyModel.o(pd2, str);
        propertyModel.o(AbstractC6858k7.b, str2);
        propertyModel.m(AbstractC6858k7.e, z ? 1 : 2);
    }

    public void setNativeAppInfo(AppData appData) {
        this.i = appData;
        PD2 pd2 = AbstractC6858k7.a;
        String str = appData.b;
        PropertyModel propertyModel = this.g;
        propertyModel.o(pd2, str);
        propertyModel.m(AbstractC6858k7.e, 0);
        propertyModel.l(AbstractC6858k7.i, appData.d);
        propertyModel.k(AbstractC6858k7.f, true);
        propertyModel.o(AbstractC6858k7.h, appData.e);
    }

    @Override // defpackage.InterfaceC7546m7
    public final void b(String str) {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.MQa5VwR6(j, str);
        long j2 = this.a;
        if (j2 == 0) {
            return;
        }
        N.MwQAZYNv(j2);
        this.a = 0L;
    }

    @Override // defpackage.InterfaceC7546m7
    public final boolean a() {
        if (this.g.h(AbstractC6858k7.e) != 0) {
            return false;
        }
        this.h.A(this.i.f, null, null);
        long j = this.a;
        if (j == 0) {
            return true;
        }
        N.MpeFYmhO(j);
        return true;
    }

    @Override // defpackage.InterfaceC7546m7
    public final void c() {
        long j = this.a;
        if (j == 0) {
            return;
        }
        N.M3ujfdbM(j);
        long j2 = this.a;
        if (j2 == 0) {
            return;
        }
        N.MwQAZYNv(j2);
        this.a = 0L;
    }
}
