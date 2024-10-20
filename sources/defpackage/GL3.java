package defpackage;

import J.N;
import android.graphics.Bitmap;
import java.util.ArrayDeque;
import org.chromium.base.Callback;
import org.chromium.base.ThreadUtils;
import org.chromium.components.offline_items_collection.OfflineContentAggregatorBridge;
import org.chromium.components.offline_items_collection.OfflineItemVisuals;
import org.chromium.components.offline_items_collection.VisualsCallback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final /* synthetic */ class GL3 implements Runnable {
    public final /* synthetic */ IL3 a;

    /* JADX WARN: Type inference failed for: r2v5, types: [HL3] */
    @Override // java.lang.Runnable
    public final void run() {
        final IL3 il3 = this.a;
        il3.getClass();
        Object obj = ThreadUtils.a;
        if (il3.e != null) {
            return;
        }
        ArrayDeque arrayDeque = il3.d;
        if (arrayDeque.isEmpty()) {
            return;
        }
        ML3 ml3 = (ML3) arrayDeque.poll();
        il3.e = ml3;
        Bitmap a = il3.a(il3.e.c, ml3.a());
        if (a == null) {
            final ML3 ml32 = il3.e;
            final ?? r2 = new Callback() { // from class: HL3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    IL3 il32 = IL3.this;
                    il32.getClass();
                    il32.b((Bitmap) obj2, ml32.a());
                }
            };
            C6161i50 c6161i50 = ml32.b.a;
            VisualsCallback visualsCallback = new VisualsCallback() { // from class: LL3
                @Override // org.chromium.components.offline_items_collection.VisualsCallback
                public final void f(C6161i50 c6161i502, OfflineItemVisuals offlineItemVisuals) {
                    Bitmap bitmap;
                    ML3 ml33 = ML3.this;
                    ml33.getClass();
                    Callback callback = r2;
                    if (offlineItemVisuals == null || (bitmap = offlineItemVisuals.a) == null) {
                        callback.onResult(null);
                        return;
                    }
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i = ml33.c;
                    if (width > i && height > ml33.d) {
                        int width2 = bitmap.getWidth();
                        float f = AbstractC1895Op0.b(V60.a).d;
                        if (f > 1.5f) {
                            width2 = (int) ((width2 * 1.5f) / f);
                        }
                        width = width2;
                        int height2 = bitmap.getHeight();
                        float f2 = AbstractC1895Op0.b(V60.a).d;
                        if (f2 > 1.5f) {
                            height2 = (int) ((height2 * 1.5f) / f2);
                        }
                        height = height2;
                    }
                    int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
                    if (min > i) {
                        long j = i;
                        long j2 = min;
                        width = (int) ((bitmap.getWidth() * j) / j2);
                        height = (int) ((bitmap.getHeight() * j) / j2);
                    }
                    if (bitmap.getWidth() != width || bitmap.getHeight() != height) {
                        bitmap = Bitmap.createScaledBitmap(bitmap, width, height, false);
                    }
                    callback.onResult(bitmap);
                }
            };
            OfflineContentAggregatorBridge offlineContentAggregatorBridge = ml32.a;
            N.MwOuZAaJ(offlineContentAggregatorBridge.a, offlineContentAggregatorBridge, c6161i50.a, c6161i50.b, visualsCallback);
            return;
        }
        il3.b(a, il3.e.a());
    }
}
