package defpackage;

import org.chromium.base.Callback;
import org.chromium.components.offline_items_collection.OfflineItem;
import org.chromium.ui.modelutil.PropertyModel;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: qb2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9077qb2 implements Runnable {
    public final /* synthetic */ PropertyModel a;
    public final /* synthetic */ OfflineItem g;

    public /* synthetic */ RunnableC9077qb2(OfflineItem offlineItem, PropertyModel propertyModel) {
        this.a = propertyModel;
        this.g = offlineItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((Callback) this.a.i(GD1.r)).onResult(this.g);
    }
}