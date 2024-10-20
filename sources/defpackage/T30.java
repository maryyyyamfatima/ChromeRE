package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: chromium-ChromeModern.aab-stable-519513610 */
/* loaded from: classes.dex */
public final class T30 implements InterfaceC5393fr2 {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ V30 b;

    public T30(V30 v30, AbstractC8508ov abstractC8508ov) {
        this.b = v30;
        this.a = abstractC8508ov;
    }

    @Override // defpackage.InterfaceC5393fr2
    public final void a(Status status) {
        this.b.a.remove(this.a);
    }
}
