package defpackage;

import android.telephony.TelephonyManager$CellInfoCallback;
import java.util.List;
import org.chromium.base.Callback;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* renamed from: oe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8406oe extends TelephonyManager$CellInfoCallback {
    public final /* synthetic */ Callback a;

    public C8406oe(C9539rv2 c9539rv2) {
        this.a = c9539rv2;
    }

    public final void onCellInfo(List list) {
        this.a.onResult(list);
    }
}
