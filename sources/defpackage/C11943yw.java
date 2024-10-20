package defpackage;

import android.graphics.Bitmap;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: yw */
/* loaded from: classes.dex */
public final /* synthetic */ class C11943yw implements SH0 {
    public final /* synthetic */ AbstractC12286zw a;
    public final /* synthetic */ PropertyModel b;

    public /* synthetic */ C11943yw(AbstractC12286zw abstractC12286zw, PropertyModel propertyModel) {
        this.a = abstractC12286zw;
        this.b = propertyModel;
    }

    @Override // defpackage.SH0
    public final void a(int i, Bitmap bitmap) {
        AbstractC12286zw abstractC12286zw = this.a;
        if (bitmap == null) {
            abstractC12286zw.getClass();
        } else {
            AbstractC12286zw.k(this.b, C5382fp3.b(abstractC12286zw.a, bitmap).a());
        }
    }
}
