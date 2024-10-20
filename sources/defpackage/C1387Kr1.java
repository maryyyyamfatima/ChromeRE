package defpackage;

import android.os.Environment;
import java.io.File;
import org.chromium.base.ContentUriUtils;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: Kr1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1387Kr1 extends AbstractC4610db2 {
    public C1387Kr1(C0003Aa2 c0003Aa2) {
        super(c0003Aa2);
        k();
    }

    @Override // defpackage.AbstractC4610db2
    public final boolean j(OfflineItem offlineItem) {
        boolean contains;
        String absolutePath;
        String str = offlineItem.v;
        if (ContentUriUtils.e(str)) {
            contains = true;
        } else {
            C7432ln3 c = C7432ln3.c();
            try {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                c.close();
                contains = (externalStorageDirectory == null || str == null || (absolutePath = externalStorageDirectory.getAbsolutePath()) == null) ? false : str.contains(absolutePath);
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        }
        if ((offlineItem.q && contains) || offlineItem.j) {
            return true;
        }
        if (offlineItem.K != null) {
            return false;
        }
        int i = offlineItem.B;
        return i == 3 || i == 5;
    }
}
