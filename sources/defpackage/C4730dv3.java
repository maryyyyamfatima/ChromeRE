package defpackage;

import J.N;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Size;
import java.io.File;
import java.util.HashSet;
import org.chromium.base.Callback;
import org.chromium.base.PathUtils;
import org.chromium.base.TraceEvent;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.flags.CachedFeatureFlags;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: dv3 */
/* loaded from: classes.dex */
public final class C4730dv3 extends AbstractC0185Bl {
    public final /* synthetic */ int h;
    public final /* synthetic */ Size i;
    public final /* synthetic */ Callback j;
    public final /* synthetic */ TabContentManager k;

    @Override // defpackage.AbstractC0185Bl
    public final Object b() {
        File file = new File(PathUtils.getThumbnailCacheDirectory(), AbstractC8207o22.a(new StringBuilder(), this.h, ".jpeg"));
        if (!file.isFile()) {
            return null;
        }
        Size size = this.i;
        if (size == null || size.getWidth() <= 0 || size.getHeight() <= 0) {
            return BitmapFactory.decodeFile(file.getPath());
        }
        String path = file.getPath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        int i2 = options.outHeight;
        int i3 = options.outWidth;
        if (i2 > size.getHeight() || i3 > size.getWidth()) {
            int i4 = i2 / 2;
            int i5 = i3 / 2;
            while (i4 / i >= size.getHeight() && i5 / i >= size.getWidth()) {
                i *= 2;
            }
        }
        options.inSampleSize = i;
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeFile(path, options);
    }

    public C4730dv3(TabContentManager tabContentManager, int i, Size size, Callback callback) {
        this.k = tabContentManager;
        this.h = i;
        this.i = size;
        this.j = callback;
    }

    @Override // defpackage.AbstractC0185Bl
    public final void k(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        int i = this.h;
        TraceEvent.e(i, "GetTabThumbnailFromDisk");
        TabContentManager tabContentManager = this.k;
        int i2 = tabContentManager.m - 1;
        tabContentManager.m = i2;
        if (i2 == 0 && !tabContentManager.k) {
            tabContentManager.k = true;
            tabContentManager.o = tabContentManager.n;
            tabContentManager.g();
        }
        boolean z = tabContentManager.h;
        final Callback callback = this.j;
        if (bitmap == null) {
            long j = tabContentManager.f;
            if (j == 0 || !z) {
                return;
            }
            N.MGNfqDdn(j, tabContentManager, this.h, tabContentManager.d(), new Callback() { // from class: cv3
                @Override // org.chromium.base.Callback
                public final ZE e0(Object obj2) {
                    return new ZE(this, obj2);
                }

                @Override // org.chromium.base.Callback
                public final void onResult(Object obj2) {
                    Bitmap bitmap2 = (Bitmap) obj2;
                    if (bitmap2 != null) {
                        EI2.h(1, 4, "GridTabSwitcher.ThumbnailFetchingResult");
                    } else {
                        EI2.h(2, 4, "GridTabSwitcher.ThumbnailFetchingResult");
                    }
                    Callback.this.onResult(bitmap2);
                }
            });
            return;
        }
        if (CachedFeatureFlags.b(AbstractC6265iP.d.b("TabGridLayoutAndroid:allow_to_refetch"), true)) {
            double width = bitmap.getHeight() == 0 ? 0.0d : (bitmap.getWidth() * 1.0d) / bitmap.getHeight();
            HashSet hashSet = tabContentManager.a;
            if (!hashSet.contains(Integer.valueOf(i)) && Math.abs(width - tabContentManager.d()) >= 0.01d) {
                EI2.h(3, 4, "GridTabSwitcher.ThumbnailFetchingResult");
                if (tabContentManager.f == 0) {
                    callback.onResult(bitmap);
                    return;
                } else {
                    if (z) {
                        hashSet.add(Integer.valueOf(i));
                        N.MGNfqDdn(tabContentManager.f, tabContentManager, this.h, tabContentManager.d(), this.j);
                        return;
                    }
                    return;
                }
            }
        }
        EI2.h(0, 4, "GridTabSwitcher.ThumbnailFetchingResult");
        callback.onResult(bitmap);
    }
}
