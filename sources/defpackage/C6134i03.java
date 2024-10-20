package defpackage;

import J.N;
import android.text.TextUtils;
import java.util.Locale;
import org.chromium.components.offline_items_collection.OfflineItem;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: i03, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6134i03 extends AbstractC4610db2 {
    public String i;

    public C6134i03(C9477rl0 c9477rl0) {
        super(c9477rl0);
        k();
    }

    @Override // defpackage.AbstractC4610db2
    public final boolean j(OfflineItem offlineItem) {
        if (TextUtils.isEmpty(this.i)) {
            return false;
        }
        String MR6Af3ZS = N.MR6Af3ZS(offlineItem.y.i(), 1);
        if (TextUtils.isEmpty(MR6Af3ZS) ? false : MR6Af3ZS.toLowerCase(Locale.getDefault()).contains(this.i)) {
            return false;
        }
        String str = offlineItem.g;
        return !(TextUtils.isEmpty(str) ? false : str.toLowerCase(Locale.getDefault()).contains(this.i));
    }
}
